package co.edu.unbosque.model;

public class VueloNacionalDTO extends VueloDTO {

	private String tipoMotor;


	public VueloNacionalDTO() {

	}


	public VueloNacionalDTO(String tipoMotor) {
		super();
		this.tipoMotor = tipoMotor;
	}


	public VueloNacionalDTO(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto,
			String horaLlegada, String horaSalida, String pesoCombustible, String pesoEquipaje, String tipoMotor) {
		super(aerolinea, numPasajeros, nombreCapitan, nombreCopiloto, horaLlegada, horaSalida, pesoCombustible,
				pesoEquipaje);
		this.tipoMotor = tipoMotor;
	}


	public VueloNacionalDTO(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto,
			String horaLlegada, String horaSalida, String pesoCombustible, String pesoEquipaje) {
		super(aerolinea, numPasajeros, nombreCapitan, nombreCopiloto, horaLlegada, horaSalida, pesoCombustible, pesoEquipaje);
		// TODO Auto-generated constructor stub
	}


	public String getTipoMotor() {
		return tipoMotor;
	}


	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	
	
	
	
}