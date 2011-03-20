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

package jessmchung.groupon.enums;

/**
 *
 * @author Jessica
 */
public enum GrouponErrorCode {
    UNKNOWN("", "Unknown error code"),
    OK("200", "OK: Success!"),
    BAD_REQUEST("400", "Bad Request: The request was invalid for reasons other than authentication."),
    UNAUTHORIZED("401", "Unauthorized: Authentication credentials were missing or incorrect."),
    FORBIDDEN("403", "Forbidden: The request is understood, but was refused because the requestor does not have the correct rights to perform the action requested."),
    NOT_FOUND("404", "Not Found: A specified instance of a resource that does not exist has been requested. Note: incorrect parameters for a request will result in a 400 response."),
    INTERNAL_SERVER_ERROR("500", "Internal Server Error: Something unexpected happened on the server. Contact support."),
    SERVICE_UNAVAILABLE("503", "Service Unavailable: Groupon is currently unavailable to fulfill your request");
    
    private final String code;
    private final String description;
    GrouponErrorCode(String code, String description){
        this.code = code;
        this.description = description;
    }
    
    public String code(){
        return this.code;
    }
    
    public String description(){
        return this.description;
    }
    
    public static GrouponErrorCode parseException(Exception ex){
        String message = ex.getMessage();
        String responseCodeString = "HTTP response code: ";
        if(message.contains(responseCodeString + BAD_REQUEST.code()))
            return BAD_REQUEST;
        else if(message.contains(responseCodeString + FORBIDDEN.code()))
            return FORBIDDEN;
        else if(message.contains(responseCodeString + INTERNAL_SERVER_ERROR.code()))
            return INTERNAL_SERVER_ERROR;
        else if(message.contains(responseCodeString + NOT_FOUND.code()))
            return NOT_FOUND;
        else if(message.contains(responseCodeString + SERVICE_UNAVAILABLE.code()))
            return SERVICE_UNAVAILABLE;
        else if(message.contains(responseCodeString + UNAUTHORIZED.code()))
            return UNAUTHORIZED;
        else return UNKNOWN;
    }
}
