/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ICAROUS_HEARTBEAT PACKING
package com.mavlink.icarous;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * ICAROUS heartbeat
 */
public class msg_icarous_heartbeat extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ICAROUS_HEARTBEAT = 42000;
    public static final int MAVLINK_MSG_LENGTH = 1;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ICAROUS_HEARTBEAT;

      
    /**
     * See the FMS_STATE enum.
     */
    public short status;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ICAROUS_HEARTBEAT;
        
        packet.payload.putUnsignedByte(status);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a icarous_heartbeat message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.status = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_icarous_heartbeat() {
        this.msgid = MAVLINK_MSG_ID_ICAROUS_HEARTBEAT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_icarous_heartbeat( short status) {
        this.msgid = MAVLINK_MSG_ID_ICAROUS_HEARTBEAT;

        this.status = status;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_icarous_heartbeat( short status, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ICAROUS_HEARTBEAT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.status = status;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_icarous_heartbeat(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ICAROUS_HEARTBEAT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_icarous_heartbeat(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_ICAROUS_HEARTBEAT;

        readJSONheader(jo);
        
        this.status = (short)jo.optInt("status",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("status", (int)status);
        
        
        return jo;
    }

      
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_ICAROUS_HEARTBEAT - sysid:"+sysid+" compid:"+compid+" status:"+status+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ICAROUS_HEARTBEAT";
    }
}
        