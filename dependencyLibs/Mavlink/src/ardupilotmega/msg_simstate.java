/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SIMSTATE PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Status of simulation environment, if used.
 */
public class msg_simstate extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SIMSTATE = 164;
    public static final int MAVLINK_MSG_LENGTH = 44;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SIMSTATE;

      
    /**
     * Roll angle.
     */
    public float roll;
      
    /**
     * Pitch angle.
     */
    public float pitch;
      
    /**
     * Yaw angle.
     */
    public float yaw;
      
    /**
     * X acceleration.
     */
    public float xacc;
      
    /**
     * Y acceleration.
     */
    public float yacc;
      
    /**
     * Z acceleration.
     */
    public float zacc;
      
    /**
     * Angular speed around X axis.
     */
    public float xgyro;
      
    /**
     * Angular speed around Y axis.
     */
    public float ygyro;
      
    /**
     * Angular speed around Z axis.
     */
    public float zgyro;
      
    /**
     * Latitude.
     */
    public int lat;
      
    /**
     * Longitude.
     */
    public int lng;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SIMSTATE;
        
        packet.payload.putFloat(roll);
        packet.payload.putFloat(pitch);
        packet.payload.putFloat(yaw);
        packet.payload.putFloat(xacc);
        packet.payload.putFloat(yacc);
        packet.payload.putFloat(zacc);
        packet.payload.putFloat(xgyro);
        packet.payload.putFloat(ygyro);
        packet.payload.putFloat(zgyro);
        packet.payload.putInt(lat);
        packet.payload.putInt(lng);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a simstate message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.roll = payload.getFloat();
        this.pitch = payload.getFloat();
        this.yaw = payload.getFloat();
        this.xacc = payload.getFloat();
        this.yacc = payload.getFloat();
        this.zacc = payload.getFloat();
        this.xgyro = payload.getFloat();
        this.ygyro = payload.getFloat();
        this.zgyro = payload.getFloat();
        this.lat = payload.getInt();
        this.lng = payload.getInt();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_simstate() {
        this.msgid = MAVLINK_MSG_ID_SIMSTATE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_simstate( float roll, float pitch, float yaw, float xacc, float yacc, float zacc, float xgyro, float ygyro, float zgyro, int lat, int lng) {
        this.msgid = MAVLINK_MSG_ID_SIMSTATE;

        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        this.lat = lat;
        this.lng = lng;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_simstate( float roll, float pitch, float yaw, float xacc, float yacc, float zacc, float xgyro, float ygyro, float zgyro, int lat, int lng, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SIMSTATE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        this.lat = lat;
        this.lng = lng;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_simstate(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SIMSTATE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_simstate(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SIMSTATE;

        readJSONheader(jo);
        
        this.roll = (float)jo.optDouble("roll",0);
        this.pitch = (float)jo.optDouble("pitch",0);
        this.yaw = (float)jo.optDouble("yaw",0);
        this.xacc = (float)jo.optDouble("xacc",0);
        this.yacc = (float)jo.optDouble("yacc",0);
        this.zacc = (float)jo.optDouble("zacc",0);
        this.xgyro = (float)jo.optDouble("xgyro",0);
        this.ygyro = (float)jo.optDouble("ygyro",0);
        this.zgyro = (float)jo.optDouble("zgyro",0);
        this.lat = (int)jo.optInt("lat",0);
        this.lng = (int)jo.optInt("lng",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("roll", (double)roll);
        jo.put("pitch", (double)pitch);
        jo.put("yaw", (double)yaw);
        jo.put("xacc", (double)xacc);
        jo.put("yacc", (double)yacc);
        jo.put("zacc", (double)zacc);
        jo.put("xgyro", (double)xgyro);
        jo.put("ygyro", (double)ygyro);
        jo.put("zgyro", (double)zgyro);
        jo.put("lat", (int)lat);
        jo.put("lng", (int)lng);
        
        
        return jo;
    }

                          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SIMSTATE - sysid:"+sysid+" compid:"+compid+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" xacc:"+xacc+" yacc:"+yacc+" zacc:"+zacc+" xgyro:"+xgyro+" ygyro:"+ygyro+" zgyro:"+zgyro+" lat:"+lat+" lng:"+lng+"";
    }
}
        