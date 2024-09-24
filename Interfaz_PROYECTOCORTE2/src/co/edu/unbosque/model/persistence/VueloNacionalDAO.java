package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.VueloNacional;
import co.edu.unbosque.model.VueloNacionalDTO;
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
		public String showAll() {
			String rta = "";
			if (listaVueloNacional.isEmpty()) {
				return "";
			} else {
				for (VueloNacional t : listaVueloNacional) {
					rta += t;
					readFile();
				}
				return rta;
			}
		}

		/**
		 * Retorna todos los elementos de VueloNacional en una lista de VueloNacionalDTO.
		 * 
		 * @return Lista de VueloNacionalDTO.
		 */

		@Override
		public ArrayList<VueloNacionalDTO> getAll() {
			return DataMapper.listaVueloNacionalToListaVueloNacionalDTO(listaVueloNacional);
		}

		/**
		 * Agrega un nuevo bus VueloNacional a la lista si no existe un duplicado.
		 * 
		 * @param newData El objeto VueloNacionalDTO que representa el nuevo bus.
		 * @return true si el bus se agregó correctamente, false si ya existe.
		 */

		@Override
		public boolean add(VueloNacionalDTO newData) {
			if (find(DataMapper.vueloNacionalDTOToVueloNacional(newData)) == null) {
				listaVueloNacional.add(DataMapper.vueloNacionalDTOToVueloNacional(newData));
				writeFile();
				writeSerialized();
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Elimina un bus VueloNacional de la lista.
		 * 
		 * @param toDelete El objeto VueloNacionalDTO que representa el bus a eliminar.
		 * @return true si el bus fue eliminado, false si no se encontró.
		 */
		

		/**
		 * Busca un bus VueloNacional en la lista por su placa.
		 * 
		 * @param toFind El objeto VueloNacional que se desea encontrar.
		 * @return El objeto VueloNacional encontrado, o null si no se encuentra.
		 */
		@Override
		public VueloNacional find(VueloNacional toFind) {
			VueloNacional found = null;
			if (!listaVueloNacional.isEmpty()) {
				for (VueloNacional VueloNacional : listaVueloNacional) {
					if (VueloNacional.getNombreCapitan().equals(toFind.getNombreCapitan())) {
						found = VueloNacional;
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

		/**
		 * Actualiza un bus VueloNacional existente en la lista.
		 * 
		 * @param previous El objeto VueloNacionalDTO que representa el bus anterior.
		 * @param newData  El objeto VueloNacionalDTO con los nuevos datos del bus.
		 * @return true si el bus fue actualizado correctamente, false si no se
		 *         encontró.
		 */
		@Override
		public boolean delete(VueloNacionalDTO toDelete,VueloNacionalDTO toDelete2,VueloNacionalDTO toDelete3) {
	        VueloNacional found = find(DataMapper.vueloNacionalDTOToVueloNacional(toDelete));
	        VueloNacional found2 = find(DataMapper.vueloNacionalDTOToVueloNacional(toDelete2));
	        VueloNacional found3 = find(DataMapper.vueloNacionalDTOToVueloNacional(toDelete3));
	        if (found != null&&found2 != null&&found3 != null) {
	            listaVueloNacional.remove(found);
	            writeFile();
	            writeSerialized();
	            return true; 
	        } else {
	            return false;
	        }
	    }
		@Override
		public boolean update(VueloNacionalDTO previous, VueloNacionalDTO newData,VueloNacionalDTO previous2, VueloNacionalDTO newData2,VueloNacionalDTO previous3, VueloNacionalDTO newData3) {
			VueloNacional found = find(DataMapper.vueloNacionalDTOToVueloNacional(previous));
			VueloNacional found2 = find(DataMapper.vueloNacionalDTOToVueloNacional(previous2));
			VueloNacional found3 = find(DataMapper.vueloNacionalDTOToVueloNacional(previous3));
			if (found != null&&found2 != null&&found3 !=null) {
				listaVueloNacional.remove(found);
				listaVueloNacional.remove(found2);
				listaVueloNacional.remove(found3);
				listaVueloNacional.add(DataMapper.vueloNacionalDTOToVueloNacional(newData));
				listaVueloNacional.add(DataMapper.vueloNacionalDTOToVueloNacional(newData2));
				listaVueloNacional.add(DataMapper.vueloNacionalDTOToVueloNacional(newData3));
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
