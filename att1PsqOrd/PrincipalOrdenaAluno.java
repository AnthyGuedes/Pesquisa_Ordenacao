import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrincipalOrdenaAluno {
    static int ALUNOS = 500;
    public static void main(String[] args) {
        List<Aluno> alunos = Ordenacao.gerarAlunos(ALUNOS);

        List<Aluno> alunosBolha = new ArrayList<>(alunos);
        List<Aluno> alunosInsercao = new ArrayList<>(alunos);
        List<Aluno> alunosSelecao = new ArrayList<>(alunos);
        List<Aluno> alunosSort = new ArrayList<>(alunos);

        //threads para cada método de ordenação
        Thread threadBolha = new Thread(() -> {
            Ordenacao.bolha(alunosBolha);
            System.out.println("|Metodo Bolha terminou de ordenar|");
        });

        Thread threadInsercao = new Thread(() -> {
            Ordenacao.insercao(alunosInsercao);
            System.out.println("|Método Inserção terminou a ordenação|");
        });

        Thread threadSelecao = new Thread(() -> {
            Ordenacao.selecao(alunosSelecao);
            System.out.println("|Método Seleção terminou de ordenar|");
        });

        Thread threadSort = new Thread(() -> {
            alunosSort.sort(Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getIdade));
            System.out.println("|Método Sort terminou a ordenação|");
        });

        threadBolha.start();
        threadInsercao.start();
        threadSelecao.start();
        threadSort.start();

        try {
            threadBolha.join();
            threadInsercao.join();
            threadSelecao.join();
            threadSort.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("|-------------|");

        Ordenacao.exibirAlunos("Bolha", alunosBolha);
        Ordenacao.exibirAlunos("Inserção", alunosInsercao);
        Ordenacao.exibirAlunos("Seleção", alunosSelecao);
        Ordenacao.exibirAlunos("Sort", alunosSort);
    }
}
