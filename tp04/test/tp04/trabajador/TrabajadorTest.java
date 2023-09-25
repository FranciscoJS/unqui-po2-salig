package tp04.trabajador;
import tp04.ingreso.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest
{
	private Trabajador trabajador1;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoHorasExtra ingreso3;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		trabajador1 = new Trabajador( "jorge" );
		ingreso1 = new Ingreso("Abril", "Sueldo basico", 500);
		ingreso2 = new Ingreso("Mayo", "Sueldo basico", 700);
		ingreso3 = new IngresoHorasExtra("Mayo", "Horas extra", 200, 4);
		
		trabajador1.percibirIngreso(ingreso1);
		trabajador1.percibirIngreso(ingreso2);
		trabajador1.percibirIngreso(ingreso3);
	}

	
	@Test
	void test()
	{
		assertEquals( 1400, trabajador1.getTotalPercibido() );
		assertEquals( 1200, trabajador1.getMontoImponible() );
		assertEquals(24, trabajador1.getImpuestoAPagar() );
	}
}
