
public class Parada {
	//Atributos
	private int id;
	private String nombre;
	private boolean tieneTorno;
	
	//Constructores
	
	public Parada(int id,String nombre, boolean tieneTorno) {
		
		this.id=id;
		this.nombre=nombre;
		this.tieneTorno=tieneTorno;
	}
	
	//Métodos
	//Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isTieneTorno() {
		return tieneTorno;
	}

	public void setTieneTorno(boolean tieneTorno) {
		this.tieneTorno = tieneTorno;
	}

	
	//toString
	@Override
	public String toString() {
		return "Parada [id=" + id + ", nombre=" + nombre + ", tieneTorno=" + tieneTorno + "]";
	}
	
}
