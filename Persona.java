abstract class Persona
{
	protected String nombre;
	protected String apellido;
	protected String rut;
	protected int edad;

	protected Persona(){}

	protected Persona( String n , String a , String r , int e )
	{
		this.nombre = n;
		this.apellido = a;
		this.rut = r;
		this.edad = e;
	}

	abstract protected void setNombre( String param );

	abstract protected void setApellido( String param );

	abstract protected void setRut( String param );

	abstract protected void setEdad( int param );

	abstract protected String getNombre();

	abstract protected String getApellido();

	abstract protected String getRut();

	abstract protected int getEdad();

	abstract protected void mostrar();

}
