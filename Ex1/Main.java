package Ex1;

public class Main {
    public static void main(String[] args) {
        DVD dvd = new DVD();
        dvd.inserirDados(2, "DVD teste", 30);
        dvd.setFaixas(10);
        dvd.printDados();

        CD cd = new CD();
        cd.inserirDados(3, "Álbum teste", 50);
        cd.setMusicas(10);
        cd.printDados();
    }
    
}
