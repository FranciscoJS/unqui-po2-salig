package ejercicios.stream.ejercicio04;
import java.util.ArrayList;
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
	
}
