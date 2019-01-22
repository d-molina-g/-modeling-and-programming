import java.io.*;
import java.util.*;

//Determinación de acceso como PÚBLICA para la clase.
public class main
{
	public static void main( String arg[] ) throws IOException
	{

			ArrayList <Alumno> lista_alumno = new ArrayList<Alumno>();
			cargar_alumnos( lista_alumno , "alumnos.dat");
			System.out.println("----------------------------------------------");
			System.out.println("Tamaño de arraylist: "+lista_alumno.size() );
			System.out.println("----------------------------------------------");
			System.out.println("Mostrando la listad de alumnos...");
			System.out.println("----------------------------------------------");
			mostrar_lista( lista_alumno );
			System.out.println("----------------------------------------------");


			ArrayList <Profesor> lista_profesor = new ArrayList<Profesor>();
			cargar_profesores( lista_profesor , "profesores.dat");
			System.out.println("----------------------------------------------");
			System.out.println("Tamaño de arraylist: "+lista_profesor.size() );
			System.out.println("----------------------------------------------");
			System.out.println("Mostrando la listad de profesores...");
			System.out.println("----------------------------------------------");
			mostrar_lista_profesor( lista_profesor );
			System.out.println("----------------------------------------------");

	}

	static void cargar_alumnos( ArrayList < Alumno > array_list , String archivo ) throws IOException
	{
		BufferedReader br = new BufferedReader( new FileReader( archivo ) );
		String linea ;
		int i = 0;
		String [] array = new String[5];
		while( (linea = br.readLine())!= null )
		{
			//Creo un objeto tipo alumno:
			Alumno alumno = new Alumno();
			StringTokenizer token = new StringTokenizer( linea , "\t");
			//Divido la linea en tokens, hasta que se termine la linea
			while( token.hasMoreTokens() )
			{
				array[i] = (String)token.nextToken();
				i++;
			}
			//Restauro para la próxima entrada
			i = 0;
			//doy los valores al objeto creado
			alumno.setRut( array[0] );
			alumno.setNombre( array[1] );
			alumno.setApellido( array[2] );
			alumno.setCarrera( array[3] );
			alumno.setEdad( Integer.parseInt( array[4] ) );
			//inserto el objeto a mi arraylist
			array_list.add( alumno );
		}
	}


	//ESTE METODO UTILIZA UN OBJETO AUXILIAR PARA HACER LLAMADAS A UN METODO DE LA CLASE ALUMNO
	//EN ESTRICTO RIGOR, MOSTRAR DEBIESE SER UN METODO STATIC
	static void mostrar_lista( ArrayList < Alumno > array_list )
	{
		Alumno a = new Alumno();
		for( int i = 0 ; i < array_list.size() ; i++ )
		{
			a = array_list.get(i);
			a.mostrar();
		}
	}

	static void cargar_profesores( ArrayList < Profesor > array_list , String archivo ) throws IOException
	{
		BufferedReader br = new BufferedReader( new FileReader( archivo ) );
		String linea ;
		int i = 0;
		String [] array = new String[5];
		while( (linea = br.readLine())!= null )
		{
			//Creo un objeto tipo alumno:
			Profesor profesor = new Profesor();
			StringTokenizer token = new StringTokenizer( linea , "\t");
			//Divido la linea en tokens, hasta que se termine la linea
			while( token.hasMoreTokens() )
			{
				array[i] = (String)token.nextToken();
				i++;
			}
			//Restauro para la procima entrada
			i = 0;
			//doy los valores al objeto creado
			profesor.setRut( array[0] );
			profesor.setNombre( array[1] );
			profesor.setApellido( array[2] );
			profesor.setProfesion( array[3] );
			profesor.setEdad( Integer.parseInt( array[4] ) );
			//inserto el objeto a mi arraylist
			array_list.add( profesor );
		}
	}


	static void mostrar_profesor( Profesor p )
	{
		System.out.println("Nombre = "+p.getNombre() );
		System.out.println("Apellido = "+p.getApellido() );
		System.out.println("Rut = "+p.getRut() );
		System.out.println("Profesion = "+p.getProfesion() );
		System.out.println("Edad = "+p.getEdad() );
		System.out.println();
	}


	//ESTO ES UNA LLAMADA SEMÁNTICAMENTE CORRECTA
	static void mostrar_lista_profesor( ArrayList < Profesor > array_list )
	{
		Profesor p = new Profesor();
		for( int i = 0 ; i < array_list.size() ; i++ )
		{
			p = array_list.get(i);
			mostrar_profesor( p );
		}
	}

}