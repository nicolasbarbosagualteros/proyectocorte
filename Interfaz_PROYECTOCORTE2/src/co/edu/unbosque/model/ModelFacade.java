package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.VueloNacionalDAO;
import co.edu.unbosque.model.persistence.VueloDAO;
import co.edu.unbosque.model.persistence.VueloInternacionalDAO;

public class ModelFacade {

	private VueloNacionalDAO vueloNacionalDAO;
	private VueloInternacionalDAO vueloInternacionalDAO;
	private VueloDAO vueloDAO;
	
	public ModelFacade() {
	
		vueloNacionalDAO = new VueloNacionalDAO();
		vueloInternacionalDAO = new VueloInternacionalDAO();
		vueloDAO = new VueloDAO();
	}

	public VueloNacionalDAO getVueloNacionalDAO() {
		return vueloNacionalDAO;
	}

	public void setVueloNacionalDAO(VueloNacionalDAO vueloNacionalDAO) {
		this.vueloNacionalDAO = vueloNacionalDAO;
	}

	public VueloInternacionalDAO getVueloInternacionalDAO() {
		return vueloInternacionalDAO;
	}

	public void setVueloInternacionalDAO(VueloInternacionalDAO vueloInternacionalDAO) {
		this.vueloInternacionalDAO = vueloInternacionalDAO;
	}

	public VueloDAO getVueloDAO() {
		return vueloDAO;
	}

	public void setVueloDAO(VueloDAO vueloDAO) {
		this.vueloDAO = vueloDAO;
	}


	
}
