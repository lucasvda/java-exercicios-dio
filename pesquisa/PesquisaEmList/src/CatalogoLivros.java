import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> listaLivros;

  public CatalogoLivros() {
    this.listaLivros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    listaLivros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> listaLivroPorAutor = new ArrayList<>();
    if (!listaLivros.isEmpty()) {      
      for (Livro l : listaLivros) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          listaLivroPorAutor.add(l);  
        }      
      }      
    }
    return listaLivroPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> listaLivroPorAnoDePublicacao = new ArrayList<>();
    if (!listaLivros.isEmpty()) {
      for (Livro l : listaLivros) {
        if (anoInicial <= anoFinal && l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
          listaLivroPorAnoDePublicacao.add(l);
        }      
      }      
    }
    return listaLivroPorAnoDePublicacao;


  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro novoLivro = null;
    if (!listaLivros.isEmpty()) {
      for (Livro l : listaLivros) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          novoLivro = l;
          break;        
        }      
      }
    }
    return novoLivro;
  }

  public static void main(String[] args) {

    CatalogoLivros catalogoLivros = new CatalogoLivros();
    
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    //System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    //System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2001, 2023));

    System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));
  }

}
