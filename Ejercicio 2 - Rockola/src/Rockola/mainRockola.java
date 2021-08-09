package Rockola;

import java.util.Scanner;
import java.util.Vector;

import Rockola.Cancion;

class Rockola{
	private String marcaRockola;
	private int anioRockola;
	private Vector<Cancion> listaReproduccion = new Vector<Cancion>();
	
	Rockola(String marca, int anio) {
		marcaRockola = marca;
		anioRockola = anio;
	}
	
	public void setMarca(String marca) { marcaRockola = marca; }
	public void setAnio(int anio) { anioRockola = anio; }
	
	public String getMarca() { return marcaRockola; }
	public int getAnio() { return anioRockola; }
	
	public void informacionRockola() {
		System.out.printf("Información de Rockola" + "\n" + 
		"marca de rockola: " + this.marcaRockola + "\n" +
		"año de rockola: " + this.anioRockola + "\n");
	}
	
	public void agregarALista(Cancion cancion) {   //Metodo para agregar canciones al vector de la lista de reproducción
		listaReproduccion.addElement(cancion);
		System.out.println("Canción agregada");
	}
	
	public void eliminarCancionLista(int posicion) {//Metodo para eliminar canciones al vector de la lista de reproducción
		if(listaReproduccion.isEmpty()) {
			System.out.println("No hay canciones en la lista de reproducción");
		}
		else {
			listaReproduccion.remove(posicion-1);
			System.out.println("Canción eliminada de la lista de reproducción");
		}
	}
	
	public Cancion getCancionEspecifica(int cancion) {//Metodo para obtener la información de una canción de la lista
		Cancion cancionEspecifica = listaReproduccion.elementAt(cancion);
		return cancionEspecifica;
	}
	
	public void mostrarListaReproduccion() {//Metodo para visualizar la lista de reproducción completa
		if(listaReproduccion.isEmpty()) {
			System.out.println("No hay canciones en la lista de reproducción");
		}
		else {
			for(int i = 0; i<listaReproduccion.size(); i++) {
				Cancion cancion = listaReproduccion.elementAt(i);
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println((i+1) + "\n" + "Titulo: " + cancion.getTitulo() + "\n" + "Duración: "+ cancion.getDuracion() + " minutos\n" +  "Artista: " + cancion.getDuracion() + "\n" + "Album: " + cancion.getAlbum() + "\n" + "Año: " + cancion.getAnio());
				System.out.println("-------------------------------------------------------------------------------------");
			}
		}
	}
	public int ultimaLista() { //Metodo para retornar la ultima posición de la lista
		return listaReproduccion.size()-1;
	}
}

public class mainRockola {
	static Scanner sc = new Scanner(System.in);
	static Cancion cancion = new Cancion();
	static Rockola rock, rockG;
	public static void main(String[] args) {
		String marcaRockola;
		int anioRockola;
		
		System.out.println("Teclee la marca de la Rockola: ");
		marcaRockola = sc.nextLine();
		System.out.println("Teclee el año de la Rockola: ");
		try {
			anioRockola = sc.nextInt();
		}
		catch(NumberFormatException e) {
			System.out.println("Teclee un año valido: ");
			anioRockola = sc.nextInt();
		}
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n\n");
		Rockola rock = new Rockola(marcaRockola, anioRockola);
		rockG = rock;
		menuPrincipal(rock);
	}
	
	public static void menuPrincipal(Rockola rock) {//Menu principal del control de la rockola
		int opcionSeleccionada;
		do {
			System.out.println("\n------------------- Menu principal -------------------");
			System.out.println("1 - Menu canciones rockola");
			System.out.println("2 - Menu lista reproducción");
			System.out.println("3 - Información reproducción");
			System.out.println("4 - Información Rockola");
			System.out.println("5 - Apagar");
			
			System.out.println("Teclee la opción deseada: ");
			try {
				opcionSeleccionada = sc.nextInt();
			}
			catch(NumberFormatException e) {
				System.out.println("Teclee una opción valida");
				opcionSeleccionada = 6;
			}
			
			
			switch(opcionSeleccionada) {
				case 1:
					menuCanciones();
					break;
				case 2:
					menuListaReproduccion();
					break;
				case 3:
					informacionReproduccion();
					break;
				case 4:
					rock.informacionRockola();
					break;
				case 5:
					System.out.println("Adios");
					System.exit(0);
					break;
			}
		}
		while(opcionSeleccionada != 5 || opcionSeleccionada > 5);
	}
	
