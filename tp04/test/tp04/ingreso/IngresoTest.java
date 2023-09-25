package tp04.ingreso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest
{
	private Ingreso ingreso1;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		ingreso1 = new Ingreso("Diciembre", "Sueldo basico", 1500);
	}

	@Test
	void test()
	{
		assertEquals( 1500, ingreso1.getMontoImponible() );
		assertEquals( 1500, ingreso1.getMontoPercibido() );
	}

}
