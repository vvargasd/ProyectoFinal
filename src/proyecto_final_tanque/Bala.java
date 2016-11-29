package proyecto_final_tanque;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Bala extends Rectangle{
	
	private int posx;
	private int posy;
	private int velocidad;
	private double angulo;
	private double dy;
	
	
	private Image bala;	
	
	public Bala(int x, int y, int velocidad, int angulo) {
		this.posx = x;
		this.posy = y;
		this.x = posx;
		this.y = posy;
		this.width = 20;
		this.height = 20;
		this.velocidad = velocidad;
		this.angulo = angulo;
		this.cargarImagen("bala20.png");
	}
	
	public Image cargarImagen(String title){
		ImageIcon icon = new ImageIcon(title);
		this.bala = icon.getImage();
		return bala;
	}
	
	public void paint(Graphics g, JPanel panel){
		
			g.drawImage(bala, posx, posy+11, panel);
		
		
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

	public Image getBala() {
		return bala;
	}

	public void setBala(Image bala) {
		this.bala = bala;
	}
	
	public void actualizar(){
		this.x = posx;
		this.y = posy + 9;
	}
	public void disparar(){				
				actualizar();
				posx += velocidad*Math.cos(Math.toRadians(angulo));
				posy -= velocidad*Math.sin(Math.toRadians(angulo));
	}

}
