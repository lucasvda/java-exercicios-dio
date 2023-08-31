import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  List<Pessoa> listaPessoas;

  public OrdenacaoPessoas() {
    this.listaPessoas = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    listaPessoas.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> listaPessoaPorIdade = listaPessoas;
    if (!listaPessoas.isEmpty()) {
      Collections.sort(listaPessoaPorIdade);
    }
    return listaPessoaPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> listaPessoaPorAltura= listaPessoas;
    if (!listaPessoaPorAltura.isEmpty()) {
      Collections.sort(listaPessoaPorAltura, new ComparatorPorAltura());
    }
    return listaPessoaPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoas novaListaPessoas = new OrdenacaoPessoas();

    novaListaPessoas.adicionarPessoa("Alice", 20, 1.56);
    novaListaPessoas.adicionarPessoa("Bob", 30, 1.80);
    novaListaPessoas.adicionarPessoa("Charlie", 25, 1.70);
    novaListaPessoas.adicionarPessoa("David", 17, 1.56);

    System.out.println(novaListaPessoas.ordenarPorIdade());

    System.out.println(novaListaPessoas.ordenarPorAltura());


  }

}
