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
