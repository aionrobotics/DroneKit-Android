/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SYSTEM_TIME PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The system time is the time of the master clock, typically the computer clock of the main onboard computer.
 */
public class msg_system_time extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SYSTEM_TIME = 2;
    public static final int MAVLINK_MSG_LENGTH = 12;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SYSTEM_TIME;

      
    /**
     * Timestamp (UNIX epoch time).
     */
    public long time_unix_usec;
      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SYSTEM_TIME;
        
        packet.payload.putUnsignedLong(time_unix_usec);
        packet.payload.putUnsignedInt(time_boot_ms);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a system_time message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_unix_usec = payload.getUnsignedLong();
        this.time_boot_ms = payload.getUnsignedInt();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_system_time() {
        this.msgid = MAVLINK_MSG_ID_SYSTEM_TIME;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_system_time( long time_unix_usec, long time_boot_ms) {
        this.msgid = MAVLINK_MSG_ID_SYSTEM_TIME;

        this.time_unix_usec = time_unix_usec;
        this.time_boot_ms = time_boot_ms;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_system_time( long time_unix_usec, long time_boot_ms, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SYSTEM_TIME;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_unix_usec = time_unix_usec;
        this.time_boot_ms = time_boot_ms;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_system_time(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SYSTEM_TIME;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_system_time(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SYSTEM_TIME;

        readJSONheader(jo);
        
        this.time_unix_usec = (long)jo.optLong("time_unix_usec",0);
        this.time_boot_ms = (long)jo.optLong("time_boot_ms",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_unix_usec", time_unix_usec);
        jo.put("time_boot_ms", time_boot_ms);
        
        
        return jo;
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SYSTEM_TIME - sysid:"+sysid+" compid:"+compid+" time_unix_usec:"+time_unix_usec+" time_boot_ms:"+time_boot_ms+"";
    }
}
        