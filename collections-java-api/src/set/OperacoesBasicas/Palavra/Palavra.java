package set.OperacoesBasicas.Palavra;

import java.util.Objects;

public class Palavra {
    
    private String palavra;

    public Palavra(String palavra){
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }
    
    //Cógido para não inserir mais de um elemento igual.
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Palavra palavra)) return false;
        return getPalavra() == palavra.getPalavra();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }


    @Override
    public String toString() {
        return palavra;
    }
}
