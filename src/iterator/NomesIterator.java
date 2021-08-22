
package iterator;

/**
 *
 * @author wesle
 */
public class NomesIterator implements Iterator {
    private int posicaoAtual;
    public String[] nomes;

    public NomesIterator(String[] nomes) {
        this.nomes = nomes;
        this.posicaoAtual = 0;
    }

    public int getPosicaoAtual() {
        return posicaoAtual;
    }

    public void setPosicaoAtual(int posicaoAtual) {
        this.posicaoAtual = posicaoAtual;
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }
    
    
    
    @Override
    public boolean hasNext() {
        return (this.getPosicaoAtual() < this.nomes.length);
    }

    @Override
    public String getNext() {
        String name = this.nomes[this.getPosicaoAtual()];
        
        this.posicaoAtual++;
        
        return name;
    }
    
}
