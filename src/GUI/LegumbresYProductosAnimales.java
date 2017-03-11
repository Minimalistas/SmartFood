package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class LegumbresYProductosAnimales extends JFrame {
	public LegumbresYProductosAnimales() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alvaro\\Desktop\\HackForGood\\Icono principaldpm.png"));
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		setVisible(true);
		setEnabled(true);
		setBounds(12, 48, 450, 400);
		
		JLabel lblLegumbresYProductosAnimales = new JLabel("Legumbres y productos animales");
		lblLegumbresYProductosAnimales.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLegumbresYProductosAnimales.setBounds(97, 13, 251, 16);
		getContentPane().add(lblLegumbresYProductosAnimales);

	}
}
