package estudo.fila.estática;

import java.util.Scanner;

public class EstudoFilaEstática {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fila fn = new Fila();
        Fila fp = new Fila();
        int op, pos;
        String nome;

        do {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("1 - Enfileirar");
            System.out.println("2 - Atender");
            System.out.println("3 - Pesquiar");
            System.out.println("4 - Imprimir filas");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.print("Tipo de cliente: \n1 - Normal \n2 - Prioritário \nOpção: ");
                    op = input.nextInt();
                    System.out.print("Digite o seu nome: ");
                    nome = input.next();

                    if (op == 1) {
                        fn.Enfileirar('N', nome);
                    } else if (op == 2) {
                        fp.Enfileirar('P', nome);
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 2:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    if (!fp.Vazia()) {
                        fp.Desenfileirar();
                    } else if (!fn.Vazia()) {
                        fn.Desenfileirar();
                    }
                    break;

                case 3:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.print("Qual das filar você deseja pesquisar: \n1 - Normal \n2 - Priorotária \nOpção: ");
                    op = input.nextInt();

                    if (op == 1) {
                        System.out.print("Digite o nome da pessoa: ");
                        nome = input.next();
                        pos = fn.Pesquisar(nome);
                        if (pos == -1) {
                            System.out.println("O " + nome + " não foi encontrado na fila normal");
                        } else {
                            System.out.println("O " + nome + " se encontra na fila normal e está na posição " + pos);
                        }
                    } else if (op == 2) {
                        System.out.print("Digite o nome da pessoa: ");
                        nome = input.next();
                        pos = fp.Pesquisar(nome);
                        if (pos == -1) {
                            System.out.println("O " + nome + " não foi encontrado na fila prioritária");
                        } else {
                            System.out.println("O " + nome + " se encontra na fila prioritária e está na posição " + pos);
                        }
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 4:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.print("Esclha qual das filas imprimir:  \n1 - Normal \n2 - Prioritária \nOpção: ");
                    op = input.nextInt();

                    if (op == 1) {
                        System.out.println("Fila normal");
                        fn.Imprimir();
                    } else if (op == 2) {
                        System.out.println("Fila de prioridade");
                        fp.Imprimir();
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 5:
                    System.out.println("FIM DO PROGRAMA!!");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!!");
            }
        } while (op != 5);

    }

}
