package set.basic_operations;

public class Convidado {
    private String nome;
    private int codigoDoConvite;

    public Convidado(String nome, int codigoDoConvite) {
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoDoConvite() {
        return codigoDoConvite;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Convidado convidado)) return false;
        return getCodigoDoConvite() == convidado.getCodigoDoConvite();
    }

    public String toString() {
        return "Convidado: {" +
            "nome = '" + nome + '\'' +
            ", codigoConvite = " + codigoDoConvite +
            '}';
    }
}
