package proyecto_final_tanque;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BalaBoss extends Rectangle{

	private int posx;
	private int posy;
	private int velocidad;
	private double angulo;
	private Image bala;

	public BalaBoss(int x, int y, int velocidad, int angulo) {
		this.posx = x;
		this.posy = y;
		this.x = posx;
		this.y = posy;
		this.width = 20;
		this.height = 20;
		this.velocidad = velocidad;
		this.angulo = angulo;
		this.cargarImagen("calavera2.png");
	}

	public Image cargarImagen(String title) {
		ImageIcon icon = new ImageIcon(title);
		this.bala = icon.getImage();
		return bala;
	}

	public void paint(Graphics g, JPanel panel) {
		g.drawImage(bala, posx, posy, panel);
		
	}

	
	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(float angulo) {
		this.angulo = angulo;
	}

	public void actualizar() {
	}

	public void disparar(int n) {
		actualizar();
		if(n == 1){
			posx-= velocidad;
			posy+= velocidad/2;
		}else if(n == 2){
			posx-= velocidad - 1;
			posy+= velocidad/2;
		}else if(n == 3){
			posx-= velocidad;
			posy+= velocidad -2;
		}else if(n == 4){
			posx-= velocidad - 1;
			posy+= velocidad -2;
		}else if(n == 5){
			posx-= velocidad -2;
			posy+= velocidad -1;
		}else if(n == 6){
			posx-= velocidad -2;
			posy+= velocidad -1;
		}else if(n == 7){
			posx-= velocidad -2;
			posy+= velocidad -1;
		}
	}

	
}
