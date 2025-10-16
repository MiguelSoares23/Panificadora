import models.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // -----------------------------
        // Criando clientes
        // -----------------------------
        Cliente cliente1 = new Cliente(1, "João", "123456789", "111.111.111-11");
        Cliente cliente2 = new Cliente(2, "Maria", "987654321", "222.222.222-22");

        // -----------------------------
        // Criando funcionários
        // ----------------------------- 
        List<Cliente> clientesFuncionario1 = new ArrayList<>();
        clientesFuncionario1.add(cliente1);
        Funcionario funcionario1 = new Funcionario(1, "Carlos", "Atendente", 2000f, clientesFuncionario1);

        List<Cliente> clientesFuncionario2 = new ArrayList<>();
        clientesFuncionario2.add(cliente2);
        Funcionario funcionario2 = new Funcionario(2, "Ana", "Caixa", 2200f, clientesFuncionario2);

        // -----------------------------
        // Criando fornecedores
        // -----------------------------
        Fornecedor fornecedor1 = new Fornecedor(1, "Fornecedor A", "999999999", "Farinha");
        Fornecedor fornecedor2 = new Fornecedor(2, "Fornecedor B", "888888888", "Açúcar");

        // -----------------------------
        // Criando produtos
        // -----------------------------
        Produto produto1 = new Produto(1, "Pão Francês", 0.50f, 100, "Padaria");
        Produto produto2 = new Produto(2, "Bolo de Chocolate", 15f, 20, "Confeitaria");
        Produto produto3 = new Produto(3, "Pão Integral", 0.80f, 50, "Padaria");

        // -----------------------------
        // Criando padaria e adicionando funcionários e fornecedores
        // -----------------------------
        Padaria padaria = new Padaria(1, "Padaria do Miguel", "Rua Central");
        padaria.adcFuncionario(funcionario1);
        padaria.adcFuncionario(funcionario2);
        padaria.adcFornecedor(fornecedor1);
        padaria.adcFornecedor(fornecedor2);

        // -----------------------------
        //  Listando funcionários e fornecedores
        // -----------------------------
        System.out.println("=== FUNCIONÁRIOS ===");
        padaria.listarFuncionarios();
        System.out.println("\n=== FORNECEDORES ===");
        padaria.listarFornecedores();

        // -----------------------------
        // Testando estoque
        // -----------------------------
        System.out.println("\n=== ESTOQUE ANTES ===");
        System.out.println(produto1.getNome() + ": " + produto1.getQtdEstoque());
        System.out.println(produto2.getNome() + ": " + produto2.getQtdEstoque());

        produto1.retirarEstoque(20);   // venda de 20 pães
        produto2.reporEstoque(5);      // reposição de 5 bolos

        System.out.println("\n=== ESTOQUE DEPOIS ===");
        System.out.println(produto1.getNome() + ": " + produto1.getQtdEstoque());
        System.out.println(produto2.getNome() + ": " + produto2.getQtdEstoque());

        // -----------------------------
        //  Criando vendas
        // -----------------------------
        Venda venda1 = new Venda(1, LocalDate.now(), cliente1, funcionario1);
        venda1.adicionarItem(new ItemVenda(produto1, 10, produto1.getPreco()));
        venda1.adicionarItem(new ItemVenda(produto2, 1, produto2.getPreco()));

        Venda venda2 = new Venda(2, LocalDate.now(), cliente2, funcionario2);
        venda2.adicionarItem(new ItemVenda(produto3, 5, produto3.getPreco()));

        // -----------------------------
        // Exibindo dados das vendas
        // -----------------------------
        System.out.println("\n=== VENDA 1 ===");
        System.out.println("Cliente: " + venda1.getCliente().getNome());
        System.out.println("Funcionario: " + venda1.getFuncionario().getNome());
        System.out.println("Itens:");
        venda1.getItens().forEach(item ->
                System.out.println(item.getProduto().getNome() + " - qtd: " + item.getQtd() + " - subtotal: R$ " + item.getSubtotal())
        );
        System.out.println("Valor total: R$ " + venda1.getValorTotal());

        System.out.println("\n=== VENDA 2 ===");
        System.out.println("Cliente: " + venda2.getCliente().getNome());
        System.out.println("Funcionario: " + venda2.getFuncionario().getNome());
        System.out.println("Itens:");
        venda2.getItens().forEach(item ->
                System.out.println(item.getProduto().getNome() + " - qtd: " + item.getQtd() + " - subtotal: R$ " + item.getSubtotal())
        );
        System.out.println("Valor total: R$ " + venda2.getValorTotal());

        // -----------------------------
        // Testando polimorfismo
        // -----------------------------
        System.out.println("\n=== EXIBINDO DADOS DE TODOS ===");
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(cliente1);
        pessoas.add(cliente2);
        pessoas.add(funcionario1);
        pessoas.add(funcionario2);

        pessoas.forEach(p -> p.exibirDados()); // chama o exibirDados de cada classe
    }
}
