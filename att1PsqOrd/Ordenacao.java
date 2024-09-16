import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ordenacao {

    /**
     * Método ordenação por bolha, com método compareTo
     * @param lista Lista de Obj Alunos a ser ordenada
     */
    public static void bolha(List<Aluno> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {

                    Aluno aux = lista.get(j);

                    lista.set(j, lista.get(j + 1));

                    lista.set(j + 1, aux);
                }
            }
        }
    }

    /**
     * Método ordenação por Inserção, com método compareTo
     * @param lista Lista de Obj Alunos a ser ordenada
     */
    public static void insercao(List<Aluno> lista) {
        for (int i = 1; i < lista.size(); i++) {
            Aluno aux = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j).compareTo(aux) > 0) {

                lista.set(j + 1, lista.get(j));
                j--;
            }

            lista.set(j + 1, aux);
        }
    }

    /**
     * Método ordenação por Seleção, com método compareTo
     * @param lista Lista de Obj Alunos a ser ordenada
     */
    public static void selecao(List<Aluno> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            int menor = i;

            for (int j = i + 1; j < n; j++) {
                if (lista.get(j).compareTo(lista.get(menor)) < 0) {
                    menor = j;
                }
            }
            Aluno aux = lista.get(menor);
            lista.set(menor, lista.get(i));
            lista.set(i, aux);
        }
    }

    /**
     * Método para gerar uma lista de alunos com nomee, número e idadea aleatória
     * @return Lista de alunos gerada
     */
    public static List<Aluno> gerarAlunos(int totalAlunos) {
        List<Aluno> alunos = new ArrayList<>(totalAlunos);
        Random random = new Random();
        String[] nomes = {"Ana", "Anthony", "Zeca", "Vitor", "Claudiomiro", "Marcio", "Marcelo", "Euclides", "Gilberto", "Romeo", "Silvio Santos", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena"};

        for (int i = 0; i < totalAlunos; i++) {
            String nome = nomes[random.nextInt(nomes.length)] + i; //nome e numero do lado para ordenar nos casos de repetir nome
            int idade = 18 + random.nextInt(53); // idade entre 18 e 70
            alunos.add(new Aluno(nome, idade));
        }

        return alunos;
    }

    /**
     * Método para exibir todos os alunos de uma lista
     * @param metodo Nome do método de ordenação utilizado
     * @param alunos Lista de alunos a ser exibida
     */
    public static void exibirAlunos(String metodo, List<Aluno> alunos) {
        System.out.println("|Alunos ordenados pelo método|" + metodo);
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
        System.out.println("-----");
    }
}
