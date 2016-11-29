package proyecto_final_tanque;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public abstract class Enemigo extends Rectangle{
	
	protected int resistencia;
	protected int posx;
	protected int posy;
	
	public abstract void paint(Graphics g, JPanel panel);
	
	public abstract void mover();

}
