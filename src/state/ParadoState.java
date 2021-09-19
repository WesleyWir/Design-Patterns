
package state;

/**
 *
 * @author wesle
 */
public class ParadoState extends Estado{
    
    public ParadoState(Personagem personagem) {
        super(personagem);
    }
    
    @Override
    public void correr(){
        this.personagem.estado = new CorrendoState(this.personagem);
    }

    @Override
    public String toString(){
        return "Parado...";
    }

    @Override
    public void parar() {
    }
}
