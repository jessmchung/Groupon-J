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

package jessmchung.groupon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import jessmchung.groupon.datatypes.Deal;
import jessmchung.groupon.datatypes.Division;
import jessmchung.groupon.enums.GrouponErrorCode;
import jessmchung.groupon.parsers.DealParser;
import jessmchung.groupon.parsers.DivisionParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jessica
 */
public class GrouponApiV2 {
    private static final String DOMAIN = "http://api.groupon.com/v2";
    private static final String DIVISIONS_ENDPOINT = "/divisions";
    private static final String DEALS_ENDPOINT = "/deals";
    private static final String DATATYPE = ".json";
    
    private String clientId;
    
    public GrouponApiV2(String clientId){
        this.clientId = clientId;
    }
    
    public Collection<Deal> getDeals(HashMap<String, String> query) throws MalformedURLException, IOException, GrouponException{
        Collection<Deal> deals = null;
        String request = DOMAIN + DEALS_ENDPOINT;
        request += "?client_id=" + this.clientId;
        
        URL url;
        try{
            url = new URL(request);
            URLConnection urlConnection = url.openConnection();
            try {
                JSONObject jsonObject = buildJSONFromConnection(urlConnection);
                JSONArray dealsArray = jsonObject.getJSONArray("deals");
                deals = new DealParser().parse(dealsArray);
                
            } catch (JSONException ex) {
                throw new GrouponException("Could not parse response into json object format");
            }
        }catch(MalformedURLException ex){
            throw ex;
        }catch(IOException ex){
            GrouponErrorCode errorCode = GrouponErrorCode.parseException(ex);
            if(errorCode.equals(GrouponErrorCode.UNKNOWN))
                throw ex;
            else throw new GrouponException(errorCode);
        }
        return deals;
    }
    
    public Collection<Division> getDivisions() throws MalformedURLException, IOException, GrouponException{
        Collection<Division> divisions = null;
        String request = DOMAIN + DIVISIONS_ENDPOINT;
        request += "?client_id=" + this.clientId;
        
        URL url;
        try {
            url = new URL(request);
            URLConnection urlConnection = url.openConnection();
            try {
                JSONObject object = buildJSONFromConnection(urlConnection);
                JSONArray divisionsArray = object.getJSONArray("divisions");
                divisions = new DivisionParser().parse(divisionsArray);
            } catch (JSONException ex) {
                throw new GrouponException("Could not parse response into json object format");
            }
        } catch (MalformedURLException ex) {
            throw ex;
        } catch (IOException ex){
            GrouponErrorCode errorCode = GrouponErrorCode.parseException(ex);
            if(errorCode.equals(GrouponErrorCode.UNKNOWN))
                throw ex;
            else throw new GrouponException(errorCode);
        }
        return divisions;
    }
    
    /**
     * TODO: There must be a better way than this.  christ.
     * @param connection
     * @return
     * @throws IOException
     * @throws JSONException 
     */
    private JSONObject buildJSONFromConnection(URLConnection connection) throws IOException, JSONException{
        String line;
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while((line = reader.readLine()) != null){
            builder.append(line);
        }

        JSONObject json = new JSONObject(builder.toString());
        return json;
    }

}
