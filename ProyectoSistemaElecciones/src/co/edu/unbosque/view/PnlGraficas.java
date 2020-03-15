package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PnlGraficas extends JPanel
{
	public JButton homMuj, inscritos, insCol, insDep, insMun, insPuesto, volver;
	
	
	public PnlGraficas()
	{
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		IniciarComponentes();
		
		setVisible(false);
	}
	
	public void IniciarComponentes()
	{
		homMuj = new JButton("Hombres-Mujeres");
		homMuj.setBackground(Color.ORANGE);
		homMuj.setSize(200, 50);
		homMuj.setLocation(90, 100);
		add(homMuj);
		
		inscritos = new JButton("Inscritos");
		inscritos.setBackground(Color.ORANGE);
		inscritos.setSize(200, 50);
		inscritos.setLocation(340, 100);
		add(inscritos);
		
		insCol = new JButton("Inscritos-Colombia");
		insCol.setBackground(Color.ORANGE);
		insCol.setSize(200, 50);
		insCol.setLocation(590, 100);
		add(insCol);
		
		insDep = new JButton("Inscritos-Departamento");
		insDep.setBackground(Color.ORANGE);
		insDep.setSize(200, 50);
		insDep.setLocation(90, 300);
		add(insDep);
		
		insMun = new JButton("Inscritos-Municipio");
		insMun.setBackground(Color.ORANGE);
		insMun.setSize(200, 50);
		insMun.setLocation(340, 300);
		add(insMun);
		
		insPuesto = new JButton("Inscritos-Puesto");
		insPuesto.setBackground(Color.ORANGE);
		insPuesto.setSize(200, 50);
		insPuesto.setLocation(590, 300);
		add(insPuesto);
		
		volver = new JButton("Regresar");
		volver.setBackground(Color.ORANGE);
		volver.setSize(120, 30);
		volver.setLocation(761, 468);
		add(volver);
	}

}
