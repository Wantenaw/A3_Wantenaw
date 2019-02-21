
package Wantenaw;

/**
 *
 * @author wille
 */
public enum Destination {
    AB ("Alberta", 21.95),
    BC ("British Columbia", 25.95),
    MB ("Manitoba", 18.95),
    NB ("New Brunswick", 21.95),
    NL ("Newfoundland & Labrador", 24.95),
    NS ("Nova Scotia", 22.95),
    NT ("Northwest Territories", 27.95),
    NU ("Nunavut", 27.95),
    ON ("Ontario", 12.49),
    PE ("Prince Edward Island", 23.49),
    QC ("Quebec", 16.95),
    SK ("Saskatchewan", 21.95),
    YT ("Yukon", 29.95);
    
    private final String name;
    private final double cost;
    Destination(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
}
