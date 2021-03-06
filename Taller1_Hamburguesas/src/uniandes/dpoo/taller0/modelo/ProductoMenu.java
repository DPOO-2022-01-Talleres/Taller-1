package uniandes.dpoo.taller0.modelo;

/**
 * Esta clase encapsula la información de un producto básico del menú.
 */
public class ProductoMenu implements Producto {
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	/**
	 * El nombre del producto.
	 */
	private String nombre;
	
	/**
	 * El precio base u original del producto.
	 */
	private int precioBase;
	
	
	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	/**
	 * Construye un nuevo producto del menú e inicializa sus atributos con la 
	 * información de los parámetros.
	 * 
	 * @param nombre El nombre del producto.
	 * @param precioBase El precio base del producto.
	 */
	public ProductoMenu(String nombre, int precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	
	// ************************************************************************
	// Métodos para consultar los atributos
	// ************************************************************************
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public int getPrecio() {
		return precioBase;
	}
	
	
	// ************************************************************************
	// Otros métodos
	// ************************************************************************
	
	@Override
	public String generarTextoFactura() {
		String factura = "\n" + nombre + "\t" + precioBase;
		return factura;
	}
	
	@Override
	public String generarTextoFacturaTxt() {
		String factura = nombre + "\t" + precioBase;
		return factura;
	}
	
}
