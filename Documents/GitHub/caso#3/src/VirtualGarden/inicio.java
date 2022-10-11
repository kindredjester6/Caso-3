package VirtualGarden;

import java.io.FileNotFoundException;

import VirtualGarden.Simulacion.ThreadSim;
import VirtualGarden.statuses.StatusManager;
import VirtualGarden.utils.ExtractPlanta;
import VirtualGarden.utils.Planta;

public class inicio {

	public static void main(String[] args) throws FileNotFoundException   {
		
		ExtractPlanta attributes1 = new ExtractPlanta(0); //Lista de planta
		ExtractPlanta attributes2 = new ExtractPlanta(1);
		ExtractPlanta attributes3 = new ExtractPlanta(2);
		
		StatusManager manager = new StatusManager(0, attributes1);
		ThreadSim sim = new ThreadSim(manager);
		
		sim.addObserver(manager);
		
		Thread simThread = new Thread(sim);
		simThread.start();
		
		//Planta planta = new Planta(0, attributes1);
		//System.out.println(planta.toString());
		
	}
}