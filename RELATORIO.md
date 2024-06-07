### Relatório do Projeto
Criaremos um arquivo `RELATORIO.md` para descrever o relatório do projeto.


# Relatório do Projeto
## Introdução
O objetivo deste projeto é desenvolver um sistema simples de gestão de produtos que permite a diferentes tipos de usuários (administrador, funcionário e cliente) realizar operações específicas relacionadas aos produtos.

## Estrutura do Projeto
### Classes
1. **Produto**:
    - **Atributos**: nome, cor, preço, quantidade, descrição.
    - **Métodos**: getters e setters, exibir informações, adicionar produto à lista, obter lista de produtos.

2. **Administrador**:
    - **Métodos**: adicionar produtos ao estoque, consultar estoque.

3. **Funcionario**:
    - **Métodos**: realizar vendas de produtos.

4. **Cliente**:
    - **Métodos**: consultar produtos disponíveis.

5. **Loja**:
    - **Métodos**: contém o método `main` e gerencia o menu de interação.

## Funcionalidades Implementadas
### Adicionar Produtos
O administrador pode adicionar novos produtos ao estoque. Para cada produto, são coletadas informações como nome, preço, quantidade e descrição.

### Consultar Estoque
O administrador pode consultar o estoque para ver todos os produtos disponíveis, juntamente com suas informações detalhadas.

### Realizar Vendas
O funcionário pode realizar vendas de produtos, especificando o nome do produto e a quantidade a ser vendida. O sistema verifica a disponibilidade e atualiza o estoque.

### Consultar Produtos
Os clientes podem consultar a lista de produtos disponíveis no estoque, visualizando as informações detalhadas de cada produto.

## Execução do Projeto
### Compilação
Para compilar o projeto, execute o seguinte comando:
javac Produto.java Administrador.java Funcionario.java Cliente.java Loja.java

Execução
Para executar o projeto, utilize o comando:
java Loja

Conclusão
Este sistema oferece uma solução simples para a gestão de produtos, permitindo que diferentes tipos de usuários realizem operações específicas. O projeto pode ser expandido com novas funcionalidades, como autenticação de usuários, relatórios detalhados de vendas, entre outros.

Melhorias Futuras
Implementar autenticação para diferentes tipos de usuários.
Adicionar relatórios de vendas e histórico de transações.
Melhorar a interface do usuário para torná-la mais intuitiva.



### Estrutura do Projeto

Estrutura do projeto com os arquivos necessários:

projeto/
├── Produto.java
├── Administrador.java
├── Funcionario.java
├── Cliente.java
├── Loja.java
├── README.md
└── RELATORIO.md