Public class SistemaCantantes{
	Arraylist<Cantante> lista = new Arraylist <>();

	public Arraylist<Cantante> cantantesJovenes(){
	Arraylist<Cantante> returnear = new Arraylist<>();
	
	for (Cantante x: this.cantantesJovenes){
		if (x.es_un_adulto_joven) {
			returnear.add(x);
		}
		
		
	
	} 
	return  returnear;
	
	
	
	}
	public void agregar_cancion(String nombre_artistico, String nombre_cancion,int duracion){
	
	
	
	}
	
	
}
