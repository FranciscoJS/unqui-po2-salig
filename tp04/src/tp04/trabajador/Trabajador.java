package tp04.trabajador;
import java.util.ArrayList;
import java.util.Collection;
import tp04.ingreso.*;

public class Trabajador
{
	private String nombre;
	private Collection<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();
	
	
	Trabajador(String nombre)
	{
		this.nombre = nombre;
	}
	
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	
	public void percibirIngreso(Ingreso ingreso)
	{
		this.ingresosPercibidos.add(ingreso);
	}
	
	
	public float getTotalPercibido()
	{
		float montoTotal = 0;
		for( Ingreso ingreso:  ingresosPercibidos)
		{
			montoTotal = montoTotal + ingreso.getMontoPercibido();
		}
		return montoTotal;
	}
	
	
	public float getMontoImponible()
	{
		float montoTotal = 0;
		for( Ingreso ingreso:  ingresosPercibidos)
		{
			montoTotal = montoTotal + ingreso.getMontoImponible();
		}
		return montoTotal;
	}
	
	
	public float getImpuestoAPagar()
	{
		return this.getMontoImponible() * 2 / 100 ;
	}
}
