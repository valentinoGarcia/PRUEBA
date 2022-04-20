import java.util.ArrayList;Public class Cantante extends Persona{
	private String NombreArtistico;
	private ArrayList<Cancion> Canciones = new ArrayList<>();

	public String getNombreArtistico() {
		return NombreArtistico;
	}

	public Arraylist<Cancion> getCanciones() {
		return Canciones;
	}

	public Arraylist<String> obtener_Canciones_mas_largas () {
	private Arraylist<String> nombres = new Arraylist <>();


		for( Cancion x :this.Canciones)
		{
			if (x.es_Larga() ) {
				returnear.add (x.getNombre() );
			}
			
		}
			return returnear;
			
}

	public void Agregar_Cancion (String nombre, int duracion) {

        	Cancion ingresar = new Cancion(nombre,duracion) ;
        	

        	this.Canciones.add(ingresar);

        	
        

	
	}


}

