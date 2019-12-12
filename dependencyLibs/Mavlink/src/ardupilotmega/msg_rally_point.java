/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RALLY_POINT PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * A rally point. Used to set a point when from GCS -> MAV. Also used to return a point from MAV -> GCS.
 */
public class msg_rally_point extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RALLY_POINT = 175;
    public static final int MAVLINK_MSG_LENGTH = 19;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RALLY_POINT;

      
    /**
     * Latitude of point.
     */
    public int lat;
      
    /**
     * Longitude of point.
     */
    public int lng;
      
    /**
     * Transit / loiter altitude relative to home.
     */
    public short alt;
      
    /**
     * Break altitude relative to home.
     */
    public short break_alt;
      
    /**
     * Heading to aim for when landing.
     */
    public int land_dir;
      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Component ID.
     */
    public short target_component;
      
    /**
     * Point index (first point is 0).
     */
    public short idx;
      
    /**
     * Total number of points (for sanity checking).
     */
    public short count;
      
    /**
     * Configuration flags.
     */
    public short flags;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_RALLY_POINT;
        
        packet.payload.putInt(lat);
        packet.payload.putInt(lng);
        packet.payload.putShort(alt);
        packet.payload.putShort(break_alt);
        packet.payload.putUnsignedShort(land_dir);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(idx);
        packet.payload.putUnsignedByte(count);
        packet.payload.putUnsignedByte(flags);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a rally_point message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.lat = payload.getInt();
        this.lng = payload.getInt();
        this.alt = payload.getShort();
        this.break_alt = payload.getShort();
        this.land_dir = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.idx = payload.getUnsignedByte();
        this.count = payload.getUnsignedByte();
        this.flags = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_rally_point() {
        this.msgid = MAVLINK_MSG_ID_RALLY_POINT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_rally_point( int lat, int lng, short alt, short break_alt, int land_dir, short target_system, short target_component, short idx, short count, short flags) {
        this.msgid = MAVLINK_MSG_ID_RALLY_POINT;

        this.lat = lat;
        this.lng = lng;
        this.alt = alt;
        this.break_alt = break_alt;
        this.land_dir = land_dir;
        this.target_system = target_system;
        this.target_component = target_component;
        this.idx = idx;
        this.count = count;
        this.flags = flags;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_rally_point( int lat, int lng, short alt, short break_alt, int land_dir, short target_system, short target_component, short idx, short count, short flags, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RALLY_POINT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.lat = lat;
        this.lng = lng;
        this.alt = alt;
        this.break_alt = break_alt;
        this.land_dir = land_dir;
        this.target_system = target_system;
        this.target_component = target_component;
        this.idx = idx;
        this.count = count;
        this.flags = flags;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_rally_point(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RALLY_POINT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_rally_point(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_RALLY_POINT;

        readJSONheader(jo);
        
        this.lat = (int)jo.optInt("lat",0);
        this.lng = (int)jo.optInt("lng",0);
        this.alt = (short)jo.optInt("alt",0);
        this.break_alt = (short)jo.optInt("break_alt",0);
        this.land_dir = (int)jo.optInt("land_dir",0);
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
        this.idx = (short)jo.optInt("idx",0);
        this.count = (short)jo.optInt("count",0);
        this.flags = (short)jo.optInt("flags",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("lat", lat);
        jo.put("lng", lng);
        jo.put("alt", alt);
        jo.put("break_alt", break_alt);
        jo.put("land_dir", land_dir);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        jo.put("idx", idx);
        jo.put("count", count);
        jo.put("flags", flags);
        
        
        return jo;
    }

                        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_RALLY_POINT - sysid:"+sysid+" compid:"+compid+" lat:"+lat+" lng:"+lng+" alt:"+alt+" break_alt:"+break_alt+" land_dir:"+land_dir+" target_system:"+target_system+" target_component:"+target_component+" idx:"+idx+" count:"+count+" flags:"+flags+"";
    }
}
        