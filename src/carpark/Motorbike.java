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
public class Motorbike {
    Scanner input = new Scanner(System.in);
    String engineSize;
    
    public Motorbike() {
        engineSize = " ";
    }
    
    public void setSize() {
        
        System.out.println("Enter engine size:");
        engineSize = input.next();
        System.out.println("Engine size is: " + engineSize);
        
    }
    
    public void deleteMotorbike() {
        engineSize = " ";
    }
    
    public String getName() {
        return engineSize;
    }
}
