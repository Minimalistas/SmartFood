package packageDefault;

public class GestorDieta {

	public GestorDieta() {
		
		ClaseMainSF.miDespensa.getListaProductos(); //lista productos
		ClaseMainSF.miDespensa.getListaProductos().get(2); //producto numero 2 de la lista de productos
		ClaseMainSF.miDespensa.getListaProductos().get(2).getNombre(); //nombre del producto numero 2 de la lista de productos
		
	}
	
}
