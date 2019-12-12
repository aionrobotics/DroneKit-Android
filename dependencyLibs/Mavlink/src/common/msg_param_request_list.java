/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PARAM_REQUEST_LIST PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Request all parameters of this component. After this request, all parameters are emitted. The parameter microservice is documented at https://mavlink.io/en/services/parameter.html
 */
public class msg_param_request_list extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_PARAM_REQUEST_LIST = 21;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PARAM_REQUEST_LIST;

      
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
        packet.msgid = MAVLINK_MSG_ID_PARAM_REQUEST_LIST;
        
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a param_request_list message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_param_request_list() {
        this.msgid = MAVLINK_MSG_ID_PARAM_REQUEST_LIST;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_param_request_list( short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_PARAM_REQUEST_LIST;

        this.target_system = target_system;
        this.target_component = target_component;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_param_request_list( short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_PARAM_REQUEST_LIST;
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
    public msg_param_request_list(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_PARAM_REQUEST_LIST;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_param_request_list(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_PARAM_REQUEST_LIST;

        readJSONheader(jo);
        
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("target_system", (int)target_system);
        jo.put("target_component", (int)target_component);
        
        
        return jo;
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_PARAM_REQUEST_LIST - sysid:"+sysid+" compid:"+compid+" target_system:"+target_system+" target_component:"+target_component+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_PARAM_REQUEST_LIST";
    }
}
        