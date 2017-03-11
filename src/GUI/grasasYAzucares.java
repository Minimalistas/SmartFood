package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class grasasYAzucares extends JFrame {
	public grasasYAzucares() {
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		
		JLabel lblGrasasAzucares = new JLabel("Cereales y Tubérculos");
		lblGrasasAzucares.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGrasasAzucares.setBounds(140, 13, 207, 16);
		getContentPane().add(lblGrasasAzucares);
	}
}
