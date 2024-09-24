package co.edu.unbosque.control;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.VueloNacionalDTO;
import co.edu.unbosque.util.exception.EmptyTextException;
import co.edu.unbosque.util.exception.ExceptionChecker;
import co.edu.unbosque.util.exception.InputTextNotValidException;
import co.edu.unbosque.util.exception.PassengerNumberException;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {

	private ViewFacade vf;
	private ModelFacade mf;

	public Controller() {
		vf = new ViewFacade();
		mf = new ModelFacade();

		// MAINPANEL
		vf.getWindow().getMainPanel().getBtnChangeScreen().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnSalir().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnNacional().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnInternacional().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnChangeScreenDark().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnSalirDark().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnNacionalDark().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnInternacionalDark().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnExport().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnExportDark().addActionListener(this);

		// MAINPANEL NACIONAL
		vf.getWindow().getMainPanelNacional().getBtnBack().addActionListener(this);
		vf.getWindow().getMainPanelNacional().getBtnAdd().addActionListener(this);
		vf.getWindow().getMainPanelNacional().getBtnUpdate().addActionListener(this);
		vf.getWindow().getMainPanelNacional().getBtnDelete().addActionListener(this);
		vf.getWindow().getMainPanelNacional().getBtnBackDark().addActionListener(this);
		vf.getWindow().getMainPanelNacional().getBtnAddDark().addActionListener(this);
		vf.getWindow().getMainPanelNacional().getBtnUpdateDark().addActionListener(this);
		vf.getWindow().getMainPanelNacional().getBtnDeleteDark().addActionListener(this);
		// PANELADD NACIONAL
		vf.getWindow().getPanelAddNacional().getBtnAdd().addActionListener(this);
		vf.getWindow().getPanelAddNacional().getBtnBack().addActionListener(this);
		vf.getWindow().getPanelAddNacional().getNomEmpresa().addActionListener(this);
		vf.getWindow().getPanelAddNacional().getBtnAddDark().addActionListener(this);
		vf.getWindow().getPanelAddNacional().getBtnBackDark().addActionListener(this);
		// PANELUPDATE NACIONAL
		vf.getWindow().getPanelUpdateNacional().getBtnBack().addActionListener(this);
		vf.getWindow().getPanelUpdateNacional().getBtnUpdate().addActionListener(this);
		vf.getWindow().getPanelUpdateNacional().getNomEmpresa().addActionListener(this);
		vf.getWindow().getPanelUpdateNacional().getBtnBackDark().addActionListener(this);
		vf.getWindow().getPanelUpdateNacional().getBtnUpdateDark().addActionListener(this);
		// PANELDELETE NACIONAL
		vf.getWindow().getPanelDeleteNacional().getBtnBack().addActionListener(this);
		vf.getWindow().getPanelDeleteNacional().getBtnDelete().addActionListener(this);
		vf.getWindow().getPanelDeleteNacional().getBtnBackDark().addActionListener(this);
		vf.getWindow().getPanelDeleteNacional().getBtnDeleteDark().addActionListener(this);

		// MAINPANEL INTERNACIONAL
		vf.getWindow().getMainPanelInternacional().getBtnBack().addActionListener(this);
		vf.getWindow().getMainPanelInternacional().getBtnAdd().addActionListener(this);
		vf.getWindow().getMainPanelInternacional().getBtnUpdate().addActionListener(this);
		vf.getWindow().getMainPanelInternacional().getBtnDelete().addActionListener(this);
		vf.getWindow().getMainPanelInternacional().getBtnBackDark().addActionListener(this);
		vf.getWindow().getMainPanelInternacional().getBtnAddDark().addActionListener(this);
		vf.getWindow().getMainPanelInternacional().getBtnUpdateDark().addActionListener(this);
		vf.getWindow().getMainPanelInternacional().getBtnDeleteDark().addActionListener(this);

		// PANELADD INTERNACIONAL
		vf.getWindow().getPanelAddInternacional().getBtnAdd().addActionListener(this);
		vf.getWindow().getPanelAddInternacional().getBtnBack().addActionListener(this);
		vf.getWindow().getPanelAddInternacional().getNomEmpresa().addActionListener(this);
		vf.getWindow().getPanelAddInternacional().getBtnAddDark().addActionListener(this);
		vf.getWindow().getPanelAddInternacional().getBtnBackDark().addActionListener(this);

		// PANELUPDATE INTERNACIONAL
		vf.getWindow().getPanelUpdateInternacional().getBtnBack().addActionListener(this);
		vf.getWindow().getPanelUpdateInternacional().getBtnUpdate().addActionListener(this);
		vf.getWindow().getPanelUpdateInternacional().getNomEmpresa().addActionListener(this);
		vf.getWindow().getPanelUpdateInternacional().getBtnBackDark().addActionListener(this);
		vf.getWindow().getPanelUpdateInternacional().getBtnUpdateDark().addActionListener(this);

		// PANELDELETE INTERNACIONAL
		vf.getWindow().getPanelDeleteInternacional().getBtnBack().addActionListener(this);
		vf.getWindow().getPanelDeleteInternacional().getBtnDelete().addActionListener(this);
		vf.getWindow().getPanelDeleteInternacional().getBtnBackDark().addActionListener(this);
		vf.getWindow().getPanelDeleteInternacional().getBtnDeleteDark().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vf.getWindow().getMainPanel().getBtnChangeScreen()) {

			vf.getWindow().getMainPanel().setBackground(new Color(20, 20, 20));
			vf.getWindow().getMainPanelNacional().setBackground(new Color(20, 20, 20));
			vf.getWindow().getPanelAddNacional().setBackground(new Color(20, 20, 20));
			vf.getWindow().getPanelUpdateNacional().setBackground(new Color(20, 20, 20));
			vf.getWindow().getPanelDeleteNacional().setBackground(new Color(20, 20, 20));

			vf.getWindow().getMainPanel().getLblLogo().setVisible(false);
			vf.getWindow().getMainPanel().getLblLogoDark().setVisible(true);
			vf.getWindow().getMainPanelNacional().getLblLogo().setVisible(false);
			vf.getWindow().getMainPanelNacional().getLblLogoDark().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getLblLogo().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getLblLogoDark().setVisible(true);
			vf.getWindow().getPanelAddNacional().getLblLogo().setVisible(false);
			vf.getWindow().getPanelAddNacional().getLblLogoDark().setVisible(true);
			vf.getWindow().getPanelAddInternacional().getLblLogo().setVisible(false);
			vf.getWindow().getPanelAddInternacional().getLblLogoDark().setVisible(true);
			vf.getWindow().getPanelUpdateNacional().getLblLogo().setVisible(false);
			vf.getWindow().getPanelUpdateNacional().getLblLogoDark().setVisible(true);
			vf.getWindow().getPanelUpdateInternacional().getLblLogo().setVisible(false);
			vf.getWindow().getPanelUpdateInternacional().getLblLogoDark().setVisible(true);
			vf.getWindow().getPanelDeleteNacional().getLblLogo().setVisible(false);
			vf.getWindow().getPanelDeleteNacional().getLblLogoDark().setVisible(true);
			vf.getWindow().getPanelDeleteInternacional().getLblLogo().setVisible(false);
			vf.getWindow().getPanelDeleteInternacional().getLblLogoDark().setVisible(true);

			vf.getWindow().getMainPanel().getLblDark().setVisible(true);
			vf.getWindow().getMainPanel().getLblBright().setVisible(false);
			vf.getWindow().getMainPanel().getBtnNacional().setVisible(false);
			vf.getWindow().getMainPanel().getBtnNacionalDark().setVisible(true);
			vf.getWindow().getMainPanel().getBtnInternacional().setVisible(false);
			vf.getWindow().getMainPanel().getBtnInternacionalDark().setVisible(true);
			vf.getWindow().getMainPanel().getBtnChangeScreen().setVisible(false);
			vf.getWindow().getMainPanel().getBtnChangeScreenDark().setVisible(true);
			vf.getWindow().getMainPanel().getBtnSalir().setVisible(false);
			vf.getWindow().getMainPanel().getBtnSalirDark().setVisible(true);
			vf.getWindow().getMainPanel().getBtnExport().setVisible(false);
			vf.getWindow().getMainPanel().getBtnExportDark().setVisible(true);

			vf.getWindow().getMainPanelNacional().getLblBright().setVisible(false);
			vf.getWindow().getMainPanelNacional().getLblDark().setVisible(true);
			vf.getWindow().getMainPanelNacional().getBtnAdd().setVisible(false);
			vf.getWindow().getMainPanelNacional().getBtnAddDark().setVisible(true);
			vf.getWindow().getMainPanelNacional().getBtnUpdate().setVisible(false);
			vf.getWindow().getMainPanelNacional().getBtnUpdateDark().setVisible(true);
			vf.getWindow().getMainPanelNacional().getBtnDelete().setVisible(false);
			vf.getWindow().getMainPanelNacional().getBtnDeleteDark().setVisible(true);
			vf.getWindow().getMainPanelNacional().getBtnBack().setVisible(false);
			vf.getWindow().getMainPanelNacional().getBtnBackDark().setVisible(true);

			vf.getWindow().getPanelAddNacional().getLblBright().setVisible(false);
			vf.getWindow().getPanelAddNacional().getLblDark().setVisible(true);
			vf.getWindow().getPanelAddNacional().getBtnAdd().setVisible(false);
			vf.getWindow().getPanelAddNacional().getBtnAddDark().setVisible(true);
			vf.getWindow().getPanelAddNacional().getBtnBack().setVisible(false);
			vf.getWindow().getPanelAddNacional().getBtnBackDark().setVisible(true);
			vf.getWindow().getPanelAddNacional().getLabelPasajeros().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddNacional().getLabelHoraSalida().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddNacional().getLabelHoraLLegada().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddNacional().getLabelEmpresa().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddNacional().getLabelCombo().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddNacional().getLabelNombrePiloto().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddNacional().getLabelNombreCopiloto().setForeground(Color.WHITE);

			vf.getWindow().getPanelUpdateNacional().getLblBright().setVisible(false);
			vf.getWindow().getPanelUpdateNacional().getLblDark().setVisible(true);
			vf.getWindow().getPanelUpdateNacional().getBtnBack().setVisible(false);
			vf.getWindow().getPanelUpdateNacional().getBtnBackDark().setVisible(true);
			vf.getWindow().getPanelUpdateNacional().getBtnUpdate().setVisible(false);
			vf.getWindow().getPanelUpdateNacional().getBtnUpdateDark().setVisible(true);
			vf.getWindow().getPanelUpdateNacional().getLabelPasajeros().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateNacional().getLabelHoraSalida().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateNacional().getLabelHoraLLegada().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateNacional().getLabelEmpresa().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateNacional().getLabelCombo().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateNacional().getLabelNewData().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateNacional().getLabelListaVuelos().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateNacional().getLabelNombrePiloto().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateNacional().getLabelNombreCopiloto().setForeground(Color.WHITE);

			vf.getWindow().getPanelDeleteNacional().getLblBright().setVisible(false);
			vf.getWindow().getPanelDeleteNacional().getLblDark().setVisible(true);
			vf.getWindow().getPanelDeleteNacional().getBtnBack().setVisible(false);
			vf.getWindow().getPanelDeleteNacional().getBtnBackDark().setVisible(true);
			vf.getWindow().getPanelDeleteNacional().getBtnDelete().setVisible(false);
			vf.getWindow().getPanelDeleteNacional().getBtnDeleteDark().setVisible(true);
			vf.getWindow().getPanelDeleteNacional().getListaVuelos().setForeground(Color.WHITE);
			vf.getWindow().getPanelDeleteNacional().getLblDatoEliminar().setForeground(Color.WHITE);

			vf.getWindow().getMainPanelInternacional().setBackground(new Color(20, 20, 20));
			vf.getWindow().getPanelAddInternacional().setBackground(new Color(20, 20, 20));
			vf.getWindow().getPanelUpdateInternacional().setBackground(new Color(20, 20, 20));
			vf.getWindow().getPanelDeleteInternacional().setBackground(new Color(20, 20, 20));

			vf.getWindow().getMainPanel().getLblDark().setVisible(true);
			vf.getWindow().getMainPanel().getLblBright().setVisible(false);
			vf.getWindow().getMainPanel().getBtnInternacional().setVisible(false);
			vf.getWindow().getMainPanel().getBtnInternacionalDark().setVisible(true);
			vf.getWindow().getMainPanel().getBtnInternacional().setVisible(false);
			vf.getWindow().getMainPanel().getBtnInternacionalDark().setVisible(true);
			vf.getWindow().getMainPanel().getBtnChangeScreen().setVisible(false);
			vf.getWindow().getMainPanel().getBtnChangeScreenDark().setVisible(true);
			vf.getWindow().getMainPanel().getBtnSalir().setVisible(false);
			vf.getWindow().getMainPanel().getBtnSalirDark().setVisible(true);

			vf.getWindow().getMainPanelInternacional().getLblBright().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getLblDark().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getBtnAdd().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getBtnAddDark().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getBtnUpdate().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getBtnUpdateDark().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getBtnDelete().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getBtnDeleteDark().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getBtnBack().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getBtnBackDark().setVisible(true);

			vf.getWindow().getPanelAddInternacional().getLblBright().setVisible(false);
			vf.getWindow().getPanelAddInternacional().getLblDark().setVisible(true);
			vf.getWindow().getPanelAddInternacional().getBtnAdd().setVisible(false);
			vf.getWindow().getPanelAddInternacional().getBtnAddDark().setVisible(true);
			vf.getWindow().getPanelAddInternacional().getBtnBack().setVisible(false);
			vf.getWindow().getPanelAddInternacional().getBtnBackDark().setVisible(true);
			vf.getWindow().getPanelAddInternacional().getLabelPasajeros().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddInternacional().getLabelHoraSalida().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddInternacional().getLabelHoraLLegada().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddInternacional().getLabelEmpresa().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddInternacional().getLabelCombo().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddInternacional().getLabelNombrePiloto().setForeground(Color.WHITE);
			vf.getWindow().getPanelAddInternacional().getLabelNombreCopiloto().setForeground(Color.WHITE);

			vf.getWindow().getPanelUpdateInternacional().getLblBright().setVisible(false);
			vf.getWindow().getPanelUpdateInternacional().getLblDark().setVisible(true);
			vf.getWindow().getPanelUpdateInternacional().getBtnBack().setVisible(false);
			vf.getWindow().getPanelUpdateInternacional().getBtnBackDark().setVisible(true);
			vf.getWindow().getPanelUpdateInternacional().getBtnUpdate().setVisible(false);
			vf.getWindow().getPanelUpdateInternacional().getBtnUpdateDark().setVisible(true);
			vf.getWindow().getPanelUpdateInternacional().getLabelPasajeros().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateInternacional().getLabelHoraSalida().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateInternacional().getLabelHoraLLegada().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateInternacional().getLabelEmpresa().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateInternacional().getLabelCombo().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateInternacional().getLabelNewData().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateInternacional().getLabelListaVuelos().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateInternacional().getLabelNombrePiloto().setForeground(Color.WHITE);
			vf.getWindow().getPanelUpdateInternacional().getLabelNombreCopiloto().setForeground(Color.WHITE);

			vf.getWindow().getPanelDeleteInternacional().getLblBright().setVisible(false);
			vf.getWindow().getPanelDeleteInternacional().getLblDark().setVisible(true);
			vf.getWindow().getPanelDeleteInternacional().getBtnBack().setVisible(false);
			vf.getWindow().getPanelDeleteInternacional().getBtnBackDark().setVisible(true);
			vf.getWindow().getPanelDeleteInternacional().getBtnDelete().setVisible(false);
			vf.getWindow().getPanelDeleteInternacional().getBtnDeleteDark().setVisible(true);
			vf.getWindow().getPanelDeleteInternacional().getListaVuelos().setForeground(Color.WHITE);
			vf.getWindow().getPanelDeleteInternacional().getLblDatoEliminar().setForeground(Color.WHITE);

			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnChangeScreenDark()) {

			vf.getWindow().getMainPanel().setBackground(new Color(241, 241, 236));
			vf.getWindow().getMainPanelNacional().setBackground(new Color(241, 241, 236));
			vf.getWindow().getPanelAddNacional().setBackground(new Color(241, 241, 236));
			vf.getWindow().getPanelUpdateNacional().setBackground(new Color(241, 241, 236));
			vf.getWindow().getPanelDeleteNacional().setBackground(new Color(241, 241, 236));

			vf.getWindow().getMainPanel().getLblDark().setVisible(false);
			vf.getWindow().getMainPanel().getLblBright().setVisible(true);
			vf.getWindow().getMainPanel().getBtnNacional().setVisible(true);
			vf.getWindow().getMainPanel().getBtnNacionalDark().setVisible(false);
			vf.getWindow().getMainPanel().getBtnInternacional().setVisible(true);
			vf.getWindow().getMainPanel().getBtnInternacionalDark().setVisible(false);
			vf.getWindow().getMainPanel().getBtnChangeScreen().setVisible(true);
			vf.getWindow().getMainPanel().getBtnChangeScreenDark().setVisible(false);
			vf.getWindow().getMainPanel().getBtnSalir().setVisible(true);
			vf.getWindow().getMainPanel().getBtnSalirDark().setVisible(false);
			vf.getWindow().getMainPanel().getBtnExport().setVisible(true);
			vf.getWindow().getMainPanel().getBtnExportDark().setVisible(false);

			vf.getWindow().getMainPanel().getLblLogo().setVisible(true);
			vf.getWindow().getMainPanel().getLblLogoDark().setVisible(false);
			vf.getWindow().getMainPanelNacional().getLblLogo().setVisible(true);
			vf.getWindow().getMainPanelNacional().getLblLogoDark().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getLblLogo().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getLblLogoDark().setVisible(false);
			vf.getWindow().getPanelAddNacional().getLblLogo().setVisible(true);
			vf.getWindow().getPanelAddNacional().getLblLogoDark().setVisible(false);
			vf.getWindow().getPanelAddInternacional().getLblLogo().setVisible(true);
			vf.getWindow().getPanelAddInternacional().getLblLogoDark().setVisible(false);
			vf.getWindow().getPanelUpdateNacional().getLblLogo().setVisible(true);
			vf.getWindow().getPanelUpdateNacional().getLblLogoDark().setVisible(false);
			vf.getWindow().getPanelUpdateInternacional().getLblLogo().setVisible(true);
			vf.getWindow().getPanelUpdateInternacional().getLblLogoDark().setVisible(false);
			vf.getWindow().getPanelDeleteNacional().getLblLogo().setVisible(true);
			vf.getWindow().getPanelDeleteNacional().getLblLogoDark().setVisible(false);
			vf.getWindow().getPanelDeleteInternacional().getLblLogo().setVisible(true);
			vf.getWindow().getPanelDeleteInternacional().getLblLogoDark().setVisible(false);

			vf.getWindow().getMainPanelNacional().getLblBright().setVisible(true);
			vf.getWindow().getMainPanelNacional().getLblDark().setVisible(false);
			vf.getWindow().getMainPanelNacional().getBtnAdd().setVisible(true);
			vf.getWindow().getMainPanelNacional().getBtnAddDark().setVisible(false);
			vf.getWindow().getMainPanelNacional().getBtnUpdate().setVisible(true);
			vf.getWindow().getMainPanelNacional().getBtnUpdateDark().setVisible(false);
			vf.getWindow().getMainPanelNacional().getBtnDelete().setVisible(true);
			vf.getWindow().getMainPanelNacional().getBtnDeleteDark().setVisible(false);
			vf.getWindow().getMainPanelNacional().getBtnBack().setVisible(true);
			vf.getWindow().getMainPanelNacional().getBtnBackDark().setVisible(false);

			vf.getWindow().getPanelAddNacional().getLblBright().setVisible(true);
			vf.getWindow().getPanelAddNacional().getLblDark().setVisible(false);
			vf.getWindow().getPanelAddNacional().getBtnAdd().setVisible(true);
			vf.getWindow().getPanelAddNacional().getBtnAddDark().setVisible(false);
			vf.getWindow().getPanelAddNacional().getBtnBack().setVisible(true);
			vf.getWindow().getPanelAddNacional().getBtnBackDark().setVisible(false);
			vf.getWindow().getPanelAddNacional().getLabelPasajeros().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddNacional().getLabelHoraSalida().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddNacional().getLabelHoraLLegada().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddNacional().getLabelEmpresa().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddNacional().getLabelCombo().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddNacional().getLabelNombrePiloto().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddNacional().getLabelNombreCopiloto().setForeground(Color.BLACK);

			vf.getWindow().getPanelUpdateNacional().getLblBright().setVisible(true);
			vf.getWindow().getPanelUpdateNacional().getLblDark().setVisible(false);
			vf.getWindow().getPanelUpdateNacional().getBtnBack().setVisible(true);
			vf.getWindow().getPanelUpdateNacional().getBtnBackDark().setVisible(false);
			vf.getWindow().getPanelUpdateNacional().getBtnUpdate().setVisible(true);
			vf.getWindow().getPanelUpdateNacional().getBtnUpdateDark().setVisible(false);
			vf.getWindow().getPanelUpdateNacional().getLabelPasajeros().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateNacional().getLabelHoraSalida().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateNacional().getLabelHoraLLegada().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateNacional().getLabelEmpresa().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateNacional().getLabelCombo().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateNacional().getLabelNewData().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateNacional().getLabelListaVuelos().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateNacional().getLabelNombrePiloto().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateNacional().getLabelNombreCopiloto().setForeground(Color.BLACK);

			vf.getWindow().getPanelDeleteNacional().getLblBright().setVisible(true);
			vf.getWindow().getPanelDeleteNacional().getLblDark().setVisible(false);
			vf.getWindow().getPanelDeleteNacional().getBtnBack().setVisible(true);
			vf.getWindow().getPanelDeleteNacional().getBtnBackDark().setVisible(false);
			vf.getWindow().getPanelDeleteNacional().getBtnDelete().setVisible(true);
			vf.getWindow().getPanelDeleteNacional().getBtnDeleteDark().setVisible(false);
			vf.getWindow().getPanelDeleteNacional().getListaVuelos().setForeground(Color.BLACK);
			vf.getWindow().getPanelDeleteNacional().getLblDatoEliminar().setForeground(Color.BLACK);

			vf.getWindow().getMainPanelInternacional().setBackground(new Color(241, 241, 236));
			vf.getWindow().getPanelAddInternacional().setBackground(new Color(241, 241, 236));
			vf.getWindow().getPanelUpdateInternacional().setBackground(new Color(241, 241, 236));
			vf.getWindow().getPanelDeleteInternacional().setBackground(new Color(241, 241, 236));

			vf.getWindow().getMainPanel().getLblDark().setVisible(false);
			vf.getWindow().getMainPanel().getLblBright().setVisible(true);
			vf.getWindow().getMainPanel().getBtnInternacional().setVisible(true);
			vf.getWindow().getMainPanel().getBtnInternacionalDark().setVisible(false);
			vf.getWindow().getMainPanel().getBtnInternacional().setVisible(true);
			vf.getWindow().getMainPanel().getBtnInternacionalDark().setVisible(false);
			vf.getWindow().getMainPanel().getBtnChangeScreen().setVisible(true);
			vf.getWindow().getMainPanel().getBtnChangeScreenDark().setVisible(false);
			vf.getWindow().getMainPanel().getBtnSalir().setVisible(true);
			vf.getWindow().getMainPanel().getBtnSalirDark().setVisible(false);

			vf.getWindow().getMainPanelInternacional().getLblBright().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getLblDark().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getBtnAdd().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getBtnAddDark().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getBtnUpdate().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getBtnUpdateDark().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getBtnDelete().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getBtnDeleteDark().setVisible(false);
			vf.getWindow().getMainPanelInternacional().getBtnBack().setVisible(true);
			vf.getWindow().getMainPanelInternacional().getBtnBackDark().setVisible(false);

			vf.getWindow().getPanelAddInternacional().getLblBright().setVisible(true);
			vf.getWindow().getPanelAddInternacional().getLblDark().setVisible(false);
			vf.getWindow().getPanelAddInternacional().getBtnAdd().setVisible(true);
			vf.getWindow().getPanelAddInternacional().getBtnAddDark().setVisible(false);
			vf.getWindow().getPanelAddInternacional().getBtnBack().setVisible(true);
			vf.getWindow().getPanelAddInternacional().getBtnBackDark().setVisible(false);
			vf.getWindow().getPanelAddInternacional().getLabelPasajeros().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddInternacional().getLabelHoraSalida().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddInternacional().getLabelHoraLLegada().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddInternacional().getLabelEmpresa().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddInternacional().getLabelCombo().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddInternacional().getLabelNombrePiloto().setForeground(Color.BLACK);
			vf.getWindow().getPanelAddInternacional().getLabelNombreCopiloto().setForeground(Color.BLACK);

			vf.getWindow().getPanelUpdateInternacional().getLblBright().setVisible(true);
			vf.getWindow().getPanelUpdateInternacional().getLblDark().setVisible(false);
			vf.getWindow().getPanelUpdateInternacional().getBtnBack().setVisible(true);
			vf.getWindow().getPanelUpdateInternacional().getBtnBackDark().setVisible(false);
			vf.getWindow().getPanelUpdateInternacional().getBtnUpdate().setVisible(true);
			vf.getWindow().getPanelUpdateInternacional().getBtnUpdateDark().setVisible(false);
			vf.getWindow().getPanelUpdateInternacional().getLabelPasajeros().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateInternacional().getLabelHoraSalida().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateInternacional().getLabelHoraLLegada().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateInternacional().getLabelEmpresa().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateInternacional().getLabelCombo().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateInternacional().getLabelNewData().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateInternacional().getLabelListaVuelos().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateInternacional().getLabelNombrePiloto().setForeground(Color.BLACK);
			vf.getWindow().getPanelUpdateInternacional().getLabelNombreCopiloto().setForeground(Color.BLACK);

			vf.getWindow().getPanelDeleteInternacional().getLblBright().setVisible(true);
			vf.getWindow().getPanelDeleteInternacional().getLblDark().setVisible(false);
			vf.getWindow().getPanelDeleteInternacional().getBtnBack().setVisible(true);
			vf.getWindow().getPanelDeleteInternacional().getBtnBackDark().setVisible(false);
			vf.getWindow().getPanelDeleteInternacional().getBtnDelete().setVisible(true);
			vf.getWindow().getPanelDeleteInternacional().getBtnDeleteDark().setVisible(false);
			vf.getWindow().getPanelDeleteInternacional().getListaVuelos().setForeground(Color.BLACK);
			vf.getWindow().getPanelDeleteInternacional().getLblDatoEliminar().setForeground(Color.BLACK);

			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnSalir()) {
			System.exit(0);
		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnNacional()) {
			vf.getWindow().remove(vf.getWindow().getMainPanel());
			vf.getWindow().add(vf.getWindow().getMainPanelNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		}

		else if (e.getSource() == vf.getWindow().getMainPanel().getBtnSalirDark()) {
			System.exit(0);
		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnNacionalDark()) {
			vf.getWindow().remove(vf.getWindow().getMainPanel());
			vf.getWindow().add(vf.getWindow().getMainPanelNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnInternacional()) {
			vf.getWindow().remove(vf.getWindow().getMainPanel());
			vf.getWindow().add(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnInternacionalDark()) {
			vf.getWindow().remove(vf.getWindow().getMainPanel());
			vf.getWindow().add(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		}

		else if (e.getSource() == vf.getWindow().getMainPanelNacional().getBtnBack()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelNacional());
			vf.getWindow().add(vf.getWindow().getMainPanel());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getMainPanelNacional().getBtnAdd()) {

			vf.getWindow().remove(vf.getWindow().getMainPanelNacional());
			vf.getWindow().add(vf.getWindow().getPanelAddNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelNacional().getBtnUpdate()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelNacional());
			vf.getWindow().add(vf.getWindow().getPanelUpdateNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelNacional().getBtnDelete()) {

			vf.getWindow().remove(vf.getWindow().getMainPanelNacional());
			vf.getWindow().add(vf.getWindow().getPanelDeleteNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelNacional().getBtnBackDark()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelNacional());
			vf.getWindow().add(vf.getWindow().getMainPanel());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getMainPanelNacional().getBtnAddDark()) {

			vf.getWindow().remove(vf.getWindow().getMainPanelNacional());
			vf.getWindow().add(vf.getWindow().getPanelAddNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelNacional().getBtnUpdateDark()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelNacional());
			vf.getWindow().add(vf.getWindow().getPanelUpdateNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelNacional().getBtnDeleteDark()) {

			vf.getWindow().remove(vf.getWindow().getMainPanelNacional());
			vf.getWindow().add(vf.getWindow().getPanelDeleteNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		}

		else if (e.getSource() == vf.getWindow().getPanelAddNacional().getBtnAdd()) {

			addNacional();

		} else if (e.getSource() == vf.getWindow().getPanelAddNacional().getBtnAddDark()) {

			addNacional();

		}

		else if (e.getSource() == vf.getWindow().getPanelAddNacional().getBtnBack()) {
			vf.getWindow().remove(vf.getWindow().getPanelAddNacional());
			vf.getWindow().add(vf.getWindow().getMainPanelNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelAddNacional().getBtnBackDark()) {
			vf.getWindow().remove(vf.getWindow().getPanelAddNacional());
			vf.getWindow().add(vf.getWindow().getMainPanelNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelAddNacional().getNomEmpresa()) {

			String aerolinea = vf.getWindow().getPanelAddNacional().getNomEmpresa().getSelectedItem().toString();
			switch (aerolinea) {
			case "Avianca": {
				vf.getWindow().getPanelAddNacional().getAvianca().setVisible(true);
				vf.getWindow().getPanelAddNacional().getLatam().setVisible(false);
				vf.getWindow().getPanelAddNacional().getWingo().setVisible(false);
				vf.getWindow().getPanelAddNacional().getEmirates().setVisible(false);
			}
				break;

			case "LATAM": {
				vf.getWindow().getPanelAddNacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelAddNacional().getLatam().setVisible(true);
				vf.getWindow().getPanelAddNacional().getWingo().setVisible(false);
				vf.getWindow().getPanelAddNacional().getEmirates().setVisible(false);
			}
				break;

			case "Wingo": {
				vf.getWindow().getPanelAddNacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelAddNacional().getLatam().setVisible(false);
				vf.getWindow().getPanelAddNacional().getWingo().setVisible(true);
				vf.getWindow().getPanelAddNacional().getEmirates().setVisible(false);
			}
				break;
			case "Emirates": {
				vf.getWindow().getPanelAddNacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelAddNacional().getLatam().setVisible(false);
				vf.getWindow().getPanelAddNacional().getWingo().setVisible(false);
				vf.getWindow().getPanelAddNacional().getEmirates().setVisible(true);
			}
				break;

			}
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelUpdateNacional().getNomEmpresa()) {
			String aerolinea = vf.getWindow().getPanelUpdateNacional().getNomEmpresa().getSelectedItem().toString();
			switch (aerolinea) {
			case "Avianca": {
				vf.getWindow().getPanelUpdateNacional().getAvianca().setVisible(true);
				vf.getWindow().getPanelUpdateNacional().getLatam().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getWingo().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getEmirates().setVisible(false);
			}
				break;

			case "LATAM": {
				vf.getWindow().getPanelUpdateNacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getLatam().setVisible(true);
				vf.getWindow().getPanelUpdateNacional().getWingo().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getEmirates().setVisible(false);
			}
				break;

			case "Wingo": {
				vf.getWindow().getPanelUpdateNacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getLatam().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getWingo().setVisible(true);
				vf.getWindow().getPanelUpdateNacional().getEmirates().setVisible(false);
			}
				break;
			case "Emirates": {
				vf.getWindow().getPanelUpdateNacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getLatam().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getWingo().setVisible(false);
				vf.getWindow().getPanelUpdateNacional().getEmirates().setVisible(true);
			}
				break;

			}
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelUpdateNacional().getBtnBack()) {
			vf.getWindow().remove(vf.getWindow().getPanelUpdateNacional());
			vf.getWindow().add(vf.getWindow().getMainPanelNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelUpdateNacional().getBtnBackDark()) {
			vf.getWindow().remove(vf.getWindow().getPanelUpdateNacional());
			vf.getWindow().add(vf.getWindow().getMainPanelNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelUpdateNacional().getBtnUpdate()) {

		} else if (e.getSource() == vf.getWindow().getPanelUpdateNacional().getBtnUpdateDark()) {

		} else if (e.getSource() == vf.getWindow().getPanelDeleteNacional().getBtnBack()) {
			vf.getWindow().remove(vf.getWindow().getPanelDeleteNacional());
			vf.getWindow().add(vf.getWindow().getMainPanelNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelDeleteNacional().getBtnBackDark()) {
			vf.getWindow().remove(vf.getWindow().getPanelDeleteNacional());
			vf.getWindow().add(vf.getWindow().getMainPanelNacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelDeleteNacional().getBtnDelete()) {

		} else if (e.getSource() == vf.getWindow().getPanelDeleteNacional().getBtnDeleteDark()) {

		} else if (e.getSource() == vf.getWindow().getMainPanelInternacional().getBtnBack()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().add(vf.getWindow().getMainPanel());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getMainPanelInternacional().getBtnAdd()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().add(vf.getWindow().getPanelAddInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelInternacional().getBtnUpdate()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().add(vf.getWindow().getPanelUpdateInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelInternacional().getBtnDelete()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().add(vf.getWindow().getPanelDeleteInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelInternacional().getBtnBackDark()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().add(vf.getWindow().getMainPanel());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getMainPanelInternacional().getBtnAddDark()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().add(vf.getWindow().getPanelAddInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelInternacional().getBtnUpdateDark()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().add(vf.getWindow().getPanelUpdateInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getMainPanelInternacional().getBtnDeleteDark()) {
			vf.getWindow().remove(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().add(vf.getWindow().getPanelDeleteInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();

		} else if (e.getSource() == vf.getWindow().getPanelAddInternacional().getBtnAdd()) {

		} else if (e.getSource() == vf.getWindow().getPanelAddInternacional().getBtnBack()) {
			vf.getWindow().remove(vf.getWindow().getPanelAddInternacional());
			vf.getWindow().add(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelAddInternacional().getBtnBackDark()) {
			vf.getWindow().remove(vf.getWindow().getPanelAddInternacional());
			vf.getWindow().add(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelAddInternacional().getNomEmpresa()) {

			String aerolinea = vf.getWindow().getPanelAddInternacional().getNomEmpresa().getSelectedItem().toString();
			switch (aerolinea) {
			case "Avianca": {
				vf.getWindow().getPanelAddInternacional().getAvianca().setVisible(true);
				vf.getWindow().getPanelAddInternacional().getLatam().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getWingo().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getEmirates().setVisible(false);
			}
				break;

			case "LATAM": {
				vf.getWindow().getPanelAddInternacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getLatam().setVisible(true);
				vf.getWindow().getPanelAddInternacional().getWingo().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getEmirates().setVisible(false);
			}
				break;

			case "Wingo": {
				vf.getWindow().getPanelAddInternacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getLatam().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getWingo().setVisible(true);
				vf.getWindow().getPanelAddInternacional().getEmirates().setVisible(false);
			}
				break;
			case "Emirates": {
				vf.getWindow().getPanelAddInternacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getLatam().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getWingo().setVisible(false);
				vf.getWindow().getPanelAddInternacional().getEmirates().setVisible(true);
			}
				break;

			}
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelUpdateInternacional().getNomEmpresa()) {
			String aerolinea = vf.getWindow().getPanelUpdateInternacional().getNomEmpresa().getSelectedItem()
					.toString();
			switch (aerolinea) {
			case "Avianca": {
				vf.getWindow().getPanelUpdateInternacional().getAvianca().setVisible(true);
				vf.getWindow().getPanelUpdateInternacional().getLatam().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getWingo().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getEmirates().setVisible(false);
			}
				break;

			case "LATAM": {
				vf.getWindow().getPanelUpdateInternacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getLatam().setVisible(true);
				vf.getWindow().getPanelUpdateInternacional().getWingo().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getEmirates().setVisible(false);
			}
				break;

			case "Wingo": {
				vf.getWindow().getPanelUpdateInternacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getLatam().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getWingo().setVisible(true);
				vf.getWindow().getPanelUpdateInternacional().getEmirates().setVisible(false);
			}
				break;
			case "Emirates": {
				vf.getWindow().getPanelUpdateInternacional().getAvianca().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getLatam().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getWingo().setVisible(false);
				vf.getWindow().getPanelUpdateInternacional().getEmirates().setVisible(true);
			}
				break;

			}
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelUpdateInternacional().getBtnBack()) {
			vf.getWindow().remove(vf.getWindow().getPanelUpdateInternacional());
			vf.getWindow().add(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelUpdateInternacional().getBtnBackDark()) {
			vf.getWindow().remove(vf.getWindow().getPanelUpdateInternacional());
			vf.getWindow().add(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelUpdateInternacional().getBtnUpdate()) {

		} else if (e.getSource() == vf.getWindow().getPanelUpdateInternacional().getBtnUpdateDark()) {

		} else if (e.getSource() == vf.getWindow().getPanelDeleteInternacional().getBtnBack()) {
			vf.getWindow().remove(vf.getWindow().getPanelDeleteInternacional());
			vf.getWindow().add(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelDeleteInternacional().getBtnBackDark()) {
			vf.getWindow().remove(vf.getWindow().getPanelDeleteInternacional());
			vf.getWindow().add(vf.getWindow().getMainPanelInternacional());
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getPanelDeleteInternacional().getBtnDelete()) {

		} else if (e.getSource() == vf.getWindow().getPanelDeleteInternacional().getBtnDeleteDark()) {

		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnExport()) {

		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnExportDark()) {

		}
	}

	public void addNacional() {

		String airline = vf.getWindow().getPanelAddNacional().getNomEmpresa().getSelectedItem().toString();
		try {
			ExceptionChecker.verificarEspaciosVacios(airline);
		} catch (EmptyTextException e) {
			vf.getWindow().getPopUpWindow().espaciosVacios();
		}

		String numPassengers = vf.getWindow().getPanelAddNacional().getNumPasajeros().getText();

		try {
			ExceptionChecker.verificarEspaciosVacios(numPassengers);
			int pasajeros = Integer.parseInt(numPassengers);
			ExceptionChecker.verificarNumeroPasajeros(pasajeros);
			ExceptionChecker.verificarNombre(numPassengers);
		} catch (EmptyTextException e) {
			vf.getWindow().getPopUpWindow().espaciosVacios();
		} catch (PassengerNumberException e) {
			vf.getWindow().getPopUpWindow().numeroPasajerosErroneo();
		} catch (InputTextNotValidException e) {
			vf.getWindow().getPopUpWindow().nombreInvalido();
		}

		String captain = vf.getWindow().getPanelAddNacional().getNombrePiloto().getText();
		try {
			ExceptionChecker.verificarEspaciosVacios(captain);
			ExceptionChecker.verificarNombre(captain);
		} catch (EmptyTextException e) {
			vf.getWindow().getPopUpWindow().espaciosVacios();
		} catch (InputTextNotValidException e) {
			vf.getWindow().getPopUpWindow().nombreInvalido();
		}

		String copilot = vf.getWindow().getPanelAddNacional().getNombreCopiloto().getText();
		try {
			ExceptionChecker.verificarEspaciosVacios(copilot);
			ExceptionChecker.verificarNombre(copilot);
		} catch (EmptyTextException e) {
			vf.getWindow().getPopUpWindow().espaciosVacios();
		} catch (InputTextNotValidException e) {
			vf.getWindow().getPopUpWindow().nombreInvalido();
		}

		String arrival = vf.getWindow().getPanelAddNacional().getHoraLlegada().getText();
		try {
			ExceptionChecker.verificarEspaciosVacios(arrival);

		} catch (EmptyTextException e) {
			vf.getWindow().getPopUpWindow().espaciosVacios();
		}

		String departure = vf.getWindow().getPanelAddNacional().getHoraSalida().getText();
		try {
			ExceptionChecker.verificarEspaciosVacios(departure);

		} catch (EmptyTextException e) {
			vf.getWindow().getPopUpWindow().espaciosVacios();
		}

		int fuel = Integer.parseInt(vf.getWindow().getPanelAddNacional().getNumPasajeros().getText()) * 600;
		String fuelWeight = String.valueOf(fuel);

		int packageW = Integer.parseInt(numPassengers) * 10;
		String packageWeight = String.valueOf(packageW);

		String motorType = vf.getWindow().getPanelAddNacional().getTurbinaOHelice().getSelectedItem().toString();
		try {
			ExceptionChecker.verificarEspaciosVacios(motorType);
		} catch (EmptyTextException e) {
			vf.getWindow().getPopUpWindow().espaciosVacios();
		}

		mf.getVueloNacionalDAO().add(new VueloNacionalDTO(airline, numPassengers, captain, copilot, arrival, departure,
				fuelWeight, packageWeight, motorType));
	}

	public void updateNacional() {

	}

	public void deleteNacional() {

	}

	public void addInternacional() {

	}

	public void updateInternacional() {

	}

	public void deleteInternacional() {

	}

}
