// Classe executável

public class TesteFuncionario {

    public static void main(String[] args) {

        // Criação dos objetos das classes Engenheiro, Vendedor e Horista
        Engenheiro e = new Engenheiro ("55000","Claudio", 15000.0);
        Vendedor v = new Vendedor ("60000", "Mickey", 20000.0, 0.10);
        Horista h = new Horista ("65000", "Pateta", 40, 100.0);

        // Exibição dos dados dos objetos criados
        System.out.println(e);
        System.out.println(v);
        System.out.println(h);

        // Exibição do salário de cada objeto
        // Aqui vemos o POLIMORFISMO - método de mesmo nome, implementado de forma diferente
        // em cada classe, e produzindo resultados diferentes ao ser chamado
        System.out.println("Salário do Engenheiro: " + e.calcSalario());
        System.out.println("Salário do Vendedor: " + v.calcSalario());
        System.out.println("Salário do Horista: " + h.calcSalario());

        // Criação do objeto da classe Empresa
        Empresa bandtec = new Empresa();

        // Adiciona os objetos de Engenheiro, Vendedor e Horista à lista de funcionários
        // do objeto bandtec
        bandtec.adicionaFunc(e);
        bandtec.adicionaFunc(v);
        bandtec.adicionaFunc(h);

        // Exibe todos os funcionários da bandtec
        bandtec.exibeTodos();

        // Exibe o total gasto com salário pela bandtec
        bandtec.exibeTotalSalario();

        // Exibe apenas os funcionários horistas
        bandtec.exibeHoristas();

    }
}
