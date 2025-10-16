package models;


import java.util.ArrayList;
import java.util.List;

public class Padaria{
    private int idPadaria;
    private String nome;
    private String endereco;
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();


    public Padaria(int idPadaria, String nome, String endereco) {
        this.idPadaria = idPadaria;
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Funcionario> getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public List<Fornecedor> getFornecedores() {
        return this.fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public void adcFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void adcFornecedor(Fornecedor f) {
        fornecedores.add(f);
    }

    public void listarFuncionarios() {
    funcionarios.forEach(Funcionario::exibirDados);
}


    public void listarFornecedores() {
    fornecedores.forEach(Fornecedor::exibirDados);
}

}