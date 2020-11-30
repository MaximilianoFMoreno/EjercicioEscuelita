
public class Producto implements Comparable<Producto>{
	
	String tipo_producto; //Podria crear un ENUM para setear los tipos de producto. Si tengo tiempo lo hago
	String nombre_producto; 
	Double precio_producto; //Uso Double porque me parece mas correcto para manejar los precios. 
	
	
	public Producto(){	}
	
	public Producto(String nombre_producto, Double precio_producto, String tipo_producto) {
		super();
		this.nombre_producto = nombre_producto;
		this.precio_producto = precio_producto;
		this.tipo_producto = tipo_producto; 
	}
	
	public void cargarProducto(){
		
	}
	
	

	public String getTipo_producto() {
		return tipo_producto;
	}

	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Double getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(Double precio_producto) {
		this.precio_producto = precio_producto;
	}

	@Override
	public int compareTo(Producto p) {
		
		return this.precio_producto.compareTo(p.precio_producto);
	} 
	
	
	
	

}
