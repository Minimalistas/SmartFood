package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class cerealesYTuberculos extends JFrame{

	public cerealesYTuberculos() {
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		setVisible(true);
		setEnabled(true);
		setBounds(12, 48, 450, 400);
		
		JLabel lblcerealesYTuberculos = new JLabel("Cereales y tubérculos");
		lblcerealesYTuberculos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblcerealesYTuberculos.setBounds(153, 13, 150, 16);
		getContentPane().add(lblcerealesYTuberculos);
}
}
