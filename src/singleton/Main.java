
package singleton;

/**
 *
 * @author wesle
 */
public class Main {
    
    public static void main(String[] args) {
        Logger logg = Logger.getInstance();
        Logger secondLogg = Logger.getInstance();
        
        logg.printar("Executando f");
        logg.printar("Executando g");
        logg.printar("Executando h");
        
        secondLogg.printar("Executando f");
        secondLogg.printar("Executando g");
        secondLogg.printar("Executando h");
    }
    
}
