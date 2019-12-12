/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PARAM_VALUE PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Emit the value of a onboard parameter. The inclusion of param_count and param_index in the message allows the recipient to keep track of received parameters and allows him to re-request missing parameters after a loss or timeout. The parameter microservice is documented at https://mavlink.io/en/services/parameter.html
 */
public class msg_param_value extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_PARAM_VALUE = 22;
    public static final int MAVLINK_MSG_LENGTH = 25;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PARAM_VALUE;

      
    /**
     * Onboard parameter value
     */
    public float param_value;
      
    /**
     * Total number of onboard parameters
     */
    public int param_count;
      
    /**
     * Index of this onboard parameter
     */
    public int param_index;
      
    /**
     * Onboard parameter id, terminated by NULL if the length is less than 16 human-readable chars and WITHOUT null termination (NULL) byte if the length is exactly 16 chars - applications have to provide 16+1 bytes storage if the ID is stored as string
     */
    public byte param_id[] = new byte[16];
      
    /**
     * Onboard parameter type.
     */
    public short param_type;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_PARAM_VALUE;
        
        packet.payload.putFloat(param_value);
        packet.payload.putUnsignedShort(param_count);
        packet.payload.putUnsignedShort(param_index);
        
        for (int i = 0; i < param_id.length; i++) {
            packet.payload.putByte(param_id[i]);
        }
                    
        packet.payload.putUnsignedByte(param_type);
        
        
        return packet;
    }

    /**
     * Decode a param_value message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.param_value = payload.getFloat();
        this.param_count = payload.getUnsignedShort();
        this.param_index = payload.getUnsignedShort();
         
        for (int i = 0; i < this.param_id.length; i++) {
            this.param_id[i] = payload.getByte();
        }
                
        this.param_type = payload.getUnsignedByte();
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_param_value() {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_param_value( float param_value, int param_count, int param_index, byte[] param_id, short param_type) {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE;

        this.param_value = param_value;
        this.param_count = param_count;
        this.param_index = param_index;
        this.param_id = param_id;
        this.param_type = param_type;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_param_value( float param_value, int param_count, int param_index, byte[] param_id, short param_type, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.param_value = param_value;
        this.param_count = param_count;
        this.param_index = param_index;
        this.param_id = param_id;
        this.param_type = param_type;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_param_value(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_param_value(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE;

        readJSONheader(jo);
        
        this.param_value = (float)jo.optFloat("param_value");
        this.param_count = (int)jo.optInt("param_count");
        this.param_index = (int)jo.optInt("param_index");
         
        JSONArray ja_param_id = jo.optJSONArray("param_id");
        for (int i = 0; i < Math.min(this.param_id.length, ja_param_id.length()); i++) {
            this.param_id[i] = (byte)ja_param_id.getInt(i);
        }
                
        this.param_type = (short)jo.optInt("param_type");
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("param_value", param_value);
        jo.put("param_count", param_count);
        jo.put("param_index", param_index);
         
        JSONArray ja_param_id = new JSONArray();
        for (int i = 0; i < this.param_id.length; i++) {
            ja_param_id.put(this.param_id[i]);
        }
        jo.put("param_id", (Object)ja_param_id);
                
        jo.put("param_type", param_type);
        
        
        return jo;
    }

           
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setParam_Id(String str) {
        int len = Math.min(str.length(), 16);
        for (int i=0; i<len; i++) {
            param_id[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<16; i++) {            // padding for the rest of the buffer
            param_id[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getParam_Id() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (param_id[i] != 0)
                buf.append((char) param_id[i]);
            else
                break;
        }
        return buf.toString();

    }
                           
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_PARAM_VALUE - sysid:"+sysid+" compid:"+compid+" param_value:"+param_value+" param_count:"+param_count+" param_index:"+param_index+" param_id:"+param_id+" param_type:"+param_type+"";
    }
}
        