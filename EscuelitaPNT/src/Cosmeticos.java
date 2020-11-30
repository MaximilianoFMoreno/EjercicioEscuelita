
public class Cosmeticos extends Producto{
	
	int contenido;

	public Cosmeticos() {
		super();
	}

	public Cosmeticos(String nombre_producto, Double precio_producto, String tipo_producto, int contenido) {
		super(nombre_producto, precio_producto, tipo_producto);
		this.contenido = contenido;
		
	}


	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre_producto+ " ///  "+ "Contenido:  "+contenido+"ml"+ "  ///  " + "Precio: $"+precio_producto; 
							} 
	
}
