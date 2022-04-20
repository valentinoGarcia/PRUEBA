import java.util.ArrayList;

public class  	SistemaCantantes{
	ArrayList<Cantante> lista = new ArrayList<>();

	public Arraylist<String> cantantesJovenes(){
	Arraylist<String> returnear = new Arraylist<>();
	
	for (Cantante x: this.cantantesJovenes){
		if (x.es_un_adulto_joven) {
			returnear.add(x.getNombre);
		}
		
		
	
	} 
	return  returnear;
	
	
	
	}
	public void agregar_cancion(String nombre_artistico, String nombre_cancion,int duracion) {
		for (Cantante x : this.lista) {
			if (x.getNombreArtistico() = nombre_artistico) {
				x.Agregar_Cancion(nombre_cancion,duracion);
			}

		}
	}
	
}
