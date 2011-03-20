/*
 * Groupon-J - Java client library for Groupon API v2
 *  Copyright (C) 2011  Jessica M. Chung
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
