/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GPS_RTCM_DATA PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * RTCM message for injecting into the onboard GPS (used for DGPS)
 */
public class msg_gps_rtcm_data extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GPS_RTCM_DATA = 233;
    public static final int MAVLINK_MSG_LENGTH = 182;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GPS_RTCM_DATA;

      
    /**
     * LSB: 1 means message is fragmented, next 2 bits are the fragment ID, the remaining 5 bits are used for the sequence ID. Messages are only to be flushed to the GPS when the entire message has been reconstructed on the autopilot. The fragment ID specifies which order the fragments should be assembled into a buffer, while the sequence ID is used to detect a mismatch between different buffers. The buffer is considered fully reconstructed when either all 4 fragments are present, or all the fragments before the first fragment with a non full payload is received. This management is used to ensure that normal GPS operation doesn't corrupt RTCM data, and to recover from a unreliable transport delivery order.
     */
    public short flags;
      
    /**
     * data length
     */
    public short len;
      
    /**
     * RTCM message (may be fragmented)
     */
    public short data[] = new short[180];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;
        
        packet.payload.putUnsignedByte(flags);
        packet.payload.putUnsignedByte(len);
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gps_rtcm_data message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.flags = payload.getUnsignedByte();
        this.len = payload.getUnsignedByte();
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gps_rtcm_data() {
        this.msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gps_rtcm_data( short flags, short len, short[] data) {
        this.msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;

        this.flags = flags;
        this.len = len;
        this.data = data;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gps_rtcm_data( short flags, short len, short[] data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.flags = flags;
        this.len = len;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gps_rtcm_data(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_gps_rtcm_data(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;

        readJSONheader(jo);
        
        this.flags = (short)jo.optInt("flags",0);
        this.len = (short)jo.optInt("len",0);
         
        if (jo.has("data")) {
            JSONArray ja_data = jo.optJSONArray("data");
            if (ja_data == null) {
                this.data[0] = (short)jo.optInt("data", 0);
            } else {
                for (int i = 0; i < Math.min(this.data.length, ja_data.length()); i++) {
                    this.data[i] = (short)ja_data.optInt(i,0);
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
        
        jo.put("flags", flags);
        jo.put("len", len);
         
        JSONArray ja_data = new JSONArray();
        for (int i = 0; i < this.data.length; i++) {
            ja_data.put(this.data[i]);
        }
        jo.put("data", (Object)ja_data);
                
        
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GPS_RTCM_DATA - sysid:"+sysid+" compid:"+compid+" flags:"+flags+" len:"+len+" data:"+data+"";
    }
}
        