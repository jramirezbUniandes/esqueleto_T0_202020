package main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import clases.Pelicula;
import controller.Controller;

public class Main 
{
	public ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
	
	public static void main(String[] args) 
	{
		Controller controler = new Controller();
		controler.run();
		
	}
	
	public void cargarListas()
	{
		String archivo = "./data/AllMoviesDetailsCleaned";
		String archivo2 = "./data/AllCasting";
		String linea = "";
		String linea2 = "";
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			BufferedReader br2 = new BufferedReader(new FileReader(archivo2));
			while((linea = br.readLine()) !=null && (linea2 = br2.readLine()) !=null)
			{
				String[] valores = linea.split(";");
				String[] valores2 = linea2.split(";"); 
				if(valores[0] == valores2[0])
				{
				Pelicula agregada = new Pelicula(Integer.parseInt(valores[0]), valores[5], valores[1], valores2[12], Integer.parseInt(valores[18]), Float.parseFloat(valores[17]));
				listaPeliculas.add(agregada);
				}
			} 
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
