package co.edu.unbosque.model.Persistencia;

public class Persistencia {

	 private ArchivoBinario ab; 
	 
	 public Persistencia () {
		 ab = new ArchivoBinario();
	 }

	public ArchivoBinario getAb() {
		return ab;
	}

	public void setAb(ArchivoBinario ab) {
		this.ab = ab;
	}
	 
	
	
}
