public class TestaTributo {

    public static void main(String[] args) {

        Alimento pipino = new Alimento(132,"Pipino de novo", 10.0, 5);
        Perfume puruvudu = new Perfume(100, "Excentrico", 50.0,"Almadiçoado");

        Servico marketeiroDigital = new Servico("Marketing digital", 100.0);

        System.out.println(pipino);
        System.out.println(puruvudu);
        System.out.println(marketeiroDigital);

        Tributo tr = new Tributo();

        tr.adicionaTributavel(pipino);
        tr.adicionaTributavel(puruvudu);
        tr.adicionaTributavel(marketeiroDigital);

        tr.exibeTodos();

        System.out.format("Total de impostos: %.2f",tr.calculaTribuito());


    }

}
