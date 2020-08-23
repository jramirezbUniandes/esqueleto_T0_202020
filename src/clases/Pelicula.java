package clases;

import java.awt.List;
import java.util.ArrayList;

public class Pelicula 
{
	private float votosPromedio;
	private int identificador;
	private String nombreDirector;
	private int cantidadVotos;
	private ArrayList<String> nombresActores;
	private String genero;
	/**
	 * Creo que los generos no se crean aquí
	 */
	private String nombresGeneros[];
	private String nombrePelicula; 

	public Pelicula(int pIdentificador, String pNombre, String pGenero, String pNombreDirector, int pCantVotos, float pVotosPromedio)
	{
		identificador = pIdentificador; 
		nombresActores = new ArrayList<String>();
		nombrePelicula = pNombre;
		genero = pGenero;
		nombreDirector = pNombreDirector;
		cantidadVotos = pCantVotos;
		votosPromedio = pVotosPromedio;
	}

	public int darIdentificador()
	{
		return cantidadVotos;
	}
	
	public String darNombrePelicula()
	{
		return nombrePelicula;
	}

	public String darNombreDirector()
	{
		return nombreDirector;
	}

	public int darCantidadVotos()
	{
		return cantidadVotos;
	}

	public float darVotosPromedio()
	{
		return votosPromedio;
	}

	public ArrayList<String> darListaNombresActores()
	{
		return nombresActores;
	}
}
