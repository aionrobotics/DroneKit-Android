/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RADIO_STATUS PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Status generated by radio and injected into MAVLink stream.
 */
public class msg_radio_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RADIO_STATUS = 109;
    public static final int MAVLINK_MSG_LENGTH = 9;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RADIO_STATUS;

      
    /**
     * Count of radio packet receive errors (since boot).
     */
    public int rxerrors;
      
    /**
     * Count of error corrected radio packets (since boot).
     */
    public int fixed;
      
    /**
     * Local (message sender) recieved signal strength indication in device-dependent units/scale. Values: [0-254], 255: invalid/unknown.
     */
    public short rssi;
      
    /**
     * Remote (message receiver) signal strength indication in device-dependent units/scale. Values: [0-254], 255: invalid/unknown.
     */
    public short remrssi;
      
    /**
     * Remaining free transmitter buffer space.
     */
    public short txbuf;
      
    /**
     * Local background noise level. These are device dependent RSSI values (scale as approx 2x dB on SiK radios). Values: [0-254], 255: invalid/unknown.
     */
    public short noise;
      
    /**
     * Remote background noise level. These are device dependent RSSI values (scale as approx 2x dB on SiK radios). Values: [0-254], 255: invalid/unknown.
     */
    public short remnoise;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_RADIO_STATUS;
        
        packet.payload.putUnsignedShort(rxerrors);
        packet.payload.putUnsignedShort(fixed);
        packet.payload.putUnsignedByte(rssi);
        packet.payload.putUnsignedByte(remrssi);
        packet.payload.putUnsignedByte(txbuf);
        packet.payload.putUnsignedByte(noise);
        packet.payload.putUnsignedByte(remnoise);
        
        
        return packet;
    }

    /**
     * Decode a radio_status message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.rxerrors = payload.getUnsignedShort();
        this.fixed = payload.getUnsignedShort();
        this.rssi = payload.getUnsignedByte();
        this.remrssi = payload.getUnsignedByte();
        this.txbuf = payload.getUnsignedByte();
        this.noise = payload.getUnsignedByte();
        this.remnoise = payload.getUnsignedByte();
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_radio_status() {
        this.msgid = MAVLINK_MSG_ID_RADIO_STATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_radio_status( int rxerrors, int fixed, short rssi, short remrssi, short txbuf, short noise, short remnoise) {
        this.msgid = MAVLINK_MSG_ID_RADIO_STATUS;

        this.rxerrors = rxerrors;
        this.fixed = fixed;
        this.rssi = rssi;
        this.remrssi = remrssi;
        this.txbuf = txbuf;
        this.noise = noise;
        this.remnoise = remnoise;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_radio_status( int rxerrors, int fixed, short rssi, short remrssi, short txbuf, short noise, short remnoise, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RADIO_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.rxerrors = rxerrors;
        this.fixed = fixed;
        this.rssi = rssi;
        this.remrssi = remrssi;
        this.txbuf = txbuf;
        this.noise = noise;
        this.remnoise = remnoise;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_radio_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RADIO_STATUS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_radio_status(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_RADIO_STATUS;

        readJSONheader(jo);
        
        this.rxerrors = (int)jo.optInt("rxerrors");
        this.fixed = (int)jo.optInt("fixed");
        this.rssi = (short)jo.optInt("rssi");
        this.remrssi = (short)jo.optInt("remrssi");
        this.txbuf = (short)jo.optInt("txbuf");
        this.noise = (short)jo.optInt("noise");
        this.remnoise = (short)jo.optInt("remnoise");
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("rxerrors", rxerrors);
        jo.put("fixed", fixed);
        jo.put("rssi", rssi);
        jo.put("remrssi", remrssi);
        jo.put("txbuf", txbuf);
        jo.put("noise", noise);
        jo.put("remnoise", remnoise);
        
        
        return jo;
    }

                  
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_RADIO_STATUS - sysid:"+sysid+" compid:"+compid+" rxerrors:"+rxerrors+" fixed:"+fixed+" rssi:"+rssi+" remrssi:"+remrssi+" txbuf:"+txbuf+" noise:"+noise+" remnoise:"+remnoise+"";
    }
}
        