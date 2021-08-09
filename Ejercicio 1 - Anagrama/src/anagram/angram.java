package anagram;

import java.util.Scanner;
import java.util.Vector;
import java.text.Normalizer;

public class angram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena1= "", cadena2= "";
		boolean anagrama = false;
		
		System.out.print("Teclee la primer cadena: ");
		cadena1 = sc.nextLine().trim();
		
		System.out.print("Teclee la segunda cadena: ");
		cadena2 = sc.nextLine().trim();
		
		
		anagrama = es_anagrama(Normalizer.normalize(cadena1.toLowerCase(), Normalizer.Form.NFD), Normalizer.normalize(cadena2.toLowerCase(), Normalizer.Form.NFD)); 
		if(anagrama) {
			System.out.println("La cadena: " + cadena1 + " y la cadena: " + cadena2 + " son angramas" );
			System.out.println("Si las cadenas contienen acentos estos son descartados para su comparación");
		}
		else {
			System.out.println("La cadena: " + cadena1 + " y la cadena: " + cadena2 + " no son anagramas" );
		}
	}
	
	public static boolean es_anagrama(String cadena1, String cadena2) {
		int coincidencias = 0;
		boolean es_anagrama = false;
		cadena1 = cadena1.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		cadena2 = cadena2.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		
		Vector vectorCad1 = new Vector();
		Vector vectorCad2 = new Vector();
		
		if(cadena1.length() == cadena2.length()) {
			for(int i = 0; i<cadena1.length(); i++) {
				vectorCad1.addElement(cadena1.charAt(i));
				vectorCad2.addElement(cadena2.charAt(i));
			}
		}
		else {
			return es_anagrama;
		}
		
		for(int i = 0; i<vectorCad1.size(); i++) {
			if(!vectorCad1.contains(vectorCad2.elementAt(i))) {
				return es_anagrama;
			}
			else {
				coincidencias++;
			}
		}
		if(coincidencias == vectorCad1.size()) {
			es_anagrama = true;
		}
		
		return es_anagrama;
	}
}
