/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Unit 3 Problem 3. This program creates a Cycle with a certain number of
 * wheels and certain weight provided by initial inputs. Has default class
 * constructor that creates 100 wheels and 1000 weight. Outputs properties of 
 * Each Cycle created.
 * @author Xuaco
 */
public class MainCycle {
        public static void main(String[] args){
           Cycle cycle1 = new Cycle(39, 420);
           
           System.out.println("Cycle 1 has " + cycle1.toString());
           Cycle cycle2 = new Cycle(12, 100);
           Cycle cycle3 = new Cycle();
           System.out.println("Cycle 2 has " + cycle1.toString());
           
           System.out.println("Cycle 3 has " + cycle3.toString());
        }
    
}
