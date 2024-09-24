package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Window extends JFrame {

	private MainPanel mainPanel;

	private MainPanelNacional mainPanelNacional;
	private PanelAddNacional panelAddNacional;
	private PanelUpdateNacional panelUpdateNacional;
	private PanelDeleteNacional panelDeleteNacional;
	private MainPanelInternacional mainPanelInternacional;
	private PanelAddInternacional panelAddInternacional;
	private PanelUpdateInternacional panelUpdateInternacional;
	private PanelDeleteInternacional panelDeleteInternacional;
	private PopUpWindow popUpWindow;
	
	public Window() {
		mainPanel = new MainPanel();
		mainPanelNacional = new MainPanelNacional();
		panelAddNacional = new PanelAddNacional();
		panelUpdateNacional = new PanelUpdateNacional();
		panelDeleteNacional = new PanelDeleteNacional();
		mainPanelInternacional = new MainPanelInternacional();
		panelAddInternacional = new PanelAddInternacional();
		panelUpdateInternacional = new PanelUpdateInternacional();
		panelDeleteInternacional = new PanelDeleteInternacional();
		popUpWindow = new PopUpWindow();
		
		setTitle("Aeropuerto el Dorado");
		setSize(800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		add(mainPanel);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}

	public MainPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}



	public MainPanelNacional getMainPanelNacional() {
		return mainPanelNacional;
	}

	public void setMainPanelNacional(MainPanelNacional mainPanelNacional) {
		this.mainPanelNacional = mainPanelNacional;
	}

	
	public PanelAddNacional getPanelAddNacional() {
		return panelAddNacional;
	}

	public void setPanelAddNacional(PanelAddNacional panelAddNacional) {
		this.panelAddNacional = panelAddNacional;
	}

	
	public PanelUpdateNacional getPanelUpdateNacional() {
		return panelUpdateNacional;
	}

	public void setPanelUpdateNacional(PanelUpdateNacional panelUpdateNacional) {
		this.panelUpdateNacional = panelUpdateNacional;
	}

	public PanelDeleteNacional getPanelDeleteNacional() {
		return panelDeleteNacional;
	}

	public void setPanelDeleteNacional(PanelDeleteNacional panelDeleteNacional) {
		this.panelDeleteNacional = panelDeleteNacional;
	}

	public MainPanelInternacional getMainPanelInternacional() {
		return mainPanelInternacional;
	}

	public void setMainPanelInternacional(MainPanelInternacional mainPanelInternacional) {
		this.mainPanelInternacional = mainPanelInternacional;
	}

	public PanelAddInternacional getPanelAddInternacional() {
		return panelAddInternacional;
	}

	public void setPanelAddInternacional(PanelAddInternacional panelAddInternacional) {
		this.panelAddInternacional = panelAddInternacional;
	}

	public PanelUpdateInternacional getPanelUpdateInternacional() {
		return panelUpdateInternacional;
	}

	public void setPanelUpdateInternacional(PanelUpdateInternacional panelUpdateInternacional) {
		this.panelUpdateInternacional = panelUpdateInternacional;
	}

	public PanelDeleteInternacional getPanelDeleteInternacional() {
		return panelDeleteInternacional;
	}

	public void setPanelDeleteInternacional(PanelDeleteInternacional panelDeleteInternacional) {
		this.panelDeleteInternacional = panelDeleteInternacional;
	}

	public PopUpWindow getPopUpWindow() {
		return popUpWindow;
	}

	public void setPopUpWindow(PopUpWindow popUpWindow) {
		this.popUpWindow = popUpWindow;
	}

	

	
	
}
