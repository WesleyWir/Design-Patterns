
package state;

/**
 *
 * @author wesle
 */
public class Main {
    public static void main(String[] args) {
        Personagem person = new Personagem();
        ParadoState parar = new ParadoState(person);
        CorrendoState correr = new CorrendoState(person);
        PulandoState pular = new PulandoState(person);
        
        Estado[] arrEstados = {pular, correr, parar, correr, pular, correr, pular, parar, parar};
        
        for(Estado state : arrEstados){
            person.trocarEstado(state);
            System.out.println(person.estado.toString());
        }
    }
}
