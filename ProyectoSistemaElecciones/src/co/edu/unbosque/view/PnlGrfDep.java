package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PnlGrfDep extends JPanel {

	private JButton atras;

	public PnlGrfDep() {
		setLayout(null);
		setBackground(Color.white);

		IniciarComponentes();

		setVisible(false);
	}

	public void IniciarComponentes() {
		atras = new JButton("Atras");
		atras.setBackground(Color.ORANGE);
		atras.setSize(120, 30);
		atras.setLocation(761, 468);
		add(atras);

	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

}
