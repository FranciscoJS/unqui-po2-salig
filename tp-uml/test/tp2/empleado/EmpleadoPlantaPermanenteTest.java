package tp2.empleado;

import java.time.LocalDate;

public class EmpleadoPlantaPermanenteTest
{
	
	
	public static void main (String[] args)
	{
		EmpleadoPlantaTemporaria empleadoTemporario1 = new EmpleadoPlantaTemporaria("Juan", "Tucuman 3137", "Soltero",
				LocalDate.of(1996, 10, 3), 500, 5);
		
		EmpleadoPlantaTemporaria empleadoTemporario2 = new EmpleadoPlantaTemporaria("Patricia", "Azcuenaga 800", "Casado",
				LocalDate.of(1985, 12, 25), 600, 12);
		
		EmpleadoPlantaPermanente empleadoPermanente1 = new EmpleadoPlantaPermanente("Jorge", "Suipacha 512", "Casado",
				LocalDate.of(1992, 2, 15), 850, false, 0, 7);
		
		EmpleadoPlantaPermanente empleadoPermanente2 = new EmpleadoPlantaPermanente("Hernan", "Corrientes 1245", "Soltero",
				LocalDate.of(1988, 5, 1), 700, true, 4, 5);
		
		empleadoTemporario1.generaRecibo();
		System.out.println( empleadoTemporario1.edad() );
		// System.out.println( empleadoTemporario1.verRecibo(3) );
		empleadoTemporario1.recibosDeHaberes.get(0).getConceptos();
		
		/*
		empleadoPermanente1.generaRecibo();
		empleadoPermanente1.recibosDeHaberes.get(0).getConceptos();
		*/
		
	}

}
