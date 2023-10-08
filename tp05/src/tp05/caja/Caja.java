package tp05.caja;
import tp05.producto.*;
import tp05.factura.*;
import tp05.cliente.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Caja
{
	public float registrarProductos(Cliente cliente)
	{
		float montoActual = 0;
		for( Producto producto: cliente.getProductos() )
		{
			montoActual += producto.registrar(this);
		}
		return montoActual;
	}
	
	public float registrarFacturas(Cliente cliente)
	{
		float montoActual = 0;
		for( Factura factura: cliente.getFacturas() )
		{
			montoActual += factura.registrar(this);
		}
		return montoActual;
	}
	
	/*
	 	for( Producto producto: cliente.getProductos() )
		{
			montoActual += producto.registrar(this);
		}
		
	 	
	 */
	
}
