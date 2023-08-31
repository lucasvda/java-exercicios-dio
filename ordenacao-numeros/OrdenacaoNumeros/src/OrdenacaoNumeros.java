import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
  List<Integer> listaNumeros;

  public OrdenacaoNumeros() {
    this.listaNumeros = new ArrayList<>();
  }
  @Override
  public int compareTo(Integer n) {
    return Integer.compare(listaNumeros.get(0), n);
  }

  public void adicionarNumero(int numero) {
    listaNumeros.add(numero);
  }
  
  public List<Integer> ordenarAscendente() {
    List<Integer> ordemCrescente = listaNumeros;
    if (!ordemCrescente.isEmpty()) {
      Collections.sort(ordemCrescente);
    
    }
    return ordemCrescente;
  }

  public List<Integer> ordenarDescendente() {
    List<Integer> ordemDecrescente = listaNumeros;
    if (!ordemDecrescente.isEmpty()) {
      Collections.reverse(ordemDecrescente);
    
    }
    return ordemDecrescente;
  }
public static void main(String[] args) {
  
  OrdenacaoNumeros novaOrdenacaoNumeros = new OrdenacaoNumeros();

  novaOrdenacaoNumeros.adicionarNumero(10);
  novaOrdenacaoNumeros.adicionarNumero(2);
  novaOrdenacaoNumeros.adicionarNumero(768);
  novaOrdenacaoNumeros.adicionarNumero(564);
  novaOrdenacaoNumeros.adicionarNumero(128);
  novaOrdenacaoNumeros.adicionarNumero(189);
  novaOrdenacaoNumeros.adicionarNumero(23);
  novaOrdenacaoNumeros.adicionarNumero(9784);
  novaOrdenacaoNumeros.adicionarNumero(67834);
  novaOrdenacaoNumeros.adicionarNumero(5);

  System.out.println(novaOrdenacaoNumeros.ordenarAscendente());

  System.out.println(novaOrdenacaoNumeros.ordenarDescendente());

}

}

