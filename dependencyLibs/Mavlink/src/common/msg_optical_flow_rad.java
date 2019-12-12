/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE OPTICAL_FLOW_RAD PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Optical flow from an angular rate flow sensor (e.g. PX4FLOW or mouse sensor)
 */
public class msg_optical_flow_rad extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_OPTICAL_FLOW_RAD = 106;
    public static final int MAVLINK_MSG_LENGTH = 44;
    private static final long serialVersionUID = MAVLINK_MSG_ID_OPTICAL_FLOW_RAD;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * Integration time. Divide integrated_x and integrated_y by the integration time to obtain average flow. The integration time also indicates the.
     */
    public long integration_time_us;
      
    /**
     * Flow around X axis (Sensor RH rotation about the X axis induces a positive flow. Sensor linear motion along the positive Y axis induces a negative flow.)
     */
    public float integrated_x;
      
    /**
     * Flow around Y axis (Sensor RH rotation about the Y axis induces a positive flow. Sensor linear motion along the positive X axis induces a positive flow.)
     */
    public float integrated_y;
      
    /**
     * RH rotation around X axis
     */
    public float integrated_xgyro;
      
    /**
     * RH rotation around Y axis
     */
    public float integrated_ygyro;
      
    /**
     * RH rotation around Z axis
     */
    public float integrated_zgyro;
      
    /**
     * Time since the distance was sampled.
     */
    public long time_delta_distance_us;
      
    /**
     * Distance to the center of the flow field. Positive value (including zero): distance known. Negative value: Unknown distance.
     */
    public float distance;
      
    /**
     * Temperature
     */
    public short temperature;
      
    /**
     * Sensor ID
     */
    public short sensor_id;
      
    /**
     * Optical flow quality / confidence. 0: no valid flow, 255: maximum quality
     */
    public short quality;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW_RAD;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putUnsignedInt(integration_time_us);
        packet.payload.putFloat(integrated_x);
        packet.payload.putFloat(integrated_y);
        packet.payload.putFloat(integrated_xgyro);
        packet.payload.putFloat(integrated_ygyro);
        packet.payload.putFloat(integrated_zgyro);
        packet.payload.putUnsignedInt(time_delta_distance_us);
        packet.payload.putFloat(distance);
        packet.payload.putShort(temperature);
        packet.payload.putUnsignedByte(sensor_id);
        packet.payload.putUnsignedByte(quality);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a optical_flow_rad message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.integration_time_us = payload.getUnsignedInt();
        this.integrated_x = payload.getFloat();
        this.integrated_y = payload.getFloat();
        this.integrated_xgyro = payload.getFloat();
        this.integrated_ygyro = payload.getFloat();
        this.integrated_zgyro = payload.getFloat();
        this.time_delta_distance_us = payload.getUnsignedInt();
        this.distance = payload.getFloat();
        this.temperature = payload.getShort();
        this.sensor_id = payload.getUnsignedByte();
        this.quality = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_optical_flow_rad() {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW_RAD;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_optical_flow_rad( long time_usec, long integration_time_us, float integrated_x, float integrated_y, float integrated_xgyro, float integrated_ygyro, float integrated_zgyro, long time_delta_distance_us, float distance, short temperature, short sensor_id, short quality) {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW_RAD;

        this.time_usec = time_usec;
        this.integration_time_us = integration_time_us;
        this.integrated_x = integrated_x;
        this.integrated_y = integrated_y;
        this.integrated_xgyro = integrated_xgyro;
        this.integrated_ygyro = integrated_ygyro;
        this.integrated_zgyro = integrated_zgyro;
        this.time_delta_distance_us = time_delta_distance_us;
        this.distance = distance;
        this.temperature = temperature;
        this.sensor_id = sensor_id;
        this.quality = quality;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_optical_flow_rad( long time_usec, long integration_time_us, float integrated_x, float integrated_y, float integrated_xgyro, float integrated_ygyro, float integrated_zgyro, long time_delta_distance_us, float distance, short temperature, short sensor_id, short quality, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW_RAD;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.integration_time_us = integration_time_us;
        this.integrated_x = integrated_x;
        this.integrated_y = integrated_y;
        this.integrated_xgyro = integrated_xgyro;
        this.integrated_ygyro = integrated_ygyro;
        this.integrated_zgyro = integrated_zgyro;
        this.time_delta_distance_us = time_delta_distance_us;
        this.distance = distance;
        this.temperature = temperature;
        this.sensor_id = sensor_id;
        this.quality = quality;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_optical_flow_rad(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW_RAD;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_optical_flow_rad(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW_RAD;

        readJSONheader(jo);
        
         
        if (jo.has("time_usec")) {
            final JSONArray ja_time_usec = jo.optJSONArray("time_usec");
            if (ja_time_usec == null) {
                this.time_usec = (long)jo.optLong("time_usec", 0);
            } else if (ja_time_usec.length() > 0) {
                this.time_usec = (long)ja_time_usec.optLong(0, 0);
            }
        }
                    
        this.integration_time_us = (long)jo.optLong("integration_time_us",0);
        this.integrated_x = (float)jo.optDouble("integrated_x",0);
        this.integrated_y = (float)jo.optDouble("integrated_y",0);
        this.integrated_xgyro = (float)jo.optDouble("integrated_xgyro",0);
        this.integrated_ygyro = (float)jo.optDouble("integrated_ygyro",0);
        this.integrated_zgyro = (float)jo.optDouble("integrated_zgyro",0);
        this.time_delta_distance_us = (long)jo.optLong("time_delta_distance_us",0);
        this.distance = (float)jo.optDouble("distance",0);
        this.temperature = (short)jo.optInt("temperature",0);
        this.sensor_id = (short)jo.optInt("sensor_id",0);
        this.quality = (short)jo.optInt("quality",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", (long)time_usec);
        jo.put("integration_time_us", (long)integration_time_us);
        jo.put("integrated_x", (double)integrated_x);
        jo.put("integrated_y", (double)integrated_y);
        jo.put("integrated_xgyro", (double)integrated_xgyro);
        jo.put("integrated_ygyro", (double)integrated_ygyro);
        jo.put("integrated_zgyro", (double)integrated_zgyro);
        jo.put("time_delta_distance_us", (long)time_delta_distance_us);
        jo.put("distance", (double)distance);
        jo.put("temperature", (int)temperature);
        jo.put("sensor_id", (int)sensor_id);
        jo.put("quality", (int)quality);
        
        
        return jo;
    }

                            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_OPTICAL_FLOW_RAD - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" integration_time_us:"+integration_time_us+" integrated_x:"+integrated_x+" integrated_y:"+integrated_y+" integrated_xgyro:"+integrated_xgyro+" integrated_ygyro:"+integrated_ygyro+" integrated_zgyro:"+integrated_zgyro+" time_delta_distance_us:"+time_delta_distance_us+" distance:"+distance+" temperature:"+temperature+" sensor_id:"+sensor_id+" quality:"+quality+"";
    }
}
        