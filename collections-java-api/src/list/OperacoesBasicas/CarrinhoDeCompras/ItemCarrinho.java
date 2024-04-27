package list.OperacoesBasicas.CarrinhoDeCompras;

public class ItemCarrinho {
    private String nomeItem;
    private Double preco;
    private int quantidade;
    private double valorTotalItem;

    public ItemCarrinho(String nomeItem, Double preco, int quantidade) {
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.quantidade = quantidade;
        calculaValorTotal();
    }

    public double getPreco() {
        return preco;
    }

    public String getItem() {
        return nomeItem;
    }

    private  double calculaValorTotal() {
        if (quantidade == 1 ) {
            valorTotalItem = preco;
            return valorTotalItem;
        } else if (quantidade <= 0) {
            valorTotalItem = 0.0;
            return valorTotalItem;
        }
        valorTotalItem = preco*quantidade;
        return valorTotalItem;   
    }

    public double getValorTotalItem() {
        return valorTotalItem;
    }

    @Override
    public String toString() {

        return "\nItem :"+nomeItem+"\nPreco: "+preco+"\nQuantidade: "+quantidade;
    }

}
