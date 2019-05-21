/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COMMAND_LONG PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Send a command with up to seven parameters to the MAV
 */
public class msg_command_long extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_COMMAND_LONG = 76;
    public static final int MAVLINK_MSG_LENGTH = 33;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COMMAND_LONG;


      
    /**
     * Parameter 1 (for the specific command).
     */
    public float param1;
      
    /**
     * Parameter 2 (for the specific command).
     */
    public float param2;
      
    /**
     * Parameter 3 (for the specific command).
     */
    public float param3;
      
    /**
     * Parameter 4 (for the specific command).
     */
    public float param4;
      
    /**
     * Parameter 5 (for the specific command).
     */
    public float param5;
      
    /**
     * Parameter 6 (for the specific command).
     */
    public float param6;
      
    /**
     * Parameter 7 (for the specific command).
     */
    public float param7;
      
    /**
     * Command ID (of command to send).
     */
    public int command;
      
    /**
     * System which should execute the command
     */
    public short target_system;
      
    /**
     * Component which should execute the command, 0 for all components
     */
    public short target_component;
      
    /**
     * 0: First transmission of this command. 1-255: Confirmation transmissions (e.g. for kill command)
     */
    public short confirmation;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_COMMAND_LONG;
        
        packet.payload.putFloat(param1);
        
        packet.payload.putFloat(param2);
        
        packet.payload.putFloat(param3);
        
        packet.payload.putFloat(param4);
        
        packet.payload.putFloat(param5);
        
        packet.payload.putFloat(param6);
        
        packet.payload.putFloat(param7);
        
        packet.payload.putUnsignedShort(command);
        
        packet.payload.putUnsignedByte(target_system);
        
        packet.payload.putUnsignedByte(target_component);
        
        packet.payload.putUnsignedByte(confirmation);
        
        if(isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a command_long message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.param1 = payload.getFloat();
        
        this.param2 = payload.getFloat();
        
        this.param3 = payload.getFloat();
        
        this.param4 = payload.getFloat();
        
        this.param5 = payload.getFloat();
        
        this.param6 = payload.getFloat();
        
        this.param7 = payload.getFloat();
        
        this.command = payload.getUnsignedShort();
        
        this.target_system = payload.getUnsignedByte();
        
        this.target_component = payload.getUnsignedByte();
        
        this.confirmation = payload.getUnsignedByte();
        
        if(isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_command_long() {
        msgid = MAVLINK_MSG_ID_COMMAND_LONG;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_command_long(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_COMMAND_LONG;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

                          
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_COMMAND_LONG - sysid:"+sysid+" compid:"+compid+" param1:"+param1+" param2:"+param2+" param3:"+param3+" param4:"+param4+" param5:"+param5+" param6:"+param6+" param7:"+param7+" command:"+command+" target_system:"+target_system+" target_component:"+target_component+" confirmation:"+confirmation+"";
    }
}
        