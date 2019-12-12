/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MEMINFO PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * State of APM memory.
 */
public class msg_meminfo extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MEMINFO = 152;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MEMINFO;

      
    /**
     * Heap top.
     */
    public int brkval;
      
    /**
     * Free memory.
     */
    public int freemem;
      
    /**
     * Free memory (32 bit).
     */
    public long freemem32;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MEMINFO;
        
        packet.payload.putUnsignedShort(brkval);
        packet.payload.putUnsignedShort(freemem);
        
        if (isMavlink2) {
             packet.payload.putUnsignedInt(freemem32);
            
        }
        return packet;
    }

    /**
     * Decode a meminfo message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.brkval = payload.getUnsignedShort();
        this.freemem = payload.getUnsignedShort();
        
        if (isMavlink2) {
             this.freemem32 = payload.getUnsignedInt();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_meminfo() {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_meminfo( int brkval, int freemem, long freemem32) {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;

        this.brkval = brkval;
        this.freemem = freemem;
        this.freemem32 = freemem32;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_meminfo( int brkval, int freemem, long freemem32, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.brkval = brkval;
        this.freemem = freemem;
        this.freemem32 = freemem32;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_meminfo(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_meminfo(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;

        readJSONheader(jo);
        
        this.brkval = (int)jo.optInt("brkval",0);
        this.freemem = (int)jo.optInt("freemem",0);
        
        this.freemem32 = (long)jo.optLong("freemem32",0);
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("brkval", (int)brkval);
        jo.put("freemem", (int)freemem);
        
        jo.put("freemem32", (long)freemem32);
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_MEMINFO - sysid:"+sysid+" compid:"+compid+" brkval:"+brkval+" freemem:"+freemem+" freemem32:"+freemem32+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_MEMINFO";
    }
}
        