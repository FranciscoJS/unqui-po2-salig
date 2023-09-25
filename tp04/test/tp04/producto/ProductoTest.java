package tp04.producto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest
{
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	void setUp() throws Exception
	{
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d, false);
	}

	@Test
	void testConstructor()
	{
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9, arroz.getPrecio());
		assertTrue(arroz.esPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(55, vino.getPrecio());
		assertFalse(vino.esPrecioCuidado());
		
		// fail("Not yet implemented");
	}
	
	@Test
	public void testAumentarPrecio()
	{
		arroz.aumentarPrecio(1.5);
		assertEquals(20.4, arroz.getPrecio());
	}

}
