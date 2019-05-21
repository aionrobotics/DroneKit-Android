/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COMMAND_ACK PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Report status of a command. Includes feedback whether the command was executed.
 */
public class msg_command_ack extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_COMMAND_ACK = 77;
    public static final int MAVLINK_MSG_LENGTH = 3;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COMMAND_ACK;


      
    /**
     * Command ID (of acknowledged command).
     */
    public int command;
      
    /**
     * Result of command.
     */
    public short result;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_COMMAND_ACK;
        
        packet.payload.putUnsignedShort(command);
        
        packet.payload.putUnsignedByte(result);
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a command_ack message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.command = payload.getUnsignedShort();
        
        this.result = payload.getUnsignedByte();
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_command_ack() {
        msgid = MAVLINK_MSG_ID_COMMAND_ACK;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_command_ack(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_COMMAND_ACK;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

        
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_COMMAND_ACK - sysid:"+sysid+" compid:"+compid+" command:"+command+" result:"+result+"";
    }
}
        