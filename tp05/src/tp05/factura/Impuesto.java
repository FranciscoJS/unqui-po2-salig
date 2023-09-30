package tp05.factura;
import tp05.caja.*;

public class Impuesto extends Factura
{
	private float tasaDelServicio;
	
	public Impuesto(float tasaDelServicio)
	{
		this.tasaDelServicio = tasaDelServicio;
	}
	
	public float getCostoNeto()
	{
		return this.tasaDelServicio;
	}	
}
