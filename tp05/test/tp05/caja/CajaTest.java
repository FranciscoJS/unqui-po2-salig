package tp05.caja;
import tp05.producto.*;
import tp05.cliente.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp05.producto.ProductoCooperativa;
import tp05.producto.ProductoTradicional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CajaTest
{
	
	/*
	public static void main(String[] args)
	{
		final Caja caja = new Caja();
		final Cliente cliente = new Cliente();
		final ProductoTradicional cafe = new ProductoTradicional(1200, 3);
		final ProductoTradicional arroz = new ProductoTradicional(800, 15);
		final ProductoCooperativa leche = new ProductoCooperativa(600, 5);
		final ProductoCooperativa aceite = new ProductoCooperativa(2200, 2);
		final List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(cafe);
		listaDeProductos.add(leche);
		listaDeProductos.add(arroz);
		// listaDeProductos.add(aceite);
		cliente.agregarProductos(listaDeProductos);
		
		System.out.println( aceite.getStock() );
		System.out.println( aceite.registrar(caja) );
		System.out.println( aceite.getStock() );
		// System.out.println( leche.getMontoTotalDescuentos() );
		// System.out.printf( "%d mod %d = %d", (numero1 % numero2), 2, ( (numero1 % numero2) % 2 ) );
		
	}	
	*/
	
	private Caja caja;
	private Cliente cliente;
	private ProductoTradicional cafe;
	private ProductoTradicional arroz;
	private ProductoCooperativa leche;
	private ProductoCooperativa aceite;
	private List<Producto> listaDeProductos;
	
	@BeforeEach
	void setUp() throws Exception
	{
		caja = new Caja();
		cliente = new Cliente();
		cafe = new ProductoTradicional(1200, 3);
		arroz = new ProductoTradicional(800, 15);
		leche = new ProductoCooperativa(600, 5);
		aceite = new ProductoCooperativa(2200, 2);
		listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(cafe);
		listaDeProductos.add(leche);
		listaDeProductos.add(arroz);
		listaDeProductos.add(aceite);
		cliente.agregarProductos(listaDeProductos);
	}

	
	@Test
	void testDisminuyeStock()
	{
		assertEquals( 3,  cafe.getStock() );
		cafe.registrar(caja);
		assertEquals( 2,  cafe.getStock() );
	}
	
	
	@Test
	void registrarProductos()
	{
		assertEquals( 4520, caja.registrarProductos(cliente) );		
	}
	
	
	@Test
	void noRegistraProductoSinStock()
	{
		cliente.getProductos().get(0).disminuirStock(3); // Set stock de café en cero.
		assertEquals( 3320, caja.registrarProductos(cliente) ); // Se registran todos los productos menos el café con stock cero.
	}
	
	
}
