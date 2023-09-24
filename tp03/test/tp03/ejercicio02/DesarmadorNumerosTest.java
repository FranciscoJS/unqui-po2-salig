package tp03.ejercicio02;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DesarmadorNumerosTest
{
	private DesarmadorNumeros desarmador;
	private List<Integer> listaEnteros;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		desarmador = new DesarmadorNumeros();
		listaEnteros = new ArrayList<Integer>();
		
		listaEnteros.add(5000);
		listaEnteros.add(100);
		listaEnteros.add(7000);
		listaEnteros.add(8500);
		listaEnteros.add(0);
		listaEnteros.add(-10000);	
		listaEnteros.add(-500);
	}
	
	@Test
	public void test()
	{
		assertEquals( desarmador.nroDeMayorCantidadParesEn_(listaEnteros), -10000 );		
	}
	
	

}

/*
public static void main(String[] args)
{
	DesarmadorNumeros desarmador = new DesarmadorNumeros();
	final List<Integer> listaEnteros = new ArrayList<Integer>();
	
	listaEnteros.add(5000); // 3
	listaEnteros.add(100); // 2
	listaEnteros.add(7000); // 3
	listaEnteros.add(8500); // 3
	listaEnteros.add(0); // 1
	listaEnteros.add(-500); // 2
	listaEnteros.add(-10000);	 // 4
	
	
	System.out.println( desarmador.cantidadDigitosParesDelNro_(8511) );
	System.out.println( desarmador.cantidadDigitosParesDelNro_(7700) );
	 System.out.println( desarmador.cantidadDigitosParesDelNro_(-1000) );
	System.out.println( desarmador.cantidadDigitosParesDelNro_(5000) );
	
	System.out.println( desarmador.nroDeMayorCantidadParesEn_(listaEnteros) );
}
*/
