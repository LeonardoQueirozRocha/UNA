package estudo.fila.estática;

public class Fila {

    private final int TAM_MAX = 1000;
    private int primeiro, ultimo;
    private Cliente item[];
    private int senha;

    public Fila() {
        item = new Cliente[TAM_MAX];
        primeiro = ultimo = 0;
    }

    public boolean Vazia() {
        return item[primeiro] == null;
    }

    public void Enfileirar(char tipocliente, String nome) {
        senha++;
        Cliente c = new Cliente(tipocliente, nome, senha);
        if (ultimo >= TAM_MAX) {
            System.out.println("Fila cheia");
        } else {
            item[ultimo] = c;
            ultimo++;
        }
    }

    public int Pesquisar(String nome) {
        for (int i = primeiro; i < ultimo; i++) {
            if (item[i].nome.compareToIgnoreCase(nome) == 0) {
                return i;
            }
        }
        return -1;
    }

    public int Desenfileirar() {
        int pos = primeiro;
        if (Vazia()) {
            System.out.println("Fila Vazia");
        } else {
            for (int i = pos; i < ultimo - 1; i++) {
                item[i] = item[i + 1];
            }
        }
        ultimo--;
        return pos;

    }

    public void Imprimir() {
        for (int i = primeiro; i < ultimo; i++) {
            System.out.println(item[i]);
        }
    }
}
