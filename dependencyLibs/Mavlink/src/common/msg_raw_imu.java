/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RAW_IMU PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The RAW IMU readings for the usual 9DOF sensor setup. This message should always contain the true raw values without any scaling to allow data capture and system debugging.
 */
public class msg_raw_imu extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RAW_IMU = 27;
    public static final int MAVLINK_MSG_LENGTH = 26;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RAW_IMU;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * X acceleration (raw)
     */
    public short xacc;
      
    /**
     * Y acceleration (raw)
     */
    public short yacc;
      
    /**
     * Z acceleration (raw)
     */
    public short zacc;
      
    /**
     * Angular speed around X axis (raw)
     */
    public short xgyro;
      
    /**
     * Angular speed around Y axis (raw)
     */
    public short ygyro;
      
    /**
     * Angular speed around Z axis (raw)
     */
    public short zgyro;
      
    /**
     * X Magnetic field (raw)
     */
    public short xmag;
      
    /**
     * Y Magnetic field (raw)
     */
    public short ymag;
      
    /**
     * Z Magnetic field (raw)
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
        packet.msgid = MAVLINK_MSG_ID_RAW_IMU;
        
        packet.payload.putUnsignedLong(time_usec);
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
     * Decode a raw_imu message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
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
    public msg_raw_imu() {
        this.msgid = MAVLINK_MSG_ID_RAW_IMU;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_raw_imu( long time_usec, short xacc, short yacc, short zacc, short xgyro, short ygyro, short zgyro, short xmag, short ymag, short zmag) {
        this.msgid = MAVLINK_MSG_ID_RAW_IMU;

        this.time_usec = time_usec;
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
    public msg_raw_imu( long time_usec, short xacc, short yacc, short zacc, short xgyro, short ygyro, short zgyro, short xmag, short ymag, short zmag, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RAW_IMU;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
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
    public msg_raw_imu(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RAW_IMU;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_raw_imu(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_RAW_IMU;

        readJSONheader(jo);
        
         
        if (jo.has("time_usec")) {
            final JSONArray ja_time_usec = jo.optJSONArray("time_usec");
            if (ja_time_usec == null) {
                this.time_usec = (long)jo.optLong("time_usec", 0);
            } else if (ja_time_usec.length() > 0) {
                this.time_usec = (long)ja_time_usec.optLong(0, 0);
            }
        }
                    
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
        
        jo.put("time_usec", (long)time_usec);
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
        return "MAVLINK_MSG_ID_RAW_IMU - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" xacc:"+xacc+" yacc:"+yacc+" zacc:"+zacc+" xgyro:"+xgyro+" ygyro:"+ygyro+" zgyro:"+zgyro+" xmag:"+xmag+" ymag:"+ymag+" zmag:"+zmag+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_RAW_IMU";
    }
}
        