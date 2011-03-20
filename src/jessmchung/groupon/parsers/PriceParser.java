/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jessmchung.groupon.parsers;

import jessmchung.groupon.datatypes.Price;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public class PriceParser extends GrouponTypeParser<Price>{

    @Override
    public Price parse(JSONObject json) throws JSONException {
        Price obj = new Price();
        if(json.has("currencyCode"))
            obj.setCurrencyCode(json.getString("currencyCode"));
        if(json.has("amount"))
            obj.setAmount(json.getDouble("amount"));
        if(json.has("formattedAmount"))
            obj.setFormattedAmount(json.getString("formattedAmount"));
        
        return obj;
    }

}
