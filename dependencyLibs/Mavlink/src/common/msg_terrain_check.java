/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE TERRAIN_CHECK PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Request that the vehicle report terrain height at the given location. Used by GCS to check if vehicle has all terrain data needed for a mission.
 */
public class msg_terrain_check extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_TERRAIN_CHECK = 135;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_TERRAIN_CHECK;

      
    /**
     * Latitude
     */
    public int lat;
      
    /**
     * Longitude
     */
    public int lon;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_TERRAIN_CHECK;
        
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a terrain_check message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.lat = payload.getInt();
        this.lon = payload.getInt();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_terrain_check() {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_CHECK;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_terrain_check( int lat, int lon) {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_CHECK;

        this.lat = lat;
        this.lon = lon;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_terrain_check( int lat, int lon, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_CHECK;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.lat = lat;
        this.lon = lon;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_terrain_check(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_CHECK;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_terrain_check(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_CHECK;

        readJSONheader(jo);
        
        this.lat = (int)jo.optInt("lat",0);
        this.lon = (int)jo.optInt("lon",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("lat", (int)lat);
        jo.put("lon", (int)lon);
        
        
        return jo;
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_TERRAIN_CHECK - sysid:"+sysid+" compid:"+compid+" lat:"+lat+" lon:"+lon+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_TERRAIN_CHECK";
    }
}
        