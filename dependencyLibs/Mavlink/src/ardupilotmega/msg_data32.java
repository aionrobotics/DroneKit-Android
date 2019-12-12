/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DATA32 PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Data packet, size 32.
 */
public class msg_data32 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DATA32 = 170;
    public static final int MAVLINK_MSG_LENGTH = 34;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DATA32;

      
    /**
     * Data type.
     */
    public short type;
      
    /**
     * Data length.
     */
    public short len;
      
    /**
     * Raw data.
     */
    public short data[] = new short[32];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_DATA32;
        
        packet.payload.putUnsignedByte(type);
        packet.payload.putUnsignedByte(len);
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a data32 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.type = payload.getUnsignedByte();
        this.len = payload.getUnsignedByte();
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_data32() {
        this.msgid = MAVLINK_MSG_ID_DATA32;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_data32( short type, short len, short[] data) {
        this.msgid = MAVLINK_MSG_ID_DATA32;

        this.type = type;
        this.len = len;
        this.data = data;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_data32( short type, short len, short[] data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_DATA32;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.type = type;
        this.len = len;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_data32(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_DATA32;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_data32(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_DATA32;

        readJSONheader(jo);
        
        this.type = (short)jo.optInt("type",0);
        this.len = (short)jo.optInt("len",0);
         
        if (jo.has("data")) {
            JSONArray ja_data = jo.optJSONArray("data");
            if (ja_data == null) {
                this.data[0] = (short)jo.optInt("data", 0);
            } else {
                for (int i = 0; i < Math.min(this.data.length, ja_data.length()); i++) {
                    this.data[i] = (short)ja_data.optInt(i,0);
                }
            }
        }
                    
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("type", (int)type);
        jo.put("len", (int)len);
         
        JSONArray ja_data = new JSONArray();
        for (int i = 0; i < this.data.length; i++) {
            ja_data.put(this.data[i]);
        }
        jo.putOpt("data", (Object)ja_data);
                
        
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_DATA32 - sysid:"+sysid+" compid:"+compid+" type:"+type+" len:"+len+" data:"+data+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_DATA32";
    }
}
        