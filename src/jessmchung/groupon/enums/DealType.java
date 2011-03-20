/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.enums;

/**
 *
 * @author Jessica
 */
public enum DealType implements FieldNameEnum{
    GROUPON("groupon"),
    MERCHANT("merchant"),
    PROMOTED_MERCHANT("promoted-merchant");
    
    private final String fieldName;
    
    DealType(String name){
        this.fieldName = name;
    }

    @Override
    public String fieldName() {
        return this.fieldName;
    }
}
