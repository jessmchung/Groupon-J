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
