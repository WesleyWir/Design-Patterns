
package command;

/**
 *
 * @author wesle
 */
public class Rolar extends Comando{
    
    public Rolar(Cachorro cachorro) {
        super(cachorro);
    }
    
    @Override
    public void executar(){
        this.cachorro.rolar();
    }
}
