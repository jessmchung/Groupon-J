/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.datatypes;

/**
 *
 * @author Jessica
 */
public class Merchant implements GrouponType{
    private String websiteUrl;
    private String name;
    private String id;
    
    public Merchant(){}
    
    @Override
    public String toString(){
        return name + ", " + id + " (" + websiteUrl + ")";
    }
    public void setWebsiteUrl(String websiteUrl){
        this.websiteUrl = websiteUrl;
    }
    
    public String getWebsiteUrl(){
        return this.websiteUrl;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
}
