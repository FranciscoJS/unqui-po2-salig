package tp04.ingreso;


public class Ingreso
{
	private String mesPercepcion;
	private String concepto;
	private float montoPercibido;
	
	
	public Ingreso(String mesPercepcion, String concepto, float montoPercibido)
	{
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	
	public String getMesPercepcion()
	{
		return this.mesPercepcion;
	}
	

	public String getConcepto()
	{
		return this.concepto;
	}
	

	public float getMontoPercibido()
	{
		return this.montoPercibido;
	}
	
	
	public float getMontoImponible()
	{
		return this.getMontoPercibido();
	}
}
