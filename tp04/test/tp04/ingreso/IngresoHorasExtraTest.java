package tp04.ingreso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoHorasExtraTest
{

	private IngresoHorasExtra ingreso;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		ingreso = new IngresoHorasExtra("Febrero", "Horas Extra", 500, 4);
	}

	
	@Test
	void test()
	{
		assertEquals( 0, ingreso.getMontoImponible() );
		assertEquals( 500, ingreso.getMontoPercibido() );
	}
}
