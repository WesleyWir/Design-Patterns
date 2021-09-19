
package command;

/**
 *
 * @author wesle
 */
public class Sentar extends Comando{
    
    public Sentar(Cachorro cachorro) {
        super(cachorro);
    }
    
    @Override
    public void executar(){
        this.cachorro.sentar();
    }
}
