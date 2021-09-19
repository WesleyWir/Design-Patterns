/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author wesle
 */
public class MyList {
    public EstrategiaDeOrdenacao estrategia;

    public EstrategiaDeOrdenacao getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(EstrategiaDeOrdenacao estrategia) {
        this.estrategia = estrategia;
    }
    
    public void ordenar(){
        estrategia.ordenar();
    }
}