	public static void menuCanciones() { //Menu donde se realiza las opereaciones con las canciones como agregar, eliminar y mostrar
		int opcion;
			do {
			System.out.println("\n------------------- Menu de Canciones -------------------");
			System.out.println("1 - Agregar cancion");
			System.out.println("2 - Eliminar cancion");
			System.out.println("3 - Mostrar canciones");
			System.out.println("4 - Regresar al menu anterior");
			System.out.println("Teclee la opción deseada: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					String titulo, artista, album;
					int anio;
					float duracion;
					sc.nextLine();
					
					System.out.println("Teclee el titulo de la canción: ");
					titulo = sc.nextLine();
										
					System.out.println("Teclee la duración de la canción: ");
					try {
						duracion = sc.nextFloat();
					}
					catch(NumberFormatException e) {
						System.out.println("Teclee una duración valida: ");
						duracion = sc.nextFloat();
					}
					sc.nextLine();
					
					System.out.println("Teclee el artista de la canción: ");
					artista = sc.nextLine();
					
					System.out.println("Teclee el album de la canción: ");
					album = sc.nextLine();
					
					System.out.println("Teclee el año de la canción: ");
					try {
						anio = sc.nextInt();
					}
					catch(NumberFormatException e) {
						System.out.println("Teclee un año valido: ");
						anio = sc.nextInt();
					}
					
					sc.nextLine();
					
					Cancion nuevaCancion = new Cancion(titulo, duracion, artista, album, anio);
					cancion.agregarCancion(nuevaCancion);
					break;
				case 2:
					int eliminar;
					cancion.mostrarCanciones();
					System.out.println("Teclee el numero de la canción a eliminar: ");
					eliminar = sc.nextInt();
					cancion.eliminarCancion(eliminar);
					break;
				case 3:
					cancion.mostrarCanciones();
					break;
				case 4:
					menuPrincipal(rockG);
					break;
				default:
					System.out.println("Teclee una opción valida");
					break;	
			}
		}while(opcion< 1 || opcion>4);
	}
	
	public static void menuListaReproduccion() {//Menu donde se maneja lo concerniente a la lista de reproducción
		int opcion;
		
		do {
			System.out.println("1 - Agregar una canción a la lista");
			System.out.println("2 - Eliminar una canción de la lista");
			System.out.println("3 - Ver la lista de reproducción");
			System.out.println("4 - Volver al menu anterior");
			System.out.println("Teclee la opción deseada: ");
			try {
				opcion = sc.nextInt();
			}
			catch(NumberFormatException e) {
				System.out.println("Teclee una opción valida");
				opcion = 7;
			}
			
			
			switch(opcion) {
				case 1:
					int numero_cancion;
					System.out.println("Lista de canciones");
					cancion.mostrarCanciones();
					System.out.println("-----------------------------------");
					System.out.println("Teclee el numero de la canción para agregar: ");
					numero_cancion = sc.nextInt();
					Cancion cancionSeleccionada = cancion.getCancion(numero_cancion);
					rockG.agregarALista(cancionSeleccionada);
					break;
				case 2:
					int eliminar_cancion;
					System.out.println("Lista de canciones");
					cancion.mostrarCanciones();
					System.out.println("Teclee el numero de la canción para eliminar de la lista: ");
					eliminar_cancion = sc.nextInt();
					rockG.eliminarCancionLista(eliminar_cancion);
					break;
				case 3:
					rockG.mostrarListaReproduccion();
					break;
				case 4:
					menuPrincipal(rockG);
			}
			
		}while(opcion<1 || opcion>4);
	}
	
	public static void informacionReproduccion() {   //Controles de reproducción
		int estado = 0, cancionPasada = rockG.ultimaLista(), cancionActual=0; //Pausa=0, reproducir lista=1, Siguiente cancion=2, canción anterior=3, detener=4
		char opcion; 
		
		do {
			System.out.println("------------------ Control de reproducción ------------------");
			System.out.println("R - Reproducir lista");
			System.out.println("P - Pausar");
			System.out.println("D - Detener");
			System.out.println("S - Siguiente canción");
			System.out.println("A - Canción anterior");
			System.out.println("E - Regresar al menu anterior");
			
			System.out.println("Teclee la opción deseada: ");
			opcion = sc.next().charAt(0);
			
			switch(opcion) {
				case 'R':
				case 'r':
					estado = 1;
					Cancion cancion = rockG.getCancionEspecifica(cancionActual);
					System.out.println("\nEn reproducción");
					System.out.println(cancion.getTitulo());
					System.out.println(cancion.getDuracion());
					System.out.println(cancion.getArtista());
					break;
				case 'P':
				case 'p':
					estado = 0;
					Cancion cancionPausa = rockG.getCancionEspecifica(cancionActual);
					System.out.println("\nEn pausa");
					System.out.println(cancionPausa.getTitulo());
					System.out.println(cancionPausa.getDuracion());
					System.out.println(cancionPausa.getArtista());
					break;
				case 'D':
				case 'd':
					estado = 4;
					System.out.println("\nReproducción detenida");
					break;
				case 'S':
				case 's':
					cancionPasada = cancionActual;
					cancionActual++;
					Cancion cancionSaltada = rockG.getCancionEspecifica(cancionActual);
					System.out.println("\nEn reproducción");
					System.out.println(cancionSaltada.getTitulo());
					System.out.println(cancionSaltada.getDuracion());
					System.out.println(cancionSaltada.getArtista());
					break;
				case 'A':
				case 'a':
					cancionActual = cancionPasada;
					cancionPasada--;
					Cancion cancionAtrasada = rockG.getCancionEspecifica(cancionActual);
					System.out.println("\nEn reproducción");
					System.out.println(cancionAtrasada.getTitulo());
					System.out.println(cancionAtrasada.getDuracion());
					System.out.println(cancionAtrasada.getArtista());
					break;
				case 'E':
				case 'e':
					menuPrincipal(rockG);
					break;
				
			}
			
		}while(opcion != 'E' || opcion != 'e' || opcion != 'R' || opcion != 'r' || opcion != 'P' || opcion != 'p' || opcion != 'D' || opcion != 'd' || opcion != 'S' || opcion != 's' || opcion != 'A' || opcion != 'a');
	}
}

