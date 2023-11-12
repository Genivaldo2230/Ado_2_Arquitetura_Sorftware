package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeFacade implements Component {

    // Lista para armazenar os componentes (pode ser Leaf ou outro CompositeFacade)
    private List<Component> components = new ArrayList<>();

    // Nome identificador do CompositeFacade
    private String nome;

    // Construtor que recebe o nome do CompositeFacade
    public CompositeFacade(String nome) {
        this.nome = nome;
    }

    // Método para adicionar um componente à lista
    public void adicionarComponent(Component component) {
        components.add(component);
    }

    // Método para remover um componente da lista
    public void removerComponent(Component component) {
        components.remove(component);
    }

    // Método para calcular o preço total dos componentes na lista
    public double calcularPreco() {
        double totalPreco = 0;
        for (Component component : components) {
            totalPreco += component.getPreco();
        }
        return totalPreco;
    }

    // Método para imprimir a estrutura do CompositeFacade e seus componentes
    public String imprimirEstrutura() {
        StringBuilder estrutura = new StringBuilder(nome + ":\n");
        for (Component component : components) {
            // Adiciona espaços para melhor formatação e anexa a representação de cada componente
            estrutura.append("  ").append(component.toString()).append("\n");
        }
        return estrutura.toString();
    }

    // Sobrescreve o método toString para retornar apenas o nome do CompositeFacade
    @Override
    public String toString() {
        return nome; // Modificado para retornar apenas o nome, não o endereço de memória.
    }

    // Implementação do método da interface Component para obter o preço total
    @Override
    public double getPreco() {
        return calcularPreco();
    }
}
