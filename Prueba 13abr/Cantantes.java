Public class Cantante extends Persona{
	private String NombreArtistico;
	Arraylist<Cancion> Canciones = new Arraylist<>();
	public Arraylist<Cancion> obtener_Canciones_mas_largas () {
	Arraylist<Cancion> returnear = new Arraylist <>();
		for( Cancion x :this.Canciones)
		{
			if (x.es_Larga) {
				returnear.add (x);
			}
			
		}
			return returnear;
			
}

	public void Agregar_Cancion () {
		System.out.println("ingrese el nombre");
        	Scanner ingreso1 = new Scanner(System.in);
        	int nombre = ingreso1.nextLine();
        	System.out.println("Ahora, ingrese la duracion");
        	Scanner ingreso2 = new Scanner(System.in);
        	Cancion ingresar = new Cancion(nombre,duracion) ;
        	
        	int duracion = ingreso2.nextInt();       
        	this.Canciones.add( ingresar)

        	
        

	
	}


}
