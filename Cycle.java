/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class creates, if no parameters are mentioned a default of 100 for wheels
 * and default of 1000 for weight. Uses 2 parameters given by user.
 * @author Xuaco
 */
public class Cycle {
    private int numberOfWheels;
    private int weight;
    
    Cycle(int numberOfWheels, int weight){
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }
    public Cycle(){
        this(100, 1000);
    }
/*   int getNumberOfWheels(){
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
    */
    public String toString(){
        return this.numberOfWheels + " wheels and weighs " + this.weight + ".";
    }
    
            
    
}
