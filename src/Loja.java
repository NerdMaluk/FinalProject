import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        Cliente cliente = new Cliente();
        Administrador administrador = new Administrador();
        Funcionario funcionario = new Funcionario();

        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Consultar estoque");
            System.out.println("3. Consultar produtos");
            System.out.println("4. Realizar venda");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a linha

            switch (escolha) {
                case 1:
                    administrador.adicionarProdutos(scanner);
                    break;
                case 2:
                    administrador.consultarEstoque();
                    break;
                case 3:
                    cliente.consultarProdutos();
                    break;
                case 4:
                    funcionario.realizarVenda(scanner);
                    break;
                case 5:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        // Fecha o scanner
        scanner.close();
    }

}
