package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigoConvite = codigo;
    }

    public int getCodigoConvite(){
        return codigoConvite;
    }

    public String getNomeConvidado() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "\nConvidado {"+nome+"} Codigo {"+codigoConvite+"}";
    }
}
