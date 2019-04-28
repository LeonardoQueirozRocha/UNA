package trabalho.de.aeds;

public class Produto {

    public int codigo;
    public String nome;
    public double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return "Código: " + codigo + "\tNome: " + nome + "\tPreço: " + preco + "\tDoll";
    }

}
