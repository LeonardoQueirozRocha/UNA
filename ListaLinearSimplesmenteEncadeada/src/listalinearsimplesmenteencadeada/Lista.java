package listalinearsimplesmenteencadeada;
import java.util.Scanner;

public class Lista {
    Scanner input = new Scanner(System.in);

    TipoNo primeiro;
    TipoNo ultimo;

    public Lista() {
        primeiro = ultimo = null;
    }

    public boolean Vazia() {
        return primeiro == null;
    }

    public void InserirNoInicio(Produto item) {
        TipoNo no = new TipoNo(item);
        no.proximo = primeiro;

        if (Vazia()) {
            ultimo = no;
        }

        primeiro = no;
    }

    public void InserirNoFim(Produto item) {
        TipoNo no = new TipoNo(item);

        if (Vazia()) {
            primeiro = no;
        } else {
            ultimo.proximo = no;
        }

        ultimo = no;
    }

    public double MediaPreco() {
        TipoNo aux = primeiro;
        double s = 0;
        double m;
        double n = 0;
        while (aux != null) {
            s = s + aux.item.preco;
            n = n + 1;
            aux = aux.proximo;
        }
        return m = s / n;
    }
    
    public void Alteracao(int codigo, String nome){
        TipoNo aux = primeiro;
        
        
        while (aux != null){
            if ( aux.item.codigo == codigo){
                aux.item.nome = nome;
                System.out.println("Nome alterado");
                return;
            }
            aux = aux.proximo;
        }
        System.out.println("Produto não encontrado");
    }

    public void Imprimir() {
        TipoNo aux = primeiro;

        while (aux != null) {
            System.out.println(aux);
            aux = aux.proximo;
        }
    }

}
