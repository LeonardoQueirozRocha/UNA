package trabalho.de.aeds;

public class TipoNo {

    public TipoNo proximo;
    public TipoNo anterior;
    public Produto item;

    public TipoNo(int codigo, String nome, double preco) {
        item = new Produto(codigo, nome, preco);
        this.proximo = null;
        this.anterior = null;
    }

    public String toString() {
        return item.toString();
    }

}
