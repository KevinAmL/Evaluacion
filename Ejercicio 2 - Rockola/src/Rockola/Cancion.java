package Rockola;

import java.util.Vector;

public class Cancion {
	private Vector<Cancion> listaCanciones =  new Vector<Cancion>();
	private String titutlo, artista, album;
	private int anio;
	private float duracion;
	
	Cancion(String titulo, float duracion, String artista, String album, int anio){
		this.titutlo = titulo;
		this.duracion = duracion;
		this.artista = artista;
		this.album = album;
		this.anio = anio;
	}
	
	public Cancion() {
		// TODO Auto-generated constructor stub
	}

	public void setTitulo(String titulo) { this.titutlo = titulo; }
	public void setDuracion(float duracion) { this.duracion = duracion; }
	public void setArtista(String artista) { this.artista = artista; }	/////////Setters de canción
	public void setAlbum(String album) { this.album = album; }
	public void setAnio(int anio) { this.anio = anio; }
	
	public String getTitulo() { return this.titutlo; }
	public float getDuracion() { return this.duracion; }            ////////Getters de canción
	public String getArtista() { return this.artista; }
	public String getAlbum() { return this.album; }
	public int getAnio() { return this.anio; }
	
	public void agregarCancion(Cancion cancion) { //Metodo para agregar una canción a la rockola
		listaCanciones.add(cancion);
		System.out.println("Canción agregada");
	}
	public void eliminarCancion(int posicionCancion) {//Metodo para eliminar una canción de la rockola
		if(!listaCanciones.isEmpty()) {
			listaCanciones.remove(posicionCancion - 1);
			System.out.println("Canción elmininada");
		}
		else {
			System.out.println("No hay canciones en la rockola");
		}
		
	}
	
	public void mostrarCanciones() { //Muestra las canciones guardadas en la rockola
		System.out.println("-----------------------------------------------------------------------------------------");
		if(listaCanciones.isEmpty()) {
			System.out.println("No hay canciones en la rockola");
			return;
		}
		for(int i = 0; i<listaCanciones.size(); i++) {
			Cancion cancion =  listaCanciones.elementAt(i);
			System.out.println((i+1) + "\n" + "Titulo: " + cancion.titutlo + "\n" + "Duración: "+ cancion.duracion + " minutos\n" +  "Artista: " + cancion.artista + "\n" + "Album: " + cancion.album + "\n" + "Año: " + cancion.anio);
			System.out.println("-----------------------------------------------------------------------------------------");
		}
	}
	
	public Cancion getCancion(int posicion) { //Obtener una canción de la rockola
		if(listaCanciones.isEmpty()) {
			System.out.println("No hay canciones en la rockola");
			return null;
		}
		Cancion cancionSeleccionada = listaCanciones.elementAt(posicion-1);
		return cancionSeleccionada;
	}

}
