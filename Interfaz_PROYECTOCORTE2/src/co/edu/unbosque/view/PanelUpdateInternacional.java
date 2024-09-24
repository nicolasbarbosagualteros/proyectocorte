package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelUpdateInternacional extends JPanel {

	private JButton btnBack, btnUpdate,btnBackDark, btnUpdateDark;
	private JTextArea newData, numPasajeros, horaSalida, horaLlegada, vuelos, numVisa, nombrePiloto, nombreCopiloto;
	private JComboBox nomEmpresa;
	private JLabel lblBright,lblDark, avianca, latam, wingo, emirates, labelNewData,labelPasajeros, labelEmpresa, labelHoraSalida, labelHoraLLegada, labelCombo, labelListaVuelos, lblLogoDark, lblLogo, labelNombrePiloto, labelNombreCopiloto;

	public PanelUpdateInternacional() {

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

		Image imageBtnAdd = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/updatePlaneBright.png")
				.getImage();
		ImageIcon imageIconBtnAdd = new ImageIcon(imageBtnAdd.getScaledInstance(150, 106, Image.SCALE_SMOOTH));
		btnUpdate = new JButton();
		btnUpdate.setIcon(imageIconBtnAdd);
		btnUpdate.setToolTipText("Actualizar vuelo");
		btnUpdate.setBounds(610, 220, 150, 106);
		btnUpdate.setContentAreaFilled(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setFocusPainted(false);
		btnUpdate.setVisible(true);
		add(btnUpdate);
		
		Image imageBtnAddDark = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/updatePlaneDark.png")
				.getImage();
		ImageIcon imageIconBtnAddDark = new ImageIcon(imageBtnAddDark.getScaledInstance(150, 106, Image.SCALE_SMOOTH));
		btnUpdateDark = new JButton();
		btnUpdateDark.setIcon(imageIconBtnAddDark);
		btnUpdateDark.setToolTipText("Actualizar vuelo");
		btnUpdateDark.setBounds(610, 220, 150, 106);
		btnUpdateDark.setContentAreaFilled(false);
		btnUpdateDark.setBorderPainted(false);
		btnUpdateDark.setFocusPainted(false);
		btnUpdateDark.setVisible(false);
		add(btnUpdateDark);

		Font fontlbl = new Font("Audiowide", Font.ITALIC, 12);
		Font fonttxt = new Font("Audiowide", Font.BOLD, 20);

		labelNewData = new JLabel("Piloto del vuelo que desea actualizar:");
		labelNewData.setBounds(30, 80, 300, 30);
		labelNewData.setFont(fontlbl);
		add(labelNewData);

		 newData = new JTextArea();

		newData.setFont(fonttxt);
		newData.setBackground(new Color(231, 233, 234));
		add(newData);

		 labelPasajeros = new JLabel("Ingrese el nuevo número de pasajeros:");

		labelPasajeros.setFont(fontlbl);
		add(labelPasajeros);

		JTextArea textPasajeros = new JTextArea();
		textPasajeros.setBounds(30, 185, 250, 30);
		textPasajeros.setFont(fonttxt);
		textPasajeros.setBackground(new Color(231, 233, 234));
		add(textPasajeros);

		 labelEmpresa = new JLabel("Nueva aerolinea:");

		labelEmpresa.setFont(fontlbl);
		add(labelEmpresa);

		String[] aerolineas = { "Avianca", "LATAM", "Wingo", "Emirates" };
		nomEmpresa = new JComboBox<>(aerolineas);

		nomEmpresa.setFont(fontlbl);
		add(nomEmpresa);
		
		labelHoraSalida = new JLabel("Ingrese la nueva hora de salida del vuelo:");

		labelHoraSalida.setFont(fontlbl);
		add(labelHoraSalida);

		horaSalida = new JTextArea();

		horaSalida.setBackground(new Color(231, 233, 234));
		horaSalida.setFont(fonttxt);
		add(horaSalida);

		 labelHoraLLegada = new JLabel("Ingrese la nueva hora de llegada del vuelo:");

		labelHoraLLegada.setFont(fontlbl);
		add(labelHoraLLegada);

		horaLlegada = new JTextArea();

		horaLlegada.setBackground(new Color(231, 233, 234));
		horaLlegada.setFont(fonttxt);
		add(horaLlegada);

		 labelCombo = new JLabel("Nuevo número de Visa:");
		labelCombo.setFont(fontlbl);
		add(labelCombo);

		
		numVisa = new JTextArea();
		numVisa.setBackground(new Color(231, 233, 234));
		numVisa.setFont(fonttxt);
		add(numVisa);

		labelNewData.setBounds(30, 80, 250, 20);
		newData.setBounds(30, 100, 250, 30);

		labelPasajeros.setBounds(300, 80, 250, 20);
		textPasajeros.setBounds(300, 100, 250, 30);

		labelEmpresa.setBounds(570, 80, 250, 20);
		nomEmpresa.setBounds(570, 100, 200, 30);

		labelHoraSalida.setBounds(30, 140, 250, 20);
		horaSalida.setBounds(30, 160, 250, 30);

		labelHoraLLegada.setBounds(300, 140, 250, 20);
		horaLlegada.setBounds(300, 160, 250, 30);

		labelCombo.setBounds(570, 140, 250, 20);
		numVisa.setBounds(570, 160, 200, 30);
		
		
		labelListaVuelos = new JLabel("Lista de vuelos:");
		labelListaVuelos.setFont(fontlbl);
		labelListaVuelos.setBounds(30, 240, 250, 20);
		add(labelListaVuelos);
		
		vuelos = new JTextArea();
		vuelos.setEditable(false);	
		vuelos.setBounds(30, 260, 530,120 );
		vuelos.setBackground(new Color(231, 233, 234));
		add(vuelos);
		
		labelNombrePiloto = new JLabel("Ingrese el nuevo nombre del piloto");
		labelNombrePiloto.setBounds(30, 190, 250, 20);
		labelNombrePiloto.setFont(fontlbl);
		add(labelNombrePiloto);
		
		nombrePiloto = new JTextArea();
		nombrePiloto.setBounds(30, 210, 250, 30);
		nombrePiloto.setFont(fonttxt);
		nombrePiloto.setBackground(new Color(231, 233, 234));
		add(nombrePiloto);
		
		
		labelNombreCopiloto = new JLabel("Ingrese el nuevo nombre del copiloto");
		labelNombreCopiloto.setBounds(300, 190, 250, 20);
		labelNombreCopiloto.setFont(fontlbl);
		add(labelNombreCopiloto);
		
		nombreCopiloto = new JTextArea();
		nombreCopiloto.setBounds(300, 210,250, 30);
		nombreCopiloto.setBackground(new Color(231, 233, 234));
		nombreCopiloto.setFont(fonttxt);
		add(nombreCopiloto);
		
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

		avianca = new JLabel();
		avianca.setBounds(500, 5, 300, 59);
		Image imageAvianca = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/avianca.png").getImage();
		ImageIcon imageIconAvianca = new ImageIcon(imageAvianca.getScaledInstance(250, 59, Image.SCALE_SMOOTH));
		avianca.setIcon(imageIconAvianca);
		avianca.setVisible(false);

		latam = new JLabel();
		latam.setBounds(500, 5, 250, 59);
		Image imageLatam = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/latam.png").getImage();
		ImageIcon imageIconLatam = new ImageIcon(imageLatam.getScaledInstance(250, 59, Image.SCALE_SMOOTH));
		latam.setIcon(imageIconLatam);
		latam.setVisible(false);

		wingo = new JLabel();
		wingo.setBounds(500, 5, 250, 70);
		Image imageWingo = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/wingo.png").getImage();
		ImageIcon imageIconWingo = new ImageIcon(imageWingo.getScaledInstance(250, 70, Image.SCALE_SMOOTH));
		wingo.setIcon(imageIconWingo);
		wingo.setVisible(false);

		emirates = new JLabel();
		emirates.setBounds(600, 0, 110, 75);
		Image imageEmirates = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/emirates.png").getImage();
		ImageIcon imageIconEmirates = new ImageIcon(imageEmirates.getScaledInstance(110, 75, Image.SCALE_SMOOTH));
		emirates.setIcon(imageIconEmirates);
		emirates.setVisible(false);

		add(avianca);
		add(latam);
		add(wingo);
		add(emirates);

		add(lblBright);
		add(lblDark);

	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JButton getBtnUpdate() {
		return btnUpdate;
	}

	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	public JTextArea getNewData() {
		return newData;
	}

	public void setNewData(JTextArea newData) {
		this.newData = newData;
	}

	public JTextArea getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(JTextArea numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public JTextArea getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(JTextArea horaSalida) {
		this.horaSalida = horaSalida;
	}

	public JTextArea getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(JTextArea horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public JTextArea getVuelos() {
		return vuelos;
	}

	public void setVuelos(JTextArea vuelos) {
		this.vuelos = vuelos;
	}

	public JComboBox getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(JComboBox nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}


	public JLabel getLblBright() {
		return lblBright;
	}

	public void setLblBright(JLabel lblBright) {
		this.lblBright = lblBright;
	}

	public JLabel getAvianca() {
		return avianca;
	}

	public void setAvianca(JLabel avianca) {
		this.avianca = avianca;
	}

	public JLabel getLatam() {
		return latam;
	}

	public void setLatam(JLabel latam) {
		this.latam = latam;
	}

	public JLabel getWingo() {
		return wingo;
	}

	public void setWingo(JLabel wingo) {
		this.wingo = wingo;
	}

	public JLabel getEmirates() {
		return emirates;
	}

	public void setEmirates(JLabel emirates) {
		this.emirates = emirates;
	}

	public JButton getBtnBackDark() {
		return btnBackDark;
	}

	public void setBtnBackDark(JButton btnBackDark) {
		this.btnBackDark = btnBackDark;
	}

	public JButton getBtnUpdateDark() {
		return btnUpdateDark;
	}

	public void setBtnUpdateDark(JButton btnUpdateDark) {
		this.btnUpdateDark = btnUpdateDark;
	}

	public JLabel getLblDark() {
		return lblDark;
	}

	public void setLblDark(JLabel lblDark) {
		this.lblDark = lblDark;
	}

	public JLabel getLabelNewData() {
		return labelNewData;
	}

	public void setLabelNewData(JLabel labelNewData) {
		this.labelNewData = labelNewData;
	}

	public JLabel getLabelPasajeros() {
		return labelPasajeros;
	}

	public void setLabelPasajeros(JLabel labelPasajeros) {
		this.labelPasajeros = labelPasajeros;
	}

	public JLabel getLabelEmpresa() {
		return labelEmpresa;
	}

	public void setLabelEmpresa(JLabel labelEmpresa) {
		this.labelEmpresa = labelEmpresa;
	}

	public JLabel getLabelHoraSalida() {
		return labelHoraSalida;
	}

	public void setLabelHoraSalida(JLabel labelHoraSalida) {
		this.labelHoraSalida = labelHoraSalida;
	}

	public JLabel getLabelHoraLLegada() {
		return labelHoraLLegada;
	}

	public void setLabelHoraLLegada(JLabel labelHoraLLegada) {
		this.labelHoraLLegada = labelHoraLLegada;
	}

	public JLabel getLabelCombo() {
		return labelCombo;
	}

	public void setLabelCombo(JLabel labelCombo) {
		this.labelCombo = labelCombo;
	}

	public JLabel getLabelListaVuelos() {
		return labelListaVuelos;
	}

	public void setLabelListaVuelos(JLabel labelListaVuelos) {
		this.labelListaVuelos = labelListaVuelos;
	}

	public JTextArea getNumVisa() {
		return numVisa;
	}

	public void setNumVisa(JTextArea numVisa) {
		this.numVisa = numVisa;
	}

	public JTextArea getNombrePiloto() {
		return nombrePiloto;
	}

	public void setNombrePiloto(JTextArea nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public JTextArea getNombreCopiloto() {
		return nombreCopiloto;
	}

	public void setNombreCopiloto(JTextArea nombreCopiloto) {
		this.nombreCopiloto = nombreCopiloto;
	}

	public JLabel getLblLogoDark() {
		return lblLogoDark;
	}

	public void setLblLogoDark(JLabel lblLogoDark) {
		this.lblLogoDark = lblLogoDark;
	}

	public JLabel getLblLogo() {
		return lblLogo;
	}

	public void setLblLogo(JLabel lblLogo) {
		this.lblLogo = lblLogo;
	}

	public JLabel getLabelNombrePiloto() {
		return labelNombrePiloto;
	}

	public void setLabelNombrePiloto(JLabel labelNombrePiloto) {
		this.labelNombrePiloto = labelNombrePiloto;
	}

	public JLabel getLabelNombreCopiloto() {
		return labelNombreCopiloto;
	}

	public void setLabelNombreCopiloto(JLabel labelNombreCopiloto) {
		this.labelNombreCopiloto = labelNombreCopiloto;
	}
	
	
	
	
	
	

}
