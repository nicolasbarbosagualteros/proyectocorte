package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.VueloNacional;
import co.edu.unbosque.model.VueloNacionalDTO;

	public class VueloNacionalDAO implements CRUDOperation<VueloNacionalDTO, VueloNacional> {
	
		private ArrayList<VueloNacional> listaVueloNacional;
		private final String SERIAL_NAME = "vueloNacional.dat";
		private final String FILE_NAME = "vueloNacional.csv";
		
		
		public VueloNacionalDAO() {
			FileHandler.checkFolder();
			readSerialized();		
		}
		
		@Override
		public ArrayList<VueloNacionalDTO> getAll() {
		
			return DataMapper.listaVueloNacionalToListaVueloNacionalDTO(listaVueloNacional);
		}
		
		@Override
		public String showAll() {
			String rta = "";
			if (listaVueloNacional.isEmpty()) {
				return "No hay vuelos ";
			} else {
				for (VueloNacional vueloNacional : listaVueloNacional) {
					rta += vueloNacional;
				}
				return rta;
			}
		}

		

		@Override
		public boolean add(VueloNacionalDTO newData) {
			if(find(DataMapper.vueloNacionalDTOToVueloNacional(newData))==null) {
				listaVueloNacional.add(DataMapper.vueloNacionalDTOToVueloNacional(newData));
				writeFile();
				writeSerialized();
				return true;
			} else {
				return false;
			}
		}

		@Override
		public boolean delete(VueloNacionalDTO toDelete) {
			VueloNacional found = find(DataMapper.vueloNacionalDTOToVueloNacional(toDelete));
			if (found != null) {
				listaVueloNacional.remove(found);
				writeFile();
				writeSerialized();
				return true;

			} else {
				return false;
			}
		}

		@Override
		public VueloNacional find(VueloNacional toFind) {
			VueloNacional found = null;
			if(!listaVueloNacional.isEmpty()){
				for(VueloNacional vueloNacional : listaVueloNacional) {
					if(vueloNacional.getNombreCapitan().equals(toFind.getNombreCapitan())) {
						found = vueloNacional;
						return found;
					} else {
						continue; 
					}
				}
			} else {
				return null;
			}
			return null;
		}

		@Override
		public boolean update(VueloNacionalDTO previous, VueloNacionalDTO newData) {
		
			VueloNacional found = find(DataMapper.vueloNacionalDTOToVueloNacional(newData));
			if (found !=null) {
				listaVueloNacional.remove(found);
				listaVueloNacional.add(DataMapper.vueloNacionalDTOToVueloNacional(newData));
				writeFile();
				writeSerialized();
				return true;
			} else {
				return false;
		}


	}
		
		public void writeFile() {
			String content = "";
			for (VueloNacional vueloNacional : listaVueloNacional) {
				content += vueloNacional.getAerolinea() + ";";
				content += vueloNacional.getNumPasajeros() + ";";
				content += vueloNacional.getNombreCapitan() + ";";
				content += vueloNacional.getNombreCopiloto()+";";
				content += vueloNacional.getHoraLlegada() + ";";
				content += vueloNacional.getHoraSalida()+";";
				content += vueloNacional.getPesoCombustible()+";";
				content += vueloNacional.getPesoEquipaje()+";";
				content += vueloNacional.getTipoMotor();
				content += "\n";
			}

			FileHandler.writeFile(FILE_NAME, content);
		}

		public void readFile() {
			String content = FileHandler.readFile(FILE_NAME);

			if (content.equals("") || content == null) {
				listaVueloNacional = new ArrayList<>();
			} else {
				listaVueloNacional = new ArrayList<>();
				String[] rows = content.split("\n");
				for (String row : rows) {
					String[] cols = row.split(";");
					VueloNacional temporal = new VueloNacional();
					temporal.setAerolinea(cols[0]);
					temporal.setNumPasajeros(cols[1]);
					temporal.setNombreCapitan(cols[2]);
					temporal.setNombreCopiloto(cols[3]);
					temporal.setHoraLlegada(cols[4]);
					temporal.setHoraSalida(cols[5]);
					temporal.setPesoCombustible(cols[6]);
					temporal.setPesoEquipaje(cols[7]);
					temporal.setTipoMotor(cols[8]);
					listaVueloNacional.add(temporal);
				}
			}

		
		}
		public void writeSerialized() {
			FileHandler.writeSerialized(SERIAL_NAME, listaVueloNacional);
		}
		
		public void readSerialized() {
			Object content = FileHandler.readSerialized(SERIAL_NAME);
			if(content == null) {
				listaVueloNacional = new ArrayList<>();
				
			}else {
				listaVueloNacional = (ArrayList<VueloNacional>) content;
			}
		}
		
	}
