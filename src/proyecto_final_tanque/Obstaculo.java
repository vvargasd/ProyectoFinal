package proyecto_final_tanque;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Obstaculo extends Rectangle{
	
	private int resistencia;
	private int posx;
	private int posy;
	private Image domino;
	
	public Obstaculo(int resistencia, int posx, int posy){
		this.resistencia = resistencia;
		this.posx = posx;
		this.posy = posy;
		this.x = posx;
		this.y = posy;
		this.width = 100;
		this.height = 100;
	}
	
	public Image cargarImagen(String title) {
		ImageIcon icon = new ImageIcon(title);
		this.domino = icon.getImage();
		return domino;
	}
	
	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
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

	public void paint(Graphics g, JPanel panel){
		
		if(resistencia == 1){
			domino = cargarImagen("domino1.png");
			g.drawImage(domino, posx, posy, panel);
		}else if(resistencia == 2){
			domino = cargarImagen("d2.png");
			g.drawImage(domino, posx, posy, panel);
		}else if(resistencia == 3){
			domino = cargarImagen("d3.png");
			g.drawImage(domino, posx, posy, panel);
		}else if(resistencia == 4){
			domino = cargarImagen("d4.png");
			g.drawImage(domino, posx, posy, panel);
		}else if(resistencia == 5){
			domino = cargarImagen("d5.png");
			g.drawImage(domino, posx, posy, panel);
		}else if(resistencia == 6){
			domino = cargarImagen("d6.png");
			g.drawImage(domino, posx, posy, panel);
		}else if(resistencia == 100){
			domino = cargarImagen("d00.png");
			g.drawImage(domino, posx, posy, panel);
		}
		
	}
}
