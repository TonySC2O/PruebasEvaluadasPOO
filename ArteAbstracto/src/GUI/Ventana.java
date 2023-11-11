package GUI;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana() {
		setTitle("Arte Abstracto");
	    setSize(600, 600);
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
        setLocationRelativeTo(null);
	}
}
