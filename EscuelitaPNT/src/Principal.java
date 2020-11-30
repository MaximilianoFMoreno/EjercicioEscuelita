import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	
	public static void cargarProductos(List<Producto> array){
		
		Gaseosas gas1 = new Gaseosas("Coca Cola Zero", 20.0,"Gaseosa", 1.5); 
		Gaseosas gas2 = new Gaseosas("Coca Cola", 18.0,"Gaseosa", 1.5); 
		Cosmeticos cos1 = new Cosmeticos("Shampoo Sedal", 19.0, "Cosmetico",  500); 
		Frutas frut1 = new Frutas("Frutillas",64.0,"Fruta","kilo"); 
		//Frutas fru2 = new Frutas("Pera",80.0,"Fruta","kilo"); TEST
		
		array.add(gas1);
		array.add(gas2);
		array.add(cos1);
		array.add(frut1);
		//array.add(fru2); TEST
	}
	
	
	
	public static void main(String[] args) {
		
		List<Producto> productos = new ArrayList<Producto>();
		cargarProductos(productos); 
		
		for (Producto producto : productos) {
			if(producto.getTipo_producto() == "Gaseosa"){
				System.out.println(((Gaseosas) producto).toString());	
			}
			else if (producto.getTipo_producto() == "Cosmetico"){
				System.out.println(((Cosmeticos) producto).toString());
			}
			else if(producto.getTipo_producto() == "Fruta"){	
				System.out.println(((Frutas) producto).toString());
			}	
			
			}
		System.out.println("=====================================================");
		Collections.sort(productos, new Ordenar());
		Producto pr = productos.get(productos.size()-1); 
		System.out.println("Producto más caro: " + pr.nombre_producto);
		System.out.println("Producto más barato: " + productos.get(0).nombre_producto);
			
			
			
			
			
		}
		
		
	}


