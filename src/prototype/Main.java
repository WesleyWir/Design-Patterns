/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wesle
 */
public class Main {
    
    public static void main(String[] args) {
        List<Veiculo> vehicles = new ArrayList<Veiculo>();
        
        Carro carro1 = new Carro();
        carro1.cor = "preto";
        carro1.cilindradas = 255;
        carro1.numeroPortas = 4;
        
        Caminhao caminhao1 = new Caminhao();
        caminhao1.cor = "branco";
        caminhao1.cilindradas = 100;
        caminhao1.numeroEixos = 8;
        
        vehicles.add(carro1);
        vehicles.add(caminhao1);
        
        List<Veiculo> vehiclesCopy = new ArrayList<Veiculo>();

        for(Veiculo vehicle : vehicles){
            vehiclesCopy.add(vehicle.clone());
        }         
        
        for(Veiculo vehicle : vehiclesCopy){
            System.out.println("Cor: "+vehicle.cor+"\nCilindradas: "+vehicle.cilindradas+"\n");
        }
    }
}
