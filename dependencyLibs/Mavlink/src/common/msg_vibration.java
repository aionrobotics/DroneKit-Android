/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE VIBRATION PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Vibration levels and accelerometer clipping
 */
public class msg_vibration extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_VIBRATION = 241;
    public static final int MAVLINK_MSG_LENGTH = 32;
    private static final long serialVersionUID = MAVLINK_MSG_ID_VIBRATION;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * Vibration levels on X-axis
     */
    public float vibration_x;
      
    /**
     * Vibration levels on Y-axis
     */
    public float vibration_y;
      
    /**
     * Vibration levels on Z-axis
     */
    public float vibration_z;
      
    /**
     * first accelerometer clipping count
     */
    public long clipping_0;
      
    /**
     * second accelerometer clipping count
     */
    public long clipping_1;
      
    /**
     * third accelerometer clipping count
     */
    public long clipping_2;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_VIBRATION;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putFloat(vibration_x);
        packet.payload.putFloat(vibration_y);
        packet.payload.putFloat(vibration_z);
        packet.payload.putUnsignedInt(clipping_0);
        packet.payload.putUnsignedInt(clipping_1);
        packet.payload.putUnsignedInt(clipping_2);
        
        
        return packet;
    }

    /**
     * Decode a vibration message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.vibration_x = payload.getFloat();
        this.vibration_y = payload.getFloat();
        this.vibration_z = payload.getFloat();
        this.clipping_0 = payload.getUnsignedInt();
        this.clipping_1 = payload.getUnsignedInt();
        this.clipping_2 = payload.getUnsignedInt();
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_vibration() {
        this.msgid = MAVLINK_MSG_ID_VIBRATION;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_vibration( long time_usec, float vibration_x, float vibration_y, float vibration_z, long clipping_0, long clipping_1, long clipping_2) {
        this.msgid = MAVLINK_MSG_ID_VIBRATION;

        this.time_usec = time_usec;
        this.vibration_x = vibration_x;
        this.vibration_y = vibration_y;
        this.vibration_z = vibration_z;
        this.clipping_0 = clipping_0;
        this.clipping_1 = clipping_1;
        this.clipping_2 = clipping_2;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_vibration( long time_usec, float vibration_x, float vibration_y, float vibration_z, long clipping_0, long clipping_1, long clipping_2, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_VIBRATION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.vibration_x = vibration_x;
        this.vibration_y = vibration_y;
        this.vibration_z = vibration_z;
        this.clipping_0 = clipping_0;
        this.clipping_1 = clipping_1;
        this.clipping_2 = clipping_2;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_vibration(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_VIBRATION;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_vibration(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_VIBRATION;

        readJSONheader(jo);
        
        this.time_usec = (long)jo.optLong("time_usec");
        this.vibration_x = (float)jo.optFloat("vibration_x");
        this.vibration_y = (float)jo.optFloat("vibration_y");
        this.vibration_z = (float)jo.optFloat("vibration_z");
        this.clipping_0 = (long)jo.optLong("clipping_0");
        this.clipping_1 = (long)jo.optLong("clipping_1");
        this.clipping_2 = (long)jo.optLong("clipping_2");
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", time_usec);
        jo.put("vibration_x", vibration_x);
        jo.put("vibration_y", vibration_y);
        jo.put("vibration_z", vibration_z);
        jo.put("clipping_0", clipping_0);
        jo.put("clipping_1", clipping_1);
        jo.put("clipping_2", clipping_2);
        
        
        return jo;
    }

                  
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_VIBRATION - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" vibration_x:"+vibration_x+" vibration_y:"+vibration_y+" vibration_z:"+vibration_z+" clipping_0:"+clipping_0+" clipping_1:"+clipping_1+" clipping_2:"+clipping_2+"";
    }
}
        