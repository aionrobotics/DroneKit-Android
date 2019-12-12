/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LOG_REQUEST_DATA PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Request a chunk of a log
 */
public class msg_log_request_data extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LOG_REQUEST_DATA = 119;
    public static final int MAVLINK_MSG_LENGTH = 12;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LOG_REQUEST_DATA;

      
    /**
     * Offset into the log
     */
    public long ofs;
      
    /**
     * Number of bytes
     */
    public long count;
      
    /**
     * Log id (from LOG_ENTRY reply)
     */
    public int id;
      
    /**
     * System ID
     */
    public short target_system;
      
    /**
     * Component ID
     */
    public short target_component;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LOG_REQUEST_DATA;
        
        packet.payload.putUnsignedInt(ofs);
        packet.payload.putUnsignedInt(count);
        packet.payload.putUnsignedShort(id);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a log_request_data message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.ofs = payload.getUnsignedInt();
        this.count = payload.getUnsignedInt();
        this.id = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_log_request_data() {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_DATA;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_log_request_data( long ofs, long count, int id, short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_DATA;

        this.ofs = ofs;
        this.count = count;
        this.id = id;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_log_request_data( long ofs, long count, int id, short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_DATA;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ofs = ofs;
        this.count = count;
        this.id = id;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_log_request_data(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_DATA;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_log_request_data(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_DATA;

        readJSONheader(jo);
        
        this.ofs = (long)jo.optLong("ofs",0);
        this.count = (long)jo.optLong("count",0);
        this.id = (int)jo.optInt("id",0);
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("ofs", ofs);
        jo.put("count", count);
        jo.put("id", id);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        
        
        return jo;
    }

              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_LOG_REQUEST_DATA - sysid:"+sysid+" compid:"+compid+" ofs:"+ofs+" count:"+count+" id:"+id+" target_system:"+target_system+" target_component:"+target_component+"";
    }
}
        