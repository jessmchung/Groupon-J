/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.datatypes;

/**
 *
 * @author Jessica
 */
public class RedemptionLocation implements GrouponType{
    private String streetAddress1;
    private String streetAddress2;
    private String state;
    private String city;
    private double lat;
    private double lng;
    private String postalCode;
    private String name;
    
    public RedemptionLocation(){}
    
    @Override
    public String toString(){
        return "\n" + this.name + "\n" + this.streetAddress1 + " " + this.streetAddress2 +
                "\n" + this.city + ", " + this.state + " " + this.postalCode +
                "\n(" + this.lat + ", " + this.lng + ")";
    }
    
    public void setStreetAddress1(String streetAddress1){
        this.streetAddress1 = streetAddress1;
    }
    
    public String getStreetAddress1(){
        return this.streetAddress1;
    }
    
    public void setStreetAddress2(String streetAddress2){
        this.streetAddress2 = streetAddress2;
    }
    
    public String getStreetAddress2(){
        return this.streetAddress2;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public String getState(){
        return this.state;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public void setLat(double lat){
        this.lat = lat;
    }
    
    public double getLat(){
        return this.lat;
    }
    
    public void setLng(double lng){
        this.lng = lng;
    }
    
    public double getLng(){
        return this.lng;
    }
    
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    
    public String getPostalCode(){
        return this.postalCode;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
