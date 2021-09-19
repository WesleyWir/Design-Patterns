
package command;

/**
 *
 * @author wesle
 */
public abstract class Comando {
    public Cachorro cachorro;

    public Comando(Cachorro cachorro) {
        this.cachorro = cachorro;
    }
    
    public void executar(){
        
    }
}
