package pkg;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<String> outraLista = new ArrayList<>();
		outraLista.add("Bruno");
		outraLista.add("Yuru");
		outraLista.add("Ceretinha");
		
		Numeros.exibir(outraLista);
		
		Numeros.popularAleatorio(lista,100,1000);
		Numeros.exibir(lista);

	}

}
