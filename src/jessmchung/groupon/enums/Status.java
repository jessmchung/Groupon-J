/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.enums;

/**
 *
 * @author Jessica
 */
public enum Status implements FieldNameEnum {
    OPEN("open"),
    CLOSED("closed");
    
    private final String fieldName;
    
    Status(String name){
        this.fieldName = name;
    }

    @Override
    public String fieldName() {
        return this.fieldName;
    }
}
