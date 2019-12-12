/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE BATTERY2 PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * 2nd Battery status
 */
public class msg_battery2 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_BATTERY2 = 181;
    public static final int MAVLINK_MSG_LENGTH = 4;
    private static final long serialVersionUID = MAVLINK_MSG_ID_BATTERY2;

      
    /**
     * Voltage.
     */
    public int voltage;
      
    /**
     * Battery current, -1: autopilot does not measure the current.
     */
    public short current_battery;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_BATTERY2;
        
        packet.payload.putUnsignedShort(voltage);
        packet.payload.putShort(current_battery);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a battery2 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.voltage = payload.getUnsignedShort();
        this.current_battery = payload.getShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_battery2() {
        this.msgid = MAVLINK_MSG_ID_BATTERY2;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_battery2( int voltage, short current_battery) {
        this.msgid = MAVLINK_MSG_ID_BATTERY2;

        this.voltage = voltage;
        this.current_battery = current_battery;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_battery2( int voltage, short current_battery, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_BATTERY2;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.voltage = voltage;
        this.current_battery = current_battery;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_battery2(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_BATTERY2;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_battery2(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_BATTERY2;

        readJSONheader(jo);
        
        this.voltage = (int)jo.optInt("voltage",0);
        this.current_battery = (short)jo.optInt("current_battery",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("voltage", (int)voltage);
        jo.put("current_battery", (int)current_battery);
        
        
        return jo;
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_BATTERY2 - sysid:"+sysid+" compid:"+compid+" voltage:"+voltage+" current_battery:"+current_battery+"";
    }
}
        