package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import packageDefault.ClaseMainSF;
import packageDefault.Usuario;


public class Usuarios extends JFrame  {
	
	JLabel lblUsuario;
	JLabel lblImg;
	JScrollPane scrllPaneUsuarios;
	
	public Usuarios() {
		
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		setEnabled(true);
		setVisible(true);
		setBounds(200, 150, 470, 350);
		
		lblUsuario = new JLabel("Usuarios");
		lblUsuario.setFont(new Font("Dialog", Font.BOLD, 14));
		lblUsuario.setBounds(173, 13, 76, 16);
		getContentPane().add(lblUsuario);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(new File("").getAbsolutePath() + "\\sanddib128.png"));
		lblImg.setBounds(265, 69, 177, 200);
		getContentPane().add(lblImg);
		
		scrllPaneUsuarios = new JScrollPane();
		scrllPaneUsuarios.setBounds(25, 52, 211, 187);
		getContentPane().add(scrllPaneUsuarios);
		
		ArrayList<Usuario> listaUsuarios = ClaseMainSF.gestorUsuarios.getUsuarios();
		
	}
}
