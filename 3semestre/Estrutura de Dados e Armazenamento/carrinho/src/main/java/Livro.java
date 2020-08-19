public class Livro extends Produto {


    private String autor;
    private String isbn;

    public Livro(Integer codigo, String nome, Double precoCusto, String autor, String isbn) {
        super(codigo, nome, precoCusto);
        this.autor = autor;
        this.isbn = isbn;
    }

    public Double getValorVenda() {
        return getValorVenda() +  1.10;
    }

    @Override
    public String toString() {
        return "Livro - " +
                super.toString()+
                "Autor: " + autor +"\n"+
                "Isbn: " + isbn +"\n";
    }
}
