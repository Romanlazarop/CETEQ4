package Com;

public class Alumnos {
	String nombre;
	String direccion;
	int edad;
	char sexo;
	String fechaNac;
	public Alumnos()
	{
		
	}
	public Alumnos(String nombre, String direccion, int edad, char sexo, String fechaNac) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.sexo = sexo;
		this.fechaNac = fechaNac;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", sexo=" + sexo
				+ ", fechaNac=" + fechaNac + "]";
	}
	

}
