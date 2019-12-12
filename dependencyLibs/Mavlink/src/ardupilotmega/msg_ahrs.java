/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AHRS PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Status of DCM attitude estimator.
 */
public class msg_ahrs extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AHRS = 163;
    public static final int MAVLINK_MSG_LENGTH = 28;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AHRS;

      
    /**
     * X gyro drift estimate.
     */
    public float omegaIx;
      
    /**
     * Y gyro drift estimate.
     */
    public float omegaIy;
      
    /**
     * Z gyro drift estimate.
     */
    public float omegaIz;
      
    /**
     * Average accel_weight.
     */
    public float accel_weight;
      
    /**
     * Average renormalisation value.
     */
    public float renorm_val;
      
    /**
     * Average error_roll_pitch value.
     */
    public float error_rp;
      
    /**
     * Average error_yaw value.
     */
    public float error_yaw;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AHRS;
        
        packet.payload.putFloat(omegaIx);
        packet.payload.putFloat(omegaIy);
        packet.payload.putFloat(omegaIz);
        packet.payload.putFloat(accel_weight);
        packet.payload.putFloat(renorm_val);
        packet.payload.putFloat(error_rp);
        packet.payload.putFloat(error_yaw);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a ahrs message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.omegaIx = payload.getFloat();
        this.omegaIy = payload.getFloat();
        this.omegaIz = payload.getFloat();
        this.accel_weight = payload.getFloat();
        this.renorm_val = payload.getFloat();
        this.error_rp = payload.getFloat();
        this.error_yaw = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_ahrs() {
        this.msgid = MAVLINK_MSG_ID_AHRS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_ahrs( float omegaIx, float omegaIy, float omegaIz, float accel_weight, float renorm_val, float error_rp, float error_yaw) {
        this.msgid = MAVLINK_MSG_ID_AHRS;

        this.omegaIx = omegaIx;
        this.omegaIy = omegaIy;
        this.omegaIz = omegaIz;
        this.accel_weight = accel_weight;
        this.renorm_val = renorm_val;
        this.error_rp = error_rp;
        this.error_yaw = error_yaw;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_ahrs( float omegaIx, float omegaIy, float omegaIz, float accel_weight, float renorm_val, float error_rp, float error_yaw, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_AHRS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.omegaIx = omegaIx;
        this.omegaIy = omegaIy;
        this.omegaIz = omegaIz;
        this.accel_weight = accel_weight;
        this.renorm_val = renorm_val;
        this.error_rp = error_rp;
        this.error_yaw = error_yaw;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_ahrs(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_AHRS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_ahrs(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_AHRS;

        readJSONheader(jo);
        
        this.omegaIx = (float)jo.optDouble("omegaIx",0);
        this.omegaIy = (float)jo.optDouble("omegaIy",0);
        this.omegaIz = (float)jo.optDouble("omegaIz",0);
        this.accel_weight = (float)jo.optDouble("accel_weight",0);
        this.renorm_val = (float)jo.optDouble("renorm_val",0);
        this.error_rp = (float)jo.optDouble("error_rp",0);
        this.error_yaw = (float)jo.optDouble("error_yaw",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("omegaIx", omegaIx);
        jo.put("omegaIy", omegaIy);
        jo.put("omegaIz", omegaIz);
        jo.put("accel_weight", accel_weight);
        jo.put("renorm_val", renorm_val);
        jo.put("error_rp", error_rp);
        jo.put("error_yaw", error_yaw);
        
        
        return jo;
    }

                  
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_AHRS - sysid:"+sysid+" compid:"+compid+" omegaIx:"+omegaIx+" omegaIy:"+omegaIy+" omegaIz:"+omegaIz+" accel_weight:"+accel_weight+" renorm_val:"+renorm_val+" error_rp:"+error_rp+" error_yaw:"+error_yaw+"";
    }
}
        