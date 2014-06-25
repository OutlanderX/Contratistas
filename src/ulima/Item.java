package ulima;

public class Item implements GestorSistema {
	private String Nombre;
	private String Descripcion;
	private int codigo;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public void nuevo() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		
	}

}
