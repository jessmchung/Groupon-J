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
public class Price implements GrouponType{
    private String currencyCode;
    private double amount;
    private String formattedAmount;
    
    public Price(){}
    
    @Override
    public String toString(){
        return this.formattedAmount + " " + this.currencyCode + " (" + this.amount + ")";
    }
    
    public void setCurrencyCode(String currencyCode){
        this.currencyCode = currencyCode;
    }
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public void setFormattedAmount(String formattedAmount){
        this.formattedAmount = formattedAmount;
    }
    
    public String getFormattedAmount(){
        return this.formattedAmount;
    }
}

