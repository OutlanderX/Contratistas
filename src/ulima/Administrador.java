package ulima;

public class Administrador implements GestorUsuario{

	private String Nombre;
	private String Correo;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
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
