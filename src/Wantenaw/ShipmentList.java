
package Wantenaw;

/**
 *
 * @author wille
 */

public class ShipmentList {
    private ArrayList<Shipment> shipmentList;
    //private final ArrayList<Shipment> shipmentList = new ArrayList<Shipment>();
    
    ShipmentList(){
        
    }
    public Shipment getShipment(int index){
        return shipmentList[index];
    }
    public void addShipment(Shipment shipment){
        this.shipmentList.add(shipment);
    }
    public int findShipment(Destination dest){
        return this.shipmentlist
    }
    public int length(){
        return shipmentList.length;
    }
    @Override
    public String toString(){
        int i = 0;
        while (i <= shipmentList.length){    
            return getName(shipmentList[i]) + getCost(shipmentList[i]);
            i++;
        }
    }
}
