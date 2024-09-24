package co.edu.unbosque.model.persistence;
import java.util.ArrayList;


import co.edu.unbosque.model.Vuelo;
import co.edu.unbosque.model.VueloDTO;

public class VueloDAO implements CRUDOperation<VueloDTO, Vuelo>{

	private ArrayList<Vuelo> listaVuelo;
	private final String FILE_NAME = "vuelo.csv";
	private final String SERIAL_NAME = "vuelo.dat";
	@Override
	public String showAll() {
		String rta = "";
		if (listaVuelo.isEmpty()) {
			return "No hay Vuelo en la lista";
		} else {
			for (Vuelo vuelo : listaVuelo) {
				rta += vuelo;
			}
			return rta;
		}
	}

	@Override
	public ArrayList<VueloDTO> getAll() {
		// TODO Auto-generated method stub
		return DataMapper.listaVueloToListaVueloDTO(listaVuelo);
	}

	@Override
	public boolean add(VueloDTO newData) {
		if(find(DataMapper.vueloDTOToVuelo(newData))==null) {
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(VueloDTO toDelete) {
		Vuelo found = find(DataMapper.vueloDTOToVuelo(toDelete));
		if (found != null) {
			writeFile();
			writeSerialized();
			return listaVuelo.remove(found);

		} else {
			return false;
		}
	}

	@Override
	public Vuelo find(Vuelo toFind) {
		Vuelo found = null;
		if(!listaVuelo.isEmpty()){
			for(Vuelo vuelo : listaVuelo) {
				if(vuelo.getNombreCapitan().equals(toFind.getNombreCapitan())) {
					found = vuelo;
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
	public boolean update(VueloDTO previous, VueloDTO newData) {
	
		Vuelo found = find(DataMapper.vueloDTOToVuelo(newData));
		if (found !=null) {
			listaVuelo.remove(found);
			listaVuelo.add(DataMapper.vueloDTOToVuelo(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
	}


}
	
	public void writeFile() {
		String content = "";
		for (Vuelo m : listaVuelo) {
		content += m.getAerolinea() + ";";
		content += m.getNumPasajeros()+ ";";
		content += m.getNombreCapitan() + ";";
		content += m.getNombreCopiloto() + ";";
		content += m.getHoraLlegada() + ";";
		content += m.getHoraSalida() + ";";
		content += m.getPesoCombustible() + ";";
		content += m.getPesoEquipaje();
		content += "\n";
	}
		FileHandler.writeFile(FILE_NAME, content);
	}
	
	public void readFile() {
		String content = FileHandler.readFile(FILE_NAME);
		if(content.equals("") || content == null) {
			listaVuelo = new ArrayList<>();
		}else {
			listaVuelo = new ArrayList<>();
			String[] rows = content.split("\n");
			for (String row : rows) {
				String[] cols = row.split(";");
				Vuelo temp = new Vuelo();
				temp.setAerolinea(cols[0]);
				temp.setNumPasajeros((cols[1]));
				temp.setNombreCapitan(cols[2]);
				temp.setNombreCopiloto(cols[3]);
				temp.setHoraLlegada(cols[4]);
				temp.setHoraSalida(cols[5]);
				temp.setPesoCombustible(cols[6]);
				temp.setPesoEquipaje(cols[7]);
				listaVuelo.add(temp);
				
			}
		}
	}
	public void writeSerialized() {
		   FileHandler.writeSerialized(SERIAL_NAME, listaVuelo);
		   
	   }
	
	public void readSerialized() {
		   Object content = FileHandler.readSerialized(SERIAL_NAME);
		   if (content == null) {
			   listaVuelo = new ArrayList<>();
		   }else {
			   listaVuelo =(ArrayList<Vuelo>) content;
		   }
	   }
	
}
