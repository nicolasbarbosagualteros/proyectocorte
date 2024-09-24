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

public class PanelAddInternacional extends JPanel {

	private JButton btnBack, btnAdd,btnBackDark, btnAddDark;
	private JTextArea numPasajeros, horaSalida, horaLlegada, numVisa, nombrePiloto, nombreCopiloto;
	private JComboBox nomEmpresa;
	private JLabel lblBright,lblDark, avianca, latam, wingo, emirates, labelPasajeros, labelEmpresa, labelHoraSalida, labelHoraLLegada, labelCombo, labelNombrePiloto, labelNombreCopiloto, lblLogo, lblLogoDark ;

	public PanelAddInternacional() {

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
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/addPlaneBrightpng.png")
				.getImage();
		ImageIcon imageIconBtnAdd = new ImageIcon(imageBtnAdd.getScaledInstance(138, 135, Image.SCALE_SMOOTH));
		btnAdd = new JButton();
		btnAdd.setIcon(imageIconBtnAdd);
		btnAdd.setToolTipText("Agregar vuelo");
		btnAdd.setBounds(600, 140, 138, 135);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorderPainted(false);
		btnAdd.setFocusPainted(false);
		btnAdd.setVisible(true);
		add(btnAdd);
		
		Image imageBtnAddDark = new ImageIcon(
				"/Users/niko/Documents/workspace eclipse/Interfaz_PROYECTOCORTE2/assets/addPlaneDark.png")
				.getImage();
		ImageIcon imageIconBtnAddDark = new ImageIcon(imageBtnAddDark.getScaledInstance(138, 135, Image.SCALE_SMOOTH));
		btnAddDark = new JButton();
		btnAddDark.setIcon(imageIconBtnAddDark);
		btnAddDark.setToolTipText("Agregar vuelo");
		btnAddDark.setBounds(600, 140, 138, 135);
		btnAddDark.setContentAreaFilled(false);
		btnAddDark.setBorderPainted(false);
		btnAddDark.setFocusPainted(false);
		btnAddDark.setVisible(false);
		add(btnAddDark);
		

		Font fontlbl = new Font("Audiowide", Font.ITALIC, 16);
		Font fonttxt = new Font("Audiowide", Font.BOLD, 26);
		
		labelPasajeros = new JLabel("Ingrese el número de pasajeros:");
		labelPasajeros.setBounds(30, 80, 300, 30);
		labelPasajeros.setFont(fontlbl);
		add(labelPasajeros);

		numPasajeros = new JTextArea();
		numPasajeros.setBounds(30, 115, 300, 40);
		numPasajeros.setFont(fonttxt);
		numPasajeros.setBackground(new Color(231, 233, 234));
		add(numPasajeros);

		labelEmpresa = new JLabel("Ingrese la aerolinea:");
		labelEmpresa.setBounds(30, 160, 300, 30);
		labelEmpresa.setFont(fontlbl);
		add(labelEmpresa);

		String[] aerolineas = { "Avianca", "LATAM", "Wingo", "Emirates" };
		nomEmpresa = new JComboBox<>(aerolineas);
		nomEmpresa.setBounds(30, 195, 300, 40);
		nomEmpresa.setFont(fontlbl);
		add(nomEmpresa);
		
		labelHoraSalida = new JLabel("Ingrese la hora de salida del vuelo:");
		labelHoraSalida.setBounds(30, 240, 300, 30);
		labelHoraSalida.setFont(fontlbl);
		add(labelHoraSalida);

		 horaSalida = new JTextArea();
		horaSalida.setBounds(30, 275, 300, 40);
		horaSalida.setBackground(new Color(231, 233, 234));
		horaSalida.setFont(fonttxt);
		add(horaSalida);

		labelHoraLLegada = new JLabel("Ingrese la hora de llegada del vuelo:");
		labelHoraLLegada.setBounds(30, 320, 300, 30);
		labelHoraLLegada.setFont(fontlbl);
		add(labelHoraLLegada);

		horaLlegada = new JTextArea();
		horaLlegada.setBounds(30, 355, 300, 40);
		horaLlegada.setBackground(new Color(231, 233, 234));
		horaLlegada.setFont(fonttxt);
		add(horaLlegada);

		labelCombo = new JLabel("Ingrese su número de Visa:");
		labelCombo.setBounds(350, 80, 300, 30);
		labelCombo.setFont(fontlbl);
		add(labelCombo);

		
		numVisa = new JTextArea();
		numVisa.setBounds(350, 115, 280, 40);
		numVisa.setBackground(new Color(231, 233, 234));
		numVisa.setFont(fonttxt);
		add(numVisa);

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
		
		
		labelNombrePiloto = new JLabel("Ingrese el nombre del piloto");
		labelNombrePiloto.setBounds(350, 160, 300, 30);
		labelNombrePiloto.setFont(fontlbl);
		add(labelNombrePiloto);
		
		nombrePiloto = new JTextArea();
		nombrePiloto.setBounds(350, 195, 200, 40);
		nombrePiloto.setFont(fonttxt);
		nombrePiloto.setBackground(new Color(231, 233, 234));
		add(nombrePiloto);
		
		
		labelNombreCopiloto = new JLabel("Ingrese el nombre del copiloto");
		labelNombreCopiloto.setBounds(350, 240, 300, 40);
		labelNombreCopiloto.setFont(fontlbl);
		add(labelNombreCopiloto);
		
		nombreCopiloto = new JTextArea();
		nombreCopiloto.setBounds(350, 275,200, 40);
		nombreCopiloto.setBackground(new Color(231, 233, 234));
		nombreCopiloto.setFont(fonttxt);
		add(nombreCopiloto);

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

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
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

	public JButton getBtnAddDark() {
		return btnAddDark;
	}

	public void setBtnAddDark(JButton btnAddDark) {
		this.btnAddDark = btnAddDark;
	}

	public JLabel getLblDark() {
		return lblDark;
	}

	public void setLblDark(JLabel lblDark) {
		this.lblDark = lblDark;
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
