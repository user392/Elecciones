package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.model.Persona;

public class PnlListaInscritos extends JPanel {

	private JButton volver;
	private JTextArea txtnombre1, txtapellido1, txtnombre2, txtapellido2, txtlugarexpedicion, txtcedula, txtnacimiento, txtaño
	,txtpuestodevotacion,txtfechanacimiento,txtfechaExpedicion , txtsexo , txtlugarNacimiento;
	private JPanel boton;
	private static final long serialVersionUID = 1L;
	
	public PnlListaInscritos() {
		
		setLayout( new GridLayout(1,16) );
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Registros");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		 
		//labArchivo = new JLabel("Resultado de Registros");
		txtnombre1 = new JTextArea("");
		txtnombre1.setForeground(Color.BLACK);
		txtnombre1.setBackground(Color.WHITE);
	
		txtnombre2 = new JTextArea("");
		txtnombre2.setForeground(Color.BLACK);
		txtnombre2.setBackground(Color.WHITE);
	
		txtapellido1 = new JTextArea("");
		txtapellido1.setForeground(Color.BLACK);
		txtapellido1.setBackground(Color.WHITE);
		
		txtapellido2 = new JTextArea("");
		txtapellido2.setForeground(Color.BLACK);
		txtapellido2.setBackground(Color.WHITE);
	
		txtcedula = new JTextArea("");
		txtcedula.setForeground(Color.BLACK);
		txtcedula.setBackground(Color.WHITE);
		
		txtsexo = new JTextArea("");
		txtsexo.setForeground(Color.BLACK);
		txtsexo.setBackground(Color.WHITE);
		
		txtfechanacimiento = new JTextArea("");
		txtfechanacimiento.setForeground(Color.BLACK);
		txtfechanacimiento.setBackground(Color.WHITE);
		
		txtfechaExpedicion = new JTextArea("");
		txtfechaExpedicion.setForeground(Color.BLACK);
		txtfechaExpedicion.setBackground(Color.WHITE);
		
		txtlugarNacimiento = new JTextArea("");
		txtlugarNacimiento.setForeground(Color.BLACK);
		txtlugarNacimiento.setBackground(Color.WHITE);
		
		txtlugarexpedicion = new JTextArea("");
		txtlugarexpedicion.setForeground(Color.BLACK);
		txtlugarexpedicion.setBackground(Color.WHITE);
		
		txtpuestodevotacion = new JTextArea("");
		txtpuestodevotacion.setForeground(Color.BLACK);
		txtpuestodevotacion.setBackground(Color.WHITE);
		
	
	
		add(txtnombre1);
		add(txtnombre2);
		add(txtapellido1);
		add(txtapellido2);
		add(txtcedula);
		add(txtsexo);
		add(txtfechanacimiento);
		add(txtfechaExpedicion);
		add(txtlugarNacimiento);
		add(txtlugarexpedicion);
		add(txtpuestodevotacion);
		
		IniciarComponentes();
		
	

	}

	public void IniciarComponentes() {

		
		volver = new JButton("Regresar");
		volver.setBackground(Color.ORANGE);
		volver.setSize(50,90);
		volver.setLocation(761,500);
		add(volver);
	
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JTextArea getTxtnombre1() {
		return txtnombre1;
	}

	public void setTxtnombre1(JTextArea txtnombre1) {
		this.txtnombre1 = txtnombre1;
	}

	public JTextArea getTxtapellido1() {
		return txtapellido1;
	}

	public void setTxtapellido1(JTextArea txtapellido1) {
		this.txtapellido1 = txtapellido1;
	}

	public JTextArea getTxtnombre2() {
		return txtnombre2;
	}

	public void setTxtnombre2(JTextArea txtnombre2) {
		this.txtnombre2 = txtnombre2;
	}

	public JTextArea getTxtapellido2() {
		return txtapellido2;
	}

	public void setTxtapellido2(JTextArea txtapellido2) {
		this.txtapellido2 = txtapellido2;
	}

	public JTextArea getTxtlugarexpedicion() {
		return txtlugarexpedicion;
	}

	public void setTxtlugarexpedicion(JTextArea txtlugarexpedicion) {
		this.txtlugarexpedicion = txtlugarexpedicion;
	}

	public JTextArea getTxtcedula() {
		return txtcedula;
	}

	public void setTxtcedula(JTextArea txtcedula) {
		this.txtcedula = txtcedula;
	}

	public JTextArea getTxtnacimiento() {
		return txtnacimiento;
	}

	public void setTxtnacimiento(JTextArea txtnacimiento) {
		this.txtnacimiento = txtnacimiento;
	}

	public JTextArea getTxtpuestodevotacion() {
		return txtpuestodevotacion;
	}

	public void setTxtpuestodevotacion(JTextArea txtpuestodevotacion) {
		this.txtpuestodevotacion = txtpuestodevotacion;
	}

	public JTextArea getTxtfechanacimiento() {
		return txtfechanacimiento;
	}

	public void setTxtfechanacimiento(JTextArea txtfechanacimiento) {
		this.txtfechanacimiento = txtfechanacimiento;
	}

	public JTextArea getTxtfechaExpedicion() {
		return txtfechaExpedicion;
	}

	public void setTxtfechaExpedicion(JTextArea txtfechaExpedicion) {
		this.txtfechaExpedicion = txtfechaExpedicion;
	}

	public JTextArea getTxtsexo() {
		return txtsexo;
	}

	public void setTxtsexo(JTextArea txtsexo) {
		this.txtsexo = txtsexo;
	}

	public JTextArea getTxtlugarNacimiento() {
		return txtlugarNacimiento;
	}

	public void setTxtlugarNacimiento(JTextArea txtlugarNacimiento) {
		this.txtlugarNacimiento = txtlugarNacimiento;
	}
	

	
	
}