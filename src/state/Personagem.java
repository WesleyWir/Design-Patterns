
package state;

/**
 *
 * @author wesle
 */
public class Personagem {
    public Estado estado;

    public Personagem() {
        this.estado = new ParadoState(this);
    }
    
    public void trocarEstado(Estado estado){
        this.estado = estado;
    }
}
