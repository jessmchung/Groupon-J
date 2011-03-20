/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.enums;

/**
 *
 * @author Jessica
 */
public enum PlacementPriority implements FieldNameEnum {
    FEATURED("featured"),
    SIDE_DEAL("side_deal");
    
    private final String fieldName;
    
    PlacementPriority(String name){
        this.fieldName = name;
    }

    @Override
    public String fieldName() {
        return this.fieldName; 
    }
}
