package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    List<ItemCarrinho> itemList;

    double valorTotal = 0.0;


    public CarrinhoCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        itemList.add(new ItemCarrinho(nome, preco, quantidade));

    }

    public void removerItem(String nome) {
        List<ItemCarrinho> itemsParaRemover = new ArrayList<>();
        for(ItemCarrinho i: itemList) {
            if (i.getItem().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public void calcularValorTotal() {
        
        for(ItemCarrinho i : itemList) {
            valorTotal = valorTotal + i.getValorTotalItem();
        }
    }
    public void imprimeValorTotalCarrinho() {
        System.out.println(valorTotal);
    }

    public void exibirItems() {
        System.out.println(itemList);
    }



    public static void main(String[] args) {
        CarrinhoCompra listaItems = new CarrinhoCompra();

        listaItems.adicionarItem("Placa de Vídeo GTX1080", 2500.0, 2);
        listaItems.adicionarItem("Placa de Vídeo GTX1080", 3000.0, 2);
        listaItems.adicionarItem("Cadeira Gamer [PICHAU]", 1000.0, 1);
        listaItems.adicionarItem("Escrivaninha de Escritorio", 450.0, 1);
        listaItems.exibirItems();
        listaItems.calcularValorTotal();
        System.out.println("\n \n");
        listaItems.imprimeValorTotalCarrinho();

        listaItems.removerItem("Placa de Vídeo GTX1080");

        listaItems.exibirItems();

    }
}
