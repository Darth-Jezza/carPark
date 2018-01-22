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
public class Vehicle {
    Scanner input = new Scanner(System.in);
    String licencePlate;
    String brand;
    int entryDateTime;
    int entryYear;
    int entryMonth;
    int entryDay;
    int entryHour;
    int entryMinute;
    int entryDateTimeCompare;
    int entryYearCompare;
    int entryMonthCompare;
    int entryDayCompare;
    int entryHourCompare;
    int entryMinuteCompare;
    double cost;
    double costTime;
    String vehicleType = "empty";
    Car[] myCar = new Car[20];
    Van[] myVan = new Van[20];
    Motorbike[] myMotorbike = new Motorbike[20];
    int i;
    String plate;
    int empty;
        
    public Vehicle() {
        vehicleType = "empty";
        brand = "B";
        licencePlate = "P";
        entryDateTime = 0;
        i = 20;
        empty = 1;
        for (int x = 0; x < 20; x++ ) {
            myCar[x] = new Car();
            myVan[x] = new Van();
            myMotorbike[x] = new Motorbike();
        }
    }
    public void setVehicle() {

        System.out.println("Enter vehicle type:");
        vehicleType = input.next();
        System.out.println("vehicle type is " + vehicleType);
        System.out.println("Enter vehicle brand:");
        brand = input.next();
        System.out.println("vehicle type is " + brand);
        System.out.println("Enter vehicle licence plate:");
        licencePlate = input.next();
        System.out.println("vehicle licence plate is " + licencePlate);
        System.out.println("Enter vehicle time and date of entry (hh mm dd mm yyyy):");
        entryHour = input.nextInt();
        entryMinute = input.nextInt();
        entryDay = input.nextInt();
        entryMonth = input.nextInt();
        entryYear = input.nextInt();
        entryDateTime = 0;
        System.out.println("vehicle arival is " + entryHour + ":" + entryMinute + " on " + entryDay + "/" + entryMonth + "/" + entryYear);
        switch (vehicleType) {
            case "Car":
                myCar[i].setCar();
                break;
            case "car":
                myCar[i].setCar();
                break;
            case "Van":
                myVan[i].setVolume();
                break;
            case "van":
                myVan[i].setVolume();
                break;
            case "Motorbike":
                myMotorbike[i].setSize();
                break;
            case "motorbike":
                myMotorbike[i].setSize();
                break;
        }
    
    }
    public void removeVehicle() {
        if (licencePlate == plate) {
            System.out.println("Vehicle type:" + vehicleType);
            System.out.println("Vehicle plate:" + licencePlate);
            vehicleType = "empty";
            brand = " ";
            licencePlate = " ";
            entryYear = 0;
            entryMonth = 0;
            entryDay = 0;
            entryHour = 0;
            entryMinute = 0;
            myCar[i].deleteCar();
            myVan[i].deleteVan();
            myMotorbike[i].deleteMotorbike();
        }
    }
    public void displayVehicle() {
        if (vehicleType == "empty"){
            
        }
        else {
            System.out.println("Vehicle plate: " + licencePlate);
            System.out.println("vehicle arived at: " + entryHour + ":" + entryMinute + " on " + entryDay + "/" + entryMonth + "/" + entryYear);
            System.out.println("Vehicle type: " + vehicleType);
        }
    }
    public void sortVehicle() {
        entryDateTime = (entryYear * 483840) + (entryMonth * 40320) + (entryDay * 1440) + (entryHour * 60) + entryMinute;
    }
    
    public void vehicleDate() {
        empty = 1;
        entryDateTimeCompare = entryYearCompare + entryMonthCompare + entryDayCompare;
        entryDateTime = entryYear + entryMonth + entryDay;
        if (entryDateTimeCompare == entryDateTime){
            System.out.println("Vehicle plate: " + licencePlate);
            System.out.println("vehicle arived at: " + entryHour + ":" + entryMinute);
            System.out.println("Vehicle type: " + vehicleType);
            empty = 0;
        }
    }
    public void vehicleCharge(){
        if (vehicleType == "empty"){
            
        }
        else {
            cost = 0;
            costTime = 1;
            entryDateTimeCompare = entryYearCompare + entryMonthCompare + entryDayCompare + entryHourCompare + entryMinuteCompare;
            entryDateTime = entryYear + entryMonth + entryDay + entryHour + entryMinute;
            entryDateTimeCompare = entryDateTimeCompare - entryDateTime;
            
            entryHourCompare = entryHourCompare - entryHour;
            
            entryDayCompare = entryDayCompare - entryDay;
            entryMonthCompare = entryMonthCompare - entryMonth;
            entryYearCompare = entryYearCompare - entryYear;
            
            for (int x = 0; x < entryHourCompare; x++ ){
                if (x < 3){
                    cost = cost + 3;
                }
                else {
                    cost = cost + x;
                }
            }
            if (cost > 30) {
                cost = 30;
            }
            cost = cost + (entryYearCompare * 10080) + (entryMonthCompare * 840) + (entryDayCompare * 30);
            System.out.println("Vehicle plate: " + licencePlate + ". Cost of parking is: £" + cost);
        }
    }
}
