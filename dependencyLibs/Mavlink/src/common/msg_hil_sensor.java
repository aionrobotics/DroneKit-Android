/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HIL_SENSOR PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The IMU readings in SI units in NED body frame
 */
public class msg_hil_sensor extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_HIL_SENSOR = 107;
    public static final int MAVLINK_MSG_LENGTH = 64;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HIL_SENSOR;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * X acceleration
     */
    public float xacc;
      
    /**
     * Y acceleration
     */
    public float yacc;
      
    /**
     * Z acceleration
     */
    public float zacc;
      
    /**
     * Angular speed around X axis in body frame
     */
    public float xgyro;
      
    /**
     * Angular speed around Y axis in body frame
     */
    public float ygyro;
      
    /**
     * Angular speed around Z axis in body frame
     */
    public float zgyro;
      
    /**
     * X Magnetic field
     */
    public float xmag;
      
    /**
     * Y Magnetic field
     */
    public float ymag;
      
    /**
     * Z Magnetic field
     */
    public float zmag;
      
    /**
     * Absolute pressure
     */
    public float abs_pressure;
      
    /**
     * Differential pressure (airspeed)
     */
    public float diff_pressure;
      
    /**
     * Altitude calculated from pressure
     */
    public float pressure_alt;
      
    /**
     * Temperature
     */
    public float temperature;
      
    /**
     * Bitmap for fields that have updated since last message, bit 0 = xacc, bit 12: temperature, bit 31: full reset of attitude/position/velocities/etc was performed in sim.
     */
    public long fields_updated;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_HIL_SENSOR;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putFloat(xacc);
        packet.payload.putFloat(yacc);
        packet.payload.putFloat(zacc);
        packet.payload.putFloat(xgyro);
        packet.payload.putFloat(ygyro);
        packet.payload.putFloat(zgyro);
        packet.payload.putFloat(xmag);
        packet.payload.putFloat(ymag);
        packet.payload.putFloat(zmag);
        packet.payload.putFloat(abs_pressure);
        packet.payload.putFloat(diff_pressure);
        packet.payload.putFloat(pressure_alt);
        packet.payload.putFloat(temperature);
        packet.payload.putUnsignedInt(fields_updated);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a hil_sensor message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.xacc = payload.getFloat();
        this.yacc = payload.getFloat();
        this.zacc = payload.getFloat();
        this.xgyro = payload.getFloat();
        this.ygyro = payload.getFloat();
        this.zgyro = payload.getFloat();
        this.xmag = payload.getFloat();
        this.ymag = payload.getFloat();
        this.zmag = payload.getFloat();
        this.abs_pressure = payload.getFloat();
        this.diff_pressure = payload.getFloat();
        this.pressure_alt = payload.getFloat();
        this.temperature = payload.getFloat();
        this.fields_updated = payload.getUnsignedInt();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_hil_sensor() {
        this.msgid = MAVLINK_MSG_ID_HIL_SENSOR;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_hil_sensor( long time_usec, float xacc, float yacc, float zacc, float xgyro, float ygyro, float zgyro, float xmag, float ymag, float zmag, float abs_pressure, float diff_pressure, float pressure_alt, float temperature, long fields_updated) {
        this.msgid = MAVLINK_MSG_ID_HIL_SENSOR;

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
        this.abs_pressure = abs_pressure;
        this.diff_pressure = diff_pressure;
        this.pressure_alt = pressure_alt;
        this.temperature = temperature;
        this.fields_updated = fields_updated;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_hil_sensor( long time_usec, float xacc, float yacc, float zacc, float xgyro, float ygyro, float zgyro, float xmag, float ymag, float zmag, float abs_pressure, float diff_pressure, float pressure_alt, float temperature, long fields_updated, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_HIL_SENSOR;
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
        this.abs_pressure = abs_pressure;
        this.diff_pressure = diff_pressure;
        this.pressure_alt = pressure_alt;
        this.temperature = temperature;
        this.fields_updated = fields_updated;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_hil_sensor(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_HIL_SENSOR;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_hil_sensor(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_HIL_SENSOR;

        readJSONheader(jo);
        
        this.time_usec = (long)jo.optLong("time_usec",0);
        this.xacc = (float)jo.optDouble("xacc",0);
        this.yacc = (float)jo.optDouble("yacc",0);
        this.zacc = (float)jo.optDouble("zacc",0);
        this.xgyro = (float)jo.optDouble("xgyro",0);
        this.ygyro = (float)jo.optDouble("ygyro",0);
        this.zgyro = (float)jo.optDouble("zgyro",0);
        this.xmag = (float)jo.optDouble("xmag",0);
        this.ymag = (float)jo.optDouble("ymag",0);
        this.zmag = (float)jo.optDouble("zmag",0);
        this.abs_pressure = (float)jo.optDouble("abs_pressure",0);
        this.diff_pressure = (float)jo.optDouble("diff_pressure",0);
        this.pressure_alt = (float)jo.optDouble("pressure_alt",0);
        this.temperature = (float)jo.optDouble("temperature",0);
        this.fields_updated = (long)jo.optLong("fields_updated",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", time_usec);
        jo.put("xacc", xacc);
        jo.put("yacc", yacc);
        jo.put("zacc", zacc);
        jo.put("xgyro", xgyro);
        jo.put("ygyro", ygyro);
        jo.put("zgyro", zgyro);
        jo.put("xmag", xmag);
        jo.put("ymag", ymag);
        jo.put("zmag", zmag);
        jo.put("abs_pressure", abs_pressure);
        jo.put("diff_pressure", diff_pressure);
        jo.put("pressure_alt", pressure_alt);
        jo.put("temperature", temperature);
        jo.put("fields_updated", fields_updated);
        
        
        return jo;
    }

                                  
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_HIL_SENSOR - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" xacc:"+xacc+" yacc:"+yacc+" zacc:"+zacc+" xgyro:"+xgyro+" ygyro:"+ygyro+" zgyro:"+zgyro+" xmag:"+xmag+" ymag:"+ymag+" zmag:"+zmag+" abs_pressure:"+abs_pressure+" diff_pressure:"+diff_pressure+" pressure_alt:"+pressure_alt+" temperature:"+temperature+" fields_updated:"+fields_updated+"";
    }
}
        