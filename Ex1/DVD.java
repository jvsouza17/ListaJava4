package Ex1;

public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
        super();
        this.nFaixas = 0;
    }

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public int getFaixas() {
        return nFaixas;
    }

    public void setFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    @Override
    public void inserirDados(int codigo, String nome, double preco) {
        super.inserirDados(codigo, nome, preco);
    }
}