/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.datatypes;

/**
 *
 * @author Jessica
 */
public class TextAd implements GrouponType{
    private String headline;
    private String line1;
    private String line2;
    
    public TextAd(){}
    
    @Override
    public String toString(){
        return headline + "//" + line1 + "//" + line2;
    }
    
    public void setHeadline(String headline){
        this.headline = headline;
    }
    
    public String getHeadline(){
        return this.headline;
    }
    
    public void setLine1(String line1){
        this.line1 = line1;
    }
    
    public String getLine1(){
        return this.line1;
    }
    
    public void setLine2(String line2){
        this.line2 = line2;
    }
    
    public String getLine2(){
        return this.line2;
    }

}
