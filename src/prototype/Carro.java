/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author wesle
 */
public class Carro extends Veiculo {
    public int numeroPortas;
    
    public Carro(){}
    
    public Carro(Carro veiculo)
    {
        super(veiculo);
        if (veiculo != null) {
            this.numeroPortas = veiculo.numeroPortas;
        }
    }
    
    @Override
    public Veiculo clone()
    {
        return new Carro(this);
    }
}
