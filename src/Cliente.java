import java.util.List;

public class Cliente {
        // Método para consultar os produtos na lista
        public void consultarProdutos() {
            List<Produto> produtos = Produto.getProdutos();
            if (produtos.isEmpty()) {
                System.out.println("Nenhum produto disponível.");
            } else {
                System.out.println("\nProdutos disponíveis:");
                for (Produto produto : produtos) {
                    produto.consultarInfoProduto();
                    System.out.println("-------------------------");
                }
            }
        }
}


