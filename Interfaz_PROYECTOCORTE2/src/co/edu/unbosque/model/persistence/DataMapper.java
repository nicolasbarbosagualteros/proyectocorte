package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Vuelo;
import co.edu.unbosque.model.VueloDTO;
import co.edu.unbosque.model.VueloInternacional;
import co.edu.unbosque.model.VueloInternacionalDTO;
import co.edu.unbosque.model.VueloNacional;
import co.edu.unbosque.model.VueloNacionalDTO;


public class DataMapper {


	public static Vuelo vueloDTOToVuelo(VueloDTO dto) {
		Vuelo entity;
		entity = new Vuelo(dto.getAerolinea(), dto.getNumPasajeros(),dto.getNombreCapitan(), dto.getNombreCopiloto(), dto.getHoraLlegada(),dto.getHoraSalida(),dto.getPesoCombustible(), dto.getPesoEquipaje());
		return entity;
	}

	public static VueloDTO vueloToVueloDTO(Vuelo entity) {
		VueloDTO dto;
		dto = new VueloDTO(entity.getAerolinea(), entity.getNumPasajeros(),entity.getNombreCapitan(), entity.getNombreCopiloto(), entity.getHoraLlegada(),entity.getHoraSalida(),entity.getPesoCombustible(), entity.getPesoEquipaje());
		return dto;
	}

	public static ArrayList<VueloDTO> listaVueloToListaVueloDTO
		(ArrayList<Vuelo> entityList) {
		ArrayList<VueloDTO> dtoList = new ArrayList<>();
		for (Vuelo m : entityList) {
			dtoList.add(new VueloDTO(m.getAerolinea(), m.getNumPasajeros(),m.getNombreCapitan(), m.getNombreCopiloto(), m.getHoraLlegada(),m.getHoraSalida(),m.getPesoCombustible(), m.getPesoEquipaje()));
		}
		return dtoList;
	}
	
	public static ArrayList<Vuelo> listaVueloDTOToListaVuelo
		(ArrayList<VueloDTO> dtoList){
		ArrayList<Vuelo> entityList = new ArrayList<>();
		for (VueloDTO d : dtoList) {
			entityList.add(new Vuelo(d.getAerolinea(), d.getNumPasajeros(),d.getNombreCapitan(), d.getNombreCopiloto(), d.getHoraLlegada(),d.getHoraSalida(),d.getPesoCombustible(), d.getPesoEquipaje()));
		}
		return entityList;
	}
	
	
	//..........................................VueloInternacional................................

	public static VueloInternacional vueloInternacionalDTOToVueloInternacional(VueloInternacionalDTO dto) {
		VueloInternacional entity;
		entity = new VueloInternacional(dto.getAerolinea(), dto.getNumPasajeros(),dto.getNombreCapitan(), dto.getNombreCopiloto(), dto.getHoraLlegada(),dto.getHoraSalida(),dto.getPesoCombustible(), dto.getPesoEquipaje(), dto.getNumVisa());
		return entity;
	}

	public static VueloInternacionalDTO vueloInternacionalToVueloInternacionalDTO(VueloInternacional entity) {
		VueloInternacionalDTO dto;
		dto = new VueloInternacionalDTO(entity.getAerolinea(), entity.getNumPasajeros(),entity.getNombreCapitan(), entity.getNombreCopiloto(), entity.getHoraLlegada(),entity.getHoraSalida(),entity.getPesoCombustible(), entity.getPesoEquipaje(), entity.getNumVisa());
		return dto;
	}

	public static ArrayList<VueloInternacionalDTO> listaVueloInternacionalToListaVueloInternacionalDTO
		(ArrayList<VueloInternacional> entityList) {
		ArrayList<VueloInternacionalDTO> dtoList = new ArrayList<>();
		for (VueloInternacional m : entityList) {
			dtoList.add(new VueloInternacionalDTO(m.getAerolinea(), m.getNumPasajeros(),m.getNombreCapitan(), m.getNombreCopiloto(), m.getHoraLlegada(),m.getHoraSalida(),m.getPesoCombustible(), m.getPesoEquipaje(), m.getNumVisa()));
		}
		return dtoList;
	}
	
	public static ArrayList<VueloInternacional> listaVueloInternacionalDTOToListaVueloInternacional
		(ArrayList<VueloInternacionalDTO> dtoList){
		ArrayList<VueloInternacional> entityList = new ArrayList<>();
		for (VueloInternacionalDTO d : dtoList) {
			entityList.add(new VueloInternacional(d.getAerolinea(), d.getNumPasajeros(),d.getNombreCapitan(), d.getNombreCopiloto(), d.getHoraLlegada(),d.getHoraSalida(),d.getPesoCombustible(), d.getPesoEquipaje(), d.getNumVisa()));
		}
		return entityList;
	}
	
	//...............................VueloNacional....................................
	
	public static VueloNacional vueloNacionalDTOToVueloNacional(VueloNacionalDTO dto) {
		 VueloNacional entity;
		entity = new  VueloNacional(dto.getAerolinea(), dto.getNumPasajeros(),dto.getNombreCapitan(), dto.getNombreCopiloto(), dto.getHoraLlegada(),dto.getHoraSalida(),dto.getPesoCombustible(), dto.getPesoEquipaje(),dto.getTipoMotor());
		return entity;
	}

	public static VueloNacionalDTO vueloNacionalToVueloNacionalDTO( VueloNacional entity) {
		VueloNacionalDTO dto;
		dto = new VueloNacionalDTO(entity.getAerolinea(), entity.getNumPasajeros(),entity.getNombreCapitan(), entity.getNombreCopiloto(), entity.getHoraLlegada(),entity.getHoraSalida(),entity.getPesoCombustible(), entity.getPesoEquipaje(),entity.getTipoMotor());
		return dto;
	}

	public static ArrayList<VueloNacionalDTO> listaVueloNacionalToListaVueloNacionalDTO
		(ArrayList< VueloNacional> entityList) {
		ArrayList<VueloNacionalDTO> dtoList = new ArrayList<>();
		for ( VueloNacional m : entityList) {
			dtoList.add(new VueloNacionalDTO(m.getAerolinea(), m.getNumPasajeros(),m.getNombreCapitan(), m.getNombreCopiloto(), m.getHoraLlegada(),m.getHoraSalida(),m.getPesoCombustible(), m.getPesoEquipaje(), m.getTipoMotor()));
		}
		return dtoList;
	}
	
	public static ArrayList< VueloNacional> listaVueloNacionalDTOToListaVueloNacional
		(ArrayList<VueloNacionalDTO> dtoList){
		ArrayList< VueloNacional> entityList = new ArrayList<>();
		for (VueloNacionalDTO d : dtoList) {
			entityList.add(new  VueloNacional(d.getAerolinea(), d.getNumPasajeros(),d.getNombreCapitan(), d.getNombreCopiloto(), d.getHoraLlegada(),d.getHoraSalida(),d.getPesoCombustible(), d.getPesoEquipaje(), d.getTipoMotor()));
		}
		return entityList;
	}
}
