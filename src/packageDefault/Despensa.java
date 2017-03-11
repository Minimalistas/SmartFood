package packageDefault;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Despensa {

	private ArrayList<Producto> listaProductos;
	private File archivoProductos;
	private Scanner lectorArchivo;
	
	public Despensa() {
		
		listaProductos = new ArrayList<Producto>();
		archivoProductos = new File(new File("").getAbsolutePath() + "\\productosEnDespensa");
		try {
			lectorArchivo = new Scanner(archivoProductos);
		} catch (FileNotFoundException e) {
			
		}
		
		while (lectorArchivo.hasNextLine()) {
			listaProductos.add(new Producto(lectorArchivo.nextLine()));
		}
		
	}
	
	public void añadirProducto(int codBarr) {
		listaProductos.add(new Producto(codBarr));
	}
	
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}
	
}
