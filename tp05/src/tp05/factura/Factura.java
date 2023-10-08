package tp05.factura;
import tp05.caja.*;

public abstract class Factura
{
	private Agencia objetoAgencia;
	public abstract float getCostoNeto();
	
	public float registrar(Caja caja)
	{
		objetoAgencia.registrarPago(this);
		return this.getCostoNeto();
	}
}
