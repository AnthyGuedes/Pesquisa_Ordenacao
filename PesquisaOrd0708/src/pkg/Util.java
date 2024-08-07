package pkg;
import java.util.ArrayList;
import java.util.Random;
/**
 * classe com métodos static para gerar palavras ou números
 * @author laboratorio
 *
 */
public class Util {
	/**
	 * Metodo static que gera uma palavra aleatória a partir de um tamanho
	 * @param tamanho - quantidade de caracteres de palavra
	 * @return uma palavra aleatória
	 */
	public static String gerarPalavra(int tamanho) {
		StringBuilder letras = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		Random gerador = new Random();
		StringBuilder palavra = new StringBuilder();
		for(int i=0; i<tamanho; i++) {
			palavra.append(letras.charAt( gerador.nextInt(letras.length())));
		}
		return palavra.toString();
	}
	/**
	 * método static que popula uma lista com palavrars aleatórias
	 * @param lista - contém palavras geradas
	 * @param quantidade - quantas palavras deseja gerar
	 * @param tamanho - quantidade de caracteres da palavra a ser geradas
	 */
	public static void gerarPalavrasLista(ArrayList<String> lista, int quantidade, int tamanho) {
		
		for(int i=0; i<quantidade; i++) {
			lista.add(Util.gerarPalavra(tamanho));
		}
	}
	/**
	 * método static que exibe elementos de qualquer lista
	 * @param lista - contém números ou palavras
	 * @param frase - título a ser exibidopelo método
	 */
	public static void exibir(ArrayList lista, String frase) {
		System.out.println(frase);
		for(Object item : lista) {
			System.out.println(item);
		}
	}
}
