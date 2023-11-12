package produto;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    // Adicionando um método toString para fornecer uma representação significativa do Produto
    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
