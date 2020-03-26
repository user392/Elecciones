package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import co.edu.unbosque.model.FechaNacimientoExecpcion;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.VtnPrincipal;

public class Controller implements ActionListener {

	private List<String> arregloDepartamento = new ArrayList<String>();
	private List<String> arregloCiudad = new ArrayList<String>();
	private List<String> arregloPuesto = new ArrayList<String>();
	private List<String> arregloDireccion = new ArrayList<String>();
	private ArrayList<Persona> objRegistrop = new ArrayList();
	private static final String SAMPLE_CSV_FILE_PATH = "Puestos_de_votacion.csv";

	private Persona persona;
	private VtnPrincipal vtnPrincipal;
	
	public Controller() {

		vtnPrincipal = new VtnPrincipal();
		Persona persona = new Persona();

		try (

				Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH), StandardCharsets.ISO_8859_1);
				CSVParser parser = CSVFormat.DEFAULT.withDelimiter(';').withHeader().parse(reader);

		) {
			for (CSVRecord csvRecord : parser) {

				String Departamento = csvRecord.get(0) + "";
				String Ciudad = csvRecord.get(1) + "";
				String Puesto = csvRecord.get(2) + "";
				String Direccion = csvRecord.get(3) + "";

				arregloDepartamento.add(Departamento);
				arregloCiudad.add(Ciudad);
				arregloPuesto.add(Puesto);
				arregloDireccion.add(Direccion);
				
				 System.out.println(Departamento+"\t"+Ciudad+"\t"+Puesto+"\t"+Direccion);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////

		vtnPrincipal.getPnlInicio().getRegistrarCiu().addActionListener(this);
		vtnPrincipal.getPnlInicio().getBuscarCiu().addActionListener(this);
		vtnPrincipal.getPnlInicio().getGraficas().addActionListener(this);
		vtnPrincipal.getPnlInicio().getRegistrarCiu().addActionListener(this);
		vtnPrincipal.getPnlInicio().getListaInscritos().addActionListener(this);

		vtnPrincipal.getPnlAddPer().getVolver().addActionListener(this);
		vtnPrincipal.getPnlAddPer().getRegistrar().addActionListener(this);

		vtnPrincipal.getPnlBuscarPer().getVolver().addActionListener(this);

		vtnPrincipal.getPnlGraficas().getHomMuj().addActionListener(this);
		vtnPrincipal.getPnlGraficas().getInscritos().addActionListener(this);
		vtnPrincipal.getPnlGraficas().getInsCol().addActionListener(this);
		vtnPrincipal.getPnlGraficas().getInsDep().addActionListener(this);
		vtnPrincipal.getPnlGraficas().getInsMun().addActionListener(this);
		vtnPrincipal.getPnlGraficas().getInsPuesto().addActionListener(this);
		vtnPrincipal.getPnlGraficas().getVolver().addActionListener(this);

		vtnPrincipal.getPnlGrfCol().getAtras().addActionListener(this);
		vtnPrincipal.getPnlGrfDep().getAtras().addActionListener(this);
		vtnPrincipal.getPnlGrfHommuj().getAtras().addActionListener(this);
		vtnPrincipal.getPnlGrfInscritos().getAtras().addActionListener(this);
		vtnPrincipal.getPnlGrfMun().getAtras().addActionListener(this);
		vtnPrincipal.getPnlGrfPuesto().getAtras().addActionListener(this);

		vtnPrincipal.getPnlListaInscritos().getVolver().addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Registrar Ciudadano")) {
			vtnPrincipal.getPnlAddPer().setVisible(true);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);
		}

		if (e.getActionCommand().equals("Buscar Ciudadano")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(true);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}

		if (e.getActionCommand().equals("Graficas")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(true);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}

		if (e.getActionCommand().equals("Lista de Inscritos")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(true);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);
		}

		if (e.getActionCommand().equals("Hombres-Mujeres")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(true);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}

		if (e.getActionCommand().equals("Inscritos")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(true);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(true);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}

		if (e.getActionCommand().equals("Inscritos-Colombia")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(true);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(true);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}

		if (e.getActionCommand().equals("Inscritos-Departamento")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(true);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}
		if (e.getActionCommand().equals("Inscritos-Municipio")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(true);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}
		if (e.getActionCommand().equals("Inscritos-Puesto")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(true);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}

		if (e.getActionCommand().equals("Regresar")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(false);
			vtnPrincipal.getPnlInicio().setVisible(true);
			vtnPrincipal.getPnlGrfHommuj().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}

		if (e.getActionCommand().equals("Atras")) {
			vtnPrincipal.getPnlAddPer().setVisible(false);
			vtnPrincipal.getPnlBuscarPer().setVisible(false);
			vtnPrincipal.getPnlGraficas().setVisible(true);
			vtnPrincipal.getPnlInicio().setVisible(false);
			vtnPrincipal.getPnlGrfHommuj().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlListaInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfInscritos().setVisible(false);
			vtnPrincipal.getPnlGrfCol().setVisible(false);
			vtnPrincipal.getPnlGrfDep().setVisible(false);
			vtnPrincipal.getPnlGrfMun().setVisible(false);
			vtnPrincipal.getPnlGrfPuesto().setVisible(false);

		}
		if (e.getActionCommand().equals("Registrar")) {
			DateFormat famt = new SimpleDateFormat("dd/MM/yyyy");
			String mnombre1 = vtnPrincipal.getPnlAddPer().getIpnombre().getText();
			String mnombre2 = vtnPrincipal.getPnlAddPer().getIsnombre().getText();
			String mapellido1 = vtnPrincipal.getPnlAddPer().getIpapellido().getText();
			String mapellido2 = vtnPrincipal.getPnlAddPer().getIsapellido().getText();
			int mcedula= Integer.parseInt(vtnPrincipal.getPnlAddPer().getIcedula().getText());
			String msexo= (String) vtnPrincipal.getPnlAddPer().getSexo().getSelectedItem();
			String mlugarNacimiento= vtnPrincipal.getPnlAddPer().getInacimiento().getText();
			String mlugarExpedicionCedula=vtnPrincipal.getPnlAddPer().getIexpedicion().getText();
		    String FechaNacimiento = famt.format(this.vtnPrincipal.getPnlAddPer().getCalendario().getDate());
		    String FechaExpedicion = famt.format(this.vtnPrincipal.getPnlAddPer().getCalendarioExpedicion().getDate());
		    String mpuestovotacion= vtnPrincipal.getPnlAddPer().getIpuestodevotacion().getText();
			int i = 0;
		    int sizeArregloUsuarios = arregloPuesto.size();
		     int error=0;
			/////////////////////////////////////////////////////////////////////////////////
		     /** 
		      * Validación de que el puesto de Votacion sea Valido 
		      */
		    while(i<=sizeArregloUsuarios-1) {
				if(arregloPuesto.get(i).equals(mpuestovotacion) ) {
					JOptionPane.showMessageDialog(null, "Su puesto de Votacion es Valido"+"\t  ! REGISTRO VALIDO ! ", "Interfaz Registraduria", 1);
					vtnPrincipal.getPnlAddPer().setVisible(true);
					error=0;
					break;
				}else {
					error = 1;
				}
				i++;
		    }
				if(error == 1 ) {
				JOptionPane.showMessageDialog(null, "Puesto No Encontrado , Invalido , Verifique de nuevo.", "¡Error!", 2);
				}
			

		    objRegistrop.add(new Persona(mnombre1,mnombre2, mapellido1, mapellido2, mcedula,msexo, FechaNacimiento,
					FechaExpedicion,mlugarNacimiento,mlugarExpedicionCedula,mpuestovotacion));
			
			
			//Prueba de que se guardan en el arraylist de Persona
			for ( int a=0;a<objRegistrop.size();a++) {
				System.out.println(objRegistrop.get(a).getPrimerNombre());
				System.out.println(objRegistrop.get(a).getSegundoNombre());
				System.out.println(objRegistrop.get(a).getPrimerApellido());
				System.out.println(objRegistrop.get(a).getSegundoApellido());
				System.out.println(objRegistrop.get(a).getCedula());
				System.out.println(objRegistrop.get(a).getSexo());
				System.out.println(objRegistrop.get(a).getFechaDeNacimiento());
				System.out.println(objRegistrop.get(a).getFechaExpedicionCedula());
				System.out.println(objRegistrop.get(a).getLugarDeNacimiento());
				System.out.println(objRegistrop.get(a).getLugarExpedicionCedula());
				System.out.println(objRegistrop.get(a).getPuestodevotacion());
			}
		}

	
	}

	public void inscribir_Ciudadano() {

	}
	  public void comprobar_Cedula() {

	    }

	    public void buscar_Ciudadano() {

	    }

	    public void eliminar_Ciudadano() {

	    }

	    public void asignarPuestoVotacion() {

	    }

	    public void modificar_Ciudadano() {

	    }

	    public void calcularEstadisticasColombia_18_25() {

	    }

	    public void calcularEstadisticasColombia_26_29() {

	    }

	    public void calcularEstadisticasColombia_30_37() {

	    }

	    public void calcularEstadisticasColombia_38_49() {

	    }

	    public void calcularEstadisticasColombia_50_66() {

	    }

	    public void calcularEstadisticasColombia_67() {

	    }

	    public void calcularEstadisticasDepartamento_18_25() {

	    }

	    public void calcularEstadisticasDepartamento_26_29() {

	    }

	    public void calcularEstadisticasDepartamento_30_37() {

	    }

	    public void calcularEstadisticasDepartamento_38_49() {

	    }

	    public void calcularEstadisticasDepartamento_50_66() {

	    }

	    public void calcularEstadisticasDepartamento_67() {

	    }

	    public void calcularEstadisticasMunicipio_18_25() {

	    }

	    public void calcularEstadisticasMunicipio_26_29() {

	    }

	    public void calcularEstadisticasMunicipio_30_37() {

	    }

	    public void calcularEstadisticasMunicipio_38_49() {

	    }

	    public void calcularEstadisticasMunicipio_50_66() {

	    }

	    public void calcularEstadisticasMunicipio_67() {

	    }

	    public void calcularEstadisticasPuestoVotacion_18_25() {

	    }

	    public void calcularEstadisticasPuestoVotacion_26_29() {

	    }

	    public void calcularEstadisticasPuestoVotacion_30_37() {

	    }

	    public void calcularEstadisticasPuestoVotacion_38_49() {

	    }

	    public void calcularEstadisticasPuestoVotacion_50_66() {

	    }

	    public void calcularEstadisticasPuestoVotacion_67() {

	    }
  

}
