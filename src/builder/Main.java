/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author wesle
 */
public class Main {
    public static void main(String[] args) {
        CasaBuilder casaBuilder = new CasaBuilder();
        Diretor diretor = new Diretor();
        
        Casa casaPequena = diretor.casaPequena(casaBuilder);
        Casa casaMedia = diretor.casaMedia(casaBuilder);
        Casa casaGrande = diretor.casaGrande(casaBuilder);
        
        System.out.println("Casa construída ================");
        System.out.println(casaPequena.imprimir());
        System.out.println("================================\n");
        
        System.out.println("Casa construída ================");
        System.out.println(casaMedia.imprimir());
        System.out.println("================================\n");
        
        System.out.println("Casa construída ================");
        System.out.println(casaGrande.imprimir());
        System.out.println("================================");
    }
}
