/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE UAVIONIX_ADSB_OUT_CFG PACKING
package com.mavlink.uAvionix;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Static data to configure the ADS-B transponder (send within 10 sec of a POR and every 10 sec thereafter)
 */
public class msg_uavionix_adsb_out_cfg extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG = 10001;
    public static final int MAVLINK_MSG_LENGTH = 20;
    private static final long serialVersionUID = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG;

      
    /**
     * Vehicle address (24 bit)
     */
    public long ICAO;
      
    /**
     * Aircraft stall speed in cm/s
     */
    public int stallSpeed;
      
    /**
     * Vehicle identifier (8 characters, null terminated, valid characters are A-Z, 0-9, " " only)
     */
    public byte callsign[] = new byte[9];
      
    /**
     * Transmitting vehicle type. See ADSB_EMITTER_TYPE enum
     */
    public short emitterType;
      
    /**
     * Aircraft length and width encoding (table 2-35 of DO-282B)
     */
    public short aircraftSize;
      
    /**
     * GPS antenna lateral offset (table 2-36 of DO-282B)
     */
    public short gpsOffsetLat;
      
    /**
     * GPS antenna longitudinal offset from nose [if non-zero, take position (in meters) divide by 2 and add one] (table 2-37 DO-282B)
     */
    public short gpsOffsetLon;
      
    /**
     * ADS-B transponder reciever and transmit enable flags
     */
    public short rfSelect;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG;
        
        packet.payload.putUnsignedInt(ICAO);
        packet.payload.putUnsignedShort(stallSpeed);
        
        for (int i = 0; i < callsign.length; i++) {
            packet.payload.putByte(callsign[i]);
        }
                    
        packet.payload.putUnsignedByte(emitterType);
        packet.payload.putUnsignedByte(aircraftSize);
        packet.payload.putUnsignedByte(gpsOffsetLat);
        packet.payload.putUnsignedByte(gpsOffsetLon);
        packet.payload.putUnsignedByte(rfSelect);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a uavionix_adsb_out_cfg message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.ICAO = payload.getUnsignedInt();
        this.stallSpeed = payload.getUnsignedShort();
         
        for (int i = 0; i < this.callsign.length; i++) {
            this.callsign[i] = payload.getByte();
        }
                
        this.emitterType = payload.getUnsignedByte();
        this.aircraftSize = payload.getUnsignedByte();
        this.gpsOffsetLat = payload.getUnsignedByte();
        this.gpsOffsetLon = payload.getUnsignedByte();
        this.rfSelect = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_uavionix_adsb_out_cfg() {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_uavionix_adsb_out_cfg( long ICAO, int stallSpeed, byte[] callsign, short emitterType, short aircraftSize, short gpsOffsetLat, short gpsOffsetLon, short rfSelect) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG;

        this.ICAO = ICAO;
        this.stallSpeed = stallSpeed;
        this.callsign = callsign;
        this.emitterType = emitterType;
        this.aircraftSize = aircraftSize;
        this.gpsOffsetLat = gpsOffsetLat;
        this.gpsOffsetLon = gpsOffsetLon;
        this.rfSelect = rfSelect;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_uavionix_adsb_out_cfg( long ICAO, int stallSpeed, byte[] callsign, short emitterType, short aircraftSize, short gpsOffsetLat, short gpsOffsetLon, short rfSelect, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ICAO = ICAO;
        this.stallSpeed = stallSpeed;
        this.callsign = callsign;
        this.emitterType = emitterType;
        this.aircraftSize = aircraftSize;
        this.gpsOffsetLat = gpsOffsetLat;
        this.gpsOffsetLon = gpsOffsetLon;
        this.rfSelect = rfSelect;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_uavionix_adsb_out_cfg(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_uavionix_adsb_out_cfg(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG;

        readJSONheader(jo);
        
        this.ICAO = (long)jo.optLong("ICAO",0);
        this.stallSpeed = (int)jo.optInt("stallSpeed",0);
         
        if (jo.has("callsign")) {
            JSONArray ja_callsign = jo.optJSONArray("callsign");
            if (ja_callsign == null) {
                final String js_string_callsign = jo.optString("callsign");
                final byte[] b_callsign = js_string_callsign.getBytes();
                System.arraycopy(b_callsign, 0, this.callsign, 0, Math.min(this.callsign.length, b_callsign.length));
            } else {
                for (int i = 0; i < Math.min(this.callsign.length, ja_callsign.length()); i++) {
                    this.callsign[i] = (byte)ja_callsign.optInt(i,0);
                }
            }
        }
                    
        this.emitterType = (short)jo.optInt("emitterType",0);
        this.aircraftSize = (short)jo.optInt("aircraftSize",0);
        this.gpsOffsetLat = (short)jo.optInt("gpsOffsetLat",0);
        this.gpsOffsetLon = (short)jo.optInt("gpsOffsetLon",0);
        this.rfSelect = (short)jo.optInt("rfSelect",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("ICAO", (long)ICAO);
        jo.put("stallSpeed", (int)stallSpeed);
         
        JSONArray ja_callsign = new JSONArray();
        for (int i = 0; i < this.callsign.length; i++) {
            ja_callsign.put(this.callsign[i]);
        }
        jo.putOpt("callsign", (Object)ja_callsign);
                
        jo.put("emitterType", (int)emitterType);
        jo.put("aircraftSize", (int)aircraftSize);
        jo.put("gpsOffsetLat", (int)gpsOffsetLat);
        jo.put("gpsOffsetLon", (int)gpsOffsetLon);
        jo.put("rfSelect", (int)rfSelect);
        
        
        return jo;
    }

         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setCallsign(String str) {
        int len = Math.min(str.length(), 9);
        for (int i=0; i<len; i++) {
            callsign[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<9; i++) {            // padding for the rest of the buffer
            callsign[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getCallsign() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 9; i++) {
            if (callsign[i] != 0)
                buf.append((char) callsign[i]);
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
        return "MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG - sysid:"+sysid+" compid:"+compid+" ICAO:"+ICAO+" stallSpeed:"+stallSpeed+" callsign:"+callsign+" emitterType:"+emitterType+" aircraftSize:"+aircraftSize+" gpsOffsetLat:"+gpsOffsetLat+" gpsOffsetLon:"+gpsOffsetLon+" rfSelect:"+rfSelect+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG";
    }
}
        