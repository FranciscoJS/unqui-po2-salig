package ejercicios.stream.ejercicio04;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restaurante
{

	private List<Plato> listaDePlatos = new ArrayList<Plato>();
	
	
	public void agregarComida(Plato comida)
	{
		listaDePlatos.add(comida);
	}
	
	
	public double platosBaratos()
	{
		return listaDePlatos.stream().mapToDouble( e -> e.precioConIva())
				.filter(precio -> precio < 2000)
				.sum();
	}
	
	
	public String platoMasCaro()
	{
		return listaDePlatos.stream().max(Comparator.naturalOrder()).get().getNombre();
	}
}

/*
	El naturalOrder invoca al método por defecto, que en el caso de la interfaz
	Comparator, es compareTo.
*/
