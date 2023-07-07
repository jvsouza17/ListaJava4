package Ex2;

import java.util.Scanner;

public class Carro extends Veiculos {
    private double km;
    
    public Carro(){
        super();
        this.km = 0;
    }
    
    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }
    
    public double getKm() {
        return km;
    }
    
    public void setKm(double km) {
        this.km = km;
    }
    
    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Quilometragem: " + km + " km");
    }
    
    @Override
    public double getPreco() {
        
        return super.getPreco() * 0.95;
    }
    
    public void insertData() {
        //As características do carro
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        setModelo(modelo);
        
        System.out.print("Digite o preço do carro: ");
        double preco = scanner.nextDouble();
        setPreco(preco);
        
        System.out.print("Digite a quilometragem do carro: ");
        double km = scanner.nextDouble();
        setKm(km);
        
        scanner.close();
    }
}

