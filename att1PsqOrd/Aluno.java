/**
 * Classe aluno para gerar objetos com nome e idade
 */
public class Aluno implements Comparable<Aluno>{
    String nome;
    int idade;

    /**
     * Construtor da  classe Aluno
     * @param nome
     * @param idade
     */
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Reinscrição do método toString para mostrar nome e idade de Obj Aluno
     * @return
     */
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + "]";
    }

    /**
     * Reinscrição do método compareTo para Obejto Aluno
     * @param outro
     * @return
     */
    @Override
    public int compareTo(Aluno outro) {
        // comparação por nome
        int resultado = this.nome.compareTo(outro.nome);

        //nomes forem iguais, comparar pela idade
        if (resultado == 0) {
            resultado = Integer.compare(this.idade, outro.idade);
        }

        return resultado;
    }


}