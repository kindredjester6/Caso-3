package VirtualGarden.statuses;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import VirtualGarden.utils.Constantes;
import VirtualGarden.utils.IObserver;
import VirtualGarden.utils.Planta;
import VirtualGarden.Simulacion.SimulatorReport;
//import plants.simulation.SimulatorReport;
import VirtualGarden.utils.*;

public class StatusManager implements IObserver, Constantes {
	private ArrayList<Planta> garden;
	
	public StatusManager() throws FileNotFoundException {
		garden = new ArrayList<Planta>();
		garden.add(new Planta(0));
	}
	
	// la lista de reglas de abono para todas los tipos de planta que viene del json
	// la lista de reglas de agua para todos los tipos de planta que viene del json
	// lo mismo para la temperatura...
	
	public void evaluate(int pCurrentDays) {
		for(Planta currentPlant : garden) {
			currentPlant.evaluate(pCurrentDays);
		}		
	}
	
	public void updateTemperature(int cantDays, int temperature) {
		System.out.println("actualizando temp");
	}

	public void updateWater(int cantDays, int agua) {
		System.out.println("actualizando lluvia");
		// las reglas de agua sobre vida
		// recorro todas las plantas del jardin
	}

	public void updateAbono(int cantDays, int abono) {
		// las reglas de abono sobre vida
		// recorro todas las plantas del jardin
	}

	@Override
	public void update(Observable o, Object arg) {
		SimulatorReport simReport = (SimulatorReport)arg;
		if (simReport.action.compareTo(UPDATE_DAYS)==0) {
			evaluate(simReport.days);
		}
		if (simReport.action.compareTo(UPDATE_WEATHER)==0) {
			updateTemperature(simReport.days, simReport.temperature);
			updateWater(simReport.days, simReport.rain);
		}
		
	}
}