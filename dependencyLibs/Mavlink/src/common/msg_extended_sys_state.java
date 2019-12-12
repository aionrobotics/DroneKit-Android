/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE EXTENDED_SYS_STATE PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Provides state for additional features
 */
public class msg_extended_sys_state extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_EXTENDED_SYS_STATE = 245;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;

      
    /**
     * The VTOL state if applicable. Is set to MAV_VTOL_STATE_UNDEFINED if UAV is not in VTOL configuration.
     */
    public short vtol_state;
      
    /**
     * The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown.
     */
    public short landed_state;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;
        
        packet.payload.putUnsignedByte(vtol_state);
        packet.payload.putUnsignedByte(landed_state);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a extended_sys_state message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.vtol_state = payload.getUnsignedByte();
        this.landed_state = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_extended_sys_state() {
        this.msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_extended_sys_state( short vtol_state, short landed_state) {
        this.msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;

        this.vtol_state = vtol_state;
        this.landed_state = landed_state;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_extended_sys_state( short vtol_state, short landed_state, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.vtol_state = vtol_state;
        this.landed_state = landed_state;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_extended_sys_state(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_extended_sys_state(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_EXTENDED_SYS_STATE;

        readJSONheader(jo);
        
        this.vtol_state = (short)jo.optInt("vtol_state",0);
        this.landed_state = (short)jo.optInt("landed_state",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("vtol_state", (int)vtol_state);
        jo.put("landed_state", (int)landed_state);
        
        
        return jo;
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_EXTENDED_SYS_STATE - sysid:"+sysid+" compid:"+compid+" vtol_state:"+vtol_state+" landed_state:"+landed_state+"";
    }
}
        