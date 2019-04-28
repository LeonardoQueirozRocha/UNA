package trabalho.de.aeds;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Lista {

    TipoNo primeiro;
    TipoNo ultimo;
    TipoNo atual;
    Formatter arquivo;
    Scanner arq;
    private int ultimocod;

    public Lista() {
        primeiro = ultimo = null;
    }

    public boolean Vazia() {
        return primeiro == null;
    }

    public int InserirNoInicio(String nome, double preco) {
        ultimocod++;
        TipoNo no = new TipoNo(ultimocod, nome, preco);
        no.proximo = primeiro;

        if (Vazia()) {
            ultimo = no;
        } else {
            primeiro.anterior = no;
        }
        primeiro = no;
        return ultimocod;
    }

    public int InserirNoFinal(String nome, double preco) {
        ultimocod++;
        return InserirNoFinal(ultimocod, nome, preco);
    }

    public int InserirNoFinal(int codigo, String nome, double preco) {
        TipoNo no = new TipoNo(codigo, nome, preco);
        atual = no;

        if (Vazia()) {
            primeiro = no;
        } else {
            no.anterior = ultimo;
            ultimo.proximo = no;
        }
        ultimo = no;
        return codigo;
    }

    public Produto Primeiro() {
        if (primeiro != null) {
            atual = primeiro;
            return atual.item;
        } else {
            return null;
        }
    }

    public Produto Ultimo() {
        if (ultimo != null) {
            atual = ultimo;
            return atual.item;
        } else {
            return null;
        }
    }

    public Produto Proximo() {
        if (atual != null && atual.proximo != null) {
            atual = atual.proximo;
            return atual.item;
        } else {
            return null;
        }
    }

    public Produto Anterior() {
        if (atual != null && atual.anterior != null) {
            atual = atual.anterior;
            return atual.item;
        } else {
            return null;
        }
    }

    public Produto Localizar(int codigo) {
        TipoNo aux = primeiro;

        while (aux != null && aux.item.codigo != codigo) {
            aux = aux.proximo;

        }

        if (aux == null) {
            return null;
        }

        if (aux.item.codigo == codigo) {
            atual = aux;
        }
        return aux.item;
    }

    public Produto Excluir(int codigo) {
        TipoNo aux = primeiro;

        while (aux != null && aux.item.codigo != codigo) {
            aux = aux.proximo;
        }

        if (aux == null) {
            return null;
        }

        if (aux.proximo != null) {
            atual = aux.proximo;
        } else {
            atual = aux.anterior;
        }

        if (aux == primeiro) {
            if (primeiro == ultimo) {
                primeiro = ultimo = null;
            }
            primeiro = aux.proximo;
            aux.anterior = null;

        } else if (aux == ultimo) {
            ultimo.anterior.proximo = null;
            ultimo = aux.anterior;
            aux.proximo = null;

        } else {
            aux.anterior.proximo = aux.proximo;
            aux.proximo.anterior = aux.anterior;
        }
        return aux.item;
    }

    public Produto Atual() {
        return atual.item;
    }

    public void Gravar() {

        TipoNo aux = primeiro;

        try {
            arquivo = new Formatter("Produtos.txt");
        } catch (Exception Excecao) {
            System.err.println("Erro ao tentar abrir o arquivo!");
            System.exit(1);
        }

        while (aux != null) {
            arquivo.format("%d %s\n %.2f\n", aux.item.codigo, aux.item.nome, aux.item.preco);
            aux = aux.proximo;
        }
        arquivo.close();
    }

    public void Ler() {

        TipoNo aux = primeiro;

        try {
            arq = new Scanner(new File("Produtos.txt"));
        } catch (Exception Excecao) {
            System.err.println("Erro ao tentar abrir o arquivo!");
            System.exit(1);
        }

        try {
            while (arq.hasNext()) {
                InserirNoFinal(arq.nextInt(), arq.nextLine(), arq.nextDouble());
            }
        } catch (Exception minhaExcecao) {
            System.err.println("Erro ao ler o arquivo");
            System.exit(1);
        }
        arq.close();
    }

    public void Imprimir() {
        TipoNo aux = primeiro;
        System.out.println("Outfit: ");

        while (aux != null) {
            System.out.println(aux);
            aux = aux.proximo;
        }
    }
}
