/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.parsers;

import jessmchung.groupon.datatypes.TextAd;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public class TextAdParser extends GrouponTypeParser<TextAd> {

    @Override
    public TextAd parse(JSONObject json) throws JSONException {
        TextAd obj = new TextAd();
        if(json.has("headline"))
            obj.setHeadline(json.getString("headline"));
        if(json.has("line1"))
            obj.setLine1(json.getString("line1"));
        if(json.has("line2"))
            obj.setLine2(json.getString("line2"));
        
        return obj;
    }

}
