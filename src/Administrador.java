import java.util.List;
import java.util.Scanner;

public class Administrador {
    // Método para adicionar produtos usando Scanner
    public static void adicionarProdutos(Scanner scanner) {

        Produto produto = new Produto("", "",0, 0, "");

        // Solicita os dados do produto ao usuário
        System.out.print("Digite o nome do produto: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Digite o cor do produto: ");
        produto.setCor(scanner.nextLine());

        System.out.print("Digite o preço do produto: ");
        produto.setPreco(scanner.nextDouble());

        System.out.print("Digite a quantidade do produto: ");
        produto.setQuantidade(scanner.nextInt());;

        // Consumir a linha
        scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        produto.setDescricao(scanner.nextLine());

        // Adiciona o novo objeto Produto à lista
        Produto.adicionarProduto(produto);
    }
    // Método para consultar o estoque de produtos
    public void consultarEstoque() {
        List<Produto> produtos = Produto.getProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto disponível no estoque.");
        } else {
            System.out.println("\nEstoque de produtos:");
            for (Produto produto : produtos) {
                produto.consultarInfoProduto();
                System.out.println("-------------------------");
            }
        }
    }
}
