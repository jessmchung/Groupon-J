/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

