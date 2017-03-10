import java.util.ArrayList;
import java.util.Scanner;

public class GestorUsuario {
	ArrayList<Usuario> listaUsuarios;
	Usuario usuario;

	public GestorUsuario(ArrayList<Usuario> listaUsuarios, Usuario usuario) {
		super();
		listaUsuarios = new ArrayList<Usuario>();
		this.usuario = usuario;
	}

	public void addUsuario() {
		for (int i = 0; i<=listaUsuarios.size(); i++) {
			listaUsuarios.add(usuario);
		}
	}

	public void addUsuario(String nombre, Boolean genero, int edad, double altura, double peso, boolean[] enfermedades,
			boolean[] intolerancias, boolean[] gustos) {
		listaUsuarios.add(new Usuario(nombre, genero, edad, altura, peso, enfermedades, intolerancias, gustos));
	}

}
