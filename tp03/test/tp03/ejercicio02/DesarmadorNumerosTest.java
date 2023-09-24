package tp03.ejercicio02;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DesarmadorNumerosTest
{

	
	@BeforeEach
	void setUp() throws Exception
	{
		final List<Integer> listaEnteros = new ArrayList<Integer>();
		
		listaEnteros.add(5000);
		listaEnteros.add(100);
		listaEnteros.add(7000);
		listaEnteros.add(8500);
		listaEnteros.add(0);
		listaEnteros.add(-500);
		listaEnteros.add(-1000);	
	}
	
	public static void main(String[] args)
	{
		DesarmadorNumeros desarmador = new DesarmadorNumeros();
		final List<Integer> listaEnteros = new ArrayList<Integer>();
		
		listaEnteros.add(5000);
		listaEnteros.add(100);
		listaEnteros.add(7000);
		listaEnteros.add(8500);
		listaEnteros.add(0);
		listaEnteros.add(-500);
		listaEnteros.add(-1000);	
		
		
		System.out.println( desarmador.cantidadDigitosParesDelNro_(8500) );
		System.out.println( desarmador.cantidadDigitosParesDelNro_(7000) );
		System.out.println( desarmador.cantidadDigitosParesDelNro_(-1000) );
		System.out.println( desarmador.cantidadDigitosParesDelNro_(5000) );
		System.out.println( desarmador.nroDeMayorCantidadParesEn_(listaEnteros) );
	}

	/*
	@Test
	void test()
	{
		
		fail("Not yet implemented");
	}
	*/

}
