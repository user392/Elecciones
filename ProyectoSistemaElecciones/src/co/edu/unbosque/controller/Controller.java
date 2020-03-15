package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.VtnPrincipal;

public class Controller implements ActionListener {
	private List<String> arregloDepartamento = new ArrayList<String>();
	private List<String> arregloCiudad = new ArrayList<String>();
	private List<String> arregloPuesto = new ArrayList<String>();
	private List<String> arregloDireccion = new ArrayList<String>();
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
		vtnPrincipal.pnlInicio.registrarCiu.addActionListener(this);
		vtnPrincipal.pnlInicio.buscarCiu.addActionListener(this);
		vtnPrincipal.pnlInicio.graficas.addActionListener(this);
		vtnPrincipal.pnlInicio.listaInscritos.addActionListener(this);

		vtnPrincipal.pnlGraficas.homMuj.addActionListener(this);
		vtnPrincipal.pnlGraficas.inscritos.addActionListener(this);
		vtnPrincipal.pnlGraficas.insCol.addActionListener(this);
		vtnPrincipal.pnlGraficas.insDep.addActionListener(this);
		vtnPrincipal.pnlGraficas.insMun.addActionListener(this);
		vtnPrincipal.pnlGraficas.insPuesto.addActionListener(this);

		vtnPrincipal.pnlAddPer.volver.addActionListener(this);
		vtnPrincipal.pnlBuscarPer.volver.addActionListener(this);
		vtnPrincipal.pnlGraficas.volver.addActionListener(this);
		vtnPrincipal.pnlListaInscritos.volver.addActionListener(this);

		vtnPrincipal.pnlGrfHommuj.atras.addActionListener(this);
	}

	public void inscribir_Ciudadano() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Registrar Ciudadano")) {
			vtnPrincipal.pnlAddPer.setVisible(true);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}

		if (e.getActionCommand().equals("Buscar Ciudadano")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(true);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(false);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}

		if (e.getActionCommand().equals("Graficas")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(true);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(false);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}

		if (e.getActionCommand().equals("Lista de Inscritos")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(false);
			vtnPrincipal.pnlListaInscritos.setVisible(true);
		}

		if (e.getActionCommand().equals("Hombres-Mujeres")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(true);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}

		if (e.getActionCommand().equals("Inscritos")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(true);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}

		if (e.getActionCommand().equals("Inscritos-Colombia")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(true);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}

		if (e.getActionCommand().equals("Inscritos-Departamento")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(true);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}
		if (e.getActionCommand().equals("Inscritos-Municipio")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(true);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}
		if (e.getActionCommand().equals("Inscritos-Puesto")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(true);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}

		if (e.getActionCommand().equals("Regresar")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(false);
			vtnPrincipal.pnlInicio.setVisible(true);
			vtnPrincipal.pnlGrfHommuj.setVisible(false);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}

		if (e.getActionCommand().equals("Atras")) {
			vtnPrincipal.pnlAddPer.setVisible(false);
			vtnPrincipal.pnlBuscarPer.setVisible(false);
			vtnPrincipal.pnlGraficas.setVisible(true);
			vtnPrincipal.pnlInicio.setVisible(false);
			vtnPrincipal.pnlGrfHommuj.setVisible(false);
			vtnPrincipal.pnlListaInscritos.setVisible(false);

		}
		if (e.getActionCommand().equals("Registrar")) {
			System.out.println("Registro");
		}

	}

}
