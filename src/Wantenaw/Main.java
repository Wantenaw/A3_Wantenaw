
package Wantenaw;

/**
 * @author Willem Wantenaar
 * 2/20/2019
 * Assignment 3
 */
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ShipmentList shipmentList;
        
        // Loop variables
        String yes = "y";
        String no = "n";
        String i;
        
        // loop for inputting shipments
        while (i != no){
            if (i == yes){
                Destination tempDest;
                Shipment tempShipment;
                
                while (pc != ){
                    System.out.println("Enter Destination Provice Code: ");
                    String pc = input.nextLine();
                    if (pc == Destination.pc.getName()){
                    
                    }
                }
                System.out.println("Enter Total Value of Shipment: ");
                double value = input.nextDouble();
                tempShipment(setShipValue(value));
                
                System.out.println("Add Another (y/n) ? ");
                i = input.nextLine();
                
                Shipment finalShipment = new Shipment(tempDest, 0);
                shipmentList.add(finalShipment);
            }
            else {
                System.out.println("Add Another (y/n) ? ");
                i = input.nextLine();            
            }
        }
        System.out.println(shipmentList);
    }
    
}
