
package state;

/**
 *
 * @author wesle
 */
public class PulandoState extends Estado{
    public PulandoState(Personagem personagem) {
        super(personagem);
    }
    
    @Override
    public void parar(){
        this.personagem.estado = new CorrendoState(this.personagem);
    }
    
    @Override
    public void correr(){
        this.personagem.estado = new CorrendoState(this.personagem);
    }
    
    @Override
    public String toString(){
        return "Pulando...";
    }
}
