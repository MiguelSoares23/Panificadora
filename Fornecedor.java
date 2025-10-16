package models;


public class Fornecedor{
    private int idFornecedor;
    private String nome;
    private telefone: String;
    private String produtoFornecido;


    public Fornecedor(int idFornecedor, String nome, String produtoFornecido) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.produtoFornecido = produtoFornecido;
    }



    public int getIdFornecedor() {
        return this.idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProdutoFornecido() {
        return this.produtoFornecido;
    }

    public void setProdutoFornecido(String produtoFornecido) {
        this.produtoFornecido = produtoFornecido;
    }

    public void exibirDados(){
        this.exibirDados = exibirDados;
    }
}