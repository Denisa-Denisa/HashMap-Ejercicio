package Ejercicio4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio4 {
	/*
	 * Genera 1000 números aleatorios con valores entre 0 y 500. Escribe cuantos
	 * números distintos han salido.
	 * 
	 * Genera 1000 números aleatorios con valores entre 0 y 500. Escribe cuantas
	 * veces ha salido cada número.
	 * 
	 */
	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<>(1000);
		for (int i = 1; i <= 1000; i++) {
			int n = (int) (Math.random() * 501);
			numeros.add(n);

		}

		for (Integer n : numeros) {
			System.out.println();
		}

		System.out.printf("Total de numeros distintos %d%n", numeros.size());

		Map<Integer, Integer> vecesMap = new HashMap<>();
		for (int i = 1; i <= 1000; i++) {
			int n = (int) (Math.random() * 100);
			Integer numInteger = vecesMap.get(n);
			if (numInteger == null) {
				vecesMap.put(n, 1);
			} else {
				numInteger++;
				vecesMap.remove(n);
				vecesMap.put(n, numInteger);
			}
		}

		System.out.println(vecesMap);

		Map<Integer, Integer> veces = new HashMap<>();
		for (int i = 1; i <= 1000; i++) {
			int n = (int) (Math.random() * 100);
			Integer numInteger = veces.getOrDefault(n, 0);
			numInteger++;
			veces.put(n, numInteger);
		}
	}
}
