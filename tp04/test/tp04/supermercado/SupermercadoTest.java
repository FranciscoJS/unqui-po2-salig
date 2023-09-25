package tp04.supermercado;
import tp04.producto.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTest
{

	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp()
	{
		arroz = new Producto("Arroz", 18.9d, true);
		// detergente = new Producto("Detergente", 75d); Consultar cómo hacer para que al no indicarle valor, por defecto sea falso.
		detergente = new Producto("Detergente", 75d, false);
		
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
	}
	
	
	@Test
	public void testCantidadDeProductos()
	{
		assertEquals( 0, supermercado.getCantidadDeProductos() );
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals( 2, supermercado.getCantidadDeProductos() );
	}
	
	
	@Test
	public void testPrecioTotal()
	{
		// assertEquals( new Double(0), supermercado.getPrecioTotal() ); Consultar por qué se crea un objeto tipo doble y no se coloca directamente el valor
		assertEquals( 0, supermercado.getPrecioTotal() );
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals( 93.9, supermercado.getPrecioTotal() );
	}

}
