package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanelNacional extends JPanel {

	private JButton btnBack, btnAdd, btnUpdate, btnDelete, btnBackDark, btnAddDark, btnUpdateDark, btnDeleteDark;
	private JLabel lblBright, lblDark, lblLogo, lblLogoDark;

	public MainPanelNacional() {

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

		Image imageBtnAdd = new ImageIcon(
				"assets/addBright.png").getImage();
		ImageIcon imageIconBtnAdd = new ImageIcon(imageBtnAdd.getScaledInstance(170, 169, Image.SCALE_SMOOTH));
		btnAdd = new JButton();
		btnAdd.setIcon(imageIconBtnAdd);
		btnAdd.setToolTipText("Añadir vuelos nacional");
		btnAdd.setBounds(70, 150, 170, 169);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorderPainted(false);
		btnAdd.setFocusPainted(false);
		btnAdd.setVisible(true);
		add(btnAdd);
		
		Image imageBtnAddDark = new ImageIcon(
				"assets/addDark.png").getImage();
		ImageIcon imageIconBtnAddDark = new ImageIcon(imageBtnAddDark.getScaledInstance(170, 169, Image.SCALE_SMOOTH));
		btnAddDark = new JButton();
		btnAddDark.setIcon(imageIconBtnAddDark);
		btnAddDark.setToolTipText("Añadir vuelos nacional");
		btnAddDark.setBounds(70, 150, 170, 169);
		btnAddDark.setContentAreaFilled(false);
		btnAddDark.setBorderPainted(false);
		btnAddDark.setFocusPainted(false);
		btnAddDark.setVisible(false);
		add(btnAddDark);

		Image imageBtnUpdate = new ImageIcon(
				"assets/updateBright.png").getImage();
		ImageIcon imageIconBtnUpdate = new ImageIcon(imageBtnUpdate.getScaledInstance(170, 169, Image.SCALE_SMOOTH));
		btnUpdate = new JButton();
		btnUpdate.setIcon(imageIconBtnUpdate);
		btnUpdate.setToolTipText("Actualizar vuelo nacional");
		btnUpdate.setBounds(320, 150, 170, 169);
		btnUpdate.setContentAreaFilled(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setFocusPainted(false);
		btnUpdate.setVisible(true);
		add(btnUpdate);
		
		Image imageBtnUpdateDark = new ImageIcon(
				"assets/updateDark.png").getImage();
		ImageIcon imageIconBtnUpdateDark = new ImageIcon(imageBtnUpdateDark.getScaledInstance(170, 169, Image.SCALE_SMOOTH));
		btnUpdateDark = new JButton();
		btnUpdateDark.setIcon(imageIconBtnUpdateDark);
		btnUpdateDark.setToolTipText("Actualizar vuelo nacional");
		btnUpdateDark.setBounds(320, 150, 170, 169);
		btnUpdateDark.setContentAreaFilled(false);
		btnUpdateDark.setBorderPainted(false);
		btnUpdateDark.setFocusPainted(false);
		btnUpdateDark.setVisible(false);
		add(btnUpdateDark);
		

		Image imageBtnDelete = new ImageIcon(
				"assets/deleteBright.png").getImage();
		ImageIcon imageIconBtnDelete = new ImageIcon(imageBtnDelete.getScaledInstance(170, 169, Image.SCALE_SMOOTH));
		btnDelete = new JButton();
		btnDelete.setIcon(imageIconBtnDelete);
		btnDelete.setToolTipText("Eliminar vuelo nacional");
		btnDelete.setBounds(570, 150, 170, 169);
		btnDelete.setContentAreaFilled(false);
		btnDelete.setBorderPainted(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setVisible(true);
		add(btnDelete);
		
		Image imageBtnDeleteDark = new ImageIcon(
				"assets/deleteDark.png").getImage();
		ImageIcon imageIconBtnDeleteDark = new ImageIcon(imageBtnDeleteDark.getScaledInstance(170, 169, Image.SCALE_SMOOTH));
		btnDeleteDark = new JButton();
		btnDeleteDark.setIcon(imageIconBtnDeleteDark);
		btnDeleteDark.setToolTipText("Eliminar vuelo nacional");
		btnDeleteDark.setBounds(570, 150, 170, 169);
		btnDeleteDark.setContentAreaFilled(false);
		btnDeleteDark.setBorderPainted(false);
		btnDeleteDark.setFocusPainted(false);
		btnDeleteDark.setVisible(false);
		add(btnDeleteDark);


		Image imageBtnBack = new ImageIcon(
				"assets/backBright.png").getImage();
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
				"assets/backDark.png").getImage();
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

	public JButton getBtnUpdate() {
		return btnUpdate;
	}

	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
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

	public JButton getBtnUpdateDark() {
		return btnUpdateDark;
	}

	public void setBtnUpdateDark(JButton btnUpdateDark) {
		this.btnUpdateDark = btnUpdateDark;
	}

	public JButton getBtnDeleteDark() {
		return btnDeleteDark;
	}

	public void setBtnDeleteDark(JButton btnDeleteDark) {
		this.btnDeleteDark = btnDeleteDark;
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
