package tp05.cliente;
import tp05.caja.*;
import tp05.factura.*;
import tp05.producto.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cliente
{
	private List<Producto> listaProductos = new ArrayList<Producto>();
	private List<Factura> listaFacturas = new ArrayList<Factura>();
	
	
	public List<Producto> getProductos()
	{
		return this.listaProductos;
	}
	
	
	public List<Factura> getFacturas()
	{
		return this.listaFacturas;
	}
	
	
	public void agregarProducto(Producto producto)
	{
		this.listaProductos.add(producto);
	}
	
	public void agregarFactura(Factura factura)
	{
		this.listaFacturas.add(factura);
	}
	
	
	public void agregarProductos(List<Producto> productos)
	{
		this.listaProductos.addAll(productos);
	}
	

	public void agregarFacturas(List<Factura> facturas)
	{
		this.listaFacturas.addAll(facturas);
	}
	
	
	public float montoAPagar(Caja caja)
	{
		return caja.registrarProductos(this);
	}
}
