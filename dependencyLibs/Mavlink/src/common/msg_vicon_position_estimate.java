/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE VICON_POSITION_ESTIMATE PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Global position estimate from a Vicon motion system source.
 */
public class msg_vicon_position_estimate extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE = 104;
    public static final int MAVLINK_MSG_LENGTH = 116;
    private static final long serialVersionUID = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;

      
    /**
     * Timestamp (UNIX time or time since system boot)
     */
    public long usec;
      
    /**
     * Global X position
     */
    public float x;
      
    /**
     * Global Y position
     */
    public float y;
      
    /**
     * Global Z position
     */
    public float z;
      
    /**
     * Roll angle
     */
    public float roll;
      
    /**
     * Pitch angle
     */
    public float pitch;
      
    /**
     * Yaw angle
     */
    public float yaw;
      
    /**
     * Row-major representation of 6x6 pose cross-covariance matrix upper right triangle (states: x, y, z, roll, pitch, yaw; first six entries are the first ROW, next five entries are the second ROW, etc.). If unknown, assign NaN value to first element in the array.
     */
    public float covariance[] = new float[21];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;
        
        packet.payload.putUnsignedLong(usec);
        packet.payload.putFloat(x);
        packet.payload.putFloat(y);
        packet.payload.putFloat(z);
        packet.payload.putFloat(roll);
        packet.payload.putFloat(pitch);
        packet.payload.putFloat(yaw);
        
        
        if(isMavlink2) {
            
        for (int i = 0; i < covariance.length; i++) {
            packet.payload.putFloat(covariance[i]);
        }
                    
        }
        return packet;
    }

    /**
     * Decode a vicon_position_estimate message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.usec = payload.getUnsignedLong();
        this.x = payload.getFloat();
        this.y = payload.getFloat();
        this.z = payload.getFloat();
        this.roll = payload.getFloat();
        this.pitch = payload.getFloat();
        this.yaw = payload.getFloat();
        
        
        if(isMavlink2) {
             
        for (int i = 0; i < this.covariance.length; i++) {
            this.covariance[i] = payload.getFloat();
        }
                
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_vicon_position_estimate() {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_vicon_position_estimate( long usec, float x, float y, float z, float roll, float pitch, float yaw, float[] covariance) {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;

        this.usec = usec;
        this.x = x;
        this.y = y;
        this.z = z;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.covariance = covariance;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_vicon_position_estimate( long usec, float x, float y, float z, float roll, float pitch, float yaw, float[] covariance, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.usec = usec;
        this.x = x;
        this.y = y;
        this.z = z;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.covariance = covariance;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_vicon_position_estimate(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_vicon_position_estimate(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE;

        readJSONheader(jo);
        
        this.usec = (long)jo.optLong("usec");
        this.x = (float)jo.optFloat("x");
        this.y = (float)jo.optFloat("y");
        this.z = (float)jo.optFloat("z");
        this.roll = (float)jo.optFloat("roll");
        this.pitch = (float)jo.optFloat("pitch");
        this.yaw = (float)jo.optFloat("yaw");
        
         
        JSONArray ja_covariance = jo.optJSONArray("covariance");
        for (int i = 0; i < Math.min(this.covariance.length, ja_covariance.length()); i++) {
            this.covariance[i] = (float)ja_covariance.getFloat(i);
        }
                
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("usec", usec);
        jo.put("x", x);
        jo.put("y", y);
        jo.put("z", z);
        jo.put("roll", roll);
        jo.put("pitch", pitch);
        jo.put("yaw", yaw);
        
         
        JSONArray ja_covariance = new JSONArray();
        for (int i = 0; i < this.covariance.length; i++) {
            ja_covariance.put(this.covariance[i]);
        }
        jo.put("covariance", (Object)ja_covariance);
                
        
        return jo;
    }

                    
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_VICON_POSITION_ESTIMATE - sysid:"+sysid+" compid:"+compid+" usec:"+usec+" x:"+x+" y:"+y+" z:"+z+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" covariance:"+covariance+"";
    }
}
        