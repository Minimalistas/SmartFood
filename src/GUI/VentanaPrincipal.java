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
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alvaro\\Desktop\\HackForGood\\Icono principaldpm.png"));
		
		setTitle("SmartFood");
		getContentPane().setBackground(new Color(188,255,193));
		getContentPane().setLayout(null);
		setVisible(true);
		setEnabled(true);
		setBounds(250,150, 450, 350);
		
		btnVerUsuarios = new JButton("Ver usuarios");
		btnVerUsuarios.setForeground(new Color(0, 0, 0));
		btnVerUsuarios.setBackground(Color.GRAY);
		btnVerUsuarios.setBounds(149, 120, 126, 38);
		getContentPane().add(btnVerUsuarios);
		btnVerUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuarios ventanaVerUsuarios = new Usuarios();
			}
		});
		
		btnVerDesp = new JButton("Mi despensa");
		btnVerDesp.setForeground(Color.BLACK);
		btnVerDesp.setBackground(Color.GRAY);
		btnVerDesp.setBounds(149, 180, 126, 38);
		getContentPane().add(btnVerDesp);
		btnVerDesp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miDespensa ventVerDesp = new miDespensa();
			}
		});
		
		lblSmartfood = new JLabel("SMARTFOOD");
		lblSmartfood.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSmartfood.setBounds(157, 13, 157, 38);
		getContentPane().add(lblSmartfood);
		
		lblImagenPpal = new JLabel("");
		lblImagenPpal.setIcon(new ImageIcon(new File("").getAbsolutePath() + "\\descargadpm.png"));
		lblImagenPpal.setBounds(300, 86, 109, 108);
		getContentPane().add(lblImagenPpal);
		
		btnNuevoUsuario = new JButton("Nuevo Usuario");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaNuevoUsuario VentCrearUsuario = new VentanaNuevoUsuario(true);
			}
		});
		btnNuevoUsuario.setForeground(new Color(0, 0, 0));
		btnNuevoUsuario.setBackground(Color.GRAY);
		btnNuevoUsuario.setBounds(149, 64, 126, 38);
		getContentPane().add(btnNuevoUsuario);
		
		
		lblimgNewUsr = new JLabel("");
		lblimgNewUsr.setIcon(new ImageIcon(new File("").getAbsolutePath() + "\\addUsrDPM.png"));
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
