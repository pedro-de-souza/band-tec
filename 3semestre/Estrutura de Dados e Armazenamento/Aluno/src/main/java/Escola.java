import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> listaAluno;

    public Escola(String nome) {
        this.nome = nome;
        listaAluno = new ArrayList<Aluno>();
    }

    public void adiicionaAluno(Aluno a){
        listaAluno.add(a);
    }

    public void exibeTodos(){
        System.out.println("-- Lista dos Alunos --");
        for(Aluno a : listaAluno){
            System.out.println(a);
        }
    }

    public void exibeAlunosGraduacao(){
        System.out.println("-- Lista dos Alunos de Graduação --");
        for(Aluno a : listaAluno){
            if(a instanceof AlunoGraduacao){
                System.out.println(a);
            }
        }
    }

    public void exibeAprovados(){
        System.out.println("-- Lista dos Alunos Aprovados --");
        for(Aluno a : listaAluno){
            if(a.calcMedia() >= 5){
                System.out.println(a);
            }
        }
    }

    public void buscarAluno(Integer ra){
        for(Aluno a : listaAluno) {
            if (ra.equals(a.getRa())) {
                System.out.println(a);
                return;
            }
        }
        System.out.println(" Aluno não encontrado");

    }



}
