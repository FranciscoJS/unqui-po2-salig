package unq.JavaParaObjetosos.HolaMundo;

import unq.JavaParaObjetosos.Entes.Nombrable;

public class RecepcionistaClasico extends Recepcionista
{
	@Override
	protected String armarSaludo(Nombrable nombrable)
	{
		return "hola " + nombrable.getNombre();
	}
}
