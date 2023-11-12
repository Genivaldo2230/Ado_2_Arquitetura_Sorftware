package cliente;

import composite.Component;
import composite.CompositeFacade;
import composite.Leaf;

public class UsarCesta {
    public static void main(String[] args) {
        // Cria uma instância da CompositeFacade para representar a "Cesta"
        CompositeFacade cestaFacade = new CompositeFacade("Cesta");

        // Adiciona produtos individuais à cesta
        Component produto1 = new Leaf(12.56, "Café");
        Component produto2 = new Leaf(10.26, "Leite");
        Component produto3 = new Leaf(6.12, "Pão de Queijo");

        cestaFacade.adicionarComponent(produto1);
        cestaFacade.adicionarComponent(produto2);
        cestaFacade.adicionarComponent(produto3);

        // Cria uma instância da CompositeFacade para representar a "Caixa"
        CompositeFacade caixaFacade = new CompositeFacade("Caixa");

        // Adiciona produtos individuais à caixa
        Component produto4 = new Leaf(8.23, "Bombom Cereja");
        Component produto5 = new Leaf(9.78, "Bombom Licor");

        caixaFacade.adicionarComponent(produto4);
        caixaFacade.adicionarComponent(produto5);

        // Adiciona a "Caixa" à "Cesta"
        cestaFacade.adicionarComponent(caixaFacade);

        // Exibe a estrutura da "Cesta"
        System.out.println("Estrutura da Cesta:");
        System.out.println(cestaFacade.imprimirEstrutura());

        // Exibe o preço total da "Cesta"
        System.out.println("Total: " + cestaFacade.calcularPreco());
    }
}
