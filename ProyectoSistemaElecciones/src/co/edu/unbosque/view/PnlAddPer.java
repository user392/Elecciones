package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Date;
import com.toedter.calendar.JDateChooser;

public class PnlAddPer extends JPanel {
	
	private JLabel pnombre, snombre, papellido, sapellido, expedicion, cedula, nacimiento, genero, año, fexpedicion;
	private JTextField ipnombre, ipapellido, isnombre, isapellido, iexpedicion, icedula, inacimiento, iaño;
	private JComboBox sexo, dia, mes;
	private JDateChooser calendario, calendarioExpedicion;
	private JButton volver, Registrar;

	public PnlAddPer() {
		setLayout(null);
		setBackground(Color.WHITE);

		IniciarComponentes();

		setVisible(false);
	}

	public void IniciarComponentes() {

		pnombre = new JLabel("Primer Nombre: ");
		pnombre.setSize(150, 30);
		pnombre.setLocation(50, 50);
		add(pnombre);

		ipnombre = new JTextField();
		ipnombre.setSize(150, 30);
		ipnombre.setLocation(200, 50);
		add(ipnombre);

		snombre = new JLabel("Segundo Nombre: ");
		snombre.setSize(150, 30);
		snombre.setLocation(50, 100);
		add(snombre);

		isnombre = new JTextField();
		isnombre.setSize(150, 30);
		isnombre.setLocation(200, 100);
		add(isnombre);

		papellido = new JLabel("Primer Apellido: ");
		papellido.setSize(150, 30);
		papellido.setLocation(50, 150);
		add(papellido);

		ipapellido = new JTextField();
		ipapellido.setSize(150, 30);
		ipapellido.setLocation(200, 150);
		add(ipapellido);

		sapellido = new JLabel("Segundo Apellido: ");
		sapellido.setSize(150, 30);
		sapellido.setLocation(50, 200);
		add(sapellido);

		isapellido = new JTextField();
		isapellido.setSize(150, 30);
		isapellido.setLocation(200, 200);
		add(isapellido);

		cedula = new JLabel("No. de Cedula: ");
		cedula.setSize(150, 30);
		cedula.setLocation(50, 250);
		add(cedula);

		icedula = new JTextField();
		icedula.setSize(150, 30);
		icedula.setLocation(200, 250);
		add(icedula);

		nacimiento = new JLabel("Lugar de Nacimiento: ");
		nacimiento.setSize(150, 30);
		nacimiento.setLocation(50, 300);
		;
		add(nacimiento);

		inacimiento = new JTextField();
		inacimiento.setSize(150, 30);
		inacimiento.setLocation(200, 300);
		add(inacimiento);

		expedicion = new JLabel("Lugar de Expedicion: ");
		expedicion.setSize(150, 30);
		expedicion.setLocation(50, 350);
		add(expedicion);

		iexpedicion = new JTextField();
		iexpedicion.setSize(150, 30);
		iexpedicion.setLocation(200, 350);
		add(iexpedicion);

		genero = new JLabel("Genero: ");
		genero.setSize(150, 30);
		genero.setLocation(600, 50);
		add(genero);

		String[] pass = { "Seleccione", "Masculino", "Femenino" };
		sexo = new JComboBox<Object>(pass);
		sexo.setSize(150, 30);
		sexo.setLocation(690, 50);
		add(sexo);

		calendario = new JDateChooser("dd-MM-yyyy", "####-##-##", '_');
		calendario.setBounds(690, 100, 150, 30);
		calendario.setOpaque(true);
		calendario.setBackground(Color.WHITE);
		calendario.setMaxSelectableDate(new Date());
		calendario.setDateFormatString("dd-MM-yyyy");
		add(calendario);

		año = new JLabel("Año: ");
		año.setSize(150, 30);
		año.setLocation(600, 100);
		add(año);

		fexpedicion = new JLabel("Fecha de Expedición : ");
		fexpedicion.setSize(150, 30);
		fexpedicion.setLocation(600, 150);
		add(fexpedicion);

		calendarioExpedicion = new JDateChooser("dd-MM-yyyy", "####-##-##", '_');
		calendarioExpedicion.setBounds(690, 190, 150, 30);
		calendarioExpedicion.setOpaque(true);
		calendarioExpedicion.setBackground(Color.WHITE);
		calendarioExpedicion.setMaxSelectableDate(new Date());
		calendarioExpedicion.setDateFormatString("dd-MM-yyyy");
		add(calendarioExpedicion);

		Registrar = new JButton("Registrar");
		Registrar.setBackground(Color.ORANGE);
		Registrar.setSize(150, 30);
		Registrar.setLocation(630, 250);
		add(Registrar);

		volver = new JButton("Regresar");
		volver.setBackground(Color.ORANGE);
		volver.setSize(120, 30);
		volver.setLocation(761, 468);
		add(volver);
	}

