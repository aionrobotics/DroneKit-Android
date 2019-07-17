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
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_HWSTATUS;
        
        packet.payload.putUnsignedShort(Vcc);
        
        packet.payload.putUnsignedByte(I2Cerr);
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a hwstatus message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.Vcc = payload.getUnsignedShort();
        
        this.I2Cerr = payload.getUnsignedByte();
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_hwstatus() {
        msgid = MAVLINK_MSG_ID_HWSTATUS;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_hwstatus(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_HWSTATUS;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_HWSTATUS - sysid:"+sysid+" compid:"+compid+" Vcc:"+Vcc+" I2Cerr:"+I2Cerr+"";
    }
}
        