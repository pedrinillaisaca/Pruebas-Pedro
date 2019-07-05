
public class Persona {
	private String nombre , apellido ;
	private int numCed, numTel;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumCed() {
		return numCed;
	}
	public void setNumCed(int numCed) {
		this.numCed = numCed;
	}
	public int getNumTel() {
		return numTel;
	}
	
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", numCed=" + numCed + ", numTel=" + numTel
				+ "]";
	}
}
