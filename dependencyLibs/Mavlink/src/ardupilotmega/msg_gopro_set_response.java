/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GOPRO_SET_RESPONSE PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Response from a GOPRO_COMMAND set request.
 */
public class msg_gopro_set_response extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GOPRO_SET_RESPONSE = 219;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;

      
    /**
     * Command ID.
     */
    public short cmd_id;
      
    /**
     * Status.
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
        packet.msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;
        
        packet.payload.putUnsignedByte(cmd_id);
        packet.payload.putUnsignedByte(status);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gopro_set_response message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.cmd_id = payload.getUnsignedByte();
        this.status = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gopro_set_response() {
        this.msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gopro_set_response( short cmd_id, short status) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;

        this.cmd_id = cmd_id;
        this.status = status;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gopro_set_response( short cmd_id, short status, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.cmd_id = cmd_id;
        this.status = status;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gopro_set_response(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_gopro_set_response(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_SET_RESPONSE;

        readJSONheader(jo);
        
        this.cmd_id = (short)jo.optInt("cmd_id",0);
        this.status = (short)jo.optInt("status",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("cmd_id", (int)cmd_id);
        jo.put("status", (int)status);
        
        
        return jo;
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GOPRO_SET_RESPONSE - sysid:"+sysid+" compid:"+compid+" cmd_id:"+cmd_id+" status:"+status+"";
    }
}
        