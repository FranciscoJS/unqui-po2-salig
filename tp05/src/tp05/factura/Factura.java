package tp05.factura;
import tp05.caja.*;

public abstract class Factura implements Agencia
{
	public abstract float getCostoNeto();
	
	public float registrar(Caja caja)
	{
		this.registrarPago(this);
		return this.getCostoNeto();
	}
}
