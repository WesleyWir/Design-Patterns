
package mediator;

/**
 *
 * @author wesle
 */
public class Main {
    public static void main(String[] args) {
        Helicoptero helicoptero1 = new Helicoptero();
        Helicoptero helicoptero2 = new Helicoptero();
        Aviao aviao1 = new Aviao();
        Aviao aviao2 = new Aviao();
        
        PistaDePouso pista = new PistaDePouso();
        
        pista.adicionarAeronave(helicoptero1);
        pista.adicionarAeronave(helicoptero2);
        pista.adicionarAeronave(aviao1);
        pista.adicionarAeronave(aviao2);
        
        System.out.println("// == Helicóptero 1 ====");
        for (int i = 0; i < 3; i++) {
            helicoptero1.pousar();
        }
        
        System.out.println("// == Helicóptero 2 ====");
        for (int i = 0; i < 3; i++) {
            helicoptero2.pousar();
        }
        
        System.out.println("// == Avião 1 ====");
        for (int i = 0; i < 3; i++) {
            aviao1.pousar();
        }
        
        System.out.println("// == Avião 2 ====");
        for (int i = 0; i < 3; i++) {
            aviao2.pousar();
        }
    }
}
