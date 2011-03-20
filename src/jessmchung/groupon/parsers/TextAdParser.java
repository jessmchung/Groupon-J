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
