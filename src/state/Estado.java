/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author wesle
 */
public abstract class Estado {
    public Personagem personagem;

    public Estado(Personagem personagem) {
        this.personagem = personagem;
    }
    
    public void parar(){};
    public void correr(){};
    public void pular(){};
}
