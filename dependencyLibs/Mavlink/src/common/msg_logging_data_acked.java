/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LOGGING_DATA_ACKED PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * A message containing logged data which requires a LOGGING_ACK to be sent back
 */
public class msg_logging_data_acked extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LOGGING_DATA_ACKED = 267;
    public static final int MAVLINK_MSG_LENGTH = 255;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LOGGING_DATA_ACKED;

      
    /**
     * sequence number (can wrap)
     */
    public int sequence;
      
    /**
     * system ID of the target
     */
    public short target_system;
      
    /**
     * component ID of the target
     */
    public short target_component;
      
    /**
     * data length
     */
    public short length;
      
    /**
     * offset into data where first message starts. This can be used for recovery, when a previous message got lost (set to 255 if no start exists).
     */
    public short first_message_offset;
      
    /**
     * logged data
     */
    public short data[] = new short[249];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LOGGING_DATA_ACKED;
        
        packet.payload.putUnsignedShort(sequence);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(length);
        packet.payload.putUnsignedByte(first_message_offset);
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        
        return packet;
    }

    /**
     * Decode a logging_data_acked message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.sequence = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.length = payload.getUnsignedByte();
        this.first_message_offset = payload.getUnsignedByte();
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_logging_data_acked() {
        this.msgid = MAVLINK_MSG_ID_LOGGING_DATA_ACKED;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_logging_data_acked( int sequence, short target_system, short target_component, short length, short first_message_offset, short[] data) {
        this.msgid = MAVLINK_MSG_ID_LOGGING_DATA_ACKED;

        this.sequence = sequence;
        this.target_system = target_system;
        this.target_component = target_component;
        this.length = length;
        this.first_message_offset = first_message_offset;
        this.data = data;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_logging_data_acked( int sequence, short target_system, short target_component, short length, short first_message_offset, short[] data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_LOGGING_DATA_ACKED;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.sequence = sequence;
        this.target_system = target_system;
        this.target_component = target_component;
        this.length = length;
        this.first_message_offset = first_message_offset;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_logging_data_acked(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_LOGGING_DATA_ACKED;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_logging_data_acked(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_LOGGING_DATA_ACKED;

        readJSONheader(jo);
        
        this.sequence = (int)jo.optInt("sequence");
        this.target_system = (short)jo.optInt("target_system");
        this.target_component = (short)jo.optInt("target_component");
        this.length = (short)jo.optInt("length");
        this.first_message_offset = (short)jo.optInt("first_message_offset");
         
        JSONArray ja_data = jo.optJSONArray("data");
        for (int i = 0; i < Math.min(this.data.length, ja_data.length()); i++) {
            this.data[i] = (short)ja_data.getInt(i);
        }
                
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("sequence", sequence);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        jo.put("length", length);
        jo.put("first_message_offset", first_message_offset);
         
        JSONArray ja_data = new JSONArray();
        for (int i = 0; i < this.data.length; i++) {
            ja_data.put(this.data[i]);
        }
        jo.put("data", (Object)ja_data);
                
        
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_LOGGING_DATA_ACKED - sysid:"+sysid+" compid:"+compid+" sequence:"+sequence+" target_system:"+target_system+" target_component:"+target_component+" length:"+length+" first_message_offset:"+first_message_offset+" data:"+data+"";
    }
}
        