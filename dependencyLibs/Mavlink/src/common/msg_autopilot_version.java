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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
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
    @Override
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
                    
        
        if (isMavlink2) {
             
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
    @Override
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
                
        
        if (isMavlink2) {
              
        for (int i = 0; i < this.uid2.length; i++) {
            this.uid2[i] = payload.getUnsignedByte();
        }
                
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_autopilot_version() {
        this.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_autopilot_version( long capabilities, long uid, long flight_sw_version, long middleware_sw_version, long os_sw_version, long board_version, int vendor_id, int product_id, short[] flight_custom_version, short[] middleware_custom_version, short[] os_custom_version, short[] uid2) {
        this.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION;

        this.capabilities = capabilities;
        this.uid = uid;
        this.flight_sw_version = flight_sw_version;
        this.middleware_sw_version = middleware_sw_version;
        this.os_sw_version = os_sw_version;
        this.board_version = board_version;
        this.vendor_id = vendor_id;
        this.product_id = product_id;
        this.flight_custom_version = flight_custom_version;
        this.middleware_custom_version = middleware_custom_version;
        this.os_custom_version = os_custom_version;
        this.uid2 = uid2;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_autopilot_version( long capabilities, long uid, long flight_sw_version, long middleware_sw_version, long os_sw_version, long board_version, int vendor_id, int product_id, short[] flight_custom_version, short[] middleware_custom_version, short[] os_custom_version, short[] uid2, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.capabilities = capabilities;
        this.uid = uid;
        this.flight_sw_version = flight_sw_version;
        this.middleware_sw_version = middleware_sw_version;
        this.os_sw_version = os_sw_version;
        this.board_version = board_version;
        this.vendor_id = vendor_id;
        this.product_id = product_id;
        this.flight_custom_version = flight_custom_version;
        this.middleware_custom_version = middleware_custom_version;
        this.os_custom_version = os_custom_version;
        this.uid2 = uid2;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_autopilot_version(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_autopilot_version(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION;

        readJSONheader(jo);
        
         
        if (jo.has("capabilities")) {
            final JSONArray ja_capabilities = jo.optJSONArray("capabilities");
            if (ja_capabilities == null) {
                this.capabilities = (long)jo.optLong("capabilities", 0);
            } else if (ja_capabilities.length() > 0) {
                this.capabilities = (long)ja_capabilities.optLong(0, 0);
            }
        }
                    
         
        if (jo.has("uid")) {
            final JSONArray ja_uid = jo.optJSONArray("uid");
            if (ja_uid == null) {
                this.uid = (long)jo.optLong("uid", 0);
            } else if (ja_uid.length() > 0) {
                this.uid = (long)ja_uid.optLong(0, 0);
            }
        }
                    
        this.flight_sw_version = (long)jo.optLong("flight_sw_version",0);
        this.middleware_sw_version = (long)jo.optLong("middleware_sw_version",0);
        this.os_sw_version = (long)jo.optLong("os_sw_version",0);
        this.board_version = (long)jo.optLong("board_version",0);
        this.vendor_id = (int)jo.optInt("vendor_id",0);
        this.product_id = (int)jo.optInt("product_id",0);
         
        if (jo.has("flight_custom_version")) {
            JSONArray ja_flight_custom_version = jo.optJSONArray("flight_custom_version");
            if (ja_flight_custom_version == null) {
                this.flight_custom_version[0] = (short)jo.optInt("flight_custom_version", 0);
            } else {
                for (int i = 0; i < Math.min(this.flight_custom_version.length, ja_flight_custom_version.length()); i++) {
                    this.flight_custom_version[i] = (short)ja_flight_custom_version.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("middleware_custom_version")) {
            JSONArray ja_middleware_custom_version = jo.optJSONArray("middleware_custom_version");
            if (ja_middleware_custom_version == null) {
                this.middleware_custom_version[0] = (short)jo.optInt("middleware_custom_version", 0);
            } else {
                for (int i = 0; i < Math.min(this.middleware_custom_version.length, ja_middleware_custom_version.length()); i++) {
                    this.middleware_custom_version[i] = (short)ja_middleware_custom_version.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("os_custom_version")) {
            JSONArray ja_os_custom_version = jo.optJSONArray("os_custom_version");
            if (ja_os_custom_version == null) {
                this.os_custom_version[0] = (short)jo.optInt("os_custom_version", 0);
            } else {
                for (int i = 0; i < Math.min(this.os_custom_version.length, ja_os_custom_version.length()); i++) {
                    this.os_custom_version[i] = (short)ja_os_custom_version.optInt(i,0);
                }
            }
        }
                    
        
         
        if (jo.has("uid2")) {
            JSONArray ja_uid2 = jo.optJSONArray("uid2");
            if (ja_uid2 == null) {
                this.uid2[0] = (short)jo.optInt("uid2", 0);
            } else {
                for (int i = 0; i < Math.min(this.uid2.length, ja_uid2.length()); i++) {
                    this.uid2[i] = (short)ja_uid2.optInt(i,0);
                }
            }
        }
                    
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("capabilities", (long)capabilities);
        jo.put("uid", (long)uid);
        jo.put("flight_sw_version", (long)flight_sw_version);
        jo.put("middleware_sw_version", (long)middleware_sw_version);
        jo.put("os_sw_version", (long)os_sw_version);
        jo.put("board_version", (long)board_version);
        jo.put("vendor_id", (int)vendor_id);
        jo.put("product_id", (int)product_id);
         
        JSONArray ja_flight_custom_version = new JSONArray();
        for (int i = 0; i < this.flight_custom_version.length; i++) {
            ja_flight_custom_version.put(this.flight_custom_version[i]);
        }
        jo.putOpt("flight_custom_version", (Object)ja_flight_custom_version);
                
         
        JSONArray ja_middleware_custom_version = new JSONArray();
        for (int i = 0; i < this.middleware_custom_version.length; i++) {
            ja_middleware_custom_version.put(this.middleware_custom_version[i]);
        }
        jo.putOpt("middleware_custom_version", (Object)ja_middleware_custom_version);
                
         
        JSONArray ja_os_custom_version = new JSONArray();
        for (int i = 0; i < this.os_custom_version.length; i++) {
            ja_os_custom_version.put(this.os_custom_version[i]);
        }
        jo.putOpt("os_custom_version", (Object)ja_os_custom_version);
                
        
         
        JSONArray ja_uid2 = new JSONArray();
        for (int i = 0; i < this.uid2.length; i++) {
            ja_uid2.put(this.uid2[i]);
        }
        jo.putOpt("uid2", (Object)ja_uid2);
                
        
        return jo;
    }

                            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_AUTOPILOT_VERSION - sysid:"+sysid+" compid:"+compid+" capabilities:"+capabilities+" uid:"+uid+" flight_sw_version:"+flight_sw_version+" middleware_sw_version:"+middleware_sw_version+" os_sw_version:"+os_sw_version+" board_version:"+board_version+" vendor_id:"+vendor_id+" product_id:"+product_id+" flight_custom_version:"+flight_custom_version+" middleware_custom_version:"+middleware_custom_version+" os_custom_version:"+os_custom_version+" uid2:"+uid2+"";
    }
}
        