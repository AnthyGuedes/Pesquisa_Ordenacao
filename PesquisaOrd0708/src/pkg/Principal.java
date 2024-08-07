package pkg;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		 ArrayList<String> listaPalavras = new ArrayList<>();
	     Util.gerarPalavrasLista(listaPalavras, 10, 8);
	     Util.exibir(listaPalavras, "Lista de palavras...");
	}

}
