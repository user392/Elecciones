package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PnlListaInscritos extends JPanel {

	private JButton volver;

	public PnlListaInscritos() {
		setLayout(null);
		setBackground(Color.WHITE);

		IniciarComponentes();

		setVisible(false);

	}

	public void IniciarComponentes() {

		volver = new JButton("Regresar");
		volver.setBackground(Color.ORANGE);
		volver.setSize(120, 30);
		volver.setLocation(761, 468);
		add(volver);

	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	
	
}