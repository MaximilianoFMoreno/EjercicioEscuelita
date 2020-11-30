
public class Gaseosas extends Producto{
	
	 Double litros;

	public Gaseosas() {
		super();
	}
	
	public Gaseosas(String nombre_producto, Double precio_producto, String tipo_producto, Double litros) {
		super(nombre_producto, precio_producto, tipo_producto);
		this.litros = litros;
		
	}
	
	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return 
				"Nombre: " +nombre_producto + " /// "+ "Litros: "+litros + " /// "+ "Precio: $"+precio_producto;
				
	}

	
	
	 
	 
	 

}
