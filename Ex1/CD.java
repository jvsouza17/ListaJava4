package Ex1;

public class CD extends Midia {
    private int nMusicas;

    public CD() {
        super();
        this.nMusicas = 0;
    }

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public int getMusicas() {
        return nMusicas;
    }

    public void setMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    @Override
    public void inserirDados(int codigo, String nome, double preco) {
        super.inserirDados(codigo, nome, preco);
    }
}