/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author darth
 */
public class Car {
    Scanner input = new Scanner(System.in);
    double numberOfDoors;
    String colour;
    
    public Car () {
        numberOfDoors = 0;
        colour = " ";
    }
    
    public void setCar() {
        
        System.out.println("Enter car doors:");
        numberOfDoors = input.nextInt();
        System.out.println("Number of doors is " + numberOfDoors);
        System.out.println("Enter car colour:");
        colour = input.next();
        System.out.println("Car colour is " + colour);
        
    }
    
    public void deleteCar() {
        numberOfDoors = 0;
        colour = " ";
    }
    
    public double getDoors() {
        return numberOfDoors;
    }
    
    public String getColour() {
        return colour;
    }
}
