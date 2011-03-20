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
