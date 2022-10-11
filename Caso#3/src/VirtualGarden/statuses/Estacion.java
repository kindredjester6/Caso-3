package VirtualGarden.statuses;

public class Estacion {
	private String startDate;
	private String endDate;
	private String nombre;
	private int minAgua;
	private int maxAgua;
	private int minAbono;
	private int maxAbono;
	private int danno;
	private int crec; //crecimiento
	private int temp; //Usar random
	
	Estacion(String startDate,String endDate,
			String nombre,int minAgua,int maxAgua,
			int minAbono,int maxAbono, int danno
			,int crec, int temp){
		
		setStartDate(startDate);
		setEndDate(endDate);
		setNombre(nombre);
		setMinAbono(minAbono);
		setMaxAbono(maxAbono);
		setMinAgua(minAgua);
		setMaxAgua(maxAgua);
		setDanno(danno);
		setCrec(crec);
		setTemp(temp);
		
	}
	
	public void cambiarEstacion() {
		setStartDate(startDate);
		setEndDate(endDate);
		setNombre(nombre);
		setMinAbono(minAbono);
		setMaxAbono(maxAbono);
		setMinAgua(minAgua);
		setMaxAgua(maxAgua);
		setDanno(danno);
		setCrec(crec);
		setTemp(temp);
	}
	
	public void cambiarTemp() {
		//Usar random
	}
	
	public int getDanno() {
		return danno;
	}

	public int getCrec() {
		return crec;
	}

	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMinAgua() {
		return minAgua;
	}
	public void setMinAgua(int minAgua) {
		this.minAgua = minAgua;
	}
	public int getMaxAgua() {
		return maxAgua;
	}
	public void setMaxAgua(int maxAgua) {
		this.maxAgua = maxAgua;
	}
	public int getMinAbono() {
		return minAbono;
	}
	public void setMinAbono(int minAbono) {
		this.minAbono = minAbono;
	}
	public int getMaxAbono() {
		return maxAbono;
	}
	public void setMaxAbono(int maxAbono) {
		this.maxAbono = maxAbono;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public void setDanno(int danno) {
		this.danno = danno;
	}
	public void setCrec(int crec) {
		this.crec = crec;
	}
}
