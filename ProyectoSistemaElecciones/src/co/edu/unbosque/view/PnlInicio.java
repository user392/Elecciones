package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PnlInicio extends JPanel
{
	public JButton registrarCiu;
	public JButton buscarCiu;
	public JButton graficas;
	public JButton listaInscritos;
	public JLabel logo;
	ImageIcon imagen;
	Icon icono;
	
	public PnlInicio()
	{
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		IniciarComponentes();
		
		setVisible(true);
		
		
	}
	
	public void IniciarComponentes() 
	{
		registrarCiu = new JButton("Registrar Ciudadano");
		registrarCiu.setBackground(Color.ORANGE);
		registrarCiu.setSize(175, 40);
		registrarCiu.setLocation(380, 75);
		add(registrarCiu);
		
		buscarCiu = new JButton("Buscar Ciudadano");
		buscarCiu.setBackground(Color.ORANGE);
		buscarCiu.setSize(175, 40);
		buscarCiu.setLocation(620, 75);
		add(buscarCiu);
		
		graficas = new JButton("Graficas");
		graficas.setBackground(Color.ORANGE);
		graficas.setSize(175, 40);
		graficas.setLocation(380, 150);
		add(graficas);
		
		listaInscritos = new JButton("Lista de Inscritos");
		listaInscritos.setBackground(Color.ORANGE);
		listaInscritos.setSize(175, 40);
		listaInscritos.setLocation(620, 150);
		add(listaInscritos);
		
		
		
		
		
		
		
		logo = new JLabel();
		logo.setSize(300, 146);
		logo.setLocation(20, 150);
		imagen = new ImageIcon("Imagenes/inscripcion.jpg");
		icono = new ImageIcon(imagen.getImage().getScaledInstance(300, 146, Image.SCALE_DEFAULT));
		logo.setIcon(icono);
		add(logo);
		
		
	}

}
