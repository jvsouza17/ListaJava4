package Ex2;

import java.util.Scanner;

public class Moto extends Veiculos {
    private int ano;
    
    public Moto(){
        super();
        this.ano = 0;
    }
    
    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Ano: " + ano);
    }
    
    @Override
    public double getPreco() {
        // Exemplo: desconto de 10% no preço das motos
        return super.getPreco() * 0.9;
    }
    
    public void insertData() {
        // As características da moto
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o modelo da moto: ");
        String modelo = scanner.nextLine();
        setModelo(modelo);
        
        System.out.print("Digite o preço da moto: ");
        double preco = scanner.nextDouble();
        setPreco(preco);
        
        System.out.print("Digite o ano da moto: ");
        int ano = scanner.nextInt();
        setAno(ano);
        
    }
}

