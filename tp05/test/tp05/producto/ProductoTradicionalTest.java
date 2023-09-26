package tp05.producto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoTradicionalTest
{
	public static void main(String[] args)
	{
		final ProductoTradicional cafe = new ProductoTradicional(1200, 3);
		final ProductoCooperativa leche = new ProductoCooperativa(600, 5);
		
		
		System.out.println( cafe.getMontoTotalDescuentos() );
		System.out.println( leche.getMontoTotalDescuentos() );
		// System.out.printf( "%d mod %d = %d", (numero1 % numero2), 2, ( (numero1 % numero2) % 2 ) );
		
	}	

	
	private ProductoTradicional cafe;
		
	@BeforeEach
	void setUp() throws Exception
	{
		cafe = new ProductoTradicional(1200, 3);
	}

	
	@Test
	void test()
	{
		assertEquals( 0, cafe.getMontoTotalDescuentos() );
		assertEquals( 1200, cafe.getCostoNeto() );
	}

}
