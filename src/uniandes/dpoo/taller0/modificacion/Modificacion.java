package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		/**
		 * Carga el archivo con la informacion de los atletas
		 * Imprime el resultado de una busqueda del pais con mas medallistas
		 */
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());

	}
}
