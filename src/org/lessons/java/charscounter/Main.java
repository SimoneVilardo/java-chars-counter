package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci una parola = ");
		String parola = in.nextLine().toLowerCase();
		
		in.close();
		
		Map<Character, Integer> occorrenza = new HashMap<>();
		
		
		for (Character c : parola.toLowerCase().toCharArray()) {
			
			if (occorrenza.containsKey(c)) {
				
				occorrenza.put(c, occorrenza.get(c) + 1);
			} else {
				
				occorrenza.put(c, 1);
			}
		}
		
		System.out.println(occorrenza);
		
		for (Character key : occorrenza.keySet()) {
			
			int value = occorrenza.get(key);
			System.out.println(key + " --> " + value);
		}
	

	}

}
