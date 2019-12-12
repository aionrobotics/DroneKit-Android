/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_REPORT PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * 3 axis gimbal measurements.
 */
public class msg_gimbal_report extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GIMBAL_REPORT = 200;
    public static final int MAVLINK_MSG_LENGTH = 42;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_REPORT;

      
    /**
     * Time since last update.
     */
    public float delta_time;
      
    /**
     * Delta angle X.
     */
    public float delta_angle_x;
      
    /**
     * Delta angle Y.
     */
    public float delta_angle_y;
      
    /**
     * Delta angle X.
     */
    public float delta_angle_z;
      
    /**
     * Delta velocity X.
     */
    public float delta_velocity_x;
      
    /**
     * Delta velocity Y.
     */
    public float delta_velocity_y;
      
    /**
     * Delta velocity Z.
     */
    public float delta_velocity_z;
      
    /**
     * Joint ROLL.
     */
    public float joint_roll;
      
    /**
     * Joint EL.
     */
    public float joint_el;
      
    /**
     * Joint AZ.
     */
    public float joint_az;
      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Component ID.
     */
    public short target_component;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;
        
        packet.payload.putFloat(delta_time);
        packet.payload.putFloat(delta_angle_x);
        packet.payload.putFloat(delta_angle_y);
        packet.payload.putFloat(delta_angle_z);
        packet.payload.putFloat(delta_velocity_x);
        packet.payload.putFloat(delta_velocity_y);
        packet.payload.putFloat(delta_velocity_z);
        packet.payload.putFloat(joint_roll);
        packet.payload.putFloat(joint_el);
        packet.payload.putFloat(joint_az);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gimbal_report message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.delta_time = payload.getFloat();
        this.delta_angle_x = payload.getFloat();
        this.delta_angle_y = payload.getFloat();
        this.delta_angle_z = payload.getFloat();
        this.delta_velocity_x = payload.getFloat();
        this.delta_velocity_y = payload.getFloat();
        this.delta_velocity_z = payload.getFloat();
        this.joint_roll = payload.getFloat();
        this.joint_el = payload.getFloat();
        this.joint_az = payload.getFloat();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gimbal_report() {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gimbal_report( float delta_time, float delta_angle_x, float delta_angle_y, float delta_angle_z, float delta_velocity_x, float delta_velocity_y, float delta_velocity_z, float joint_roll, float joint_el, float joint_az, short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;

        this.delta_time = delta_time;
        this.delta_angle_x = delta_angle_x;
        this.delta_angle_y = delta_angle_y;
        this.delta_angle_z = delta_angle_z;
        this.delta_velocity_x = delta_velocity_x;
        this.delta_velocity_y = delta_velocity_y;
        this.delta_velocity_z = delta_velocity_z;
        this.joint_roll = joint_roll;
        this.joint_el = joint_el;
        this.joint_az = joint_az;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gimbal_report( float delta_time, float delta_angle_x, float delta_angle_y, float delta_angle_z, float delta_velocity_x, float delta_velocity_y, float delta_velocity_z, float joint_roll, float joint_el, float joint_az, short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.delta_time = delta_time;
        this.delta_angle_x = delta_angle_x;
        this.delta_angle_y = delta_angle_y;
        this.delta_angle_z = delta_angle_z;
        this.delta_velocity_x = delta_velocity_x;
        this.delta_velocity_y = delta_velocity_y;
        this.delta_velocity_z = delta_velocity_z;
        this.joint_roll = joint_roll;
        this.joint_el = joint_el;
        this.joint_az = joint_az;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gimbal_report(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_gimbal_report(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_REPORT;

        readJSONheader(jo);
        
        this.delta_time = (float)jo.optDouble("delta_time",0);
        this.delta_angle_x = (float)jo.optDouble("delta_angle_x",0);
        this.delta_angle_y = (float)jo.optDouble("delta_angle_y",0);
        this.delta_angle_z = (float)jo.optDouble("delta_angle_z",0);
        this.delta_velocity_x = (float)jo.optDouble("delta_velocity_x",0);
        this.delta_velocity_y = (float)jo.optDouble("delta_velocity_y",0);
        this.delta_velocity_z = (float)jo.optDouble("delta_velocity_z",0);
        this.joint_roll = (float)jo.optDouble("joint_roll",0);
        this.joint_el = (float)jo.optDouble("joint_el",0);
        this.joint_az = (float)jo.optDouble("joint_az",0);
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("delta_time", delta_time);
        jo.put("delta_angle_x", delta_angle_x);
        jo.put("delta_angle_y", delta_angle_y);
        jo.put("delta_angle_z", delta_angle_z);
        jo.put("delta_velocity_x", delta_velocity_x);
        jo.put("delta_velocity_y", delta_velocity_y);
        jo.put("delta_velocity_z", delta_velocity_z);
        jo.put("joint_roll", joint_roll);
        jo.put("joint_el", joint_el);
        jo.put("joint_az", joint_az);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        
        
        return jo;
    }

                            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GIMBAL_REPORT - sysid:"+sysid+" compid:"+compid+" delta_time:"+delta_time+" delta_angle_x:"+delta_angle_x+" delta_angle_y:"+delta_angle_y+" delta_angle_z:"+delta_angle_z+" delta_velocity_x:"+delta_velocity_x+" delta_velocity_y:"+delta_velocity_y+" delta_velocity_z:"+delta_velocity_z+" joint_roll:"+joint_roll+" joint_el:"+joint_el+" joint_az:"+joint_az+" target_system:"+target_system+" target_component:"+target_component+"";
    }
}
        