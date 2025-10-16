package models;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int idVenda;
    private LocalDate data;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<ItemVenda> itens = new ArrayList<>();
    private float valorTotal;

    public Venda(int idVenda, LocalDate data, Cliente cliente, Funcionario funcionario) {
        this.idVenda = idVenda;
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
        calcularTotal(); // recalcula o total se a lista for substituída
    }

    public float getValorTotal() {
        return valorTotal;
    }

    //calculado automaticamente
    public void calcularTotal() {
    valorTotal = 0;
    itens.forEach(item -> valorTotal += item.getSubtotal());
}

    //auxilia para adicionar item
    public void adicionarItem(ItemVenda item) {
        itens.add(item);
        calcularTotal();
    }
}