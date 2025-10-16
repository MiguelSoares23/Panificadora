package models;


public class ItemVenda{
    private Produto produto;
    private int qtd;
    private float precoUnidade; 
    private float subtotal;


    public ItemVenda(Produto produto, int qtd, float precoUnidade) {
        this.produto = produto;
        this.qtd = qtd;
        this.precoUnidade = precoUnidade;
        calcularSubtotal();
    }


    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPrecoUnidade() {
        return this.precoUnidade;
    }

    public void setPrecoUnidade(float precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public float getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    //só do itemvenda
    public void calcularSubtotal() {
    this.subtotal = this.qtd * this.precoUnidade;
}

}