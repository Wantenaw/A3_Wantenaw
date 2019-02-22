
package Wantenaw;

/**
 * @author Willem Wantenaar
 * 2/20/2019
 * Assignment 3
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ShipmentList shipmentList;
        
        // Loop variables
        String yes = "y";
        String no = "n";
        String i;
        String pc;
        
        // loop for inputting shipments
        while (i.equals(no)){
            if (i.equals(yes)){
                Destination tempDest;
                Shipment tempShipment;
                
                while (Destination.contains(pc)){
                    System.out.println("Enter Destination Provice Code: ");
                    pc = input.nextLine();
                    if (pc != Destination){
                        System.out.println("Ivalid Provice Code (ex.'ON')");
                    }
                }
                System.out.println("Enter Total Value of Shipment: ");
                double value = input.nextDouble();
                
                System.out.println("Add Another (y/n) ? ");
                i = input.nextLine();
                
                Shipment finalShipment = new Shipment(tempDest, value);
                shipmentList.add(finalShipment);
            }
            else {
                System.out.println("Add Another (y/n) ? ");
                i = input.nextLine();            
            }
        }
        // gets total cost
        while (int x != shipmentList){
            for (x = 0 ; x != shipmentList.length ; x++){
                double total += getCost() + getShipValue(shipmentList[x]);
            }
        }
        System.out.println(shipmentList + " $ " + total);
    }
    
}
