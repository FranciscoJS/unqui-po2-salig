package tp2.empresa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import tp2.empleado.*;


public class Empresa
{
	private String nombre;
	private int cuit;
	private Collection<Empleado> listaDeEmpleados = new ArrayList<Empleado>();
	
	public Collection<Empleado> getListaDeEmpleados()
	{
		return this.listaDeEmpleados;
	}
	
	public void agregarEmpleado(Empleado empleado)
	{
		this.listaDeEmpleados.add(empleado);
	}

	public void generarRecibos()
	{
		for( Empleado empleado: listaDeEmpleados )
		{
			empleado.generaRecibo();
		}
	}
	
	public int montoTotalSueldosNeto()
	{
		int monto = 0;
		for( Empleado empleado: listaDeEmpleados )
		{
			monto += empleado.sueldoNeto();
		}
		return monto;
	}
	
	public int montoTotalSueldosBruto()
	{
		int monto = 0;
		for( Empleado empleado: listaDeEmpleados )
		{
			monto += empleado.sueldoBruto();
		}
		return monto;
	}
	
	public int montoTotalRetenciones()
	{
		int monto = 0;
		for( Empleado empleado: listaDeEmpleados )
		{
			monto += empleado.retenciones();
		}
		return monto;
	}
	
	public Empresa(String nombre, int cuit)
	{
		this.nombre = nombre;
		this.cuit = cuit;
	}
	

}

