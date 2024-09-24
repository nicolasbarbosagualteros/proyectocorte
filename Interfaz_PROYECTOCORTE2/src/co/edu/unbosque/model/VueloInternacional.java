package co.edu.unbosque.model;

import java.io.Serializable;

public class VueloInternacional extends Vuelo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numVisa;
	
	public VueloInternacional() {

	}

	public VueloInternacional(String numVisa) {
		super();
		this.numVisa = numVisa;
	}

	public VueloInternacional(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto,
			String horaLlegada, String horaSalida, String pesoCombustible, String pesoEquipaje, String numVisa) {
		super(aerolinea, numPasajeros, nombreCapitan, nombreCopiloto, horaLlegada, horaSalida, pesoCombustible,
				pesoEquipaje);
		this.numVisa = numVisa;
	}

	public VueloInternacional(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto,
			String horaLlegada, String horaSalida, String pesoCombustible, String pesoEquipaje) {
		super(aerolinea, numPasajeros, nombreCapitan, nombreCopiloto, horaLlegada, horaSalida, pesoCombustible, pesoEquipaje);
		
	}

	public String getNumVisa() {
		return numVisa;
	}

	public void setNumVisa(String numVisa) {
		this.numVisa = numVisa;
	}



}



