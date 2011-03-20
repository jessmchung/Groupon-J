/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.parsers;

import jessmchung.groupon.datatypes.Merchant;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public class MerchantParser extends GrouponTypeParser<Merchant>{

    @Override
    public Merchant parse(JSONObject json) throws JSONException {
        Merchant obj = new Merchant();
        if(json.has("websiteUrl"))
            obj.setWebsiteUrl(json.getString("websiteUrl"));
        if(json.has("name"))
            obj.setName(json.getString("name"));
        if(json.has("id"))
            obj.setId(json.getString("id"));
        return obj;
    }
}
