package tp05parte2.personasymascotas;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable
{
	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	Persona(String nombre, LocalDate fechaNacimiento)
	{
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	
	public String getNombre()
	{
		return nombre;
	}
	
	
	public int getEdad()
	{
		LocalDate fechaActual = LocalDate.now();
		Period diferencia = Period.between(fechaActual, fechaNacimiento);
		return diferencia.getYears();
	}
}

