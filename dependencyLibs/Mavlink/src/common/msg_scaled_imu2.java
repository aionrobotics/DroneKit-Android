/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SCALED_IMU2 PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The RAW IMU readings for secondary 9DOF sensor setup. This message should contain the scaled values to the described units
 */
public class msg_scaled_imu2 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SCALED_IMU2 = 116;
    public static final int MAVLINK_MSG_LENGTH = 22;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SCALED_IMU2;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * X acceleration
     */
    public short xacc;
      
    /**
     * Y acceleration
     */
    public short yacc;
      
    /**
     * Z acceleration
     */
    public short zacc;
      
    /**
     * Angular speed around X axis
     */
    public short xgyro;
      
    /**
     * Angular speed around Y axis
     */
    public short ygyro;
      
    /**
     * Angular speed around Z axis
     */
    public short zgyro;
      
    /**
     * X Magnetic field
     */
    public short xmag;
      
    /**
     * Y Magnetic field
     */
    public short ymag;
      
    /**
     * Z Magnetic field
     */
    public short zmag;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SCALED_IMU2;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putShort(xacc);
        packet.payload.putShort(yacc);
        packet.payload.putShort(zacc);
        packet.payload.putShort(xgyro);
        packet.payload.putShort(ygyro);
        packet.payload.putShort(zgyro);
        packet.payload.putShort(xmag);
        packet.payload.putShort(ymag);
        packet.payload.putShort(zmag);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a scaled_imu2 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.xacc = payload.getShort();
        this.yacc = payload.getShort();
        this.zacc = payload.getShort();
        this.xgyro = payload.getShort();
        this.ygyro = payload.getShort();
        this.zgyro = payload.getShort();
        this.xmag = payload.getShort();
        this.ymag = payload.getShort();
        this.zmag = payload.getShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_scaled_imu2() {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU2;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_scaled_imu2( long time_boot_ms, short xacc, short yacc, short zacc, short xgyro, short ygyro, short zgyro, short xmag, short ymag, short zmag) {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU2;

        this.time_boot_ms = time_boot_ms;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        this.xmag = xmag;
        this.ymag = ymag;
        this.zmag = zmag;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_scaled_imu2( long time_boot_ms, short xacc, short yacc, short zacc, short xgyro, short ygyro, short zgyro, short xmag, short ymag, short zmag, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU2;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        this.xmag = xmag;
        this.ymag = ymag;
        this.zmag = zmag;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_scaled_imu2(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU2;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_scaled_imu2(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU2;

        readJSONheader(jo);
        
        this.time_boot_ms = (long)jo.optLong("time_boot_ms",0);
        this.xacc = (short)jo.optInt("xacc",0);
        this.yacc = (short)jo.optInt("yacc",0);
        this.zacc = (short)jo.optInt("zacc",0);
        this.xgyro = (short)jo.optInt("xgyro",0);
        this.ygyro = (short)jo.optInt("ygyro",0);
        this.zgyro = (short)jo.optInt("zgyro",0);
        this.xmag = (short)jo.optInt("xmag",0);
        this.ymag = (short)jo.optInt("ymag",0);
        this.zmag = (short)jo.optInt("zmag",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_boot_ms", (long)time_boot_ms);
        jo.put("xacc", (int)xacc);
        jo.put("yacc", (int)yacc);
        jo.put("zacc", (int)zacc);
        jo.put("xgyro", (int)xgyro);
        jo.put("ygyro", (int)ygyro);
        jo.put("zgyro", (int)zgyro);
        jo.put("xmag", (int)xmag);
        jo.put("ymag", (int)ymag);
        jo.put("zmag", (int)zmag);
        
        
        return jo;
    }

                        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SCALED_IMU2 - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" xacc:"+xacc+" yacc:"+yacc+" zacc:"+zacc+" xgyro:"+xgyro+" ygyro:"+ygyro+" zgyro:"+zgyro+" xmag:"+xmag+" ymag:"+ymag+" zmag:"+zmag+"";
    }
}
        