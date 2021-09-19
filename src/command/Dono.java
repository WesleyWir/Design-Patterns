
package command;

/**
 *
 * @author wesle
 */

public class Dono {
    public Cachorro cachorro;

    public Dono(Cachorro cachorro) {
        this.cachorro = cachorro;
    }
    
    public void treinar(){
        Sentar sentar = new Sentar(this.cachorro);
        Rolar rolar = new Rolar(this.cachorro);
        DarPata darPata = new DarPata(this.cachorro);
        
        sentar.executar();
        rolar.executar();
        darPata.executar();
    }
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Dono wesley = new Dono(cachorro);
        
        wesley.treinar();
    }
}
