
package state;

/**
 *
 * @author wesle
 */
public class CorrendoState extends Estado{
    public CorrendoState(Personagem personagem) {
        super(personagem);
    }
    
    @Override
    public void pular(){
        this.personagem.estado = new PulandoState(this.personagem);
    }
    
    @Override
    public void parar(){
        this.personagem.estado = new ParadoState(this.personagem);
    }
    
    @Override
    public String toString(){
        return "Correndo...";
    }
}
