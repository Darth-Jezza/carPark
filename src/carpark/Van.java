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
public class Van {
    Scanner input = new Scanner(System.in);
    double cargoVolume;
    
    public Van() {
        cargoVolume = 0;
    }
    
    public void setVolume() {
        
        System.out.println("Enter cargo volume:");
        cargoVolume = input.nextInt();
        System.out.println("Cargo volume is: " + cargoVolume);
        
    }
    
    public void deleteVan() {
        cargoVolume = 0;
    }
    
    public double getName() {
        return cargoVolume;
    }
}
