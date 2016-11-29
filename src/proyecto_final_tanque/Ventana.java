package proyecto_final_tanque;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	Escenario panel;
	
	public Ventana(){
		panel = new Escenario();
		this.setVisible(true);
		this.add(panel);
		this.addKeyListener(panel);
		this.setFocusable(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
