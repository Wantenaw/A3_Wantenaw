
package Wantenaw;

/**
 * @author Willem Wantenaar
 * 2/20/2019
 * Assignment 3
 */
public class ShipmentList {
    private ArrayList<Shipment> shipmentList;
    //private final ArrayList<Shipment> shipmentList = new ArrayList<Shipment>();
    
    ShipmentList(){
        
    }
    public Shipment get(int index){
        return shipmentList[index];
    }
    public void add(Shipment shipment){
        if (shipmentList.contains(shipment)){
        }
        else {
            this.shipmentList.add(shipment);
        }
    }
    public int findShipment(Destination dest){
        if (shipmentList.contains(dest)){
            return shipmentList.contains(dest);
        }
        else {
            return -1;
        }
    }
    public int length(){
        return shipmentList.length;
    }
    @Override
    public String toString(){
        for (int i = 0 ; i <= shipmentList.length ; i++){  
            return getName(shipmentList[i]) + getCost(shipmentList[i]);
        }
    }
}
