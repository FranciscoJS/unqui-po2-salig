package unq.JavaParaObjetosos.HolaMundo;

import unq.JavaParaObjetosos.Entes.Nombrable;

public abstract class Recepcionista
/*
La palabra abstract hace que no se pueda instancair ningún objeto Recepcionista directamente. Se instancian
subclases de la misma. También habilita que ciertos métodos sean abstractos y sea responsabilidad de la subclase
el implementarlos. 
*/
{

	public void saludar(Nombrable nombrable)
	{
		System.out.println(this.armarSaludo(nombrable));
	}

	protected abstract String armarSaludo(Nombrable nombrable);
}


