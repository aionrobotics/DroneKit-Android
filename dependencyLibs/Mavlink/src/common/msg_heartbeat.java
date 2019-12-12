/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HEARTBEAT PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The heartbeat message shows that a system or component is present and responding. The type and autopilot fields (along with the message component id), allow the receiving system to treat further messages from this system appropriately (e.g. by laying out the user interface based on the autopilot). This microservice is documented at https://mavlink.io/en/services/heartbeat.html
 */
public class msg_heartbeat extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_HEARTBEAT = 0;
    public static final int MAVLINK_MSG_LENGTH = 9;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HEARTBEAT;

      
    /**
     * A bitfield for use for autopilot-specific flags
     */
    public long custom_mode;
      
    /**
     * Type of the system (quadrotor, helicopter, etc.). Components use the same type as their associated system.
     */
    public short type;
      
    /**
     * Autopilot type / class.
     */
    public short autopilot;
      
    /**
     * System mode bitmap.
     */
    public short base_mode;
      
    /**
     * System status flag.
     */
    public short system_status;
      
    /**
     * MAVLink version, not writable by user, gets added by protocol because of magic data type: uint8_t_mavlink_version
     */
    public short mavlink_version;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_HEARTBEAT;
        
        packet.payload.putUnsignedInt(custom_mode);
        packet.payload.putUnsignedByte(type);
        packet.payload.putUnsignedByte(autopilot);
        packet.payload.putUnsignedByte(base_mode);
        packet.payload.putUnsignedByte(system_status);
        packet.payload.putUnsignedByte(mavlink_version);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a heartbeat message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.custom_mode = payload.getUnsignedInt();
        this.type = payload.getUnsignedByte();
        this.autopilot = payload.getUnsignedByte();
        this.base_mode = payload.getUnsignedByte();
        this.system_status = payload.getUnsignedByte();
        this.mavlink_version = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_heartbeat() {
        this.msgid = MAVLINK_MSG_ID_HEARTBEAT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_heartbeat( long custom_mode, short type, short autopilot, short base_mode, short system_status, short mavlink_version) {
        this.msgid = MAVLINK_MSG_ID_HEARTBEAT;

        this.custom_mode = custom_mode;
        this.type = type;
        this.autopilot = autopilot;
        this.base_mode = base_mode;
        this.system_status = system_status;
        this.mavlink_version = mavlink_version;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_heartbeat( long custom_mode, short type, short autopilot, short base_mode, short system_status, short mavlink_version, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_HEARTBEAT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.custom_mode = custom_mode;
        this.type = type;
        this.autopilot = autopilot;
        this.base_mode = base_mode;
        this.system_status = system_status;
        this.mavlink_version = mavlink_version;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_heartbeat(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_HEARTBEAT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_heartbeat(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_HEARTBEAT;

        readJSONheader(jo);
        
        this.custom_mode = (long)jo.optLong("custom_mode",0);
        this.type = (short)jo.optInt("type",0);
        this.autopilot = (short)jo.optInt("autopilot",0);
        this.base_mode = (short)jo.optInt("base_mode",0);
        this.system_status = (short)jo.optInt("system_status",0);
        this.mavlink_version = (short)jo.optInt("mavlink_version",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("custom_mode", custom_mode);
        jo.put("type", type);
        jo.put("autopilot", autopilot);
        jo.put("base_mode", base_mode);
        jo.put("system_status", system_status);
        jo.put("mavlink_version", mavlink_version);
        
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_HEARTBEAT - sysid:"+sysid+" compid:"+compid+" custom_mode:"+custom_mode+" type:"+type+" autopilot:"+autopilot+" base_mode:"+base_mode+" system_status:"+system_status+" mavlink_version:"+mavlink_version+"";
    }
}
        