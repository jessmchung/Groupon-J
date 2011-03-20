/*
 * Groupon-J - Java client library for Groupon API v2
 *  Copyright (C) 2011  Jessica M. Chung
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
