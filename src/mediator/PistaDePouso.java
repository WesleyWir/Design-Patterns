
package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wesle
 */
public class PistaDePouso implements Mediator {
    List<Aeronave> aeronaves = new ArrayList<Aeronave>();

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    @Override
    public void adicionarAeronave(Aeronave aeronave) {
        aeronave.setMediator(this);
        aeronaves.add(aeronave);
    }

    @Override
    public boolean solicitarPouso() {
        for(Aeronave aeronave : this.getAeronaves()){
            if(aeronave.isPousando()){
                return false;
            };
        }
        
        return true;
    }
    
}
