package com.omar.burbuja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("Le daremos al usuario un array de longitud 10 generado con números aleatorios de entre el 1 y el 100");
		System.out.println("Tras ello le preguntaremos si los quiere ordenar. En caso aformativo, le devolveremos el array");
		System.out.println("ordenado mediante el método de ordenación por burbuja");
		
		int[] array = new int[10];
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i<array.length; i++) {
			array[i]=(int)(Math.random()*100+1);
		}
		
		for(int i: array) {
			lista.add(i);
		}
		
		System.out.println("Este es su array: " + lista);
		System.out.println();
		System.out.println("¿Desea ordenarlo? (S)/(N)");
		
		try {
			String response = sc.nextLine();
			
			response.toUpperCase();
			
			if (response.equals("S")) {
				burbuja(array);
				List<Integer> listaFinal = new ArrayList<>();
				
				for(int i:array) {
					listaFinal.add(i);
				}
				
				System.out.println("Esta es la lista ordenada: " + listaFinal);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Por favor, introduzca caracteres válidos enteros");
		}

	}
	
	public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
}

}
