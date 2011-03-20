/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.datatypes;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Jessica
 */
public class DealOptions implements GrouponType{
    private String buyUrl;
    private Date expiresAt;
    private Price price;
    private double discountPercent;
    private int soldQuantity;
    private int initialQuantity;
    private String externalUrl;
    private int minimumPurchaseQuantity;
    private boolean isLimitedQuantity;
    private Price value;
    private int maximumPurchaseQuantity;
    private String title;
    private Price discount;
    private Collection details;
    private int remainingQuantity;
    private int id;
    //private Collection customFields;
    private boolean isSoldOut;
    private Collection<RedemptionLocation> redemptionLocations;
    
    public DealOptions(){}
    
    @Override
    public String toString(){
        return "Title: " + this.title +
                "\nPrice: " + this.price +
                "\nDiscount: " + this.discount + " (" + this.discountPercent + "%)" +
                "\nValue: " + this.value +
                "\nMinPurchaseQuant: " + this.minimumPurchaseQuantity + ", MaxPurchaseQuant: " + this.maximumPurchaseQuantity + ", RemainingQuant: " + this.remainingQuantity +
                "\nExpiresAt: " + this.expiresAt +
                "\nisSoldOut: " + this.isSoldOut + ", isLimitedQuantity: " + this.isLimitedQuantity +
                "\nBuyUrl: " + this.buyUrl + ", ExternalUrl: " + this.externalUrl +
                "\nRedemptionLocations: " + this.redemptionLocations;
    }
    
    public void setBuyUrl(String buyUrl){
        this.buyUrl = buyUrl;
    }
    
    public String getBuyUrl(){
        return this.buyUrl;
    }
    
    public void setExpiresAt(Date expiresAt){
        this.expiresAt = expiresAt;
    }
    
    public Date getExpiresAt(){
        return this.expiresAt;
    }
    
    public void setPrice(Price price){
        this.price = price;
    }
    
    public Price getPrice(){
        return this.price;
    }
    
    public void setDiscountPercent(double discountPercent){
        this.discountPercent = discountPercent;
    }
    
    public double getDiscountPercent(){
        return this.discountPercent;
    }
    
    public void setSoldQuantity(int soldQuantity){
        this.soldQuantity = soldQuantity;
    }
    
    public int getSoldQuantity(){
        return this.soldQuantity;
    }
  
    public void setInitialQuantity(int initialQuantity){
        this.initialQuantity = initialQuantity;
    }
    
    public int getInitialQuantity(){
        return this.initialQuantity;
    }
    
    public void setExternalUrl(String externalUrl){
        this.externalUrl = externalUrl;
    }
    
    public String getExternalUrl(){
        return this.externalUrl;
    }
    
    public void setMinimumPurchaseQuantity(int minimumPurchaseQuantity){
        this.minimumPurchaseQuantity = minimumPurchaseQuantity;
    }
    
    public int getMinimumPurchaseQuantity(){
        return this.minimumPurchaseQuantity;
    }
    
    public void setIsLimitedQuantity(boolean isLimitedQuantity){
        this.isLimitedQuantity = isLimitedQuantity;
    }
    
    public boolean getIsLimitedQuantity(){
        return this.isLimitedQuantity;
    }
    
    public void setValue(Price value){
        this.value = value;
    }
    
    public Price getValue(){
        return this.value;
    }
    
    public void setMaximumPurchaseQuantity(int maximumPurchaseQuantity){
        this.maximumPurchaseQuantity = maximumPurchaseQuantity;
    }
    
    public int getMaximumPurchaseQuantity(){
        return this.maximumPurchaseQuantity;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setDiscount(Price discount){
        this.discount = discount;
    }
    
    public Price getDiscount(){
        return this.discount;
    }
    
    public void setDetails(Collection details){
        this.details = details;
    }
    
    public Collection getDetails(){
        return this.details;
    }
    
    public void setRemainingQuantity(int remainingQuantity){
        this.remainingQuantity = remainingQuantity;
    }
    
    public int getRemainingQuantity(){
        return this.remainingQuantity;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setIsSoldOut(boolean isSoldOut){
        this.isSoldOut = isSoldOut;
    }
    
    public boolean getIsSoldOut(){
        return this.isSoldOut;
    }
    
    public void setRedemptionLocations(Collection<RedemptionLocation> redemptionLocations){
        this.redemptionLocations = redemptionLocations;
    }
    
    public Collection<RedemptionLocation> getRedemptionLocations(){
        return this.redemptionLocations;
    }
}
