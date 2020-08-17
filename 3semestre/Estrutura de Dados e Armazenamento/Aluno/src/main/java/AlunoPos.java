public class AlunoPos extends Aluno{

    private  Double nota1;
    private  Double nota2;
    private  Double notaMonografia;

    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calcMedia() {
        return (nota1+nota2/2)+notaMonografia;
    }

    @Override
    public String toString() {
        return " Aluno Pós-graduação: " + "\n"+
                super.toString()+
                " Primeira nota: " + String.format("%.1f", nota1)  + "\n"+
                " Segunda nota: " + String.format("%.1f", nota2)  + "\n"+
                " Nota monografia: " + String.format("%.1f", notaMonografia) + "\n"+
                " _________________________"+"\n"+
                " Média final: " + String.format("%.1f", calcMedia())+ "\n";

    }
}
