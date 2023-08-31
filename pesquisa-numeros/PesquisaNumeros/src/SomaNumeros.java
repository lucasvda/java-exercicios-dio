import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Number> listaNumeros;

  public SomaNumeros() {
    this.listaNumeros = new ArrayList<Number>();
  }

  public void adicionarNumero(int numero) {
    listaNumeros.add(numero);
  }
  public int calcularSoma() {
    int soma = 0;
    if (!listaNumeros.isEmpty()) {
      for (Number number : listaNumeros) {
        soma += number.intValue();
      }
    }
    return soma;
  }
  public int encontrarMaiorNumero() {
    int numeroMaior = listaNumeros.get(0).intValue();
    if (!listaNumeros.isEmpty()) {
      for (Number number : listaNumeros) {
        if (numeroMaior <= number.intValue()) {
          numeroMaior = number.intValue();
        }
      }      
    }
    return numeroMaior;
  }
public int encontrarMenorNumero() {
    int numeroMenor = listaNumeros.get(0).intValue();
    if (!listaNumeros.isEmpty()) {
      for (Number number : listaNumeros) {
        if (numeroMenor >= number.intValue()) {
          numeroMenor = number.intValue();
        }
      }      
    }
    return numeroMenor;
  }
  public void exibirNumeros() {
    System.out.println(listaNumeros);
  }

  public static void main(String[] args) {

    SomaNumeros novaListaDeNumeros = new SomaNumeros();

    novaListaDeNumeros.adicionarNumero(5);
    novaListaDeNumeros.adicionarNumero(0);
    novaListaDeNumeros.adicionarNumero(0);
    novaListaDeNumeros.adicionarNumero(-2);
    novaListaDeNumeros.adicionarNumero(10);

    System.out.println("A soma dos números é: " + novaListaDeNumeros.calcularSoma());

    System.out.println("O Maior númeoro é: " + novaListaDeNumeros.encontrarMaiorNumero());

    System.out.println("O menor número é: " + novaListaDeNumeros.encontrarMenorNumero());

    novaListaDeNumeros.exibirNumeros();

  }
}