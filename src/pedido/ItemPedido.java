package produto;

public class ItemPedido {

    private int quantidade;
    private double valor;
    private Produtos produtos;


    public ItemPedido() {
    }

    public ItemPedido(int quantidade, Produtos produtos) {
        this.quantidade = quantidade;
        this.produtos = produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    // Na classe ItemPedido
    public double getValor() {
        return this.quantidade * this.produtos.getPreco();
    }

    // Na classe Produto
    public double getPreco() {
        return valor;
    }


    @Override
    public String toString() {
        return "ItemPedido{" +
                "quantidade=" + quantidade +
                ", produtos=" + produtos +
                '}';
    }


}
