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
public class BuscaLivrosProxy {
    Map<String, String> cache = new HashMap<String, String>();
    BuscaLivrosInterface servico;
    
    public BuscaLivrosProxy(BuscaLivrosInterface servico){
        this.servico = servico;
    }
    
    public String getLivro(String id){
        if(cache.get(id) != null){
            return cache.get(id);
        }
        
        String livroName = this.servico.getLivro(id);
       
        this.cache.put(id, livroName);
        
        return this.cache.get(id);
    }
}
