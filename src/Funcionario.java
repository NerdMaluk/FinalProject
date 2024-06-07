import java.util.List;
import java.util.Scanner;

public class Funcionario {
    // Método para realizar uma venda
    public void realizarVenda(Scanner scanner) {
        List<Produto> produtos = Produto.getProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto disponível para venda.");
            return;
        }

        System.out.print("Digite o nome do produto a ser vendido: ");
        String nomeProduto = scanner.nextLine();

        Produto produtoVendido = null;

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoVendido = produto;
                break;
            }
        }

        if (produtoVendido == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Digite a quantidade a ser vendida: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha pendente

        if (quantidade > produtoVendido.getQuantidade()) {
            System.out.println("Quantidade insuficiente em estoque.");
        } else {
            produtoVendido.setQuantidade(produtoVendido.getQuantidade() - quantidade);
            System.out.println("Venda realizada com sucesso!");
        }
    }
}
