/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE V2_EXTENSION PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Message implementing parts of the V2 payload specs in V1 frames for transitional support.
 */
public class msg_v2_extension extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_V2_EXTENSION = 248;
    public static final int MAVLINK_MSG_LENGTH = 254;
    private static final long serialVersionUID = MAVLINK_MSG_ID_V2_EXTENSION;

      
    /**
     * A code that identifies the software component that understands this message (analogous to USB device classes or mime type strings).  If this code is less than 32768, it is considered a 'registered' protocol extension and the corresponding entry should be added to https://github.com/mavlink/mavlink/extension-message-ids.xml.  Software creators can register blocks of message IDs as needed (useful for GCS specific metadata, etc...). Message_types greater than 32767 are considered local experiments and should not be checked in to any widely distributed codebase.
     */
    public int message_type;
      
    /**
     * Network ID (0 for broadcast)
     */
    public short target_network;
      
    /**
     * System ID (0 for broadcast)
     */
    public short target_system;
      
    /**
     * Component ID (0 for broadcast)
     */
    public short target_component;
      
    /**
     * Variable length payload. The length is defined by the remaining message length when subtracting the header and other fields.  The entire content of this block is opaque unless you understand any the encoding message_type.  The particular encoding used can be extension specific and might not always be documented as part of the mavlink specification.
     */
    public short payload[] = new short[249];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_V2_EXTENSION;
        
        packet.payload.putUnsignedShort(message_type);
        packet.payload.putUnsignedByte(target_network);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        for (int i = 0; i < payload.length; i++) {
            packet.payload.putUnsignedByte(payload[i]);
        }
                    
        
        
        return packet;
    }

    /**
     * Decode a v2_extension message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.message_type = payload.getUnsignedShort();
        this.target_network = payload.getUnsignedByte();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
         
        for (int i = 0; i < this.payload.length; i++) {
            this.payload[i] = payload.getUnsignedByte();
        }
                
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_v2_extension() {
        this.msgid = MAVLINK_MSG_ID_V2_EXTENSION;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_v2_extension( int message_type, short target_network, short target_system, short target_component, short[] payload) {
        this.msgid = MAVLINK_MSG_ID_V2_EXTENSION;

        this.message_type = message_type;
        this.target_network = target_network;
        this.target_system = target_system;
        this.target_component = target_component;
        this.payload = payload;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_v2_extension( int message_type, short target_network, short target_system, short target_component, short[] payload, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_V2_EXTENSION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.message_type = message_type;
        this.target_network = target_network;
        this.target_system = target_system;
        this.target_component = target_component;
        this.payload = payload;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_v2_extension(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_V2_EXTENSION;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_v2_extension(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_V2_EXTENSION;

        readJSONheader(jo);
        
        this.message_type = (int)jo.optInt("message_type");
        this.target_network = (short)jo.optInt("target_network");
        this.target_system = (short)jo.optInt("target_system");
        this.target_component = (short)jo.optInt("target_component");
         
        JSONArray ja_payload = jo.optJSONArray("payload");
        for (int i = 0; i < Math.min(this.payload.length, ja_payload.length()); i++) {
            this.payload[i] = (short)ja_payload.getInt(i);
        }
                
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("message_type", message_type);
        jo.put("target_network", target_network);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
         
        JSONArray ja_payload = new JSONArray();
        for (int i = 0; i < this.payload.length; i++) {
            ja_payload.put(this.payload[i]);
        }
        jo.put("payload", (Object)ja_payload);
                
        
        
        return jo;
    }

              
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_V2_EXTENSION - sysid:"+sysid+" compid:"+compid+" message_type:"+message_type+" target_network:"+target_network+" target_system:"+target_system+" target_component:"+target_component+" payload:"+payload+"";
    }
}
        