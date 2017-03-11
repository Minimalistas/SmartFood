package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LegumbresYProductosAnimales extends JFrame {
	public LegumbresYProductosAnimales() {
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		
		JLabel lblLegumbresYProductosAnimales = new JLabel("Legumbres y productos animales");
		lblLegumbresYProductosAnimales.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLegumbresYProductosAnimales.setBounds(97, 13, 251, 16);
		getContentPane().add(lblLegumbresYProductosAnimales);

	}
}
