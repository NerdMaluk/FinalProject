import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    // Atributos da classe Produto
    private String nome;
    private String cor;
    private double preco;
    private int quantidade;
    private String descricao;

    private static List<Produto> produtos = new ArrayList<>();

    // Construtor da classe Produto
    public Produto(String nome, String cor, double preco, int quantidade, String descricao) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    // Método para exibir informações sobre o produto
    public void consultarInfoProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Descrição: " + descricao);
    }



    // Método para obter a lista de produtos
    public static List<Produto> getProdutos() {
        return produtos;
    }
    // Método para adicionar um produto à lista
    public static void adicionarProduto(Produto produto) {

        produtos.add(produto);
    }
}
