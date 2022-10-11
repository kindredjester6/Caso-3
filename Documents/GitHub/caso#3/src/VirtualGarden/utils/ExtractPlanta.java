package VirtualGarden.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExtractPlanta {
	private String url;
	private String forma;
	private int iD; 
	private int tiempo;
	private int minLife;
	private int maxLife;
	private int minAg;
	private int maxAg;
	private int maxAb;
	private int minAb;
	private JsonArray rules;
	private String nombre;
	private int tamanno;
	private int salud;
	private boolean viva;
	//private int cantAg; //Quitar esto para ponerlo en 
	//private int cantAb;	//una nueva clase para abonar y regar
	private JsonObject datosPlant;
	private JsonObject estate;

	public ExtractPlanta(int numPlant) throws FileNotFoundException {
		parsearJson(numPlant);

		extractNombre(); 

		getStates();

	}

	@SuppressWarnings("deprecation")
	public void parsearJson (int numPlant) throws FileNotFoundException {
		FileReader arc = new FileReader("C:/Users/Oscar Campos Argueda/eclipse-workspace/caso#3/src/VirtualGarden/plantas.json");
		JsonParser parser = new JsonParser();
		JsonElement datosArch = parser.parse(arc);
		JsonObject jobject = datosArch.getAsJsonObject();
		this.datosPlant = (JsonObject) jobject.getAsJsonArray("plantas").get(numPlant); //Esta en la planta que solicitó el usuario
	}
 
	public String extractNombre() {
		JsonElement extraxtElem; //Extrae el elemento que necesito
		extraxtElem = ((JsonObject) datosPlant).get("nombre");
		this.nombre = extraxtElem.getAsString();
		return this.nombre;
	}

	
	
	public void getStates() {
		
		estate = (JsonObject) datosPlant.getAsJsonObject().getAsJsonArray("estados").get(iD);
		this.iD = estate.get("id").getAsInt();
		this.minLife = estate.get("minLife").getAsInt();
		this.maxLife = estate.get("maxLife").getAsInt();
		this.forma = estate.get("nombre").getAsString();
		this.url = estate.get("foto").getAsString();
		this.rules = estate.get("rules").getAsJsonArray();

	}

	public String getNombre() {
		return this.nombre;
	}

	public String getUrl() {
		return url;
	}

	public String getForma() {
		return forma;
	}

	public int getiD() {
		return iD;
	}

	public int getTiempo() {
		return tiempo;
	}

	public int getMinLife() {
		return minLife;
	}

	public int getMaxLife() {
		return maxLife;
	}

	public int getMinAg() {
		return minAg;
	}

	public int getMaxAg() {
		return maxAg;
	}

	public int getMaxAb() {
		return maxAb;
	}

	public int getMinAb() {
		return minAb;
	}

	public JsonArray getRules() {
		return rules;
	}

	public int getTamanno() {
		return tamanno;
	}

	public int getSalud() {
		return salud;
	}

	public boolean isViva() {
		return viva;
	}

	@Override
	public String toString() {
		return "ExtractPlanta [url=" + url + "\n, forma=" + forma + "\n, iD=" + iD + "\n, tiempo=" + tiempo + "\n, minLife="
				+ minLife + "\n, maxLife=" + maxLife + "\n, minAg=" + minAg + "\n, maxAg=" + maxAg + "\n, maxAb=" + maxAb
				+ "\n, minAb=" + minAb + "\n, rules=" + rules + "\n, nombre=" + nombre + "\n, tamanno=" + tamanno + "\n, salud="
				+ salud + "\n, viva=" + viva + "\n, velCrec=" + "\n, cantAg=" + "\n, datosPlant=" + datosPlant +
				"\n, estate=" + estate + "]";
	}

}