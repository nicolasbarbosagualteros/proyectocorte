package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelDeleteNacional extends JPanel{

	private JButton btnBack, btnDelete, btnBackDark, btnDeleteDark;
	private JTextArea vuelos, datoEliminar;
	private JLabel lblBright, lblDark, lblDatoEliminar, listaVuelos, lblLogo, lblLogoDark;
	
	public PanelDeleteNacional() {
		
	
	
		setOpaque(true);
		setLayout(null);
		setPreferredSize(new Dimension(800, 450));
		setBackground(new Color(241, 241, 236));

		Image imageLblBright = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/lblBright.jpeg").getImage();
		ImageIcon imageIconLblBright = new ImageIcon(imageLblBright.getScaledInstance(800, 120, Image.SCALE_SMOOTH));
		lblBright = new JLabel();
		lblBright.setIcon(imageIconLblBright);
		lblBright.setBounds(0, -40, 800, 120);

		
		Image imageLblDark = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/lblDark.png").getImage();
		ImageIcon imageIconLblDark = new ImageIcon(imageLblDark.getScaledInstance(800, 120, Image.SCALE_SMOOTH));
		lblDark = new JLabel();
		lblDark.setIcon(imageIconLblDark);
		lblDark.setBounds(0, -40, 800, 120);
		lblDark.setVisible(false);
		
		Image imageLblLogo = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/logoDorado.png").getImage();
		ImageIcon imageIconLblLogo = new ImageIcon(imageLblLogo.getScaledInstance(400, 56, Image.SCALE_SMOOTH));
		lblLogo = new JLabel();
		lblLogo.setIcon(imageIconLblLogo);
		lblLogo.setBounds(20, 15, 400, 56);
		
		add(lblLogo);
		
		Image imageLblLogoDark = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/logoDoradoDark.png").getImage();
		ImageIcon imageIconLblLogoDark = new ImageIcon(imageLblLogoDark.getScaledInstance(400, 56, Image.SCALE_SMOOTH));
		lblLogoDark = new JLabel();
		lblLogoDark.setIcon(imageIconLblLogoDark);
		lblLogoDark.setBounds(20, 15, 400, 56);
		lblLogoDark.setVisible(false);
		add(lblLogoDark);
		Font fontlbl = new Font("Audiowide", Font.ITALIC, 16);
		Font fonttxt = new Font("Audiowide", Font.BOLD, 24);
		
		
		 lblDatoEliminar = new JLabel("Ingerese el número de vuelo que desea eliminar");
		lblDatoEliminar.setBounds(30, 80, 400, 30);
		lblDatoEliminar.setFont(fontlbl);
		add(lblDatoEliminar);
		
		
		datoEliminar = new JTextArea();
		datoEliminar.setBounds(30, 115, 300, 40);
		datoEliminar.setBackground(new Color(231, 233, 234));
		datoEliminar.setFont(fonttxt);
		add(datoEliminar);
		
		
		 listaVuelos = new JLabel("Lista de vuelos:");
		listaVuelos.setFont(fontlbl);
		listaVuelos.setBounds(30, 170, 250, 20);
		add(listaVuelos);
		
		vuelos = new JTextArea();
		vuelos.setEditable(false);	
		vuelos.setBounds(30, 200, 400,200 );
		vuelos.setBackground(new Color(231, 233, 234));
		add(vuelos);
		
		
		Image imageBtnAdd = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/deletePlaneBright.png")
				.getImage();
		ImageIcon imageIconBtnAdd = new ImageIcon(imageBtnAdd.getScaledInstance(150, 106, Image.SCALE_SMOOTH));
		btnDelete = new JButton();
		btnDelete.setIcon(imageIconBtnAdd);
		btnDelete.setToolTipText("Eliminar vuelo");
		btnDelete.setBounds(610, 115, 150, 106);
		btnDelete.setContentAreaFilled(false);
		btnDelete.setBorderPainted(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setVisible(true);
		add(btnDelete);
		
		Image imageBtnAddDark = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/deletePlaneDark.png")
				.getImage();
		ImageIcon imageIconBtnAddDark = new ImageIcon(imageBtnAddDark.getScaledInstance(150, 106, Image.SCALE_SMOOTH));
		btnDeleteDark = new JButton();
		btnDeleteDark.setIcon(imageIconBtnAddDark);
		btnDeleteDark.setToolTipText("Eliminar vuelo");
		btnDeleteDark.setBounds(610, 115, 150, 106);
		btnDeleteDark.setContentAreaFilled(false);
		btnDeleteDark.setBorderPainted(false);
		btnDeleteDark.setFocusPainted(false);
		btnDeleteDark.setVisible(false);
		add(btnDeleteDark);
		
		
		Image imageBtnBack = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/backBright.png").getImage();
		ImageIcon imageIconBtnBack = new ImageIcon(imageBtnBack.getScaledInstance(200, 100, Image.SCALE_SMOOTH));
		btnBack = new JButton();
		btnBack.setIcon(imageIconBtnBack);
		btnBack.setToolTipText("Regresar");
		btnBack.setBounds(700, 350, 110, 60);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		btnBack.setVisible(true);
		add(btnBack);
		
		Image imageBtnBackDark = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/backDark.png").getImage();
		ImageIcon imageIconBtnBackDark = new ImageIcon(imageBtnBackDark.getScaledInstance(200, 100, Image.SCALE_SMOOTH));
		btnBackDark = new JButton();
		btnBackDark.setIcon(imageIconBtnBackDark);
		btnBackDark.setToolTipText("Regresar");
		btnBackDark.setBounds(700, 350, 110, 60);
		btnBackDark.setContentAreaFilled(false);
		btnBackDark.setBorderPainted(false);
		btnBackDark.setFocusPainted(false);
		btnBackDark.setVisible(false);
		add(btnBackDark);
		
		add(lblBright);
		add(lblDark);
	}

	public JButton getBtnBackDark() {
		return btnBackDark;
	}

	public void setBtnBackDark(JButton btnBackDark) {
		this.btnBackDark = btnBackDark;
	}

	public JButton getBtnDeleteDark() {
		return btnDeleteDark;
	}

	public void setBtnDeleteDark(JButton btnDeleteDark) {
		this.btnDeleteDark = btnDeleteDark;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JTextArea getVuelos() {
		return vuelos;
	}

	public void setVuelos(JTextArea vuelos) {
		this.vuelos = vuelos;
	}

	public JTextArea getDatoEliminar() {
		return datoEliminar;
	}

	public void setDatoEliminar(JTextArea datoEliminar) {
		this.datoEliminar = datoEliminar;
	}

	public JLabel getLblBright() {
		return lblBright;
	}

	public void setLblBright(JLabel lblBright) {
		this.lblBright = lblBright;
	}

	public JLabel getLblDark() {
		return lblDark;
	}

	public void setLblDark(JLabel lblDark) {
		this.lblDark = lblDark;
	}

	public JLabel getLblDatoEliminar() {
		return lblDatoEliminar;
	}

	public void setLblDatoEliminar(JLabel lblDatoEliminar) {
		this.lblDatoEliminar = lblDatoEliminar;
	}

	public JLabel getListaVuelos() {
		return listaVuelos;
	}

	public void setListaVuelos(JLabel listaVuelos) {
		this.listaVuelos = listaVuelos;
	}

	public JLabel getLblLogo() {
		return lblLogo;
	}

	public void setLblLogo(JLabel lblLogo) {
		this.lblLogo = lblLogo;
	}

	public JLabel getLblLogoDark() {
		return lblLogoDark;
	}

	public void setLblLogoDark(JLabel lblLogoDark) {
		this.lblLogoDark = lblLogoDark;
	}
	
	
	
	
	
}
