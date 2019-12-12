/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE TERRAIN_REPORT PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Response from a TERRAIN_CHECK request
 */
public class msg_terrain_report extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_TERRAIN_REPORT = 136;
    public static final int MAVLINK_MSG_LENGTH = 22;
    private static final long serialVersionUID = MAVLINK_MSG_ID_TERRAIN_REPORT;

      
    /**
     * Latitude
     */
    public int lat;
      
    /**
     * Longitude
     */
    public int lon;
      
    /**
     * Terrain height MSL
     */
    public float terrain_height;
      
    /**
     * Current vehicle height above lat/lon terrain height
     */
    public float current_height;
      
    /**
     * grid spacing (zero if terrain at this location unavailable)
     */
    public int spacing;
      
    /**
     * Number of 4x4 terrain blocks waiting to be received or read from disk
     */
    public int pending;
      
    /**
     * Number of 4x4 terrain blocks in memory
     */
    public int loaded;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_TERRAIN_REPORT;
        
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putFloat(terrain_height);
        packet.payload.putFloat(current_height);
        packet.payload.putUnsignedShort(spacing);
        packet.payload.putUnsignedShort(pending);
        packet.payload.putUnsignedShort(loaded);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a terrain_report message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.lat = payload.getInt();
        this.lon = payload.getInt();
        this.terrain_height = payload.getFloat();
        this.current_height = payload.getFloat();
        this.spacing = payload.getUnsignedShort();
        this.pending = payload.getUnsignedShort();
        this.loaded = payload.getUnsignedShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_terrain_report() {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_REPORT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_terrain_report( int lat, int lon, float terrain_height, float current_height, int spacing, int pending, int loaded) {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_REPORT;

        this.lat = lat;
        this.lon = lon;
        this.terrain_height = terrain_height;
        this.current_height = current_height;
        this.spacing = spacing;
        this.pending = pending;
        this.loaded = loaded;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_terrain_report( int lat, int lon, float terrain_height, float current_height, int spacing, int pending, int loaded, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_REPORT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.lat = lat;
        this.lon = lon;
        this.terrain_height = terrain_height;
        this.current_height = current_height;
        this.spacing = spacing;
        this.pending = pending;
        this.loaded = loaded;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_terrain_report(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_REPORT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_terrain_report(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_TERRAIN_REPORT;

        readJSONheader(jo);
        
        this.lat = (int)jo.optInt("lat",0);
        this.lon = (int)jo.optInt("lon",0);
        this.terrain_height = (float)jo.optDouble("terrain_height",0);
        this.current_height = (float)jo.optDouble("current_height",0);
        this.spacing = (int)jo.optInt("spacing",0);
        this.pending = (int)jo.optInt("pending",0);
        this.loaded = (int)jo.optInt("loaded",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("lat", lat);
        jo.put("lon", lon);
        jo.put("terrain_height", terrain_height);
        jo.put("current_height", current_height);
        jo.put("spacing", spacing);
        jo.put("pending", pending);
        jo.put("loaded", loaded);
        
        
        return jo;
    }

                  
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_TERRAIN_REPORT - sysid:"+sysid+" compid:"+compid+" lat:"+lat+" lon:"+lon+" terrain_height:"+terrain_height+" current_height:"+current_height+" spacing:"+spacing+" pending:"+pending+" loaded:"+loaded+"";
    }
}
        