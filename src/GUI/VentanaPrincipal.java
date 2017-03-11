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
import java.io.File;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame{

	JButton btnVerUsuarios;
	JButton btnVerDesp;
	JButton btnNuevoUsuario;
	
	JLabel lblimgNewUsr;
	JLabel lblSmartfood;
	JLabel lblImagenPpal;
	JLabel lblimgVerUsrs;
	JLabel lblimgMiDesp;
	
	public VentanaPrincipal() {
		
		getContentPane().setBackground(new Color(188,255,193));
		getContentPane().setLayout(null);
		
		btnVerUsuarios = new JButton("Ver usuarios");
		btnVerUsuarios.setForeground(new Color(0, 0, 0));
		btnVerUsuarios.setBackground(new Color(139, 0, 139));
		btnVerUsuarios.setBounds(149, 120, 126, 38);
		getContentPane().add(btnVerUsuarios);
		
		btnVerDesp = new JButton("Mi despensa");
		btnVerDesp.setForeground(Color.BLACK);
		btnVerDesp.setBackground(new Color(139, 0, 139));
		btnVerDesp.setBounds(149, 180, 126, 38);
		getContentPane().add(btnVerDesp);
		
		lblSmartfood = new JLabel("SMARTFOOD");
		lblSmartfood.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSmartfood.setBounds(157, 13, 157, 38);
		getContentPane().add(lblSmartfood);
		
		lblImagenPpal = new JLabel("");
		lblImagenPpal.setIcon(new ImageIcon(new File("").getAbsolutePath() + "\\descargadpm.png"));
		lblImagenPpal.setBounds(300, 86, 109, 108);
		getContentPane().add(lblImagenPpal);
		
		btnNuevoUsuario = new JButton("Nuevo Usuario");
		btnNuevoUsuario.setForeground(new Color(0, 0, 0));
		btnNuevoUsuario.setBackground(new Color(139, 0, 139));
		btnNuevoUsuario.setBounds(149, 64, 126, 38);
		getContentPane().add(btnNuevoUsuario);
		
		lblimgNewUsr = new JLabel("");
		lblimgNewUsr.setIcon(new ImageIcon("C:\\Users\\Alvaro\\Downloads\\add-user-64x64_converted.png"));
		lblimgNewUsr.setBounds(100, 64, 44, 43);
		getContentPane().add(lblimgNewUsr);
		
		lblimgVerUsrs = new JLabel("");
		lblimgVerUsrs.setIcon(new ImageIcon(new File("").getAbsolutePath() + "\\FamiliaDPM.png"));
		lblimgVerUsrs.setBounds(100, 120, 32, 38);
		getContentPane().add(lblimgVerUsrs);
		
		lblimgMiDesp = new JLabel("");
		lblimgMiDesp.setIcon(new ImageIcon(new File("").getAbsolutePath() + "\\CarroDPM.png"));
		lblimgMiDesp.setBounds(100, 180, 32, 38);
		getContentPane().add(lblimgMiDesp);
		
	}
}
