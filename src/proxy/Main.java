/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author wesle
 */
public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("1", "Livro 1");
        Livro livro2 = new Livro("2", "Livro 2");
        Livro livro3 = new Livro("3", "Livro 3");
        BuscaLivros searchBooks = new BuscaLivros(livro1, livro2, livro3);
        
        BuscaLivrosProxy proxySearchBooks = new BuscaLivrosProxy(searchBooks);
        
        String searchedBook1 = proxySearchBooks.getLivro("1");
        String searchedBook2 = proxySearchBooks.getLivro("2");
        String searchedBook3 = proxySearchBooks.getLivro("2");
        
        System.out.println(searchedBook1);
        System.out.println(searchedBook2);
        System.out.println(searchedBook3);

    }
}
