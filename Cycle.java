/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xuaco
 */
public class Cycle {
    private int numberOfWheels;
    private int weight;
    
    public Cycle(){
        
        
    }
    
    Cycle(int numberOfWheels, int weight){
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }
    int getNumberOfWheels(){
        return numberOfWheels;
    }
    int getWeight(){
        return weight;
    }
    public void setNumberOfWheels(int numberOfWheels){
     this.numberOfWheels = numberOfWheels;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    String toString(){
        System.out.println(numberOfWheels.toString());
    }
    
            
    
}
