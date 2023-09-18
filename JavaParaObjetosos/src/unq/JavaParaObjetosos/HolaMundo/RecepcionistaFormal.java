package unq.JavaParaObjetosos.HolaMundo;

import unq.JavaParaObjetosos.Entes.Nombrable;

public class RecepcionistaFormal extends Recepcionista
{
	@Override
	protected String armarSaludo(Nombrable nombrable)
	{
		return "Buen dia estimado " + nombrable.getNombre();
	}
}

/*
	El @Override es una annotation. Es información adicional que se le puede agregar a un método, atributo o clase
	para que alguien pueda leerla en otro momento. La lee eclipse para saber ese método debe sobreescribir a uno de
	una clase superior de la jerarquía.
*/
