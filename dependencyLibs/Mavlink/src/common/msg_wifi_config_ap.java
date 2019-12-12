/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE WIFI_CONFIG_AP PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Configure AP SSID and Password.
 */
public class msg_wifi_config_ap extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_WIFI_CONFIG_AP = 299;
    public static final int MAVLINK_MSG_LENGTH = 96;
    private static final long serialVersionUID = MAVLINK_MSG_ID_WIFI_CONFIG_AP;

      
    /**
     * Name of Wi-Fi network (SSID). Leave it blank to leave it unchanged.
     */
    public byte ssid[] = new byte[32];
      
    /**
     * Password. Leave it blank for an open AP.
     */
    public byte password[] = new byte[64];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;
        
        
        for (int i = 0; i < ssid.length; i++) {
            packet.payload.putByte(ssid[i]);
        }
                    
        
        for (int i = 0; i < password.length; i++) {
            packet.payload.putByte(password[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a wifi_config_ap message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
         
        for (int i = 0; i < this.ssid.length; i++) {
            this.ssid[i] = payload.getByte();
        }
                
         
        for (int i = 0; i < this.password.length; i++) {
            this.password[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_wifi_config_ap() {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_wifi_config_ap( byte[] ssid, byte[] password) {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;

        this.ssid = ssid;
        this.password = password;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_wifi_config_ap( byte[] ssid, byte[] password, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ssid = ssid;
        this.password = password;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_wifi_config_ap(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_wifi_config_ap(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;

        readJSONheader(jo);
        
         
        if (jo.has("ssid")) {
            JSONArray ja_ssid = jo.optJSONArray("ssid");
            if (ja_ssid == null) {
                final String js_string_ssid = jo.optString("ssid");
                final byte[] b_ssid = js_string_ssid.getBytes();
                System.arraycopy(b_ssid, 0, this.ssid, 0, Math.min(this.ssid.length, b_ssid.length));
            } else {
                for (int i = 0; i < Math.min(this.ssid.length, ja_ssid.length()); i++) {
                    this.ssid[i] = (byte)ja_ssid.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("password")) {
            JSONArray ja_password = jo.optJSONArray("password");
            if (ja_password == null) {
                final String js_string_password = jo.optString("password");
                final byte[] b_password = js_string_password.getBytes();
                System.arraycopy(b_password, 0, this.password, 0, Math.min(this.password.length, b_password.length));
            } else {
                for (int i = 0; i < Math.min(this.password.length, ja_password.length()); i++) {
                    this.password[i] = (byte)ja_password.optInt(i,0);
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
        
         
        JSONArray ja_ssid = new JSONArray();
        for (int i = 0; i < this.ssid.length; i++) {
            ja_ssid.put(this.ssid[i]);
        }
        jo.put("ssid", (Object)ja_ssid);
                
         
        JSONArray ja_password = new JSONArray();
        for (int i = 0; i < this.password.length; i++) {
            ja_password.put(this.password[i]);
        }
        jo.put("password", (Object)ja_password);
                
        
        
        return jo;
    }

     
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setSsid(String str) {
        int len = Math.min(str.length(), 32);
        for (int i=0; i<len; i++) {
            ssid[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<32; i++) {            // padding for the rest of the buffer
            ssid[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getSsid() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 32; i++) {
            if (ssid[i] != 0)
                buf.append((char) ssid[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setPassword(String str) {
        int len = Math.min(str.length(), 64);
        for (int i=0; i<len; i++) {
            password[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<64; i++) {            // padding for the rest of the buffer
            password[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getPassword() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 64; i++) {
            if (password[i] != 0)
                buf.append((char) password[i]);
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
        return "MAVLINK_MSG_ID_WIFI_CONFIG_AP - sysid:"+sysid+" compid:"+compid+" ssid:"+ssid+" password:"+password+"";
    }
}
        