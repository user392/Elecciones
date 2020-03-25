package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PnlBuscarPer extends JPanel {

	private JLabel nodoc;
	private JTextField inodoc;
	private JButton volver;

	public PnlBuscarPer() {
		setLayout(null);
		setBackground(Color.WHITE);

		IniciarComponentes();

		setVisible(false);

	}

	public void IniciarComponentes() {
		nodoc = new JLabel("No. de Documento: ");
		nodoc.setSize(150, 30);
		nodoc.setLocation(270, 50);
		add(nodoc);

		inodoc = new JTextField();
		inodoc.setSize(150, 30);
		inodoc.setLocation(470, 50);
		add(inodoc);

		volver = new JButton("Regresar");
		volver.setBackground(Color.ORANGE);
		volver.setSize(120, 30);
		volver.setLocation(761, 468);
		add(volver);

	}

	public JLabel getNodoc() {
		return nodoc;
	}

	public void setNodoc(JLabel nodoc) {
		this.nodoc = nodoc;
	}

	public JTextField getInodoc() {
		return inodoc;
	}

	public void setInodoc(JTextField inodoc) {
		this.inodoc = inodoc;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

}
