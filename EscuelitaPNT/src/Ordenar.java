import java.util.Comparator;

public class Ordenar implements Comparator<Producto>{

	@Override
	public int compare(Producto p1, Producto p2) {
		return (int) (p1.getPrecio_producto() - p2.getPrecio_producto()); //Casteo a Int para implementar el compare 
	}

}
