package proyecto_final_tanque;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tanque extends Rectangle {

	private int posX;
	private int posY;
	private Bala bala;
	private int canon;
	private int vida;
	private int num_balas = 20;
	public boolean disparo;
	public boolean limite;
	

	private Image tank;
	
	

	public Tanque() {
		this.posX = 0;
		this.posY = 468;
		this.canon = 1;
		this.bala = new Bala(posX + 95, 568, 5, 0);
		this.tank = cargarImagen("1.png");
		this.width = 165;
		this.height = 100;
		this.y = posY + 100;
		this.vida = 5;
	}

	public Image cargarImagen(String title) {
		ImageIcon icon = new ImageIcon(title);
		this.tank = icon.getImage();
		return tank;
	}

	public void mover(KeyEvent e) {
		if (e.getKeyCode() == e.VK_RIGHT) {
			if (posX < 400 && limite == false) {
				posX += 7;
				bala.x += 7;
				bala.setPosx(bala.getPosx() + 7);
			}else if(limite == true){
				posX += 7;
				bala.x += 7;
				bala.setPosx(bala.getPosx() + 7); 
			}
		} else if (e.getKeyCode() == e.VK_LEFT) {
			if (posX > 0) {
				posX -= 7;
				bala.x -= 7;
				bala.setPosx(bala.getPosx() - 7);
			}
		}
	}
	
	public void mover(KeyEvent e, int bound) {
		if (e.getKeyCode() == e.VK_RIGHT) {
			
				posX += 7;
				bala.x += 7;
				bala.setPosx(bala.getPosx() + 7);
			
		} else if (e.getKeyCode() == e.VK_LEFT) {
			if (posX > 0) {
				posX -= 7;
				bala.x -= 7;
				bala.setPosx(bala.getPosx() - 7);
			}
		}
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Bala getBala() {
		return bala;
	}

	public void setBala(Bala bala) {
		this.bala = bala;
	}

	public int getCanon() {
		return canon;
	}

	public void setCanon(int canon) {
		this.canon = canon;
	}

	public int getNum_balas() {
		return num_balas;
	}

	public void setNum_balas(int num_balas) {
		this.num_balas = num_balas;
	}

	public Image getTank() {
		return tank;
	}

	public void setTank(Image tank) {
		this.tank = tank;
	}

	public void KeyPressed(KeyEvent e) {
		if (e.getKeyCode() == e.VK_UP) {
			if (canon < 19) {
				canon++;
				switch (canon) {
				case 1:
					tank = cargarImagen("1.png");
					break;
				case 2:
					tank = cargarImagen("2.png");
					break;
				case 3:
					tank = cargarImagen("3.png");
					break;
				case 4:
					tank = cargarImagen("4.png");
					break;
				case 5:
					tank = cargarImagen("5.png");
					break;
				case 6:
					tank = cargarImagen("6.png");
					break;
				case 7:
					tank = cargarImagen("7.png");
					break;
				case 8:
					tank = cargarImagen("8.png");
					break;
				case 9:
					tank = cargarImagen("9.png");
					break;
				case 10:
					tank = cargarImagen("10.png");
					break;
				case 11:
					tank = cargarImagen("11.png");
					break;
				case 12:
					tank = cargarImagen("12.png");
					break;
				case 13:
					tank = cargarImagen("13.png");
					break;
				case 14:
					tank = cargarImagen("14.png");
					break;
				case 15:
					tank = cargarImagen("15.png");
					break;
				case 16:
					tank = cargarImagen("16.png");
					break;
				case 17:
					tank = cargarImagen("17.png");
					break;
				case 18:
					tank = cargarImagen("18.png");
					break;
				}
			}
		} else if (e.getKeyCode() == e.VK_DOWN) {
			if (canon > 0) {
				canon--;
				switch (canon) {
				case 1:
					tank = cargarImagen("1.png");
					break;
				case 2:
					tank = cargarImagen("2.png");
					break;
				case 3:
					tank = cargarImagen("3.png");
					break;
				case 4:
					tank = cargarImagen("4.png");
					break;
				case 5:
					tank = cargarImagen("5.png");
					break;
				case 6:
					tank = cargarImagen("6.png");
					break;
				case 7:
					tank = cargarImagen("7.png");
					break;
				case 8:
					tank = cargarImagen("8.png");
					break;
				case 9:
					tank = cargarImagen("9.png");
					break;
				case 10:
					tank = cargarImagen("10.png");
					break;
				case 11:
					tank = cargarImagen("11.png");
					break;
				case 12:
					tank = cargarImagen("12.png");
					break;
				case 13:
					tank = cargarImagen("13.png");
					break;
				case 14:
					tank = cargarImagen("14.png");
					break;
				case 15:
					tank = cargarImagen("15.png");
					break;
				case 16:
					tank = cargarImagen("16.png");
					break;
				case 17:
					tank = cargarImagen("17.png");
					break;
				case 18:
					tank = cargarImagen("18.png");
					break;
				}
			}
		}

	}
	
	public void disparar(){
		switch(canon){
		case 1:
			bala.setAngulo(0);
			bala.disparar();
			break;
		case 2:
			bala.setAngulo(5);
			bala.disparar();
			break;
		case 3:
			bala.setAngulo(9);
			bala.disparar();
			break;
		case 4:
			bala.setAngulo(15);
			bala.disparar();
			break;
		case 5:
			bala.setAngulo(20);
			bala.disparar();
			break;
		case 6:
			bala.setAngulo(25);
			bala.disparar();
			break;
		case 7:
			bala.setAngulo(30);
			bala.disparar();
			break;
		case 8:
			bala.setAngulo(35);
			bala.disparar();
			break;
		case 9:
			bala.setAngulo(40);
			bala.disparar();
			break;
		case 10:
			bala.setAngulo(45);
			bala.disparar();
			break;
		case 11:
			bala.setAngulo(50);
			bala.disparar();
			break;
		case 12:
			bala.setAngulo(55);
			bala.disparar();
			break;
		case 13:
			bala.setAngulo(58);
			bala.disparar();
			break;
		case 14:
			bala.setAngulo(62);
			bala.disparar();
			break;
		case 15:
			bala.setAngulo(63);
			bala.disparar();
			break;
		case 16:
			bala.setAngulo(67);
			bala.disparar();
			break;
		case 17:
			bala.setAngulo(70);
			bala.disparar();
			break;
		case 18:
			bala.setAngulo(75);
			bala.disparar();
			break;
		}
	}
	
	public void rbala(){
		bala.setPosx(posX+95);
		bala.setPosy(568);
		bala.x = bala.getPosx();
		bala.y = bala.getPosy();
	}
	
	public void paint(Graphics g, JPanel panel) {
		this.x = posX + 4;
		bala.paint(g, panel);
		g.drawImage(tank, posX, posY, panel);
	}

}
