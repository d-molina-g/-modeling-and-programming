class Profesor extends Persona
{
	private String profesion;

	//Constructor

	public Profesor(){}

	public Profesor( String _nombre , String _apellido , String _rut , int _edad )
	{
		//Constructor de clase padre:
		super( _nombre , _apellido  , _rut , _edad );
	}


	//Constructor
	public Profesor( 	String _profesion , String _nombre , String _apellido , String _rut , int _edad  )
	{
		//Constructor de clase padre:
		super( _nombre , _apellido  , _rut , _edad );
		this.profesion = _profesion;
	}



	//Redefinicion de getters y setters

	public void setNombre( String param )
	{
		this.nombre = param;
	}

	public void setApellido( String param )
	{
		this.apellido = param;
	}

	public void setRut( String param )
	{
		this.rut = param;
	}

	public void setEdad( int param )
	{
		this.edad = param;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public String getApellido()
	{
		return this.apellido;
	}

	public String getRut()
	{
		return this.rut;
	}

	public void setProfesion( String param )
	{
		this.profesion = param;
	}

	public String getProfesion()
	{
		return this.profesion;
	}

	public int getEdad( )
	{
		return this.edad;
	}

	public void mostrar( )
	{
		System.out.println("Nombre = "+this.getNombre() );
		System.out.println("Apellido = "+this.getApellido() );
		System.out.println("Rut = "+this.getRut() );
		System.out.println("Profesion = "+this.getProfesion() );
		System.out.println("Edad = "+this.getEdad() );
		System.out.println();
	}


}