package VirtualGarden;

import java.io.FileNotFoundException;

import VirtualGarden.utils.ExtractPlanta;
import VirtualGarden.utils.Planta;

public class inicio {

	public static void main(String[] args) throws FileNotFoundException   {
		int numPlanta = 0;

		ExtractPlanta test = new ExtractPlanta(numPlanta); 

		Planta planta = new Planta(0);
		System.out.println(planta.toString());


	}
}