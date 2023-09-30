package tp05.factura;

public class Servicio extends Factura
{
	private float costoPorUnidad;
	private int unidadesConsumidas;
	
	public Servicio(float costoPorUnidad, int unidadesConsumidas)
	{
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	public float getCostoNeto()
	{
		return this.costoPorUnidad * this.unidadesConsumidas;
	}
}
