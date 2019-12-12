/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE VISION_SPEED_ESTIMATE PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Speed estimate from a vision source.
 */
public class msg_vision_speed_estimate extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE = 103;
    public static final int MAVLINK_MSG_LENGTH = 57;
    private static final long serialVersionUID = MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE;

      
    /**
     * Timestamp (UNIX time or time since system boot)
     */
    public long usec;
      
    /**
     * Global X speed
     */
    public float x;
      
    /**
     * Global Y speed
     */
    public float y;
      
    /**
     * Global Z speed
     */
    public float z;
      
    /**
     * Row-major representation of 3x3 linear velocity covariance matrix (states: vx, vy, vz; 1st three entries - 1st row, etc.). If unknown, assign NaN value to first element in the array.
     */
    public float covariance[] = new float[9];
      
    /**
     * Estimate reset counter. This should be incremented when the estimate resets in any of the dimensions (position, velocity, attitude, angular speed). This is designed to be used when e.g an external SLAM system detects a loop-closure and the estimate jumps.
     */
    public short reset_counter;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE;
        
        packet.payload.putUnsignedLong(usec);
        packet.payload.putFloat(x);
        packet.payload.putFloat(y);
        packet.payload.putFloat(z);
        
        if (isMavlink2) {
             
        for (int i = 0; i < covariance.length; i++) {
            packet.payload.putFloat(covariance[i]);
        }
                    
             packet.payload.putUnsignedByte(reset_counter);
            
        }
        return packet;
    }

    /**
     * Decode a vision_speed_estimate message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.usec = payload.getUnsignedLong();
        this.x = payload.getFloat();
        this.y = payload.getFloat();
        this.z = payload.getFloat();
        
        if (isMavlink2) {
              
        for (int i = 0; i < this.covariance.length; i++) {
            this.covariance[i] = payload.getFloat();
        }
                
             this.reset_counter = payload.getUnsignedByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_vision_speed_estimate() {
        this.msgid = MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_vision_speed_estimate( long usec, float x, float y, float z, float[] covariance, short reset_counter) {
        this.msgid = MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE;

        this.usec = usec;
        this.x = x;
        this.y = y;
        this.z = z;
        this.covariance = covariance;
        this.reset_counter = reset_counter;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_vision_speed_estimate( long usec, float x, float y, float z, float[] covariance, short reset_counter, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.usec = usec;
        this.x = x;
        this.y = y;
        this.z = z;
        this.covariance = covariance;
        this.reset_counter = reset_counter;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_vision_speed_estimate(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_vision_speed_estimate(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE;

        readJSONheader(jo);
        
         
        if (jo.has("usec")) {
            final JSONArray ja_usec = jo.optJSONArray("usec");
            if (ja_usec == null) {
                this.usec = (long)jo.optLong("usec", 0);
            } else if (ja_usec.length() > 0) {
                this.usec = (long)ja_usec.optLong(0, 0);
            }
        }
                    
        this.x = (float)jo.optDouble("x",0);
        this.y = (float)jo.optDouble("y",0);
        this.z = (float)jo.optDouble("z",0);
        
         
        if (jo.has("covariance")) {
            JSONArray ja_covariance = jo.optJSONArray("covariance");
            if (ja_covariance == null) {
                this.covariance[0] = (float)jo.optDouble("covariance", 0);
            } else {
                for (int i = 0; i < Math.min(this.covariance.length, ja_covariance.length()); i++) {
                    this.covariance[i] = (float)ja_covariance.optDouble(i,0);
                }
            }
        }
                    
        this.reset_counter = (short)jo.optInt("reset_counter",0);
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("usec", (long)usec);
        jo.put("x", (double)x);
        jo.put("y", (double)y);
        jo.put("z", (double)z);
        
         
        JSONArray ja_covariance = new JSONArray();
        for (int i = 0; i < this.covariance.length; i++) {
            ja_covariance.put(this.covariance[i]);
        }
        jo.putOpt("covariance", (Object)ja_covariance);
                
        jo.put("reset_counter", (int)reset_counter);
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_VISION_SPEED_ESTIMATE - sysid:"+sysid+" compid:"+compid+" usec:"+usec+" x:"+x+" y:"+y+" z:"+z+" covariance:"+covariance+" reset_counter:"+reset_counter+"";
    }
}
        