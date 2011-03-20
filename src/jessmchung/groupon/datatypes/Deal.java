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
public class Deal implements GrouponType {
    private String type;
    private boolean shippingAddressRequired;
    private boolean isTipped;
    private TextAd textAd;
    private Merchant merchant;
    private int soldQuantity;
    private String status;
    private String largeImageUrl;
    private String dealUrl;
    private Date tippedAt;
    private String placementPriority;
    private String pitchHtml;
    private String sidebarImageUrl;
    private Date startAt;
    private Date endAt;
    private String mediumImageUrl;
    private String highlightsHtml;
    private String title;
    private Collection<DealOptions> options;
    private int tippingPoint;
    private String id;
    private String announcementTitle;
    private boolean isSoldOut;
    private Division division;
    private String emailImageUrl;
    private Collection<String> tags;
    
    @Override
    public String toString(){        
        return "Title: " + this.title + " (" + this.announcementTitle + ") " + this.id +
                "\nType: " + this.type + ", PlacementPriority: " + this.placementPriority +
                "\nShipping required: " + this.shippingAddressRequired + ", isTipped: " + this.isTipped + ", isSoldOut: " + this.isSoldOut +
                "\nMerchant: " + this.merchant +
                "\nTextAd: " + this.textAd + 
                "\nSold: " + this.soldQuantity + ", " +
                "\nStatus: " + this.status + ", " +
                "\nDealUrl: " + this.dealUrl +
                "\nImageUrls: " + this.largeImageUrl + " (L), " + this.mediumImageUrl + " (M), " + 
                    this.sidebarImageUrl + " (S), " + this.emailImageUrl + " (E)" +
                "\nDivision: " + this.division +
                "\nTippedAt: " + this.tippedAt + ", StartAt; " + this.startAt + ", EndAt: " + this.endAt +
                "\nOptions: " + this.options;
    }
    
    public void setAnnouncementTitle(String announcementTitle){
        this.announcementTitle = announcementTitle;
    }
    
    public String getAnnouncementTitle(){
        return this.announcementTitle;
    }
    
    public void setDealUrl(String dealUrl){
        this.dealUrl = dealUrl;
    }
    
    public String getDealUrl(){
        return this.dealUrl;
    }
    
    public void setDivision(Division division){
        this.division = division;
    }
    
    public Division getDivision(){
        return this.division;
    }
    
    public void setEmailImageUrl(String emailImageUrl){
        this.emailImageUrl = emailImageUrl;
    }
    
    public String getEmailImageUrl(){
        return this.emailImageUrl;
    }
    
    public void setEndAt(Date endAt){
        this.endAt = endAt;
    }
    
    public Date getEndAt(){
        return this.endAt;
    }
    
    public void setHighlightsHtml(String highlightsHtml){
        this.highlightsHtml = highlightsHtml;
    }
    
    public String getHighlightsHtml(){
        return this.highlightsHtml;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setIsSoldOut(boolean isSoldOut){
        this.isSoldOut = isSoldOut;
    }
    
    public boolean getIsSoldOut(){
        return this.isSoldOut;
    }
    
    public void setIsTipped(boolean isTipped){
        this.isTipped = isTipped;
    }
    
    public boolean getIsTipped(){
        return this.isTipped;
    }
    
    public void setLargeImageUrl(String largeImageUrl){
        this.largeImageUrl = largeImageUrl;
    }
    
    public String getLargeImageUrl(){
        return this.largeImageUrl;
    }
    
    public void setMediumImageUrl(String mediumImageUrl){
        this.mediumImageUrl = mediumImageUrl;
    }
    
    public String getMediumImageUrl(){
        return this.mediumImageUrl;
    }
    
    public void setMerchant(Merchant merchant){
        this.merchant = merchant;
    }
    
    public Merchant getMerchant(){
        return this.merchant;
    }
    
    public void setOptions(Collection<DealOptions> options){
        this.options = options;
    }
    
    public Collection<DealOptions> getOptions(){
        return this.options;
    }
    
    public void setPitchHtml(String pitchHtml){
        this.pitchHtml = pitchHtml;
    }
    
    public String getPitchHtml(){
        return this.pitchHtml;
    }
    
    public void setPlacementPriority(String placementPriority){
        this.placementPriority = placementPriority;
    }
    
    public String getPlacementPriority(){
        return this.placementPriority;
    }
    
    public void setShippingAddressRequired(boolean shippingAddressRequired){
        this.shippingAddressRequired = shippingAddressRequired;
    }
    
    public boolean getShippingAddressRequired(){
        return this.shippingAddressRequired;
    }
    
    public void setSidebarImageUrl(String sidebarImageUrl){
        this.sidebarImageUrl = sidebarImageUrl;
    }
    
    public String getSidebarImageUrl(){
        return this.sidebarImageUrl;
    }
    
    public void setSoldQuantity(int soldQuantity){
        this.soldQuantity = soldQuantity;
    }
    
    public int getSoldQuantity(){
        return this.soldQuantity;
    }
    
    public void setStartAt(Date startAt){
        this.startAt = startAt;
    }
    
    public Date getStartAt(){
        return this.startAt;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setTags(Collection<String> tags){
        this.tags = tags;
    }
    
    public Collection<String> getTags(){
        return this.tags;
    }
    
    public void setTextAd(TextAd textAd){
        this.textAd = textAd;
    }
    
    public TextAd getTextAd(){
        return this.textAd;
    }
    
    public void setTippedAt(Date tippedAt){
        this.tippedAt = tippedAt;
    }
    
    public Date getTippedAt(){
        return this.tippedAt;
    }
    
    public void setTippingPoint(int tippingPoint){
        this.tippingPoint = tippingPoint;
    }
    
    public int getTippingPoint(){
        return this.tippingPoint;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
}
