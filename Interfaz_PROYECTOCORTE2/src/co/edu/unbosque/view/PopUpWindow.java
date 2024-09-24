package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class PopUpWindow {

	private JOptionPane agregado, actualizado, eliminado, noAgregado, noActualizado, noEliminado, textoNoValido, pasajerosNoValido, espaciosVacios, horaNoValida;
	
	public void agregado() {
		agregado.showMessageDialog(null,"Agregado exitosamente");
	}
	
	public void actualizado() {
		actualizado.showMessageDialog(null,"Actualizado exitosamente");
	}
	
	public void eliminado() {
		eliminado.showMessageDialog(null,"Eliminado exitosamente");
	}
	
	public void noAgregado() {
		noAgregado.showMessageDialog(null,"No se agregó");
	}
	
	public void noActualizado() {
		noActualizado.showMessageDialog(null,"No se actualizó");
	}
	
	public void noEliminado() {
		noEliminado.showMessageDialog(null,"No se eliminó");
	}
	
	public void nombreInvalido() {
		textoNoValido.showMessageDialog(null, "Ingrese una entrada válida (no caracteres especiales)");
	}

	
	public void numeroPasajerosErroneo() {
		pasajerosNoValido.showMessageDialog(null, "Ingrese un número de pasajeros válido (mayor a 0 y menor a 300)");
	}
	
	public void espaciosVacios() {
		espaciosVacios.showMessageDialog(null, "No deje espacios sin llenar");
	}
	
	public void horaNoValida() {
		horaNoValida.showMessageDialog(null, "Ingrese una hora válida");
	}
}
