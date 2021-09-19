
package builder;

/**
 *
 * @author wesle
 */
public class Casa {
    public int quartos;
    public int andares;
    public boolean garagem;
    public boolean piscina;

    public Casa(int quartos, int andares, boolean garagem, boolean piscina) {
        this.quartos = quartos;
        this.andares = andares;
        this.garagem = garagem;
        this.piscina = piscina;
    }
    
    public String imprimir(){
        String info = " Quantidade de quartos: "+this.quartos;
        info += "\n Quantidade de andares: "+this.andares;
        
        if(this.garagem){
            info += "\n Tem Garagem.";
        }else{
            info += "\n Não tem Garagem.";
        }
        
        if(this.piscina){
            info += "\n Tem Piscina.";
        }else{
            info += "\n Não tem Piscina.";
        }
        
        return info;
    }
}
