
package iterator;

/**
 *
 * @author wesle
 */
public class Main {
    
    public static void main(String[] args) {
        String nomesArr[] = {"Wesley", "Matheus", "Zé", "Marcelo", "Cláudio"};
        
        NomesIterator nomes = new NomesIterator(nomesArr);
        
        for (int i = 0; i < 10; i++) {
            if(nomes.hasNext()){
                System.out.println(nomes.getNext());
            }else{
                System.out.println("Não há mais nomes dísponiveis.");
            }
        }
    }
}
