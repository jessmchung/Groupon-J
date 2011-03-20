/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.parsers;

import jessmchung.groupon.datatypes.RedemptionLocation;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public class RedemptionLocationParser extends GrouponTypeParser<RedemptionLocation>{
    @Override
    public RedemptionLocation parse(JSONObject json) throws JSONException {
        RedemptionLocation obj = new RedemptionLocation();
        if(json.has("streetAddress1"))
            obj.setStreetAddress1(json.getString("streetAddress1"));
        if(json.has("streetAddress2"))
            obj.setStreetAddress2(json.getString("streetAddress2"));
        if(json.has("state"))
            obj.setState(json.getString("state"));
        if(json.has("city"))
            obj.setCity(json.getString("city"));
        if(json.has("lat"))
            obj.setLat(json.getDouble("lat"));
        if(json.has("lng"))
            obj.setLng(json.getDouble("lng"));
        if(json.has("postalCode"))
            obj.setPostalCode(json.getString("postalCode"));
        if(json.has("name"))
            obj.setName(json.getString("name"));
                        
        return obj;
    }

}
