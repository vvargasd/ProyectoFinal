package proyecto_final_tanque;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class APapel extends Enemigo{
	
	private Image papel;
	private int velocidad;
	private int trayectoria;

	//Enemigo e1 = new APapel(1,5, 1600, 0);
	public APapel(int trayectoria) {
		// TODO Auto-generated constructor stub
		this.trayectoria = trayectoria;
		this.width = 100;
		this.height = 100;
		papel = cargarImagen("papel.png");
		if(trayectoria == 1){
			this.posx = 1600;
			this.posy = 0;
			this.velocidad = 2;
			this.resistencia = 1;
			papel = cargarImagen("papel2.png");
		}
		else if(trayectoria == 2){
			this.posx = 1600;
			this.posy = 350;
			this.velocidad = 4;
			this.resistencia = 1;
			papel = cargarImagen("papel.png");
		}else if(trayectoria == 3){
			this.posx =800;
			this.posy = 0;
			this.velocidad = 3;
			this.resistencia = 1;
		}else if(trayectoria == 4){
			this.posx = 600;
			this.posy = 0;
			this.velocidad = 2;
			this.resistencia = 1;
		}
	}
	
	public Image cargarImagen(String title) {
		ImageIcon icon = new ImageIcon(title);
		this.papel = icon.getImage();
		return papel;
	}
	
	public void destruir(){
		posx = 1600;
		posy = 0;
	}

	@Override
	public void paint(Graphics g, JPanel panel){
		// TODO Auto-generated method stub
		g.drawImage(papel, posx, posy, panel);
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		if(trayectoria == 1){
			posx-=velocidad;
			x = posx;
			posy+=velocidad/2;
			y = posy;
		}else if(trayectoria == 2){
			posx-=velocidad;
			x = posx;
			if(posx%3==0)
			posy+= 2;
			y = posy;			
		}else if(trayectoria == 3){
			posx-=velocidad;
			x = posx;
			posy+=velocidad;
			y = posy;
		}else if(trayectoria == 4){
			posx-=velocidad;
			x = posx;
			posy+=velocidad;
			y = posy;
		}
	}

}
