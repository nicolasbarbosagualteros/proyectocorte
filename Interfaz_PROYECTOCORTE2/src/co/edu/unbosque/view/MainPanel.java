package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private JButton btnNacional, btnInternacional, btnSalir, btnChangeScreen, btnNacionalDark, btnInternacionalDark, btnSalirDark, btnChangeScreenDark, btnExport, btnExportDark;
	
	private JLabel lblDark, lblBright, lblLogo, lblLogoDark;

	public MainPanel() {

		setOpaque(true);
		setLayout(null);
		setPreferredSize(new Dimension(800, 450));
		setBackground(new Color(241, 241, 236));

		Image imageLblBright = new ImageIcon(
				"assets/lblBright.jpeg").getImage();
		ImageIcon imageIconLblBright = new ImageIcon(imageLblBright.getScaledInstance(800, 120, Image.SCALE_SMOOTH));
		lblBright = new JLabel();
		lblBright.setIcon(imageIconLblBright);
		lblBright.setBounds(0, -40, 800, 120);
		
		
		Image imageLblDark = new ImageIcon(
				"assets/lblDark.png").getImage();
		ImageIcon imageIconLblDark = new ImageIcon(imageLblDark.getScaledInstance(800, 120, Image.SCALE_SMOOTH));
		lblDark = new JLabel();
		lblDark.setIcon(imageIconLblDark);
		lblDark.setBounds(0, -40, 800, 120);
		lblDark.setVisible(false);
		
		
		Image imageLblLogo = new ImageIcon(
				"assets/logoDorado.png").getImage();
		ImageIcon imageIconLblLogo = new ImageIcon(imageLblLogo.getScaledInstance(400, 56, Image.SCALE_SMOOTH));
		lblLogo = new JLabel();
		lblLogo.setIcon(imageIconLblLogo);
		lblLogo.setBounds(20, 15, 400, 56);
		
		add(lblLogo);
		
		Image imageLblLogoDark = new ImageIcon(
				"assets/logoDoradoDark.png").getImage();
		ImageIcon imageIconLblLogoDark = new ImageIcon(imageLblLogoDark.getScaledInstance(400, 56, Image.SCALE_SMOOTH));
		lblLogoDark = new JLabel();
		lblLogoDark.setIcon(imageIconLblLogoDark);
		lblLogoDark.setBounds(20, 15, 400, 56);
		lblLogoDark.setVisible(false);
		add(lblLogoDark);
		
		
		
		
		Image imageBtnNacional = new ImageIcon(
				"assets/destinosNacionales.png")
				.getImage();
		ImageIcon imageIconBtnNacional = new ImageIcon(
				imageBtnNacional.getScaledInstance(200, 271, Image.SCALE_SMOOTH));
		btnNacional = new JButton();
		btnNacional.setIcon(imageIconBtnNacional);
		btnNacional.setToolTipText("Vuelos nacionales");
		btnNacional.setBounds(170, 110, 200, 271);
		btnNacional.setContentAreaFilled(false);
		btnNacional.setBorderPainted(false);
		btnNacional.setFocusPainted(false);
		btnNacional.setVisible(true);
		add(btnNacional);

		
		Image imageBtnNacionalDark = new ImageIcon(
				"assets/destinosNacionalesDark.png")
				.getImage();
		ImageIcon imageIconBtnNacionalDark = new ImageIcon(
				imageBtnNacionalDark.getScaledInstance(200, 271, Image.SCALE_SMOOTH));
		btnNacionalDark = new JButton();
		btnNacionalDark.setIcon(imageIconBtnNacionalDark);
		btnNacionalDark.setToolTipText("Vuelos nacionales");
		btnNacionalDark.setBounds(170, 110, 200, 271);
		btnNacionalDark.setContentAreaFilled(false);
		btnNacionalDark.setBorderPainted(false);
		btnNacionalDark.setFocusPainted(false);
		btnNacionalDark.setVisible(false);
		add(btnNacionalDark);
		
		
		Image imageBtnInternacional = new ImageIcon(
				"assets/destinosInternacionales.png")
				.getImage();
		ImageIcon imageIconBtnInternacional = new ImageIcon(
				imageBtnInternacional.getScaledInstance(200, 271, Image.SCALE_SMOOTH));
		btnInternacional = new JButton();
		btnInternacional.setIcon(imageIconBtnInternacional);
		btnInternacional.setToolTipText("Vuelos Internacionales");
		btnInternacional.setBounds(430, 110, 200, 271);
		btnInternacional.setContentAreaFilled(false);
		btnInternacional.setBorderPainted(false);
		btnInternacional.setFocusPainted(false);
		btnInternacional.setVisible(true);
		add(btnInternacional);
		
		Image imageBtnInternacionalDark = new ImageIcon(
				"assets/destinosInternacionalesDark.png")
				.getImage();
		ImageIcon imageIconBtnInternacionalDark = new ImageIcon(
				imageBtnInternacionalDark.getScaledInstance(200, 271, Image.SCALE_SMOOTH));
		btnInternacionalDark = new JButton();
		btnInternacionalDark.setIcon(imageIconBtnInternacionalDark);
		btnInternacionalDark.setToolTipText("Vuelos Internacionales");
		btnInternacionalDark.setBounds(430, 110, 200, 271);
		btnInternacionalDark.setContentAreaFilled(false);
		btnInternacionalDark.setBorderPainted(false);
		btnInternacionalDark.setFocusPainted(false);
		btnInternacionalDark.setVisible(false);
		add(btnInternacionalDark);

		Image imageBtnSalir = new ImageIcon(
				"assets/exit.png").getImage();
		ImageIcon imageIconBtnSalir = new ImageIcon(imageBtnSalir.getScaledInstance(46, 48, Image.SCALE_SMOOTH));
		btnSalir = new JButton();
		btnSalir.setIcon(imageIconBtnSalir);
		btnSalir.setToolTipText("Cerrar el aplicativo");
		btnSalir.setBounds(750, 290, 47, 212);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorderPainted(false);
		btnSalir.setFocusPainted(false);
		btnSalir.setVisible(true);
		add(btnSalir);
		
		Image imageBtnSalirDark = new ImageIcon(
				"assets/exitDark.png").getImage();
		ImageIcon imageIconBtnSalirDark = new ImageIcon(imageBtnSalirDark.getScaledInstance(46, 52, Image.SCALE_SMOOTH));
		btnSalirDark = new JButton();
		btnSalirDark.setIcon(imageIconBtnSalirDark);
		btnSalirDark.setToolTipText("Cerrar el aplicativo");
		btnSalirDark.setBounds(750, 284, 47, 212);
		btnSalirDark.setContentAreaFilled(false);
		btnSalirDark.setBorderPainted(false);
		btnSalirDark.setFocusPainted(false);
		btnSalirDark.setVisible(false);
		add(btnSalirDark);

		Image imageBtnChangeScreen = new ImageIcon(
				"assets/changeScreen.png").getImage();
		ImageIcon imageIconBtnChangeScreen = new ImageIcon(
				imageBtnChangeScreen.getScaledInstance(83, 73, Image.SCALE_SMOOTH));
		btnChangeScreen = new JButton();
		btnChangeScreen.setIcon(imageIconBtnChangeScreen);
		btnChangeScreen.setToolTipText("Cambiar a modo oscuro");
		btnChangeScreen.setBounds(720, 5, 83, 73);
		btnChangeScreen.setContentAreaFilled(false);
		btnChangeScreen.setBorderPainted(false);
		btnChangeScreen.setFocusPainted(false);
		btnChangeScreen.setVisible(true);
		add(btnChangeScreen);
		add(lblBright);
		add(lblDark);
		
		Image imageBtnChangeScreenDark = new ImageIcon(
				"assets/changeScreenDark.png").getImage();
		ImageIcon imageIconBtnChangeScreenDark = new ImageIcon(
				imageBtnChangeScreenDark.getScaledInstance(83, 73, Image.SCALE_SMOOTH));
		btnChangeScreenDark = new JButton();
		btnChangeScreenDark.setIcon(imageIconBtnChangeScreenDark);
		btnChangeScreenDark.setToolTipText("Cambiar a modo claro");
		btnChangeScreenDark.setBounds(720, 5, 83, 73);
		btnChangeScreenDark.setContentAreaFilled(false);
		btnChangeScreenDark.setBorderPainted(false);
		btnChangeScreenDark.setFocusPainted(false);
		btnChangeScreenDark.setVisible(false);
		add(btnChangeScreenDark);
		
		
		
		Image imageBtnExport = new ImageIcon(
				"assets/export.png").getImage();
		ImageIcon imageIconBtnExport = new ImageIcon(
				imageBtnExport.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnExport = new JButton();
		btnExport.setIcon(imageIconBtnExport);
		btnExport.setToolTipText("Exportar archivo");
		btnExport.setBounds(10, 360, 50, 50);
		btnExport.setContentAreaFilled(false);
		btnExport.setBorderPainted(false);
		btnExport.setFocusPainted(false);
		btnExport.setVisible(true);
		add(btnExport);
		
		
		
		Image imageBtnExportDark = new ImageIcon(
				"assets/exportDark.png").getImage();
		ImageIcon imageIconBtnExportDark = new ImageIcon(
				imageBtnExportDark.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnExportDark = new JButton();
		btnExportDark.setIcon(imageIconBtnExportDark);
		btnExportDark.setToolTipText("Exportar archivo");
		btnExportDark.setBounds(10, 360, 50, 50);
		btnExportDark.setContentAreaFilled(false);
		btnExportDark.setBorderPainted(false);
		btnExportDark.setFocusPainted(false);
		btnExportDark.setVisible(false);
		add(btnExportDark);
		
		
	
		
		add(lblBright);
		add(lblDark);
	}

	public JButton getBtnNacional() {
		return btnNacional;
	}

	public void setBtnNacional(JButton btnNacional) {
		this.btnNacional = btnNacional;
	}

	public JButton getBtnInternacional() {
		return btnInternacional;
	}

	public void setBtnInternacional(JButton btnInternacional) {
		this.btnInternacional = btnInternacional;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnChangeScreen() {
		return btnChangeScreen;
	}

	public void setBtnChangeScreen(JButton btnChangeScreen) {
		this.btnChangeScreen = btnChangeScreen;
	}

	public JLabel getLblDark() {
		return lblDark;
	}

	public void setLblDark(JLabel lblDark) {
		this.lblDark = lblDark;
	}

	public JLabel getLblBright() {
		return lblBright;
	}

	public void setLblBright(JLabel lblBright) {
		this.lblBright = lblBright;
	}

	public JButton getBtnNacionalDark() {
		return btnNacionalDark;
	}

	public void setBtnNacionalDark(JButton btnNacionalDark) {
		this.btnNacionalDark = btnNacionalDark;
	}

	public JButton getBtnInternacionalDark() {
		return btnInternacionalDark;
	}

	public void setBtnInternacionalDark(JButton btnInternacionalDark) {
		this.btnInternacionalDark = btnInternacionalDark;
	}

	public JButton getBtnSalirDark() {
		return btnSalirDark;
	}

	public void setBtnSalirDark(JButton btnSalirDark) {
		this.btnSalirDark = btnSalirDark;
	}

	public JButton getBtnChangeScreenDark() {
		return btnChangeScreenDark;
	}

	public void setBtnChangeScreenDark(JButton btnChangeScreenDark) {
		this.btnChangeScreenDark = btnChangeScreenDark;
	}

	public JButton getBtnExport() {
		return btnExport;
	}

	public void setBtnExport(JButton btnExport) {
		this.btnExport = btnExport;
	}

	public JButton getBtnExportDark() {
		return btnExportDark;
	}

	public void setBtnExportDark(JButton btnExportDark) {
		this.btnExportDark = btnExportDark;
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
