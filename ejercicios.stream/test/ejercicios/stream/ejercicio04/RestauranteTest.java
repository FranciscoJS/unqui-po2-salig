package ejercicios.stream.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestauranteTest
{
	
	private Plato milanesa;
	private Plato guiso;
	private Plato asado;
	private Plato tortilla;
	private Restaurante resto;

	@BeforeEach
	void setUp() throws Exception
	{
		
		milanesa = new Plato("Milanesa con fritas", 1500);
		guiso = new Plato("Guiso de lentejas", 1800);
		asado = new Plato("Asado con ensalada", 2000);
		tortilla = new Plato("Tortilla de papas", 1400);
		resto = new Restaurante();
		
		resto.agregarComida(milanesa);
		resto.agregarComida(guiso);
		resto.agregarComida(asado);
		resto.agregarComida(tortilla);
	}

	@Test
	void test()
	{
		assertEquals(3509, resto.platosBaratos());
	}

}
