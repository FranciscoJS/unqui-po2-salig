package tp05.producto;

public class Descuento
{
	private String concepto;
	private float descuento;
	
	
	Descuento(String concepto, float descuento)
	{
		this.concepto = concepto;
		this.descuento = descuento;
	}
	
	
	String getConcepto()
	{
		return concepto;
	}
	
	
	float getDescuento()
	{
		return descuento;
	}
}
