package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PnlInicio extends JPanel {
	private JButton registrarCiu;
	private JButton buscarCiu;
	private JButton graficas;
	private JButton listaInscritos;
	private JLabel logo;
	ImageIcon imagen;
	Icon icono;

	public PnlInicio() {
		setLayout(null);
		setBackground(Color.DARK_GRAY);

		IniciarComponentes();

		setVisible(true);

	}

	public void IniciarComponentes() {
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

	public JButton getRegistrarCiu() {
		return registrarCiu;
	}

	public void setRegistrarCiu(JButton registrarCiu) {
		this.registrarCiu = registrarCiu;
	}

	public JButton getBuscarCiu() {
		return buscarCiu;
	}

	public void setBuscarCiu(JButton buscarCiu) {
		this.buscarCiu = buscarCiu;
	}

	public JButton getGraficas() {
		return graficas;
	}

	public void setGraficas(JButton graficas) {
		this.graficas = graficas;
	}

	public JButton getListaInscritos() {
		return listaInscritos;
	}

	public void setListaInscritos(JButton listaInscritos) {
		this.listaInscritos = listaInscritos;
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	public Icon getIcono() {
		return icono;
	}

	public void setIcono(Icon icono) {
		this.icono = icono;
	}

}
