
public class Frutas extends Producto{
	
	String unidad_Venta;

	public Frutas() {
		super();
	}
	
	
	public Frutas(String nombre_producto, Double precio_producto, String tipo_producto, String unidad_Venta) {
		super(nombre_producto, precio_producto, tipo_producto);
		this.unidad_Venta = unidad_Venta;
	}


	public String getUnidad_Venta() {
		return unidad_Venta;
	}

	public void setUnidad_Venta(String unidad_Venta) {
		this.unidad_Venta = unidad_Venta;
	}


	@Override
	public String toString() {
		return 
				"Nombre: "+ nombre_producto+ " /// "+ "Precio: $"+ precio_producto+ " /// "+ "Unidad de Venta: "+unidad_Venta; 
				
	} 
	
	
	
	

}
