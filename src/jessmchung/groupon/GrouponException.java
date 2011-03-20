/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon;

import jessmchung.groupon.enums.GrouponErrorCode;

/**
 *
 * @author Jessica
 */
public class GrouponException extends Exception {

    /**
     * Creates a new instance of <code>GrouponException</code> without detail message.
     */
    public GrouponException() {
    }


    /**
     * Constructs an instance of <code>GrouponException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public GrouponException(String msg) {
        super(msg);
    }
    
    public GrouponException(GrouponErrorCode errorCode){
        super("Groupon Error " + errorCode.code() + " " + errorCode.description());
    }
    
}
