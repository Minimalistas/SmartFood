import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Despensa {

	ArrayList<Producto> listaProductos;
	File archivoProductos;
	Scanner lectorArchivo;
	
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
	
}
