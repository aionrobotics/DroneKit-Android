/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MOUNT_CONFIGURE PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Message to configure a camera mount, directional antenna, etc.
 */
public class msg_mount_configure extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MOUNT_CONFIGURE = 156;
    public static final int MAVLINK_MSG_LENGTH = 6;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MOUNT_CONFIGURE;

      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Component ID.
     */
    public short target_component;
      
    /**
     * Mount operating mode.
     */
    public short mount_mode;
      
    /**
     * (1 = yes, 0 = no).
     */
    public short stab_roll;
      
    /**
     * (1 = yes, 0 = no).
     */
    public short stab_pitch;
      
    /**
     * (1 = yes, 0 = no).
     */
    public short stab_yaw;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MOUNT_CONFIGURE;
        
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(mount_mode);
        packet.payload.putUnsignedByte(stab_roll);
        packet.payload.putUnsignedByte(stab_pitch);
        packet.payload.putUnsignedByte(stab_yaw);
        
        
        return packet;
    }

    /**
     * Decode a mount_configure message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.mount_mode = payload.getUnsignedByte();
        this.stab_roll = payload.getUnsignedByte();
        this.stab_pitch = payload.getUnsignedByte();
        this.stab_yaw = payload.getUnsignedByte();
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mount_configure() {
        this.msgid = MAVLINK_MSG_ID_MOUNT_CONFIGURE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_mount_configure( short target_system, short target_component, short mount_mode, short stab_roll, short stab_pitch, short stab_yaw) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_CONFIGURE;

        this.target_system = target_system;
        this.target_component = target_component;
        this.mount_mode = mount_mode;
        this.stab_roll = stab_roll;
        this.stab_pitch = stab_pitch;
        this.stab_yaw = stab_yaw;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_mount_configure( short target_system, short target_component, short mount_mode, short stab_roll, short stab_pitch, short stab_yaw, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_CONFIGURE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.target_system = target_system;
        this.target_component = target_component;
        this.mount_mode = mount_mode;
        this.stab_roll = stab_roll;
        this.stab_pitch = stab_pitch;
        this.stab_yaw = stab_yaw;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mount_configure(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_CONFIGURE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_mount_configure(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_CONFIGURE;

        readJSONheader(jo);
        
        this.target_system = (short)jo.optInt("target_system");
        this.target_component = (short)jo.optInt("target_component");
        this.mount_mode = (short)jo.optInt("mount_mode");
        this.stab_roll = (short)jo.optInt("stab_roll");
        this.stab_pitch = (short)jo.optInt("stab_pitch");
        this.stab_yaw = (short)jo.optInt("stab_yaw");
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        jo.put("mount_mode", mount_mode);
        jo.put("stab_roll", stab_roll);
        jo.put("stab_pitch", stab_pitch);
        jo.put("stab_yaw", stab_yaw);
        
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_MOUNT_CONFIGURE - sysid:"+sysid+" compid:"+compid+" target_system:"+target_system+" target_component:"+target_component+" mount_mode:"+mount_mode+" stab_roll:"+stab_roll+" stab_pitch:"+stab_pitch+" stab_yaw:"+stab_yaw+"";
    }
}
        