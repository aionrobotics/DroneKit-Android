/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ICE_COOLANT_TEMP PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* The temperature of the cooleant system of an internal combustion engine.
*/
public class msg_ice_coolant_temp extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_ICE_COOLANT_TEMP = 373;
    public static final int MAVLINK_MSG_LENGTH = 5;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ICE_COOLANT_TEMP;


      
    /**
    * Temperature
    */
    public float temperature;
      
    /**
    * Index of coolant system.
    */
    public short index;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ICE_COOLANT_TEMP;
              
        packet.payload.putFloat(temperature);
              
        packet.payload.putUnsignedByte(index);
        
        return packet;
    }

    /**
    * Decode a ice_coolant_temp message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.temperature = payload.getFloat();
              
        this.index = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_ice_coolant_temp(){
        msgid = MAVLINK_MSG_ID_ICE_COOLANT_TEMP;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_ice_coolant_temp(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_ICE_COOLANT_TEMP;
        unpack(mavLinkPacket.payload);        
    }

        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_ICE_COOLANT_TEMP - sysid:"+sysid+" compid:"+compid+" temperature:"+temperature+" index:"+index+"";
    }
}
        