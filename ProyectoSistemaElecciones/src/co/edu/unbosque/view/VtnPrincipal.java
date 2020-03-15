package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VtnPrincipal extends JFrame
{
	public PnlAddPer pnlAddPer;
	public PnlBuscarPer pnlBuscarPer;
	public PnlGraficas pnlGraficas;
	public PnlInicio pnlInicio;
	public PnlGrfHommuj pnlGrfHommuj;
	public PnlListaInscritos pnlListaInscritos;
	
	
	
	public VtnPrincipal()
	{
		setLayout(null);
		setSize(900,540);
		setBackground(Color.black);
		setTitle("SISTEMA REGISTRADURIA");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		IniciarComponentes();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void IniciarComponentes()
	{
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
		
		
		
		
		
	}

}
