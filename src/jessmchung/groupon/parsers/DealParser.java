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
import java.util.logging.Level;
import java.util.logging.Logger;
import jessmchung.groupon.datatypes.Deal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public class DealParser extends GrouponTypeParser<Deal>{

    @Override
    public Deal parse(JSONObject json) throws JSONException {
        Deal obj = new Deal();
        if(json.has("type"))
           obj.setType(json.getString("type"));
        if(json.has("shippingAddressRequired"))
            obj.setShippingAddressRequired(json.getBoolean("shippingAddressRequired"));
        if(json.has("isTipped"))
            obj.setIsTipped(json.getBoolean("isTipped"));
        if(json.has("textAd")){
            JSONObject textAd = json.getJSONObject("textAd");
            obj.setTextAd(new TextAdParser().parse(textAd));
        }
        if(json.has("merchant")){
            JSONObject merchant = json.getJSONObject("merchant");
            obj.setMerchant(new MerchantParser().parse(merchant));
        }
        if(json.has("soldQuantity"))
            obj.setSoldQuantity(json.getInt("soldQuantity"));
        if(json.has("status"))
            obj.setStatus(json.getString("status"));
        if(json.has("largeImageUrl"))
            obj.setLargeImageUrl(json.getString("largeImageUrl"));
        if(json.has("dealUrl"))
            obj.setDealUrl(json.getString("dealUrl"));
        if(json.has("tippedAt")){
            try {
                obj.setTippedAt(parseDate(json.getString("tippedAt")));
            } catch (ParseException ex) {
                System.out.println("Could not parse " + json.getString("tippedAt"));
            }
        }
        if(json.has("plcementPriority"))
            obj.setPlacementPriority(json.getString("placementPriority"));
        if(json.has("pitchHtml"))
            obj.setPitchHtml(json.getString("pitchHtml"));
        if(json.has("sidebarImageUrl"))
            obj.setSidebarImageUrl(json.getString("sidebarImageUrl"));
        if(json.has("startAt")){
            try {
                obj.setStartAt(parseDate(json.getString("startAt")));
            } catch (ParseException ex) {
                System.out.println("Could not parse " + json.getString("startAt"));
            }
        }
        if(json.has("endAt")){
            try {
                obj.setEndAt(parseDate(json.getString("endAt")));
            } catch (ParseException ex) {
                System.out.println("Could not parse " + json.getString("endAt"));
            }
        }
        if(json.has("mediumImageUrl"))
            obj.setMediumImageUrl(json.getString("mediumImageUrl"));
        if(json.has("highlightsHtml"))
            obj.setHighlightsHtml(json.getString("highlightsHtml"));
        if(json.has("title"))
            obj.setTitle(json.getString("title"));
        if(json.has("options")){
            JSONArray dealOptions = json.getJSONArray("options");
            obj.setOptions(new DealOptionsParser().parse(dealOptions));
        }
        if(json.has("tippingPoint"))
            obj.setTippingPoint(json.getInt("tippingPoint"));
        if(json.has("id"))
            obj.setId(json.getString("id"));
        if(json.has("announcementTitle"))
            obj.setAnnouncementTitle(json.getString("announcementTitle"));
        if(json.has("isSoldOut"))
            obj.setIsSoldOut(json.getBoolean("isSoldOut"));
        if(json.has("division")){
            JSONObject division = json.getJSONObject("division");
            obj.setDivision(new DivisionParser().parse(division));
        }
        if(json.has("emailImageUrl"))
            obj.setEmailImageUrl(json.getString("emailImageUrl"));
        
        return obj;
    }

}
