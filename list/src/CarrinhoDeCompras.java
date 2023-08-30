import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> listaItem;
  private Item item;
  
  public CarrinhoDeCompras() {
    this.listaItem = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    item = new Item(nome, preco, quantidade);
    listaItem.add(item);
  }

  public void removerItem(String nome) {
    List<Item> listaItensParaRemover = new ArrayList<>();
    for (Item item : listaItem) {
      if (item.getNome() == nome) {
        listaItensParaRemover.add(item);
      }
    }
    listaItem.removeAll(listaItensParaRemover);
  }
 public double calcularValorTotal() {
  double valorCarrinho = 0;
  for (Item item : listaItem) {
    valorCarrinho += item.getQuantidade() * item.getPreco();      
    }
    return valorCarrinho;
  }

  public void exibirItens() {
    System.out.println(listaItem);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();
    
    novoCarrinho.adicionarItem("Camiseta", 59.99, 4);
    novoCarrinho.adicionarItem("Bermuda", 89.99, 5);
    novoCarrinho.adicionarItem("Boné", 29.99, 7);
    novoCarrinho.adicionarItem("Camiseta", 59.99, 4);
    novoCarrinho.adicionarItem("Tênis", 259.99, 1);
    novoCarrinho.adicionarItem("Camiseta", 59.99, 4);
    novoCarrinho.adicionarItem("Camiseta", 59.99, 4);
    novoCarrinho.adicionarItem("Blusa de Moletom", 159.99, 2);
    novoCarrinho.adicionarItem("Regata", 39.99, 2);
    novoCarrinho.adicionarItem("Regata", 39.99, 2);
    novoCarrinho.adicionarItem("Regata", 39.99, 2);

    System.out.println("Valor Total do Carrinho: " + novoCarrinho.calcularValorTotal());
    

    novoCarrinho.exibirItens();
  }

 
}
