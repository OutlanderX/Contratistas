package ulima;

public class Usuario implements GestorUsuario {
	private String Nombre;
	private int Telefono;
	private String Clave;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	@Override
	public void nuevo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validar() {
		// TODO Auto-generated method stub
		
	}

}
