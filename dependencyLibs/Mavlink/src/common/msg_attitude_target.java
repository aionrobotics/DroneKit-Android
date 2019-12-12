/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ATTITUDE_TARGET PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Reports the current commanded attitude of the vehicle as specified by the autopilot. This should match the commands sent in a SET_ATTITUDE_TARGET message if the vehicle is being controlled this way.
 */
public class msg_attitude_target extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ATTITUDE_TARGET = 83;
    public static final int MAVLINK_MSG_LENGTH = 37;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ATTITUDE_TARGET;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * Attitude quaternion (w, x, y, z order, zero-rotation is 1, 0, 0, 0)
     */
    public float q[] = new float[4];
      
    /**
     * Body roll rate
     */
    public float body_roll_rate;
      
    /**
     * Body pitch rate
     */
    public float body_pitch_rate;
      
    /**
     * Body yaw rate
     */
    public float body_yaw_rate;
      
    /**
     * Collective thrust, normalized to 0 .. 1 (-1 .. 1 for vehicles capable of reverse trust)
     */
    public float thrust;
      
    /**
     * Mappings: If any of these bits are set, the corresponding input should be ignored: bit 1: body roll rate, bit 2: body pitch rate, bit 3: body yaw rate. bit 4-bit 7: reserved, bit 8: attitude
     */
    public short type_mask;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
        packet.payload.putFloat(body_roll_rate);
        packet.payload.putFloat(body_pitch_rate);
        packet.payload.putFloat(body_yaw_rate);
        packet.payload.putFloat(thrust);
        packet.payload.putUnsignedByte(type_mask);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a attitude_target message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
         
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.body_roll_rate = payload.getFloat();
        this.body_pitch_rate = payload.getFloat();
        this.body_yaw_rate = payload.getFloat();
        this.thrust = payload.getFloat();
        this.type_mask = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_attitude_target() {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_attitude_target( long time_boot_ms, float[] q, float body_roll_rate, float body_pitch_rate, float body_yaw_rate, float thrust, short type_mask) {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.body_roll_rate = body_roll_rate;
        this.body_pitch_rate = body_pitch_rate;
        this.body_yaw_rate = body_yaw_rate;
        this.thrust = thrust;
        this.type_mask = type_mask;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_attitude_target( long time_boot_ms, float[] q, float body_roll_rate, float body_pitch_rate, float body_yaw_rate, float thrust, short type_mask, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.body_roll_rate = body_roll_rate;
        this.body_pitch_rate = body_pitch_rate;
        this.body_yaw_rate = body_yaw_rate;
        this.thrust = thrust;
        this.type_mask = type_mask;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_attitude_target(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_attitude_target(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_ATTITUDE_TARGET;

        readJSONheader(jo);
        
        this.time_boot_ms = (long)jo.optLong("time_boot_ms",0);
         
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
                    
        this.body_roll_rate = (float)jo.optDouble("body_roll_rate",0);
        this.body_pitch_rate = (float)jo.optDouble("body_pitch_rate",0);
        this.body_yaw_rate = (float)jo.optDouble("body_yaw_rate",0);
        this.thrust = (float)jo.optDouble("thrust",0);
        this.type_mask = (short)jo.optInt("type_mask",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_boot_ms", time_boot_ms);
         
        JSONArray ja_q = new JSONArray();
        for (int i = 0; i < this.q.length; i++) {
            ja_q.put(this.q[i]);
        }
        jo.put("q", (Object)ja_q);
                
        jo.put("body_roll_rate", body_roll_rate);
        jo.put("body_pitch_rate", body_pitch_rate);
        jo.put("body_yaw_rate", body_yaw_rate);
        jo.put("thrust", thrust);
        jo.put("type_mask", type_mask);
        
        
        return jo;
    }

                  
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_ATTITUDE_TARGET - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" q:"+q+" body_roll_rate:"+body_roll_rate+" body_pitch_rate:"+body_pitch_rate+" body_yaw_rate:"+body_yaw_rate+" thrust:"+thrust+" type_mask:"+type_mask+"";
    }
}
        