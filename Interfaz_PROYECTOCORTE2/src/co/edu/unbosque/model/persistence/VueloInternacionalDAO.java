package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.VueloInternacional;
import co.edu.unbosque.model.VueloInternacionalDTO;


public class VueloInternacionalDAO implements CRUDOperation<VueloInternacionalDTO, VueloInternacional> {
	
	private ArrayList<VueloInternacional> listaVueloInternacional;
	private final String FILE_NAME = "vueloInternacional.csv";
	private final String SERIAL_NAME = "vueloInternacional.dat";
	@Override
	public String showAll() {
		String rta = "";
		if (listaVueloInternacional.isEmpty()) {
			return "No hay VueloInternacional en la lista";
		} else {
			for (VueloInternacional vueloInternacional : listaVueloInternacional) {
				rta += vueloInternacional;
			}
			return rta;
		}
	}

	@Override
	public ArrayList<VueloInternacionalDTO> getAll() {
		// TODO Auto-generated method stub
		return DataMapper.listaVueloInternacionalToListaVueloInternacionalDTO(listaVueloInternacional);
	}

	@Override
	public boolean add(VueloInternacionalDTO newData) {
		if(find(DataMapper.vueloInternacionalDTOToVueloInternacional(newData))==null) {
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(VueloInternacionalDTO toDelete) {
		VueloInternacional found = find(DataMapper.vueloInternacionalDTOToVueloInternacional(toDelete));
		if (found != null) {
			writeFile();
			writeSerialized();
			return listaVueloInternacional.remove(found);

		} else {
			return false;
		}
	}

	@Override
	public VueloInternacional find(VueloInternacional toFind) {
		VueloInternacional found = null;
		if(!listaVueloInternacional.isEmpty()){
			for(VueloInternacional vueloInternacional : listaVueloInternacional) {
				if(vueloInternacional.getNombreCapitan().equals(toFind.getNombreCapitan())) {
					found = vueloInternacional;
					return found;
				} else {
					continue; // las sig lineas desps de continue no se ejecutan, saltan a la sig iteracion
				}
			}
		} else {
			return null;
		}
		return null;
	}

	@Override
	public boolean update(VueloInternacionalDTO previous, VueloInternacionalDTO newData) {
	
		VueloInternacional found = find(DataMapper.vueloInternacionalDTOToVueloInternacional(newData));
		if (found !=null) {
			listaVueloInternacional.remove(found);
			listaVueloInternacional.add(DataMapper.vueloInternacionalDTOToVueloInternacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
	}


}
	
	public void writeFile() {
		String content = "";
		for (VueloInternacional m : listaVueloInternacional) {
		content += m.getAerolinea() + ";";
		content += m.getNumPasajeros()+ ";";
		content += m.getNombreCapitan() + ";";
		content += m.getNombreCopiloto() + ";";
		content += m.getHoraLlegada() + ";";
		content += m.getHoraSalida() + ";";
		content += m.getPesoCombustible() + ";";
		content += m.getPesoEquipaje() + ";";
		content += "\n";
	}
		FileHandler.writeFile(FILE_NAME, content);
	}
	
	public void readFile() {
		String content = FileHandler.readFile(FILE_NAME);
		if(content.equals("") || content == null) {
			listaVueloInternacional = new ArrayList<>();
		}else {
			listaVueloInternacional = new ArrayList<>();
			String[] rows = content.split("\n");
			for (String row : rows) {
				String[] cols = row.split(";");
				VueloInternacional temp = new VueloInternacional();
				temp.setAerolinea(cols[0]);
				temp.setNumPasajeros(cols[1]);
				temp.setNombreCapitan(cols[2]);
				temp.setNombreCopiloto(cols[3]);
				temp.setHoraLlegada(cols[4]);
				temp.setHoraSalida(cols[5]);
				temp.setPesoCombustible(cols[6]);
				temp.setPesoEquipaje(cols[7]);
				temp.setNumVisa(cols[8]);
				listaVueloInternacional.add(temp);
				
			}
		}
	}
	public void writeSerialized() {
		   FileHandler.writeSerialized(SERIAL_NAME, listaVueloInternacional);
		   
	   }
	
	public void readSerialized() {
		   Object content = FileHandler.readSerialized(SERIAL_NAME);
		   if (content == null) {
			   listaVueloInternacional = new ArrayList<>();
		   }else {
			   listaVueloInternacional =(ArrayList<VueloInternacional>) content;
		   }
	   }
	
}
