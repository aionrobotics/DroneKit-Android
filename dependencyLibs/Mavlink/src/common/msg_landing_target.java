/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LANDING_TARGET PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The location of a landing target. See: https://mavlink.io/en/services/landing_target.html
 */
public class msg_landing_target extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LANDING_TARGET = 149;
    public static final int MAVLINK_MSG_LENGTH = 60;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LANDING_TARGET;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * X-axis angular offset of the target from the center of the image
     */
    public float angle_x;
      
    /**
     * Y-axis angular offset of the target from the center of the image
     */
    public float angle_y;
      
    /**
     * Distance to the target from the vehicle
     */
    public float distance;
      
    /**
     * Size of target along x-axis
     */
    public float size_x;
      
    /**
     * Size of target along y-axis
     */
    public float size_y;
      
    /**
     * The ID of the target if multiple targets are present
     */
    public short target_num;
      
    /**
     * Coordinate frame used for following fields.
     */
    public short frame;
      
    /**
     * X Position of the landing target in MAV_FRAME
     */
    public float x;
      
    /**
     * Y Position of the landing target in MAV_FRAME
     */
    public float y;
      
    /**
     * Z Position of the landing target in MAV_FRAME
     */
    public float z;
      
    /**
     * Quaternion of landing target orientation (w, x, y, z order, zero-rotation is 1, 0, 0, 0)
     */
    public float q[] = new float[4];
      
    /**
     * Type of landing target
     */
    public short type;
      
    /**
     * Boolean indicating whether the position fields (x, y, z, q, type) contain valid target position information (valid: 1, invalid: 0). Default is 0 (invalid).
     */
    public short position_valid;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LANDING_TARGET;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putFloat(angle_x);
        packet.payload.putFloat(angle_y);
        packet.payload.putFloat(distance);
        packet.payload.putFloat(size_x);
        packet.payload.putFloat(size_y);
        packet.payload.putUnsignedByte(target_num);
        packet.payload.putUnsignedByte(frame);
        
        if (isMavlink2) {
             packet.payload.putFloat(x);
             packet.payload.putFloat(y);
             packet.payload.putFloat(z);
             
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
             packet.payload.putUnsignedByte(type);
             packet.payload.putUnsignedByte(position_valid);
            
        }
        return packet;
    }

    /**
     * Decode a landing_target message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.angle_x = payload.getFloat();
        this.angle_y = payload.getFloat();
        this.distance = payload.getFloat();
        this.size_x = payload.getFloat();
        this.size_y = payload.getFloat();
        this.target_num = payload.getUnsignedByte();
        this.frame = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.x = payload.getFloat();
             this.y = payload.getFloat();
             this.z = payload.getFloat();
              
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
             this.type = payload.getUnsignedByte();
             this.position_valid = payload.getUnsignedByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_landing_target() {
        this.msgid = MAVLINK_MSG_ID_LANDING_TARGET;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_landing_target( long time_usec, float angle_x, float angle_y, float distance, float size_x, float size_y, short target_num, short frame, float x, float y, float z, float[] q, short type, short position_valid) {
        this.msgid = MAVLINK_MSG_ID_LANDING_TARGET;

        this.time_usec = time_usec;
        this.angle_x = angle_x;
        this.angle_y = angle_y;
        this.distance = distance;
        this.size_x = size_x;
        this.size_y = size_y;
        this.target_num = target_num;
        this.frame = frame;
        this.x = x;
        this.y = y;
        this.z = z;
        this.q = q;
        this.type = type;
        this.position_valid = position_valid;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_landing_target( long time_usec, float angle_x, float angle_y, float distance, float size_x, float size_y, short target_num, short frame, float x, float y, float z, float[] q, short type, short position_valid, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_LANDING_TARGET;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.angle_x = angle_x;
        this.angle_y = angle_y;
        this.distance = distance;
        this.size_x = size_x;
        this.size_y = size_y;
        this.target_num = target_num;
        this.frame = frame;
        this.x = x;
        this.y = y;
        this.z = z;
        this.q = q;
        this.type = type;
        this.position_valid = position_valid;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_landing_target(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_LANDING_TARGET;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_landing_target(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_LANDING_TARGET;

        readJSONheader(jo);
        
         
        if (jo.has("time_usec")) {
            final JSONArray ja_time_usec = jo.optJSONArray("time_usec");
            if (ja_time_usec == null) {
                this.time_usec = (long)jo.optLong("time_usec", 0);
            } else if (ja_time_usec.length() > 0) {
                this.time_usec = (long)ja_time_usec.optLong(0, 0);
            }
        }
                    
        this.angle_x = (float)jo.optDouble("angle_x",0);
        this.angle_y = (float)jo.optDouble("angle_y",0);
        this.distance = (float)jo.optDouble("distance",0);
        this.size_x = (float)jo.optDouble("size_x",0);
        this.size_y = (float)jo.optDouble("size_y",0);
        this.target_num = (short)jo.optInt("target_num",0);
        this.frame = (short)jo.optInt("frame",0);
        
        this.x = (float)jo.optDouble("x",0);
        this.y = (float)jo.optDouble("y",0);
        this.z = (float)jo.optDouble("z",0);
         
        if (jo.has("q")) {
            JSONArray ja_q = jo.optJSONArray("q");
            if (ja_q == null) {
                this.q[0] = (float)jo.optDouble("q", 0);
            } else {
                for (int i = 0; i < Math.min(this.q.length, ja_q.length()); i++) {
                    this.q[i] = (float)ja_q.optDouble(i,0);
                }
            }
        }
                    
        this.type = (short)jo.optInt("type",0);
        this.position_valid = (short)jo.optInt("position_valid",0);
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", (long)time_usec);
        jo.put("angle_x", (double)angle_x);
        jo.put("angle_y", (double)angle_y);
        jo.put("distance", (double)distance);
        jo.put("size_x", (double)size_x);
        jo.put("size_y", (double)size_y);
        jo.put("target_num", (int)target_num);
        jo.put("frame", (int)frame);
        
        jo.put("x", (double)x);
        jo.put("y", (double)y);
        jo.put("z", (double)z);
         
        JSONArray ja_q = new JSONArray();
        for (int i = 0; i < this.q.length; i++) {
            ja_q.put(this.q[i]);
        }
        jo.putOpt("q", (Object)ja_q);
                
        jo.put("type", (int)type);
        jo.put("position_valid", (int)position_valid);
        
        return jo;
    }

                                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_LANDING_TARGET - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" angle_x:"+angle_x+" angle_y:"+angle_y+" distance:"+distance+" size_x:"+size_x+" size_y:"+size_y+" target_num:"+target_num+" frame:"+frame+" x:"+x+" y:"+y+" z:"+z+" q:"+q+" type:"+type+" position_valid:"+position_valid+"";
    }
}
        