/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HWSTATUS PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Status of key hardware.
 */
public class msg_hwstatus extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_HWSTATUS = 165;
    public static final int MAVLINK_MSG_LENGTH = 3;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HWSTATUS;

      
    /**
     * Board voltage.
     */
    public int Vcc;
      
    /**
     * I2C error count.
     */
    public short I2Cerr;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_HWSTATUS;
        
        packet.payload.putUnsignedShort(Vcc);
        packet.payload.putUnsignedByte(I2Cerr);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a hwstatus message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.Vcc = payload.getUnsignedShort();
        this.I2Cerr = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_hwstatus() {
        this.msgid = MAVLINK_MSG_ID_HWSTATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_hwstatus( int Vcc, short I2Cerr) {
        this.msgid = MAVLINK_MSG_ID_HWSTATUS;

        this.Vcc = Vcc;
        this.I2Cerr = I2Cerr;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_hwstatus( int Vcc, short I2Cerr, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_HWSTATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.Vcc = Vcc;
        this.I2Cerr = I2Cerr;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_hwstatus(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_HWSTATUS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_hwstatus(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_HWSTATUS;

        readJSONheader(jo);
        
        this.Vcc = (int)jo.optInt("Vcc",0);
        this.I2Cerr = (short)jo.optInt("I2Cerr",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("Vcc", (int)Vcc);
        jo.put("I2Cerr", (int)I2Cerr);
        
        
        return jo;
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_HWSTATUS - sysid:"+sysid+" compid:"+compid+" Vcc:"+Vcc+" I2Cerr:"+I2Cerr+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_HWSTATUS";
    }
}
        