package co.edu.unbosque.model;

import java.io.Serializable;

public class VueloNacional extends Vuelo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoMotor;

	public VueloNacional() {

	}

	public VueloNacional(String tipoMotor) {
		super();
		this.tipoMotor = tipoMotor;
	}

	public VueloNacional(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto,
			String horaLlegada, String horaSalida, String pesoCombustible, String pesoEquipaje, String tipoMotor) {
		super(aerolinea, numPasajeros, nombreCapitan, nombreCopiloto, horaLlegada, horaSalida, pesoCombustible,
				pesoEquipaje);
		this.tipoMotor = tipoMotor;
	}

	public VueloNacional(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto,
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