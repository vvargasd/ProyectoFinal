package proyecto_final_tanque;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Boss extends Rectangle{
	
	public int canon;
	private Image boss;
	private int posx;
	private int posy;
	public BalaBoss bala;

	public Boss(){
		this.canon = 1;
		this.posx = 3700;
		this.posy = 0;
		boss = cargarImagen("c11.png");
		this.bala = new BalaBoss(posx +300, posy+100, 5, 0);
		
	}
	
	public Image cargarImagen(String title) {
		ImageIcon icon = new ImageIcon(title);
		this.boss = icon.getImage();
		return boss;
	}
	
	public BalaBoss getBalaBoss(){
		return bala;
	}
	
	public void paint(Graphics g, JPanel panel) {
		// TODO Auto-generated method stub
		
		this.bala.paint(g,panel);
		if(canon == 1){
			boss = cargarImagen("c11.png");
			g.drawImage(boss, posx, 50, panel);
		}else if(canon == 2){
			boss = cargarImagen("c22.png");
			g.drawImage(boss, posx, 50, panel);
		}else if(canon == 3){
			boss = cargarImagen("c33.png");
			g.drawImage(boss, posx, 50, panel);
		}else if(canon == 4){
			boss = cargarImagen("c44.png");
			g.drawImage(boss, posx, 50, panel);
		}else if(canon == 5){
			boss = cargarImagen("c55.png");
			g.drawImage(boss, posx, 50, panel);
		}else if(canon == 6){
			boss = cargarImagen("c66.png");
			g.drawImage(boss, posx, 50, panel);
		}else if(canon == 7){
			boss = cargarImagen("c77.png");
			g.drawImage(boss, posx, 50, panel);
		}
		
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}
	
	public void rbala(){
		bala.setPosx(posx+300);
		bala.setPosy(posy+120);
		bala.x = bala.getPosx();
		bala.y = bala.getPosy();
	}
	
	public int disparoAleatorio(){
		
		Random rand = new Random();
		int x = rand.nextInt(7) + 1;
		if(x == 1){
			canon = 1;			
		}else if(x == 2){
			canon = 2;
		}else if(x == 3){
			canon = 3;
		}else if(x == 4){
			canon = 4;
		}else if(x == 5){
			canon = 5;
		}else if(x == 6){
			canon = 6;
		}else if(x == 7){
			canon = 7;
		}
		
		return x;
		
	}	
	
	
	
}
