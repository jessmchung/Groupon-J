/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import jessmchung.groupon.GrouponApiV2;
import jessmchung.groupon.GrouponException;
import jessmchung.groupon.datatypes.Deal;
import jessmchung.groupon.datatypes.Division;

/**
 *
 * @author Jessica
 */
public class GrouponJDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iterator i;
        GrouponApiV2 client = new GrouponApiV2("11680de3cd3cdd0b39b86897824464f0d9eaba04");
        try {
            Collection<Division> divisions = client.getDivisions();
            i = divisions.iterator();
            while(i.hasNext()){
                Division division = (Division)i.next();
                System.out.println("*******************************");
                System.out.println(division);
            }
            
            Collection<Deal> deals = client.getDeals(new HashMap<String, String>());
            i = deals.iterator();
            while(i.hasNext()){
                Deal deal = (Deal)i.next();
                System.out.println("*******************************");
                System.out.println(deal);
            }
        } catch (GrouponException ex) {
            System.out.println(ex);
        } catch(Exception ex){
            System.out.println(ex);
        }
    }

}
