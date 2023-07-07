package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //poder criar mais de um veículo
        List<Veiculos> cadastro = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro de veículos!");
        System.out.println("Deseja inserir uma moto (M) ou um carro (C)? ");
        String opcao = scanner.nextLine();
        // é ignorado letras maiusculas ou minusculas e o usuário escolhe se quer adicionar carro ou moto
        // após escolher, é necessário colocar as características
        while (opcao.equalsIgnoreCase("M") || opcao.equalsIgnoreCase("C")) {
            if (opcao.equalsIgnoreCase("M")) {
                Moto moto = new Moto();
                moto.insertData();
                cadastro.add(moto);
            } else if (opcao.equalsIgnoreCase("C")) {
                Carro carro = new Carro();
                carro.insertData();
                cadastro.add(carro);
            }
            // usado para fazer o usuário escolher adicionar mais ou sair 
            System.out.print("Deseja inserir uma moto (M) ou um carro (C)? (Digite S para sair) ");
            opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("S")) {
                break;
            }
        }
        // for-each, percorre os elementos da lista cadastro
        // cadatro é atribuida a veiculo, é mostrado na tela todos os veiculos cadastrados com o printDados()
        System.out.println("\nRelatório de Veículos:");
        for (Veiculos veiculo : cadastro) {
            veiculo.printDados();
            System.out.println("-------------------------");
        }

        // determina que o totalPrecosAntes = getTotalPrecos, o valor total de todos os veiculos são atribuídos a variavel nova
        double totalPrecosAntes = getTotalPrecos(cadastro);
        System.out.println("\nTotal de Preços dos Veículos (Antes do Reajuste): R$" + totalPrecosAntes);

        // aqui ele percorre todos os veiculos cadastrados e verifica com o instanceof se ele é uma moto ou um carro e atribui regras para as duas situações
        for (Veiculos veiculo : cadastro) {
            //em seguida será feito um cast para moto e veículo, um cast permite que tratemos o objeto como uma instância de Moto ou carro e assim podemos acessar os métodos e variáveis específicas dessas classes.
            // o cast só é válido se o objeto for realmente uma instância do tipo para o qual estamos fazendo o cast, ou uma subclasse desse tipo.
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.getAno() >= 2008) {
                    double novoPreco = moto.getPreco() * 1.1;
                    moto.setPreco(novoPreco);
                }
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.getKm() > 100000) {
                    double novoPreco = carro.getPreco() * 0.92;
                    carro.setPreco(novoPreco);
                }
            }
        }

        double totalPrecosDepois = getTotalPrecos(cadastro);
        System.out.println("\nTotal de Preços dos Veículos (Após o Reajuste): R$" + totalPrecosDepois);
        //finaliza o uso da classe Scanner e libera buffer de memória
        scanner.close();
    }

    // percorre cada veiculo na lista Veiculos e soma o preço de todos, por fim atribui todos os valores na variavel total
    private static double getTotalPrecos(List<Veiculos> veiculos) {
        double total = 0.0;
        for (Veiculos veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }
}