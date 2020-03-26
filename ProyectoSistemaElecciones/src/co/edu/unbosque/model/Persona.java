package co.edu.unbosque.model;

public class Persona implements PuestoDeVotacion {

	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private int cedula;
	private String sexo;
	private String fechaDeNacimiento;
	private String fechaExpedicionCedula;
	private String lugarDeNacimiento;
	private String lugarExpedicionCedula;
	private String puestodevotacion;

	public Persona() {
	}
	
	public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			int cedula, String sexo, String fechaDeNacimiento, String fechaExpedicionCedula, String lugarDeNacimiento,
			String lugarExpedicionCedula, String puestodevotacion) {
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.cedula = cedula;
		this.sexo = sexo;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaExpedicionCedula = fechaExpedicionCedula;
		this.lugarDeNacimiento = lugarDeNacimiento;
		this.lugarExpedicionCedula = lugarExpedicionCedula;
		this.puestodevotacion = puestodevotacion;
	



	}
	


	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getFechaExpedicionCedula() {
		return fechaExpedicionCedula;
	}

	public void setFechaExpedicionCedula(String fechaExpedicionCedula) {
		this.fechaExpedicionCedula = fechaExpedicionCedula;
	}

	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public String getLugarExpedicionCedula() {
		return lugarExpedicionCedula;
	}

	public void setLugarExpedicionCedula(String lugarExpedicionCedula) {
		this.lugarExpedicionCedula = lugarExpedicionCedula;
	}

	public String getPuestodevotacion() {
		return puestodevotacion;
	}

	public void setPuestodevotacion(String puestodevotacion) {
		this.puestodevotacion = puestodevotacion;
	}

	@Override
	public String pais() {
		String pais = "";
		return pais;
	}

	@Override
	public String departamento() {
		String departamento = "";
		return departamento;
	}

	@Override
	public String municipio() {
		String municipio = "";
		return municipio;
	}

	@Override
	public String lugarVotacion() {
		String lugarVotacion = "";
		return lugarVotacion;
	}

	@Override
	public String direccion() {
		String direccion = "";
		return direccion;
	}

	@Override
	public String Consulado() {
		String consulado = "";
		return consulado;
	}

}
