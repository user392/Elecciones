package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Date;
import com.toedter.calendar.JDateChooser;



public class PnlAddPer extends JPanel
{
	public JLabel pnombre, snombre, papellido, sapellido, expedicion, cedula, nacimiento, genero, año, fexpedicion;
	
	public JTextField ipnombre, ipapellido, isnombre, isapellido, iexpedicion, icedula, inacimiento, iaño;
	
	public JComboBox sexo, dia, mes;
	public JDateChooser calendario , calendarioExpedicion;
	public JButton volver , Registrar;

	
	public PnlAddPer()
	{
		setLayout(null);
		setBackground(Color.WHITE);
		
		IniciarComponentes();
		
		setVisible(false);
	}
	
	public void IniciarComponentes()
	{
		
		
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
		nacimiento.setLocation(50, 300);;
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
		
		String []pass = {"Seleccione","Masculino","Femenino"};
		sexo = new JComboBox<Object>(pass);
		sexo.setSize(150, 30);
		sexo.setLocation(690, 50);
		add(sexo);
		
		
		calendario = new JDateChooser("dd-MM-yyyy", "####-##-##", '_');
		calendario.setBounds(690,100,150,30);
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
		calendarioExpedicion.setBounds(690,190,150,30);
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
	
	
	
	

}
