
package command;

/**
 *
 * @author wesle
 */
public class DarPata extends Comando{
    public DarPata(Cachorro cachorro) {
        super(cachorro);
    }
    
    @Override
    public void executar(){
        this.cachorro.darPata();
    }
}
