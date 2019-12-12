/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RC_CHANNELS PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The PPM values of the RC channels received. The standard PPM modulation is as follows: 1000 microseconds: 0%, 2000 microseconds: 100%.  A value of UINT16_MAX implies the channel is unused. Individual receivers/transmitters might violate this specification.
 */
public class msg_rc_channels extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RC_CHANNELS = 65;
    public static final int MAVLINK_MSG_LENGTH = 42;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RC_CHANNELS;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * RC channel 1 value.
     */
    public int chan1_raw;
      
    /**
     * RC channel 2 value.
     */
    public int chan2_raw;
      
    /**
     * RC channel 3 value.
     */
    public int chan3_raw;
      
    /**
     * RC channel 4 value.
     */
    public int chan4_raw;
      
    /**
     * RC channel 5 value.
     */
    public int chan5_raw;
      
    /**
     * RC channel 6 value.
     */
    public int chan6_raw;
      
    /**
     * RC channel 7 value.
     */
    public int chan7_raw;
      
    /**
     * RC channel 8 value.
     */
    public int chan8_raw;
      
    /**
     * RC channel 9 value.
     */
    public int chan9_raw;
      
    /**
     * RC channel 10 value.
     */
    public int chan10_raw;
      
    /**
     * RC channel 11 value.
     */
    public int chan11_raw;
      
    /**
     * RC channel 12 value.
     */
    public int chan12_raw;
      
    /**
     * RC channel 13 value.
     */
    public int chan13_raw;
      
    /**
     * RC channel 14 value.
     */
    public int chan14_raw;
      
    /**
     * RC channel 15 value.
     */
    public int chan15_raw;
      
    /**
     * RC channel 16 value.
     */
    public int chan16_raw;
      
    /**
     * RC channel 17 value.
     */
    public int chan17_raw;
      
    /**
     * RC channel 18 value.
     */
    public int chan18_raw;
      
    /**
     * Total number of RC channels being received. This can be larger than 18, indicating that more channels are available but not given in this message. This value should be 0 when no RC channels are available.
     */
    public short chancount;
      
    /**
     * Receive signal strength indicator in device-dependent units/scale. Values: [0-254], 255: invalid/unknown.
     */
    public short rssi;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_RC_CHANNELS;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putUnsignedShort(chan1_raw);
        packet.payload.putUnsignedShort(chan2_raw);
        packet.payload.putUnsignedShort(chan3_raw);
        packet.payload.putUnsignedShort(chan4_raw);
        packet.payload.putUnsignedShort(chan5_raw);
        packet.payload.putUnsignedShort(chan6_raw);
        packet.payload.putUnsignedShort(chan7_raw);
        packet.payload.putUnsignedShort(chan8_raw);
        packet.payload.putUnsignedShort(chan9_raw);
        packet.payload.putUnsignedShort(chan10_raw);
        packet.payload.putUnsignedShort(chan11_raw);
        packet.payload.putUnsignedShort(chan12_raw);
        packet.payload.putUnsignedShort(chan13_raw);
        packet.payload.putUnsignedShort(chan14_raw);
        packet.payload.putUnsignedShort(chan15_raw);
        packet.payload.putUnsignedShort(chan16_raw);
        packet.payload.putUnsignedShort(chan17_raw);
        packet.payload.putUnsignedShort(chan18_raw);
        packet.payload.putUnsignedByte(chancount);
        packet.payload.putUnsignedByte(rssi);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a rc_channels message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.chan1_raw = payload.getUnsignedShort();
        this.chan2_raw = payload.getUnsignedShort();
        this.chan3_raw = payload.getUnsignedShort();
        this.chan4_raw = payload.getUnsignedShort();
        this.chan5_raw = payload.getUnsignedShort();
        this.chan6_raw = payload.getUnsignedShort();
        this.chan7_raw = payload.getUnsignedShort();
        this.chan8_raw = payload.getUnsignedShort();
        this.chan9_raw = payload.getUnsignedShort();
        this.chan10_raw = payload.getUnsignedShort();
        this.chan11_raw = payload.getUnsignedShort();
        this.chan12_raw = payload.getUnsignedShort();
        this.chan13_raw = payload.getUnsignedShort();
        this.chan14_raw = payload.getUnsignedShort();
        this.chan15_raw = payload.getUnsignedShort();
        this.chan16_raw = payload.getUnsignedShort();
        this.chan17_raw = payload.getUnsignedShort();
        this.chan18_raw = payload.getUnsignedShort();
        this.chancount = payload.getUnsignedByte();
        this.rssi = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_rc_channels() {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_rc_channels( long time_boot_ms, int chan1_raw, int chan2_raw, int chan3_raw, int chan4_raw, int chan5_raw, int chan6_raw, int chan7_raw, int chan8_raw, int chan9_raw, int chan10_raw, int chan11_raw, int chan12_raw, int chan13_raw, int chan14_raw, int chan15_raw, int chan16_raw, int chan17_raw, int chan18_raw, short chancount, short rssi) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS;

        this.time_boot_ms = time_boot_ms;
        this.chan1_raw = chan1_raw;
        this.chan2_raw = chan2_raw;
        this.chan3_raw = chan3_raw;
        this.chan4_raw = chan4_raw;
        this.chan5_raw = chan5_raw;
        this.chan6_raw = chan6_raw;
        this.chan7_raw = chan7_raw;
        this.chan8_raw = chan8_raw;
        this.chan9_raw = chan9_raw;
        this.chan10_raw = chan10_raw;
        this.chan11_raw = chan11_raw;
        this.chan12_raw = chan12_raw;
        this.chan13_raw = chan13_raw;
        this.chan14_raw = chan14_raw;
        this.chan15_raw = chan15_raw;
        this.chan16_raw = chan16_raw;
        this.chan17_raw = chan17_raw;
        this.chan18_raw = chan18_raw;
        this.chancount = chancount;
        this.rssi = rssi;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_rc_channels( long time_boot_ms, int chan1_raw, int chan2_raw, int chan3_raw, int chan4_raw, int chan5_raw, int chan6_raw, int chan7_raw, int chan8_raw, int chan9_raw, int chan10_raw, int chan11_raw, int chan12_raw, int chan13_raw, int chan14_raw, int chan15_raw, int chan16_raw, int chan17_raw, int chan18_raw, short chancount, short rssi, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.chan1_raw = chan1_raw;
        this.chan2_raw = chan2_raw;
        this.chan3_raw = chan3_raw;
        this.chan4_raw = chan4_raw;
        this.chan5_raw = chan5_raw;
        this.chan6_raw = chan6_raw;
        this.chan7_raw = chan7_raw;
        this.chan8_raw = chan8_raw;
        this.chan9_raw = chan9_raw;
        this.chan10_raw = chan10_raw;
        this.chan11_raw = chan11_raw;
        this.chan12_raw = chan12_raw;
        this.chan13_raw = chan13_raw;
        this.chan14_raw = chan14_raw;
        this.chan15_raw = chan15_raw;
        this.chan16_raw = chan16_raw;
        this.chan17_raw = chan17_raw;
        this.chan18_raw = chan18_raw;
        this.chancount = chancount;
        this.rssi = rssi;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_rc_channels(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_rc_channels(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS;

        readJSONheader(jo);
        
        this.time_boot_ms = (long)jo.optLong("time_boot_ms",0);
        this.chan1_raw = (int)jo.optInt("chan1_raw",0);
        this.chan2_raw = (int)jo.optInt("chan2_raw",0);
        this.chan3_raw = (int)jo.optInt("chan3_raw",0);
        this.chan4_raw = (int)jo.optInt("chan4_raw",0);
        this.chan5_raw = (int)jo.optInt("chan5_raw",0);
        this.chan6_raw = (int)jo.optInt("chan6_raw",0);
        this.chan7_raw = (int)jo.optInt("chan7_raw",0);
        this.chan8_raw = (int)jo.optInt("chan8_raw",0);
        this.chan9_raw = (int)jo.optInt("chan9_raw",0);
        this.chan10_raw = (int)jo.optInt("chan10_raw",0);
        this.chan11_raw = (int)jo.optInt("chan11_raw",0);
        this.chan12_raw = (int)jo.optInt("chan12_raw",0);
        this.chan13_raw = (int)jo.optInt("chan13_raw",0);
        this.chan14_raw = (int)jo.optInt("chan14_raw",0);
        this.chan15_raw = (int)jo.optInt("chan15_raw",0);
        this.chan16_raw = (int)jo.optInt("chan16_raw",0);
        this.chan17_raw = (int)jo.optInt("chan17_raw",0);
        this.chan18_raw = (int)jo.optInt("chan18_raw",0);
        this.chancount = (short)jo.optInt("chancount",0);
        this.rssi = (short)jo.optInt("rssi",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_boot_ms", (long)time_boot_ms);
        jo.put("chan1_raw", (int)chan1_raw);
        jo.put("chan2_raw", (int)chan2_raw);
        jo.put("chan3_raw", (int)chan3_raw);
        jo.put("chan4_raw", (int)chan4_raw);
        jo.put("chan5_raw", (int)chan5_raw);
        jo.put("chan6_raw", (int)chan6_raw);
        jo.put("chan7_raw", (int)chan7_raw);
        jo.put("chan8_raw", (int)chan8_raw);
        jo.put("chan9_raw", (int)chan9_raw);
        jo.put("chan10_raw", (int)chan10_raw);
        jo.put("chan11_raw", (int)chan11_raw);
        jo.put("chan12_raw", (int)chan12_raw);
        jo.put("chan13_raw", (int)chan13_raw);
        jo.put("chan14_raw", (int)chan14_raw);
        jo.put("chan15_raw", (int)chan15_raw);
        jo.put("chan16_raw", (int)chan16_raw);
        jo.put("chan17_raw", (int)chan17_raw);
        jo.put("chan18_raw", (int)chan18_raw);
        jo.put("chancount", (int)chancount);
        jo.put("rssi", (int)rssi);
        
        
        return jo;
    }

                                              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_RC_CHANNELS - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" chan1_raw:"+chan1_raw+" chan2_raw:"+chan2_raw+" chan3_raw:"+chan3_raw+" chan4_raw:"+chan4_raw+" chan5_raw:"+chan5_raw+" chan6_raw:"+chan6_raw+" chan7_raw:"+chan7_raw+" chan8_raw:"+chan8_raw+" chan9_raw:"+chan9_raw+" chan10_raw:"+chan10_raw+" chan11_raw:"+chan11_raw+" chan12_raw:"+chan12_raw+" chan13_raw:"+chan13_raw+" chan14_raw:"+chan14_raw+" chan15_raw:"+chan15_raw+" chan16_raw:"+chan16_raw+" chan17_raw:"+chan17_raw+" chan18_raw:"+chan18_raw+" chancount:"+chancount+" rssi:"+rssi+"";
    }
}
        