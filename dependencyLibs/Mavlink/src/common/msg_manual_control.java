/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MANUAL_CONTROL PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * This message provides an API for manually controlling the vehicle using standard joystick axes nomenclature, along with a joystick-like input device. Unused axes can be disabled an buttons are also transmit as boolean values of their 
 */
public class msg_manual_control extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MANUAL_CONTROL = 69;
    public static final int MAVLINK_MSG_LENGTH = 11;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MANUAL_CONTROL;

      
    /**
     * X-axis, normalized to the range [-1000,1000]. A value of INT16_MAX indicates that this axis is invalid. Generally corresponds to forward(1000)-backward(-1000) movement on a joystick and the pitch of a vehicle.
     */
    public short x;
      
    /**
     * Y-axis, normalized to the range [-1000,1000]. A value of INT16_MAX indicates that this axis is invalid. Generally corresponds to left(-1000)-right(1000) movement on a joystick and the roll of a vehicle.
     */
    public short y;
      
    /**
     * Z-axis, normalized to the range [-1000,1000]. A value of INT16_MAX indicates that this axis is invalid. Generally corresponds to a separate slider movement with maximum being 1000 and minimum being -1000 on a joystick and the thrust of a vehicle. Positive values are positive thrust, negative values are negative thrust.
     */
    public short z;
      
    /**
     * R-axis, normalized to the range [-1000,1000]. A value of INT16_MAX indicates that this axis is invalid. Generally corresponds to a twisting of the joystick, with counter-clockwise being 1000 and clockwise being -1000, and the yaw of a vehicle.
     */
    public short r;
      
    /**
     * A bitfield corresponding to the joystick buttons' current state, 1 for pressed, 0 for released. The lowest bit corresponds to Button 1.
     */
    public int buttons;
      
    /**
     * The system to be controlled.
     */
    public short target;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MANUAL_CONTROL;
        
        packet.payload.putShort(x);
        packet.payload.putShort(y);
        packet.payload.putShort(z);
        packet.payload.putShort(r);
        packet.payload.putUnsignedShort(buttons);
        packet.payload.putUnsignedByte(target);
        
        
        return packet;
    }

    /**
     * Decode a manual_control message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.x = payload.getShort();
        this.y = payload.getShort();
        this.z = payload.getShort();
        this.r = payload.getShort();
        this.buttons = payload.getUnsignedShort();
        this.target = payload.getUnsignedByte();
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_manual_control() {
        this.msgid = MAVLINK_MSG_ID_MANUAL_CONTROL;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_manual_control( short x, short y, short z, short r, int buttons, short target) {
        this.msgid = MAVLINK_MSG_ID_MANUAL_CONTROL;

        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
        this.buttons = buttons;
        this.target = target;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_manual_control( short x, short y, short z, short r, int buttons, short target, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MANUAL_CONTROL;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
        this.buttons = buttons;
        this.target = target;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_manual_control(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MANUAL_CONTROL;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_manual_control(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_MANUAL_CONTROL;

        readJSONheader(jo);
        
        this.x = (short)jo.optInt("x");
        this.y = (short)jo.optInt("y");
        this.z = (short)jo.optInt("z");
        this.r = (short)jo.optInt("r");
        this.buttons = (int)jo.optInt("buttons");
        this.target = (short)jo.optInt("target");
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("x", x);
        jo.put("y", y);
        jo.put("z", z);
        jo.put("r", r);
        jo.put("buttons", buttons);
        jo.put("target", target);
        
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_MANUAL_CONTROL - sysid:"+sysid+" compid:"+compid+" x:"+x+" y:"+y+" z:"+z+" r:"+r+" buttons:"+buttons+" target:"+target+"";
    }
}
        