import pedido.Pedido;
import produto.ItemPedido;
import produto.Produtos;

public class Main {
    public static void main(String[] args) {


        // Criando alguns produtos de exemplo
        Produtos produtos1 = new Produtos("Samsung S23", 1200.00);
        Produtos produtos2 = new Produtos("Motorola G80", 1700.00);
        Produtos produtos3 = new Produtos("Motorola One Visio", 1500.00);

        // Criando itens para o pedido
        ItemPedido item1 = new ItemPedido(2, produtos1);
        ItemPedido item2 = new ItemPedido(10, produtos2);
        ItemPedido item3 = new ItemPedido(10, produtos2);

        // Criando o pedido
        Pedido pedido = new Pedido();

        // Adicionando itens ao pedido
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        // Calculando e imprimindo o valor total
        double total = pedido.calcularTotal();
        System.out.println("Valor Total do Pedido: R$" + total);

        // Gerando e imprimindo o cupom fiscal
        pedido.cupomFiscal();
    }
}