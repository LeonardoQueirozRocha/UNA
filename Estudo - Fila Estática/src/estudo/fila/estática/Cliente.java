package estudo.fila.estática;

public class Cliente {

    char tipocliente;
    String nome;
    int senha;

    public Cliente(char tipocliente, String nome, int senha) {
        this.tipocliente = tipocliente;
        this.nome = nome;
        this.senha = senha;
    }
    
    public String toString(){
        return "Tipo do cliente: " + tipocliente + "\tnome: " + nome + "\tSenha: " + senha;
    }

}
