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
public class Caminhao extends Veiculo {
    public int numeroEixos;
    
    public Caminhao(){}
    
    public Caminhao(Caminhao veiculo)
    {
        super(veiculo);
        
        if(veiculo != null){
            this.numeroEixos = veiculo.numeroEixos;
        }
    }
    
    @Override
    public Veiculo clone()
    {
        return new Caminhao(this);
    }
}
