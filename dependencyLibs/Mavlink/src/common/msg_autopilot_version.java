/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AUTOPILOT_VERSION PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;
        
/**
 * Version and capability of autopilot software
 */
public class msg_autopilot_version extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AUTOPILOT_VERSION = 148;
    public static final int MAVLINK_MSG_LENGTH = 78;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AUTOPILOT_VERSION;


      
    /**
     * Bitmap of capabilities
     */
    public long capabilities;
      
    /**
     * UID if provided by hardware (see uid2)
     */
    public long uid;
      
    /**
     * Firmware version number
     */
    public long flight_sw_version;
      
    /**
     * Middleware version number
     */
    public long middleware_sw_version;
      
    /**
     * Operating system version number
     */
    public long os_sw_version;
      
    /**
     * HW / board version (last 8 bytes should be silicon ID, if any)
     */
    public long board_version;
      
    /**
     * ID of the board vendor
     */
    public int vendor_id;
      
    /**
     * ID of the product
     */
    public int product_id;
      
    /**
     * Custom version field, commonly the first 8 bytes of the git hash. This is not an unique identifier, but should allow to identify the commit using the main version number even for very large code bases.
     */
    public short flight_custom_version[] = new short[8];
      
    /**
     * Custom version field, commonly the first 8 bytes of the git hash. This is not an unique identifier, but should allow to identify the commit using the main version number even for very large code bases.
     */
    public short middleware_custom_version[] = new short[8];
      
    /**
     * Custom version field, commonly the first 8 bytes of the git hash. This is not an unique identifier, but should allow to identify the commit using the main version number even for very large code bases.
     */
    public short os_custom_version[] = new short[8];
      
    /**
     * UID if provided by hardware (supersedes the uid field. If this is non-zero, use this field, otherwise use uid)
     */
    public short uid2[] = new short[18];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION;
        
        packet.payload.putUnsignedLong(capabilities);
        
        packet.payload.putUnsignedLong(uid);
        
        packet.payload.putUnsignedInt(flight_sw_version);
        
        packet.payload.putUnsignedInt(middleware_sw_version);
        
        packet.payload.putUnsignedInt(os_sw_version);
        
        packet.payload.putUnsignedInt(board_version);
        
        packet.payload.putUnsignedShort(vendor_id);
        
        packet.payload.putUnsignedShort(product_id);
        
        
        for (int i = 0; i < flight_custom_version.length; i++) {
            packet.payload.putUnsignedByte(flight_custom_version[i]);
        }
                    
        
        
        for (int i = 0; i < middleware_custom_version.length; i++) {
            packet.payload.putUnsignedByte(middleware_custom_version[i]);
        }
                    
        
        
        for (int i = 0; i < os_custom_version.length; i++) {
            packet.payload.putUnsignedByte(os_custom_version[i]);
        }
                    
        
        if(isMavlink2) {
            
            
        for (int i = 0; i < uid2.length; i++) {
            packet.payload.putUnsignedByte(uid2[i]);
        }
                    
            
        }
        return packet;
    }

    /**
     * Decode a autopilot_version message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.capabilities = payload.getUnsignedLong();
        
        this.uid = payload.getUnsignedLong();
        
        this.flight_sw_version = payload.getUnsignedInt();
        
        this.middleware_sw_version = payload.getUnsignedInt();
        
        this.os_sw_version = payload.getUnsignedInt();
        
        this.board_version = payload.getUnsignedInt();
        
        this.vendor_id = payload.getUnsignedShort();
        
        this.product_id = payload.getUnsignedShort();
        
         
        for (int i = 0; i < this.flight_custom_version.length; i++) {
            this.flight_custom_version[i] = payload.getUnsignedByte();
        }
                
        
         
        for (int i = 0; i < this.middleware_custom_version.length; i++) {
            this.middleware_custom_version[i] = payload.getUnsignedByte();
        }
                
        
         
        for (int i = 0; i < this.os_custom_version.length; i++) {
            this.os_custom_version[i] = payload.getUnsignedByte();
        }
                
        
        if(isMavlink2) {
            
             
        for (int i = 0; i < this.uid2.length; i++) {
            this.uid2[i] = payload.getUnsignedByte();
        }
                
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_autopilot_version() {
        msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_autopilot_version(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);        
    }

                            
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_AUTOPILOT_VERSION - sysid:"+sysid+" compid:"+compid+" capabilities:"+capabilities+" uid:"+uid+" flight_sw_version:"+flight_sw_version+" middleware_sw_version:"+middleware_sw_version+" os_sw_version:"+os_sw_version+" board_version:"+board_version+" vendor_id:"+vendor_id+" product_id:"+product_id+" flight_custom_version:"+flight_custom_version+" middleware_custom_version:"+middleware_custom_version+" os_custom_version:"+os_custom_version+" uid2:"+uid2+"";
    }
}
        