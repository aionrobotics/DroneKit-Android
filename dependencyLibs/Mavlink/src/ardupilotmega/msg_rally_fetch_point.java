/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RALLY_FETCH_POINT PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Request a current rally point from MAV. MAV should respond with a RALLY_POINT message. MAV should not respond if the request is invalid.
 */
public class msg_rally_fetch_point extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RALLY_FETCH_POINT = 176;
    public static final int MAVLINK_MSG_LENGTH = 3;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RALLY_FETCH_POINT;

      
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
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_RALLY_FETCH_POINT;
        
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(idx);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a rally_fetch_point message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.idx = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_rally_fetch_point() {
        this.msgid = MAVLINK_MSG_ID_RALLY_FETCH_POINT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_rally_fetch_point( short target_system, short target_component, short idx) {
        this.msgid = MAVLINK_MSG_ID_RALLY_FETCH_POINT;

        this.target_system = target_system;
        this.target_component = target_component;
        this.idx = idx;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_rally_fetch_point( short target_system, short target_component, short idx, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RALLY_FETCH_POINT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.target_system = target_system;
        this.target_component = target_component;
        this.idx = idx;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_rally_fetch_point(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RALLY_FETCH_POINT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_rally_fetch_point(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_RALLY_FETCH_POINT;

        readJSONheader(jo);
        
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
        this.idx = (short)jo.optInt("idx",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("target_system", (int)target_system);
        jo.put("target_component", (int)target_component);
        jo.put("idx", (int)idx);
        
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_RALLY_FETCH_POINT - sysid:"+sysid+" compid:"+compid+" target_system:"+target_system+" target_component:"+target_component+" idx:"+idx+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_RALLY_FETCH_POINT";
    }
}
        