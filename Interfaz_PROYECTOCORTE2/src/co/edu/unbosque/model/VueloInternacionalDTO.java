package co.edu.unbosque.model;

public class VueloInternacionalDTO extends VueloDTO {

	private String numVisa;
	
	
	public VueloInternacionalDTO() {

	}


	public VueloInternacionalDTO(String numVisa) {
		super();
		this.numVisa = numVisa;
	}


	public VueloInternacionalDTO(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto,
			String horaLlegada, String horaSalida, String pesoCombustible, String pesoEquipaje, String numVisa) {
		super(aerolinea, numPasajeros, nombreCapitan, nombreCopiloto, horaLlegada, horaSalida, pesoCombustible,
				pesoEquipaje);
		this.numVisa = numVisa;
	}


	public VueloInternacionalDTO(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto,
			String horaLlegada, String horaSalida, String pesoCombustible, String pesoEquipaje) {
		super(aerolinea, numPasajeros, nombreCapitan, nombreCopiloto, horaLlegada, horaSalida, pesoCombustible, pesoEquipaje);
		// TODO Auto-generated constructor stub
	}


	public String getNumVisa() {
		return numVisa;
	}


	public void setNumVisa(String numVisa) {
		this.numVisa = numVisa;
	}

	
	


}
