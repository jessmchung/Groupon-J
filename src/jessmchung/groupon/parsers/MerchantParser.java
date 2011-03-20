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
