package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VtnPrincipal extends JFrame {

	private PnlAddPer pnlAddPer;
	private PnlBuscarPer pnlBuscarPer;
	private PnlGraficas pnlGraficas;
	private PnlInicio pnlInicio;
	private PnlGrfHommuj pnlGrfHommuj;
	private PnlListaInscritos pnlListaInscritos;
	private PnlGrfCol pnlGrfCol;
	private PnlGrfDep pnlGrfDep;
	private PnlGrfInscritos pnlGrfInscritos;
	private PnlGrfMun pnlGrfMun;
	private PnlGrfPuesto pnlGrfPuesto;

	public VtnPrincipal() {
		setLayout(null);
		setSize(900, 540);
		setBackground(Color.black);
		setTitle("SISTEMA REGISTRADURIA");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		IniciarComponentes();

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void IniciarComponentes() {
		pnlInicio = new PnlInicio();
		pnlInicio.setLocation(0, 0);
		pnlInicio.setSize(886, 503);
		add(pnlInicio);

		pnlAddPer = new PnlAddPer();
		pnlAddPer.setLocation(0, 0);
		pnlAddPer.setSize(886, 503);
		add(pnlAddPer);

		pnlBuscarPer = new PnlBuscarPer();
		pnlBuscarPer.setLocation(0, 0);
		pnlBuscarPer.setSize(886, 503);
		add(pnlBuscarPer);

		pnlGraficas = new PnlGraficas();
		pnlGraficas.setSize(886, 503);
		pnlGraficas.setLocation(0, 0);
		add(pnlGraficas);

		pnlListaInscritos = new PnlListaInscritos();
		pnlListaInscritos.setSize(886, 503);
		pnlListaInscritos.setLocation(0, 0);
		add(pnlListaInscritos);

		pnlGrfHommuj = new PnlGrfHommuj();
		pnlGrfHommuj.setSize(886, 506);
		pnlGrfHommuj.setLocation(0, 0);
		add(pnlGrfHommuj);

		pnlGrfInscritos = new PnlGrfInscritos();
		pnlGrfInscritos.setSize(886, 506);
		pnlGrfInscritos.setLocation(0, 0);
		add(pnlGrfInscritos);

		pnlGrfCol = new PnlGrfCol();
		pnlGrfCol.setSize(886, 506);
		pnlGrfCol.setLocation(0, 0);
		add(pnlGrfCol);

		pnlGrfDep = new PnlGrfDep();
		pnlGrfDep.setSize(886, 506);
		pnlGrfDep.setLocation(0, 0);
		add(pnlGrfDep);

		pnlGrfMun = new PnlGrfMun();
		pnlGrfMun.setSize(886, 506);
		pnlGrfMun.setLocation(0, 0);
		add(pnlGrfMun);

		pnlGrfPuesto = new PnlGrfPuesto();
		pnlGrfPuesto.setSize(886, 506);
		pnlGrfPuesto.setLocation(0, 0);
		add(pnlGrfPuesto);

	}

	public PnlAddPer getPnlAddPer() {
		return pnlAddPer;
	}

	public void setPnlAddPer(PnlAddPer pnlAddPer) {
		this.pnlAddPer = pnlAddPer;
	}

	public PnlBuscarPer getPnlBuscarPer() {
		return pnlBuscarPer;
	}

	public void setPnlBuscarPer(PnlBuscarPer pnlBuscarPer) {
		this.pnlBuscarPer = pnlBuscarPer;
	}

	public PnlGraficas getPnlGraficas() {
		return pnlGraficas;
	}

	public void setPnlGraficas(PnlGraficas pnlGraficas) {
		this.pnlGraficas = pnlGraficas;
	}

	public PnlInicio getPnlInicio() {
		return pnlInicio;
	}

	public void setPnlInicio(PnlInicio pnlInicio) {
		this.pnlInicio = pnlInicio;
	}

	public PnlGrfHommuj getPnlGrfHommuj() {
		return pnlGrfHommuj;
	}

	public void setPnlGrfHommuj(PnlGrfHommuj pnlGrfHommuj) {
		this.pnlGrfHommuj = pnlGrfHommuj;
	}

	public PnlListaInscritos getPnlListaInscritos() {
		return pnlListaInscritos;
	}

	public void setPnlListaInscritos(PnlListaInscritos pnlListaInscritos) {
		this.pnlListaInscritos = pnlListaInscritos;
	}

	public PnlGrfCol getPnlGrfCol() {
		return pnlGrfCol;
	}

	public void setPnlGrfCol(PnlGrfCol pnlGrfCol) {
		this.pnlGrfCol = pnlGrfCol;
	}

	public PnlGrfDep getPnlGrfDep() {
		return pnlGrfDep;
	}

	public void setPnlGrfDep(PnlGrfDep pnlGrfDep) {
		this.pnlGrfDep = pnlGrfDep;
	}

	public PnlGrfInscritos getPnlGrfInscritos() {
		return pnlGrfInscritos;
	}

	public void setPnlGrfInscritos(PnlGrfInscritos pnlGrfInscritos) {
		this.pnlGrfInscritos = pnlGrfInscritos;
	}

	public PnlGrfMun getPnlGrfMun() {
		return pnlGrfMun;
	}

	public void setPnlGrfMun(PnlGrfMun pnlGrfMun) {
		this.pnlGrfMun = pnlGrfMun;
	}

	public PnlGrfPuesto getPnlGrfPuesto() {
		return pnlGrfPuesto;
	}

	public void setPnlGrfPuesto(PnlGrfPuesto pnlGrfPuesto) {
		this.pnlGrfPuesto = pnlGrfPuesto;
	}
	
	

}
