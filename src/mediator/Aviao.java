
package mediator;

import java.util.Random;

/**
 *
 * @author wesle
 */
public class Aviao implements Aeronave {
    public Mediator mediator;
    public boolean pousando;

    public void setPousando(boolean pousando) {
        this.pousando = pousando;
    }
    
    public boolean getPousando()
    {
        return this.pousando;
    }
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void pousar() {
        if(this.mediator.solicitarPouso()){
            this.setPousando(true);
            System.out.println("Pousando...");
            return;
        };
        this.setPousando(false);
        System.out.println("Pista ocupada");
    }

    @Override
    public boolean isPousando() {
        if(this.getPousando()){
            int num = new Random().nextInt(100);
            
            if(num > 70){
                this.setPousando(false);
            }
        }
        return this.getPousando();
    }
}
