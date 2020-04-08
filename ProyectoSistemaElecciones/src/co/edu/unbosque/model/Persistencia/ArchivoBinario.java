package co.edu.unbosque.model.Persistencia;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.Persona;

public class ArchivoBinario {
	 
	private String ruta = "Datos/InformacionRegistraduria.dat";
	private String rutaReg = "Datos/InformacionRegistraduria.dat";
     
	private int REGISTROS = 100;
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;

	private double numeros[];
	private int valores[];
	private Persona per;
	private Persona[] datos;
	private Controller co;
	

	public int getREGISTROS() {
		return REGISTROS;
	}

	public void setREGISTROS(int rEGISTROS) {
		REGISTROS = rEGISTROS;
	}

	
	public int[] getValores() {
		return valores;
	}

	public void setValores(int[] valores) {
		this.valores = valores;
	}

	public ArchivoBinario() {
		numeros = new double[100];
		valores = new int[100];
		datos = new Persona[100];
		
	}

	public String escribirArchivoBinario() {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File(ruta);
		Random r=new Random(); 
		double d=18.76353; 
		try{     
			fos=new FileOutputStream(f);     
			dos=new DataOutputStream(fos);     
			for (int i=0;i<REGISTROS;i++){ 
				dos.writeInt(i);
				dos.writeDouble(r.nextDouble());//Nº aleatorio     
			}     
			dos.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public void leerArchivoBinario() {
		f = new File(ruta);
		try {
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			for (int i=0; i<REGISTROS ; i++){
			//System.out.println(dis.readDouble());
			numeros[i] = dis.readDouble();
			valores[i] = dis.readInt();
			}
			dis.close();
		}
		catch(IOException e){     
			e.printStackTrace(); 
		} 
	}

	public String escribirRegistro(String mnombre1, String mnombre2, String mapellido1,String mapellido2,int mcedula,String msexo
			,String mlugarNacimiento,String mlugarExpedicionCedula, String FechaNacimiento,String FechaExpedicion,String mpuestovotacion) {
    String mensaje = "Registro de Amigos Ingresado!";
	Persona []staff = new Persona[1];
	staff[0] = new Persona(mnombre1,mnombre2,mapellido1,mapellido2,mcedula,msexo,mlugarNacimiento,mlugarExpedicionCedula
			,FechaNacimiento,FechaExpedicion,mpuestovotacion);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		
	}
		return mensaje;
	
	}
	

	public void leerRegistro() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaReg));
	        datos = (Persona[])in.readObject();
	        in.close();
	        for (int i = 0; i < datos.length; i++) {
	        	System.out.println("EL ARCHIVO BINARIO CONTIENE LOS SIGUIENTES DATOS DE: ");
	            System.out.println(datos[i].getPrimerNombre());
	            System.out.println(datos[i].getSegundoNombre());
	            System.out.println(datos[i].getPrimerApellido());
	            System.out.println(datos[i].getSegundoApellido());
	            System.out.println(datos[i].getCedula());
	            System.out.println(datos[i].getSexo());
	            System.out.println(datos[i].getFechaDeNacimiento());
	            System.out.println(datos[i].getFechaExpedicionCedula());
	            System.out.println(datos[i].getLugarDeNacimiento());
	            System.out.println(datos[i].getLugarExpedicionCedula());
	            System.out.println(datos[i].getPuestodevotacion());
	           
	        }
	       
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	
	
	public Persona[] getDatos() {
		return datos;
	}

	public void setDatos(Persona[] datos) {
		this.datos = datos;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}




	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getRutaReg() {
		return rutaReg;
	}

	public void setRutaReg(String rutaReg) {
		this.rutaReg = rutaReg;
	}

	

	public FileOutputStream getFos() {
		return fos;
	}

	public void setFos(FileOutputStream fos) {
		this.fos = fos;
	}

	public DataOutputStream getDos() {
		return dos;
	}

	public void setDos(DataOutputStream dos) {
		this.dos = dos;
	}

	public FileInputStream getFis() {
		return fis;
	}

	public void setFis(FileInputStream fis) {
		this.fis = fis;
	}

	public DataInputStream getDis() {
		return dis;
	}

	public void setDis(DataInputStream dis) {
		this.dis = dis;
	}

	
	
}
