package co.edu.unbosque.model;

import java.io.Serializable;

public class Vuelo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String aerolinea;
	private String numPasajeros;
	private String nombreCapitan;
	private String nombreCopiloto;
	private String horaLlegada;
	private String horaSalida;
	private String pesoCombustible;
	private String pesoEquipaje;

	public Vuelo() {

	}

	public Vuelo(String aerolinea, String numPasajeros, String nombreCapitan, String nombreCopiloto, String horaLlegada,
			String horaSalida, String pesoCombustible, String pesoEquipaje) {
		super();
		this.aerolinea = aerolinea;
		this.numPasajeros = numPasajeros;
		this.nombreCapitan = nombreCapitan;
		this.nombreCopiloto = nombreCopiloto;
		this.horaLlegada = horaLlegada;
		this.horaSalida = horaSalida;
		this.pesoCombustible = pesoCombustible;
		this.pesoEquipaje = pesoEquipaje;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(String numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public String getNombreCapitan() {
		return nombreCapitan;
	}

	public void setNombreCapitan(String nombreCapitan) {
		this.nombreCapitan = nombreCapitan;
	}

	public String getNombreCopiloto() {
		return nombreCopiloto;
	}

	public void setNombreCopiloto(String nombreCopiloto) {
		this.nombreCopiloto = nombreCopiloto;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getPesoCombustible() {
		return pesoCombustible;
	}

	public void setPesoCombustible(String pesoCombustible) {
		this.pesoCombustible = pesoCombustible;
	}

	public String getPesoEquipaje() {
		return pesoEquipaje;
	}

	public void setPesoEquipaje(String pesoEquipaje) {
		this.pesoEquipaje = pesoEquipaje;
	}

	@Override
	public String toString() {
		return "Aerolinea:" + aerolinea + "/nNúmero de pasajeros:" + numPasajeros + "/nNombre del capitan:" + nombreCapitan
				+ "/nNombre del copiloto:" + nombreCopiloto + "/nHora de llegada:" + horaLlegada + "/nHora de salida:" + horaSalida
				+ "/nPeso del combustible:" + pesoCombustible + "/n Peso del equipaje=" + pesoEquipaje;
	}
	
}
