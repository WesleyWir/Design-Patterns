
package builder;

/**
 *
 * @author wesle
 */
public class Diretor {
    public Casa casaPequena(CasaBuilder casaBuilder){
        casaBuilder.setQuartos(2);
        casaBuilder.setAndares(1);
        casaBuilder.setGaragem(false);
        casaBuilder.setPiscina(false);
        return casaBuilder.getResultado();
    }
    
    public Casa casaMedia(CasaBuilder casaBuilder){
        casaBuilder.setQuartos(3);
        casaBuilder.setAndares(2);
        casaBuilder.setGaragem(true);
        casaBuilder.setPiscina(false);
        return casaBuilder.getResultado();
    }
    
    public Casa casaGrande(CasaBuilder casaBuilder){
        casaBuilder.setQuartos(5);
        casaBuilder.setAndares(3);
        casaBuilder.setGaragem(true);
        casaBuilder.setPiscina(true);
        return casaBuilder.getResultado();
    }
}
