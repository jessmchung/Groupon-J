/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.parsers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import jessmchung.groupon.datatypes.GrouponType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public abstract class GrouponTypeParser<T extends GrouponType> {
    public abstract T parse(JSONObject json) throws JSONException;
    public Collection<T> parse(JSONArray array) throws JSONException{
        Collection<T> collection = new ArrayList<T>();
        for (int i = 0, m = array.length(); i < m; i++) {
            Object element = array.get(i);
            T item = null;
            if (element instanceof JSONArray) {
                //item = parse((JSONArray)element);
            } else {
                item = parse((JSONObject)element);
            }
            
            collection.add(item);
        }
        return collection;
    }
    
    protected Date parseDate(String dateString) throws ParseException{
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = (Date)formatter.parse(dateString.replace("T", " ").replace("Z", ""));
        
        return date;
    }
}
