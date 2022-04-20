	public class Cancion{
	private String nombre;
	private int duracion_en_segundos;

		public String getNombre() {
			return nombre;
		}

		public int getDuracion_en_segundos() {
			return duracion_en_segundos;
		}

		public Cancion(){
            this.nombre = "Sweet home alabama";
            this.duracion_en_segundos = 160;

        }

	  public Cancion(String nombre, int duracion){
            this.nombre = nombre;
            this.duracion_en_segundos = duracion;

        }
	Public boolean es_Larga () {
	
	return this.duracion_en_segundos >= 240;
	
	
	}
	
	
	
	}

