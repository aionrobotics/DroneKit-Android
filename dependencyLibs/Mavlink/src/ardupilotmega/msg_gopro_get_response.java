/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GOPRO_GET_RESPONSE PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Response from a GOPRO_COMMAND get request.
 */
public class msg_gopro_get_response extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GOPRO_GET_RESPONSE = 217;
    public static final int MAVLINK_MSG_LENGTH = 6;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;

      
    /**
     * Command ID.
     */
    public short cmd_id;
      
    /**
     * Status.
     */
    public short status;
      
    /**
     * Value.
     */
    public short value[] = new short[4];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;
        
        packet.payload.putUnsignedByte(cmd_id);
        packet.payload.putUnsignedByte(status);
        
        for (int i = 0; i < value.length; i++) {
            packet.payload.putUnsignedByte(value[i]);
        }
                    
        
        
        return packet;
    }

    /**
     * Decode a gopro_get_response message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.cmd_id = payload.getUnsignedByte();
        this.status = payload.getUnsignedByte();
         
        for (int i = 0; i < this.value.length; i++) {
            this.value[i] = payload.getUnsignedByte();
        }
                
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gopro_get_response() {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gopro_get_response( short cmd_id, short status, short[] value) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;

        this.cmd_id = cmd_id;
        this.status = status;
        this.value = value;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gopro_get_response( short cmd_id, short status, short[] value, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.cmd_id = cmd_id;
        this.status = status;
        this.value = value;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gopro_get_response(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_gopro_get_response(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_GET_RESPONSE;

        readJSONheader(jo);
        
        this.cmd_id = (short)jo.optInt("cmd_id");
        this.status = (short)jo.optInt("status");
         
        JSONArray ja_value = jo.optJSONArray("value");
        for (int i = 0; i < Math.min(this.value.length, ja_value.length()); i++) {
            this.value[i] = (short)ja_value.getInt(i);
        }
                
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("cmd_id", cmd_id);
        jo.put("status", status);
         
        JSONArray ja_value = new JSONArray();
        for (int i = 0; i < this.value.length; i++) {
            ja_value.put(this.value[i]);
        }
        jo.put("value", (Object)ja_value);
                
        
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_GOPRO_GET_RESPONSE - sysid:"+sysid+" compid:"+compid+" cmd_id:"+cmd_id+" status:"+status+" value:"+value+"";
    }
}
        