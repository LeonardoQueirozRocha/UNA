package listalinearsimplesmenteencadeada;
import java.util.Scanner;

public class ListaLinearSimplesmenteEncadeada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lista l = new Lista();
        l.InserirNoInicio(new Produto(1010, "Lápis", 2.00));
        l.InserirNoFim(new Produto(2020, "Borracha", 1.50));
        l.Imprimir();
        System.out.println("A média é " + l.MediaPreco());
        System.out.print("Digite o código: ");
        int c = input.nextInt();
        System.out.print("Digite o novo nome: ");
        String n = input.next();
        l.Alteracao(c, n);
        l.Imprimir();

    }

}
