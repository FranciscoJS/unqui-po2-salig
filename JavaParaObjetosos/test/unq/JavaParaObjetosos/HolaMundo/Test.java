package unq.JavaParaObjetosos.HolaMundo;
import unq.JavaParaObjetosos.Entes.Persona;
import unq.JavaParaObjetosos.Entes.Nombrable;
import java.util.ArrayList;
import java.util.Collection;
// import java.time.LocalDate;




public class Test
{
	public static void main (String[] args)
	{
		Collection<Nombrable> nombrables = getNombrables();
		Recepcionista recepcionista = makeRecepcionista();
		for( Nombrable nombrable : nombrables )
		{
			recepcionista.saludar(nombrable);
		}
		
		
	/*
		// Mundo mundo; // Defino variable de tipo'Mundo'
		// Recepcionista recepcionista = makeRecepcionista();
		Nombrable nombrable = new Mundo();
		recepcionista.saludar(nombrable);
		nombrable = new Persona("Jose");
		recepcionista.saludar(nombrable);
		
		// new RecepcionistaClasico().saludar(new Mundo());
		// new RecepcionistaFormal().saludar(new Mundo());
		
		/*
		Recepcionista recepcionista; // Defino variable de tipo 'Recepcionista'
		recepcionista = new Recepcionista();
		mundo = new Mundo();
		recepcionista.saludar(mundo);
		*/
		/*
		 new Repecionista().saludar(new Mundo()); Es otra opción sin declarar variables puesto que éstas no se vuelven
		 	a usar...
		*/
	
	}

	private static Recepcionista makeRecepcionista()
	{
		return new RecepcionistaFormal();
	}
	
	private static Collection<Nombrable> getNombrables()
	{
		Collection<Nombrable> nombrables = new ArrayList<Nombrable>();
		nombrables.add(new Mundo());
		nombrables.add(new Persona("Juan"));
		nombrables.add(new Persona("Jose"));
		return nombrables;
	}
}

/*
	> La palabra 'static' indica que es un método de clase.
	> String[] es un array de String.
	
*/