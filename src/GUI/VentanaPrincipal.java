package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaPrincipal extends JFrame{

	JButton btnVerUsuarios;
	JButton btnVerDesp;
	
	public VentanaPrincipal() {
		
		getContentPane().setBackground(new Color(188,255,193));
		getContentPane().setLayout(null);
		
		btnVerUsuarios = new JButton("Ver usuarios");
		btnVerUsuarios.setBounds(102, 74, 126, 38);
		getContentPane().add(btnVerUsuarios);
		
		btnVerDesp = new JButton("Mi despensa");
		btnVerDesp.setBounds(102, 123, 126, 38);
		getContentPane().add(btnVerDesp);
		
	}
}
