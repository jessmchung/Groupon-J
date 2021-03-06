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

package jessmchung.groupon.parsers;

import java.text.ParseException;
import jessmchung.groupon.datatypes.DealOptions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public class DealOptionsParser extends GrouponTypeParser<DealOptions> {

    @Override
    public DealOptions parse(JSONObject json) throws JSONException {
        DealOptions obj = new DealOptions();
        if(json.has("buyUrl"))
            obj.setBuyUrl(json.getString("buyUrl"));
        if(json.has("expiresAt")){
            try{ 
                obj.setExpiresAt(parseDate(json.getString("expiresAt")));
            }catch(ParseException ex){ System.out.println("Could not parse " + json.getString("expiresAt")); }
        }
        if(json.has("price")){
            JSONObject price = json.getJSONObject("price");
            obj.setPrice(new PriceParser().parse(price));
        }
        if(json.has("discountPercent"))
            obj.setDiscountPercent(json.getDouble("discountPercent"));
        if(json.has("soldQuantity"))
            obj.setSoldQuantity(json.getInt("soldQuantity"));
        if(json.has("initialQuantity") && !json.isNull("initialQuantity"))
            obj.setInitialQuantity(json.getInt("initialQuantity"));
        if(json.has("externalUrl"))
            obj.setExternalUrl(json.getString("externalUrl"));
        if(json.has("minimumPurchaseQuantity"))
            obj.setMinimumPurchaseQuantity(json.getInt("minimumPurchaseQuantity"));
        if(json.has("limitedQuantity"))
            obj.setIsLimitedQuantity(json.getBoolean("isLimitedQuantity"));
        if(json.has("value")){
            JSONObject value = json.getJSONObject("value");
            obj.setValue(new PriceParser().parse(value));
        }
        if(json.has("maximumPurchaseQuantity"))
            obj.setMaximumPurchaseQuantity(json.getInt("maximumPurchaseQuantity"));
        if(json.has("title"))
            obj.setTitle(json.getString("title"));
        if(json.has("discount")){
            JSONObject discount = json.getJSONObject("discount");
            obj.setValue(new PriceParser().parse(discount));
        }
        if(json.has("remainingQuantity") && !json.isNull("remainingQuantity"))
            obj.setRemainingQuantity(json.getInt("remainingQuantity"));
        if(json.has("id"))
            obj.setId(json.getInt("id"));
        if(json.has("isSoldOut"))
            obj.setIsSoldOut(json.getBoolean("isSoldOut"));
        if(json.has("redemptionLocations")){
            JSONArray locationsArray = json.getJSONArray("redemptionLocations");
            obj.setRedemptionLocations(new RedemptionLocationParser().parse(locationsArray));
        }
        
        return obj;
    }

}
