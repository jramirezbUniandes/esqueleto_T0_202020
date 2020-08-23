package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico<T extends Comparable<T>> implements IArregloDinamico<T>
{
	/**
	 * Capacidad maxima del arreglo
	 */
	private int tamanoMax;
	/**
	 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
	 */
	private int tamanoAct;
	/**
	 * Arreglo de elementos de tamaNo maximo
	 */
	private T elementos[];

	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * @param max Capacidad maxima inicial
	 */
	public ArregloDinamico( int max )
	{
		elementos = (T[]) new Comparable[max];
		tamanoMax = max;
		tamanoAct = 0;
	}

	public void agregarAlFinal( T dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			T copia[] = elementos;
			elementos = (T[]) new Comparable[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		elementos[tamanoAct] = dato;
		tamanoAct++;
	}

	public void agregarAlInicio( T dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			T copia[] = elementos;
			elementos = (T[]) new Comparable[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		
		for (int i = 0; i < tamanoMax; i++) 
		{
			elementos[i] = elementos[i+1];
		}
		elementos[0] = dato;
		tamanoAct++;
	}

	public T eliminarElPrimero()
	{
		T rta = elementos[0];
		for (int i = 0; i < elementos.length; i++) 
		{
			elementos[i] = elementos[i+1];
		}
		return rta; 
	}
	
	public T eliminarElUltimo()
	{
		T rta = elementos[tamanoAct];
		elementos[tamanoAct] = elementos[tamanoAct +1];
		return rta; 
	}

	public T darPrimerElemento()
	{
		T rta = elementos[0];
		return rta; 
	}
	
	public T darUltimoElemento()
	{
		T rta = elementos[tamanoAct];
		return rta; 
	}
	
	public int darCapacidad() 
	{
		return tamanoMax;
	}

	public int darTamano() {
		return tamanoAct;
	}
	
	public boolean estaVacio()
	{
		boolean rta = false;
		if(tamanoAct==0)
		{
			rta = true;
		}
		return rta; 
	}
	
	public int estaPresente(T elemento)
	{
		int rta = -1;
		for (int i = 0; i < tamanoAct+1; i++) 
		{
			if(elementos[i].equals(elemento))
			{
				rta = i;
			}
		}
		return rta; 
	}

	public T darElemento(int i) 
	{
		// TODO implementar
		T rta = null;
		rta = elementos[i];
		return rta; 
	}

	public T buscar(T dato) {
		// TODO implementar
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		T rta = null;
		for (int i = 0; i < tamanoMax; i++) 
		{
			if(elementos[i].compareTo(dato)==0)
			{
				rta = elementos[i];
				break; 
			}
		}
		return rta;
	}

	public void eleminarElemento(T dato)
	{
		for (int i = 0; i < tamanoMax; i++) 
		{
			int posAct= i;
			if(elementos[i].compareTo(dato)==0)
			{
				for(int j = posAct; j< tamanoMax; j++)
				{
					elementos[j] = elementos[j+1];
				}
				break;
			}
		}
	}

	@Override
	public T eliminar(T dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(T dato) {
		// TODO Auto-generated method stub
		
	}

}
