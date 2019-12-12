/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LOG_REQUEST_END PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Stop log transfer and resume normal logging
 */
public class msg_log_request_end extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LOG_REQUEST_END = 122;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LOG_REQUEST_END;

      
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
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LOG_REQUEST_END;
        
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        
        return packet;
    }

    /**
     * Decode a log_request_end message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_log_request_end() {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_END;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_log_request_end( short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_END;

        this.target_system = target_system;
        this.target_component = target_component;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_log_request_end( short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_END;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_log_request_end(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_END;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_log_request_end(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_LOG_REQUEST_END;

        readJSONheader(jo);
        
        this.target_system = (short)jo.optInt("target_system");
        this.target_component = (short)jo.optInt("target_component");
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        
        
        return jo;
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_LOG_REQUEST_END - sysid:"+sysid+" compid:"+compid+" target_system:"+target_system+" target_component:"+target_component+"";
    }
}
        