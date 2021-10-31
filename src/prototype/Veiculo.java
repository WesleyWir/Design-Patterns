
package prototype;

/**
 *
 * @author wesle
 */
abstract class Veiculo {
    public int cilindradas;
    public String cor;
    
    public Veiculo(){};
    
    public Veiculo(Veiculo veiculo)
    {
        this.cilindradas = veiculo.cilindradas;
        this.cor = veiculo.cor;
    }
    
    public abstract Veiculo clone();
}
