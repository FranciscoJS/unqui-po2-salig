package tp05.producto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tp05.caja.*;
import tp05.cliente.Cliente;

public abstract class Producto
{
	private float costoBruto;
	private int stock;
	Collection<Descuento> descuentos = new ArrayList<Descuento>();
	
	
	Producto(float costoBruto, int stock)
	{
		this.costoBruto = costoBruto;
		this.stock = stock;
	}
	
	
	public Collection<Descuento> getDescuentos()
	{
		return descuentos;
	}
	
	
	float getCostoNeto()
	{
		return costoBruto - this.getMontoTotalDescuentos();
	}
	
	
	public float registrar(Caja caja)
	{
		if( stock > 0 )
		{
			this.disminuirStock(1);
			return this.getCostoNeto();
		}
		else
		{
			return 0;
		}
	}
	
	
	public int getStock()
	{
		return this.stock;
	}
	
	
	private void aumentarStock(int cantidad)
	{
		this.stock += cantidad;
	}
	
	
	public void disminuirStock(int cantidad)
	{
		this.stock -= cantidad;
	}
	
	
	public float getMontoTotalDescuentos()
	{
		float descuentos = 0;

			for( Descuento descuento: this.descuentos )
			{
				descuentos += descuento.getDescuento();
			}
			return costoBruto * descuentos / 100;
	}

}
