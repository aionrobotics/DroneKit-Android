/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DEBUG PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Send a debug value. The index is used to discriminate between values. These values show up in the plot of QGroundControl as DEBUG N.
 */
public class msg_debug extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DEBUG = 254;
    public static final int MAVLINK_MSG_LENGTH = 9;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DEBUG;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * DEBUG value
     */
    public float value;
      
    /**
     * index of debug variable
     */
    public short ind;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_DEBUG;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putFloat(value);
        packet.payload.putUnsignedByte(ind);
        
        
        return packet;
    }

    /**
     * Decode a debug message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.value = payload.getFloat();
        this.ind = payload.getUnsignedByte();
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_debug() {
        this.msgid = MAVLINK_MSG_ID_DEBUG;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_debug( long time_boot_ms, float value, short ind) {
        this.msgid = MAVLINK_MSG_ID_DEBUG;

        this.time_boot_ms = time_boot_ms;
        this.value = value;
        this.ind = ind;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_debug( long time_boot_ms, float value, short ind, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_DEBUG;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.value = value;
        this.ind = ind;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_debug(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_DEBUG;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_debug(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_DEBUG;

        readJSONheader(jo);
        
        this.time_boot_ms = (long)jo.optLong("time_boot_ms");
        this.value = (float)jo.optFloat("value");
        this.ind = (short)jo.optInt("ind");
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_boot_ms", time_boot_ms);
        jo.put("value", value);
        jo.put("ind", ind);
        
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_DEBUG - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" value:"+value+" ind:"+ind+"";
    }
}
        