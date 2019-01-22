import java.util.*; //ArrayList , StringTokenizer
import java.io.*; //bufferedReader

class Alumno extends Persona
{
	private String carrera;
	//Constructor por defecto:

	public Alumno()
	{
		super();
	}

	public Alumno( String _nombre , String _apellido , String _rut , int _edad )
	{
		//Constructor de clase padre:
		super( _nombre , _apellido  , _rut , _edad );
	}


	//Constructor
	public Alumno( 	String _carrera , String _nombre , String _apellido , String _rut , int _edad )
	{
		//Constructor de clase padre:
		super( _nombre , _apellido  , _rut , _edad );
		this.carrera = _carrera;
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

	public int getEdad( )
	{
		return this.edad;
	}

	//Atributo de la clase

	public void setCarrera( String param )
	{
		this.carrera = param;
	}

	public String getCarrera()
	{
		return this.carrera;
	}

	public void mostrar( )
	{
		System.out.println("Nombre = "+this.getNombre() );
		System.out.println("Apellido = "+this.getApellido() );
		System.out.println("Rut = "+this.getRut() );
		System.out.println("Carrera = "+this.getCarrera() );
		System.out.println("Edad = "+this.getEdad() );
		System.out.println();
	}

}