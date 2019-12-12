/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MISSION_CURRENT PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Message that announces the sequence number of the current active mission item. The MAV will fly towards this mission item.
 */
public class msg_mission_current extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MISSION_CURRENT = 42;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MISSION_CURRENT;

      
    /**
     * Sequence
     */
    public int seq;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MISSION_CURRENT;
        
        packet.payload.putUnsignedShort(seq);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a mission_current message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.seq = payload.getUnsignedShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mission_current() {
        this.msgid = MAVLINK_MSG_ID_MISSION_CURRENT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_mission_current( int seq) {
        this.msgid = MAVLINK_MSG_ID_MISSION_CURRENT;

        this.seq = seq;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_mission_current( int seq, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MISSION_CURRENT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.seq = seq;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mission_current(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MISSION_CURRENT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_mission_current(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_MISSION_CURRENT;

        readJSONheader(jo);
        
        this.seq = (int)jo.optInt("seq",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("seq", seq);
        
        
        return jo;
    }

      
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_MISSION_CURRENT - sysid:"+sysid+" compid:"+compid+" seq:"+seq+"";
    }
}
        