	public JLabel getPnombre() {
		return pnombre;
	}

	public void setPnombre(JLabel pnombre) {
		this.pnombre = pnombre;
	}

	public JLabel getSnombre() {
		return snombre;
	}

	public void setSnombre(JLabel snombre) {
		this.snombre = snombre;
	}

	public JLabel getPapellido() {
		return papellido;
	}

	public void setPapellido(JLabel papellido) {
		this.papellido = papellido;
	}

	public JLabel getSapellido() {
		return sapellido;
	}

	public void setSapellido(JLabel sapellido) {
		this.sapellido = sapellido;
	}

	public JLabel getExpedicion() {
		return expedicion;
	}

	public void setExpedicion(JLabel expedicion) {
		this.expedicion = expedicion;
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(JLabel nacimiento) {
		this.nacimiento = nacimiento;
	}

	public JLabel getGenero() {
		return genero;
	}

	public void setGenero(JLabel genero) {
		this.genero = genero;
	}

	public JLabel getAño() {
		return año;
	}

	public void setAño(JLabel año) {
		this.año = año;
	}

	public JLabel getFexpedicion() {
		return fexpedicion;
	}

	public void setFexpedicion(JLabel fexpedicion) {
		this.fexpedicion = fexpedicion;
	}

	public JTextField getIpnombre() {
		return ipnombre;
	}

	public void setIpnombre(JTextField ipnombre) {
		this.ipnombre = ipnombre;
	}

	public JTextField getIpapellido() {
		return ipapellido;
	}

	public void setIpapellido(JTextField ipapellido) {
		this.ipapellido = ipapellido;
	}

	public JTextField getIsnombre() {
		return isnombre;
	}

	public void setIsnombre(JTextField isnombre) {
		this.isnombre = isnombre;
	}

	public JTextField getIsapellido() {
		return isapellido;
	}

	public void setIsapellido(JTextField isapellido) {
		this.isapellido = isapellido;
	}

	public JTextField getIexpedicion() {
		return iexpedicion;
	}

	public void setIexpedicion(JTextField iexpedicion) {
		this.iexpedicion = iexpedicion;
	}

	public JTextField getIcedula() {
		return icedula;
	}

	public void setIcedula(JTextField icedula) {
		this.icedula = icedula;
	}

	public JTextField getInacimiento() {
		return inacimiento;
	}

	public void setInacimiento(JTextField inacimiento) {
		this.inacimiento = inacimiento;
	}

	public JTextField getIaño() {
		return iaño;
	}

	public void setIaño(JTextField iaño) {
		this.iaño = iaño;
	}

	public JComboBox getSexo() {
		return sexo;
	}

	public void setSexo(JComboBox sexo) {
		this.sexo = sexo;
	}

	public JComboBox getDia() {
		return dia;
	}

	public void setDia(JComboBox dia) {
		this.dia = dia;
	}

	public JComboBox getMes() {
		return mes;
	}

	public void setMes(JComboBox mes) {
		this.mes = mes;
	}

	public JDateChooser getCalendario() {
		return calendario;
	}

	public void setCalendario(JDateChooser calendario) {
		this.calendario = calendario;
	}

	public JDateChooser getCalendarioExpedicion() {
		return calendarioExpedicion;
	}

	public void setCalendarioExpedicion(JDateChooser calendarioExpedicion) {
		this.calendarioExpedicion = calendarioExpedicion;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JButton getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(JButton registrar) {
		Registrar = registrar;
	}

}
