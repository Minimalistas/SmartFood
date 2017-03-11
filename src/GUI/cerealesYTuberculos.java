package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class cerealesYTuberculos extends JFrame{

	public cerealesYTuberculos() {
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		
		JLabel lblcerealesYTuberculos = new JLabel("Grasas y az\u00FAcares");
		lblcerealesYTuberculos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblcerealesYTuberculos.setBounds(153, 13, 150, 16);
		getContentPane().add(lblcerealesYTuberculos);
}
}
