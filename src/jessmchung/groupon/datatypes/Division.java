/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.datatypes;

/**
 *
 * @author Jessica
 */
public class Division implements GrouponType{
    private double lat;
    private double lng;
    private String name;
    private String timezone;
    private String id;
    private int timezoneOffsetInSeconds;
    
    public Division(){}
    
    @Override
    public String toString(){
        return "Lat: " + this.lat + ", Lng: " + this.lng + 
                "\nName: " + this.name + ", Id: " + this.id +
                "\nTimezone: " + this.timezone + ", TimezoneOffset: " + this.timezoneOffsetInSeconds;
    }
    
    public void setLat(double latitude){
        this.lat = latitude;
    }
    
    public double getLat(){
        return this.lat;
    }
    
    public void setLng(double longitude){
        this.lng = longitude;
    }
    
    public double getLng(){
        return this.lng;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setTimezone(String timezone){
        this.timezone = timezone;
    }
    
    public String getTimezone(){
        return this.timezone;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setTimezoneOffsetInSeconds(int timezoneOffsetInSeconds){
        this.timezoneOffsetInSeconds = timezoneOffsetInSeconds;
    }
    
    public int getTimzeoneOffsetInSeconds(){
        return this.timezoneOffsetInSeconds;
    }

}
