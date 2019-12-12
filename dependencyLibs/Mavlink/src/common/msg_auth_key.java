/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AUTH_KEY PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Emit an encrypted signature / key identifying this system. PLEASE NOTE: This protocol has been kept simple, so transmitting the key requires an encrypted channel for true safety.
 */
public class msg_auth_key extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AUTH_KEY = 7;
    public static final int MAVLINK_MSG_LENGTH = 32;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AUTH_KEY;

      
    /**
     * key
     */
    public byte key[] = new byte[32];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AUTH_KEY;
        
        
        for (int i = 0; i < key.length; i++) {
            packet.payload.putByte(key[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a auth_key message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
         
        for (int i = 0; i < this.key.length; i++) {
            this.key[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_auth_key() {
        this.msgid = MAVLINK_MSG_ID_AUTH_KEY;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_auth_key( byte[] key) {
        this.msgid = MAVLINK_MSG_ID_AUTH_KEY;

        this.key = key;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_auth_key( byte[] key, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_AUTH_KEY;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.key = key;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_auth_key(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_AUTH_KEY;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_auth_key(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_AUTH_KEY;

        readJSONheader(jo);
        
         
        if (jo.has("key")) {
            JSONArray ja_key = jo.optJSONArray("key");
            if (ja_key == null) {
                final String js_string_key = jo.optString("key");
                final byte[] b_key = js_string_key.getBytes();
                System.arraycopy(b_key, 0, this.key, 0, Math.min(this.key.length, b_key.length));
            } else {
                for (int i = 0; i < Math.min(this.key.length, ja_key.length()); i++) {
                    this.key[i] = (byte)ja_key.optInt(i,0);
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
        
         
        JSONArray ja_key = new JSONArray();
        for (int i = 0; i < this.key.length; i++) {
            ja_key.put(this.key[i]);
        }
        jo.put("key", (Object)ja_key);
                
        
        
        return jo;
    }

     
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setKey(String str) {
        int len = Math.min(str.length(), 32);
        for (int i=0; i<len; i++) {
            key[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<32; i++) {            // padding for the rest of the buffer
            key[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getKey() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 32; i++) {
            if (key[i] != 0)
                buf.append((char) key[i]);
            else
                break;
        }
        return buf.toString();

    }
                         
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_AUTH_KEY - sysid:"+sysid+" compid:"+compid+" key:"+key+"";
    }
}
        