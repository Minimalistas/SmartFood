package packageDefault;
import GUI.VentanaPrincipal;

public class ClaseMainSF {

	public static VentanaPrincipal miVentanaPpal;
	public static GestorUsuario gestorUsuarios;
	
	public static void main(String[] args) {
		
		gestorUsuarios = new GestorUsuario();
		miVentanaPpal = new VentanaPrincipal();
		
		
	}

}
