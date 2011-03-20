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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import jessmchung.groupon.datatypes.GrouponType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public abstract class GrouponTypeParser<T extends GrouponType> {
    public abstract T parse(JSONObject json) throws JSONException;
    public Collection<T> parse(JSONArray array) throws JSONException{
        Collection<T> collection = new ArrayList<T>();
        for (int i = 0, m = array.length(); i < m; i++) {
            Object element = array.get(i);
            T item = null;
            if (element instanceof JSONArray) {
                //item = parse((JSONArray)element);
            } else {
                item = parse((JSONObject)element);
            }
            
            collection.add(item);
        }
        return collection;
    }
    
    protected Date parseDate(String dateString) throws ParseException{
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = (Date)formatter.parse(dateString.replace("T", " ").replace("Z", ""));
        
        return date;
    }
}
