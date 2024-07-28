package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double totalCarrinho = 0;
        double totalItem = 0;
        for (Item i: carrinho){
            totalItem = i.getQuantidade() * i.getPreco();
            totalCarrinho =+ totalItem ;
        }
        return totalCarrinho;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

}
