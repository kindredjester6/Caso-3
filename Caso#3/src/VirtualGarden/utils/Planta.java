package VirtualGarden.utils;

import java.io.FileNotFoundException;

/*
 * 
+Nombre; String
+ Tamaño; int
+ Salud ; int
+ Viva; boolean
+VelCrecimiento; int
+CantAg; Int
+cantAb; Int

 * */
public class Planta implements Constantes{
	ExtractPlanta attributes;
	String nombre;
	int tamanno;
	int type;
	int Life;
	boolean viva;
	int velCrec; //Vel. crecimiento
	//int cantAg; //Quitar esto para ponerlo en 
	//int cantAb;	//una nueva clase para abonar y regar
	
	public Planta(int type) throws FileNotFoundException{
		
		attributes = new ExtractPlanta(type);
		
		setNombre(attributes.getNombre());
		setSalud(attributes.getMaxLife());
		setVelCrec(1);
		setViva(true);
		setTamanno(1);
	}
	
	public void evaluate(int currentDays) { //mostrar los datos actuales de la planta
		
		//ArrayList<StatusChangeRule> rulesparamiestado = reglas[currentState.getId()];

		System.out.println("Evaluating plant type :"+ this.type);
		/*for(StatusChangeRule rule : rulesparamiestado) {
			if (rule.getMinDays()<=getAgeinDays() && rule.getMaxDays()>=getAgeinDays()) {
				this.currentState = rule.getNextState();
				break;
			}
		}*/
	
	}
	public void crecer(int num) {
		
		this.tamanno = num;
	}
	
	public void morir() {
		if (Life == 0) {
			setViva(false);
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanno() {
		return tamanno;
	}

	public void setTamanno(int tamanno) {
		this.tamanno = tamanno;
	}

	public int getSalud() {
		return Life;
	}

	public void setSalud(int salud) {
		this.Life = salud;
	}

	public boolean isViva() {
		return viva;
	}

	public void setViva(boolean viva) {
		this.viva = viva;
	}

	public int getVelCrec() {
		return velCrec;
	}

	public void setVelCrec(int velCrec) {
		this.velCrec = velCrec;
	}

	@Override
	public String toString() {
		return  ", nombre=" + nombre + ", tamanno=" + tamanno + ", type=" + type
				+ ", Life=" + Life + ", viva=" + viva + ", velCrec=" + velCrec + "]";
	}
	
	
	
}
