package tp05.producto;
import tp05.caja.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest
{
	private ProductoCooperativa leche;
	private Caja caja;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		leche = new ProductoCooperativa(600, 5);
		caja = new Caja();
	}

	
	@Test
	void test()
	{
		assertEquals( 60, leche.getMontoTotalDescuentos() );
		assertEquals( 540, leche.getCostoNeto() );
		leche.registrar(caja);
		assertEquals( 4, leche.getStock() );
	}

}
