public class TesteAluno {

    public static void main(String[] args) {

        Aluno alunoFundamental = new AlunoFundamental(3741,"Robson",4.0,4.0,4.5,5.0);
        Aluno alunoGraduacao = new AlunoGraduacao(3742,"Jacinto", 8.6,7.8);
        Aluno alunoPos = new AlunoPos(3743,"Glauber",6.0,7.6,8.0);

        System.out.println(" --------------------------");
        System.out.println(alunoFundamental);
        System.out.println(" --------------------------");
        System.out.println(alunoGraduacao);
        System.out.println(" --------------------------");
        System.out.println(alunoPos);

        Escola e = new Escola("Jesus Christ");

        e.adiicionaAluno(alunoFundamental);
        e.adiicionaAluno(alunoGraduacao);
        e.adiicionaAluno(alunoPos);

        e.exibeTodos();
        System.out.println(" --------------------------");
        e.exibeAlunosGraduacao();
        System.out.println(" --------------------------");
        e.exibeAprovados();
        System.out.println(" --------------------------");
        e.buscarAluno(3741);
        System.out.println(" --------------------------");
        e.buscarAluno(500);

        //A - Sim a classe Aluno tem um método calcMedia, e o polimosfismo ocorre quando as subclasses
        // chamam esse método, porque cada aluno dependendo do seu grau tem uma forma de calcular a média

        //B - Usando o exemplo desse código, com o polimorfismo ajuda a deixar o código mais dinâmico, porque todos as
        // classes derivadas da superclasse utilizam esse método só que de maneiras distintas.

        //C - Caso o sistema venha ter uma outra classe para um novo grau de ensino no qual a maneira de calcular a média é diferente dos anterios
        // o programa vai facilmente se adaptar a uma nova classe, por exemplo uma classe AlunoCursoTecnico onde a forma de calcular sua média
        // é com atividades e uma apresentação final, seguindo a lógica das demais classes o sistema estara preparado caso outras classes venham a existir

    }

}
