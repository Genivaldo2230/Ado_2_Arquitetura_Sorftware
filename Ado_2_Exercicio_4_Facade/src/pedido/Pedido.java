package pedido;



import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<ItemPedido> lista;
    private double valorTotal;

    public Pedido() {
        this.valorTotal = 0.0;
        this.lista = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        this.lista.add(item);
    }

    public double calcularTotal() {
        this.valorTotal = 0.0;
        for (ItemPedido item : lista) {
            this.valorTotal += item.getValor(); // Assuming ItemPedido has a method getValor() to retrieve the item's value
        }
        return this.valorTotal;
    }

    public void cupomFiscal() {
        // Implementation for generating and printing the fiscal receipt
        System.out.println("Cupom Fiscal:");
        for (ItemPedido item : lista) {
            System.out.println(item.toString()); // Assuming ItemPedido has a meaningful toString() method
        }
        System.out.println("Total: " + this.valorTotal);
    }


}
