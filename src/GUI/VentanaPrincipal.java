package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame{

	JButton btnVerUsuarios;
	JButton btnVerDesp;
	
	public VentanaPrincipal() {
		
		getContentPane().setBackground(new Color(188,255,193));
		getContentPane().setLayout(null);
		
		btnVerUsuarios = new JButton("Ver usuarios");
		btnVerUsuarios.setBounds(149, 120, 126, 38);
		getContentPane().add(btnVerUsuarios);
		
		btnVerDesp = new JButton("Mi despensa");
		btnVerDesp.setBounds(149, 180, 126, 38);
		getContentPane().add(btnVerDesp);
		
		JLabel lblSmartfood = new JLabel("SMARTFOOD");
		lblSmartfood.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSmartfood.setBounds(157, 13, 157, 38);
		getContentPane().add(lblSmartfood);
		
		JLabel label = new JLabel("");
		label.setBounds(314, 157, 21, 1);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Alvaro\\Desktop\\descargadpm.png"));
		label_1.setBounds(300, 86, 109, 108);
		getContentPane().add(label_1);
		
		JButton btnNuevoUsuario = new JButton("Nuevo Usuario");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNuevoUsuario.setBounds(149, 64, 126, 38);
		getContentPane().add(btnNuevoUsuario);
		
	}
}
