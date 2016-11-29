package proyecto_final_tanque;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Escenario extends JPanel implements ActionListener, KeyListener {

	private Tanque tanque;
	private ArrayList<Obstaculo> obstaculos;
	private ArrayList<Enemigo> enemigos;
	private Timer time;
	private int imgx;
	private Image fondo;
	private static Boss boss = new Boss();
	private int counter;
	int n;

	public Escenario() {
		// TODO Auto-generated constructor stub
		tanque = new Tanque();
		time = new Timer(1, this);
		fondo = cargarImagen("fondo.png");
		time.start();
		obstaculos = new ArrayList<>();
		enemigos = new ArrayList<>();
		crearObstaculo();
		crearEnemigo();
	}

	public Image cargarImagen(String title) {
		ImageIcon icon = new ImageIcon(title);
		this.fondo = icon.getImage();
		return fondo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		colisiones();
		if (counter % 500 == 0)
			n = boss.disparoAleatorio();
		boss.bala.disparar(n);
		if (boss.getBalaBoss().getPosx() < 0) {
			boss.rbala();
		}
		
		for (Enemigo enemigo : enemigos)
			enemigo.mover();
		if (tanque.disparo == true) {
			tanque.disparar(); 
			if (tanque.getBala().getPosx() > 1600 || tanque.getBala().getPosy() < 0) {
				tanque.rbala();
				tanque.disparo = false;
			}
		}
		counter++;
		if (counter == 10000)
			counter = 0;
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(fondo, imgx, 0, this);
		tanque.paint(g, this);

		boss.paint(g, this);
		for (Obstaculo o : obstaculos) {
			o.paint(g, this);
		}
		for (Enemigo e : enemigos)
			e.paint(g, this);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		tanque.KeyPressed(e);
		if (!colisiones()) {
			tanque.mover(e);
			if (imgx >= -2800) {
				if (e.getKeyCode() == e.VK_RIGHT && tanque.getPosX() > 399) {
					imgx -= 7;
					System.out.println(imgx);
					boss.setPosx(boss.getPosx() - 7);
					boss.getBalaBoss().setPosx(boss.getBalaBoss().getPosx() - 7);
					for (Obstaculo o : obstaculos) {
						o.setPosx(o.getPosx() - 7);
						o.x = o.getPosx();
					}
				}
				}
			}else {
					if (e.getKeyCode() == e.VK_LEFT)
						tanque.mover(e);
				
			}
			if (e.getKeyCode() == e.VK_SPACE) {
				tanque.disparo = true;
				crearEnemigo();
			}
		

	}

	public void disparoAleatorio() {
		boss.disparoAleatorio();
	}

	public void crearObstaculo() {
		Obstaculo o1 = new Obstaculo(6, 1500, 568);
		Obstaculo o2 = new Obstaculo(4, 2000, 568);
		Obstaculo o3 = new Obstaculo(2, 400, 468);
		Obstaculo o4 = new Obstaculo(3, 400, 568);
		Obstaculo o5 = new Obstaculo(4, 1300, 468);
		Obstaculo o6 = new Obstaculo(6, 1300, 568);
		Obstaculo o7 = new Obstaculo(1, 1200, 468);
		Obstaculo o8 = new Obstaculo(5, 1200, 568);
		Obstaculo base = new Obstaculo(100, 4000, 175);
		obstaculos.add(o1);
		obstaculos.add(o2);
		obstaculos.add(o3);
		obstaculos.add(o4);
		obstaculos.add(o5);
		obstaculos.add(o6);
		obstaculos.add(o7);
		obstaculos.add(o8);
		obstaculos.add(base);
	}

	public void crearEnemigo() {
		Enemigo e1 = new APapel(4);
		Enemigo e2 = new APapel(1);
		Enemigo e3 = new APapel(2);
		Enemigo e4 = new APapel(3);
		if(imgx != 0){
		if(imgx%10 == 0)
		enemigos.add(e1);
		if(imgx%8 == 0)
		enemigos.add(e2);
		if(imgx%6 == 0)
		enemigos.add(e3);
		if(imgx%4 == 0)
		enemigos.add(e4);
		}
	}

	public boolean colisiones() {
		ArrayList<Obstaculo> copy = new ArrayList<>();
		copy.addAll(obstaculos);
		Tanque proto = new Tanque();
		proto.x = tanque.x + 3;
		proto.y = tanque.y + 3;
		proto.width = tanque.width;
		proto.height = tanque.height;
		
		for (Obstaculo o : copy) {
			if (proto.intersects(o)) {
				return true;
			}
			if (tanque.getBala().intersects(o)) {
				o.setResistencia(o.getResistencia() - 1);
				tanque.rbala();
				tanque.disparo = false;
				if (o.getResistencia() == 0)
					obstaculos.remove(o);
			}
			// obstaculos = copy;
		}
		return false;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
