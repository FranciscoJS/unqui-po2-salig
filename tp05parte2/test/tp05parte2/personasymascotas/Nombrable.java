package tp05parte2.personasymascotas;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;

class PersonaTest
{

	public static void main(String[] args)
	{
		final Persona persona1 = new Persona( "Jorge", LocalDate.of(1985, 12, 25) );
		final Persona persona2 = new Persona( "Julia", LocalDate.of(2000, 7, 3) );
		final Mascota pepe = new Mascota( "Pepe", "Sapo" );
		final Mascota osiris = new Mascota( "Osiris", "Gato" );
		
		final Collection<Nombrable> listaDeNombrables = new ArrayList<Nombrable>();
		listaDeNombrables.add(persona1);
		listaDeNombrables.add(persona2);
		listaDeNombrables.add(pepe);
		listaDeNombrables.add(osiris);
		

		final Collection<String> listaDeNombres = new ArrayList<String>();
		for( Nombrable nombrable:  listaDeNombrables )
		{
			listaDeNombres.add( nombrable.getNombre() );
		}

		System.out.println( listaDeNombres );
	}
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		
	}

	
	@Test
	void test()
	{
		fail("Not yet implemented");
	}

}
