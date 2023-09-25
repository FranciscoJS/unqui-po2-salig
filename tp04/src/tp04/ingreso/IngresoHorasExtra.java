package tp04.ingreso;

public class IngresoHorasExtra extends Ingreso
{
	private int horasExtra;
	
	
	public IngresoHorasExtra(String mesPercepcion, String concepto, float montoPercibido, int horasExtra)
	{
		super(mesPercepcion, concepto, montoPercibido);
		this.horasExtra = horasExtra;
	}
	
	@Override
	public float getMontoImponible()
	{
		return 0;
	}
}
