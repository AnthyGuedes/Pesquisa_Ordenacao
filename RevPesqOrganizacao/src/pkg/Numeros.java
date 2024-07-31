package pkg;

import java.util.ArrayList;
import java.util.Random;

public class Numeros {
	/**
	 * metodo static que recebe uma lista de inteiros e popula numeros aleatorios, com N numeros em um Range
	 * @param lista
	 * @param n
	 * @param range
	 */
	public static void popularAleatorio(ArrayList lista, int n, int range){
		Random gerador = new Random();
		for (int i = 0; i < n; i++) {
			lista.add(gerador.nextInt(range));
			
		}
	}
	/**
	 * metodo static que recebe uma lista e exibi seus elementos um abaixo do outro
	 * @param lista
	 */
	public static void exibir(ArrayList lista) {
		for(Object item : lista) {
			System.out.println(item);
		}
	}
	
}
