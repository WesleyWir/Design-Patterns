/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wesle
 */
public class BuscaLivros implements BuscaLivrosInterface {
    Map<String, String> livros = new HashMap<String, String>();
    
    BuscaLivros(Livro livro1, Livro livro2, Livro livro3){
        livros.put(livro1.id, livro1.name);
        livros.put(livro2.id, livro2.name);
        livros.put(livro3.id, livro3.name);
    }
    
    public String getLivro(String id){
        return livros.get(id);
    }
}
