package listalinearsimplesmenteencadeada;

public class TipoNo {
    Produto item;
    TipoNo proximo;
    
    public TipoNo(Produto item){
        this.item = item;
        this.proximo = null;
    }
    
    public String toString(){
        return " -> " + item;
    }

}
