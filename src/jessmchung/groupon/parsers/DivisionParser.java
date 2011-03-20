/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.parsers;

import java.util.Collection;
import jessmchung.groupon.datatypes.Division;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public class DivisionParser extends GrouponTypeParser<Division>{

    @Override
    public Division parse(JSONObject json) throws JSONException {
        Division obj = new Division();
        if(json.has("lat"))
            obj.setLat(json.getDouble("lat"));
        if(json.has("lng"))
            obj.setLng(json.getDouble("lng"));
        if(json.has("name"))
            obj.setName(json.getString("name"));
        if(json.has("timezone"))
            obj.setTimezone(json.getString("timezone"));
        if(json.has("id"))
            obj.setId(json.getString("id"));
        if(json.has("timezoneOffsetInSeconds"))
            obj.setTimezoneOffsetInSeconds(json.getInt("timezoneOffsetInSeconds"));
        return obj;
    }
}
