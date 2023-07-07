package Ex1;
public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    
    public Midia() {

    }
    
    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n; 
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + preco;
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Detalhes: " + getDetalhes());
    }

    public void inserirDados(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
}


    
   