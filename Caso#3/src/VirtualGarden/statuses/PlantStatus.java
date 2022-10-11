package VirtualGarden.statuses;

public enum PlantStatus {
	ALMACIGO(1), 
	MEDIANA(2), 
	GRANDE(3),
	HUMEDA(4),
	MUERTA(0);
	
	private int id;
	
	PlantStatus(int pId) {
		id = pId;
	}
	
	public int getId() {
		return id;
	}
}