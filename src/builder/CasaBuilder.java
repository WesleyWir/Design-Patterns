
package builder;

/**
 *
 * @author wesle
 */
public class CasaBuilder implements Builder{
    public int quartos;
    public int andares;
    public boolean garagem;
    public boolean piscina;

    @Override
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    @Override
    public void setAndares(int andares) {
        this.andares = andares;
    }

    @Override
    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }

    @Override
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    
    public Casa getResultado(){
        return new Casa(this.quartos, this.andares, this.garagem, this.piscina);
    }
}
