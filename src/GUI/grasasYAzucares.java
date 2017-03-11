package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class grasasYAzucares extends JFrame {
	public grasasYAzucares() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alvaro\\Desktop\\HackForGood\\Icono principaldpm.png"));
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		setVisible(true);
		setEnabled(true);
		setBounds(12, 48, 450, 400);
		
		JLabel lblGrasasAzucares = new JLabel("Grasas y azúcares");
		lblGrasasAzucares.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGrasasAzucares.setBounds(140, 13, 207, 16);
		getContentPane().add(lblGrasasAzucares);
	}
}
