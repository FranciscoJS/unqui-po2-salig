package tp2.empleado;
import tp2.empresa.*;
import java.util.Collection;
import java.time.LocalDate;



public class Test
{
	public static void main (String[] args)
	{
		
		EmpleadoPlantaTemporaria empleadoTemporario1 = new EmpleadoPlantaTemporaria("Juan", "Tucuman 3137", "Soltero",
				LocalDate.of(1996, 5, 3), 500, 5);
		
		EmpleadoPlantaTemporaria empleadoTemporario2 = new EmpleadoPlantaTemporaria("Patricia", "Azcuenaga 800", "Casado",
				LocalDate.of(1985, 12, 25), 600, 12);
		
		EmpleadoPlantaPermanente empleadoPermanente1 = new EmpleadoPlantaPermanente("Jorge", "Suipacha 512", "Casado",
				LocalDate.of(1992, 2, 15), 850, false, 0, 7);
		
		EmpleadoPlantaPermanente empleadoPermanente2 = new EmpleadoPlantaPermanente("Hernan", "Corrientes 1245", "Soltero",
				LocalDate.of(1988, 5, 1), 700, true, 4, 5);
		
		Empresa empresa = new Empresa("ASMESA", 243967268);
		
		empresa.agregarEmpleado(empleadoPermanente1);
		empresa.agregarEmpleado(empleadoPermanente2);
		empresa.agregarEmpleado(empleadoTemporario1);
		empresa.agregarEmpleado(empleadoTemporario2);
		
		empleadoTemporario2.generaRecibo();
		
		
		System.out.println( empleadoTemporario2.sueldoBruto() );
		System.out.println( empleadoTemporario2.retenciones() );
		
		
/*
		System.out.println( empresa.montoTotalSueldosBruto() );
		System.out.println( empresa.montoTotalRetenciones() );
		System.out.println( empresa.montoTotalSueldosNeto() );
*/	
		
		
		
		
		
		
		
	
	}
}
