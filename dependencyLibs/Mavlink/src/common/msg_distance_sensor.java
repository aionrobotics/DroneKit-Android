/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DISTANCE_SENSOR PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Distance sensor information for an onboard rangefinder.
 */
public class msg_distance_sensor extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DISTANCE_SENSOR = 132;
    public static final int MAVLINK_MSG_LENGTH = 38;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DISTANCE_SENSOR;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * Minimum distance the sensor can measure
     */
    public int min_distance;
      
    /**
     * Maximum distance the sensor can measure
     */
    public int max_distance;
      
    /**
     * Current distance reading
     */
    public int current_distance;
      
    /**
     * Type of distance sensor.
     */
    public short type;
      
    /**
     * Onboard ID of the sensor
     */
    public short id;
      
    /**
     * Direction the sensor faces. downward-facing: ROTATION_PITCH_270, upward-facing: ROTATION_PITCH_90, backward-facing: ROTATION_PITCH_180, forward-facing: ROTATION_NONE, left-facing: ROTATION_YAW_90, right-facing: ROTATION_YAW_270
     */
    public short orientation;
      
    /**
     * Measurement variance. Max standard deviation is 6cm. 255 if unknown.
     */
    public short covariance;
      
    /**
     * Horizontal Field of View (angle) where the distance measurement is valid and the field of view is known. Otherwise this is set to 0.
     */
    public float horizontal_fov;
      
    /**
     * Vertical Field of View (angle) where the distance measurement is valid and the field of view is known. Otherwise this is set to 0.
     */
    public float vertical_fov;
      
    /**
     * Quaternion of the sensor orientation in vehicle body frame (w, x, y, z order, zero-rotation is 1, 0, 0, 0). Zero-rotation is along the vehicle body x-axis. This field is required if the orientation is set to MAV_SENSOR_ROTATION_CUSTOM. Set it to 0 if invalid."
     */
    public float quaternion[] = new float[4];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putUnsignedShort(min_distance);
        packet.payload.putUnsignedShort(max_distance);
        packet.payload.putUnsignedShort(current_distance);
        packet.payload.putUnsignedByte(type);
        packet.payload.putUnsignedByte(id);
        packet.payload.putUnsignedByte(orientation);
        packet.payload.putUnsignedByte(covariance);
        
        if (isMavlink2) {
             packet.payload.putFloat(horizontal_fov);
             packet.payload.putFloat(vertical_fov);
             
        for (int i = 0; i < quaternion.length; i++) {
            packet.payload.putFloat(quaternion[i]);
        }
                    
            
        }
        return packet;
    }

    /**
     * Decode a distance_sensor message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.min_distance = payload.getUnsignedShort();
        this.max_distance = payload.getUnsignedShort();
        this.current_distance = payload.getUnsignedShort();
        this.type = payload.getUnsignedByte();
        this.id = payload.getUnsignedByte();
        this.orientation = payload.getUnsignedByte();
        this.covariance = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.horizontal_fov = payload.getFloat();
             this.vertical_fov = payload.getFloat();
              
        for (int i = 0; i < this.quaternion.length; i++) {
            this.quaternion[i] = payload.getFloat();
        }
                
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_distance_sensor() {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_distance_sensor( long time_boot_ms, int min_distance, int max_distance, int current_distance, short type, short id, short orientation, short covariance, float horizontal_fov, float vertical_fov, float[] quaternion) {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;

        this.time_boot_ms = time_boot_ms;
        this.min_distance = min_distance;
        this.max_distance = max_distance;
        this.current_distance = current_distance;
        this.type = type;
        this.id = id;
        this.orientation = orientation;
        this.covariance = covariance;
        this.horizontal_fov = horizontal_fov;
        this.vertical_fov = vertical_fov;
        this.quaternion = quaternion;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_distance_sensor( long time_boot_ms, int min_distance, int max_distance, int current_distance, short type, short id, short orientation, short covariance, float horizontal_fov, float vertical_fov, float[] quaternion, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.min_distance = min_distance;
        this.max_distance = max_distance;
        this.current_distance = current_distance;
        this.type = type;
        this.id = id;
        this.orientation = orientation;
        this.covariance = covariance;
        this.horizontal_fov = horizontal_fov;
        this.vertical_fov = vertical_fov;
        this.quaternion = quaternion;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_distance_sensor(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_distance_sensor(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;

        readJSONheader(jo);
        
        this.time_boot_ms = (long)jo.optLong("time_boot_ms",0);
        this.min_distance = (int)jo.optInt("min_distance",0);
        this.max_distance = (int)jo.optInt("max_distance",0);
        this.current_distance = (int)jo.optInt("current_distance",0);
        this.type = (short)jo.optInt("type",0);
        this.id = (short)jo.optInt("id",0);
        this.orientation = (short)jo.optInt("orientation",0);
        this.covariance = (short)jo.optInt("covariance",0);
        
        this.horizontal_fov = (float)jo.optDouble("horizontal_fov",0);
        this.vertical_fov = (float)jo.optDouble("vertical_fov",0);
         
        if (jo.has("quaternion")) {
            JSONArray ja_quaternion = jo.optJSONArray("quaternion");
            if (ja_quaternion == null) {
                this.quaternion[0] = (float)jo.optDouble("quaternion", 0);
            } else {
                for (int i = 0; i < Math.min(this.quaternion.length, ja_quaternion.length()); i++) {
                    this.quaternion[i] = (float)ja_quaternion.optDouble(i,0);
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
        
        jo.put("time_boot_ms", (long)time_boot_ms);
        jo.put("min_distance", (int)min_distance);
        jo.put("max_distance", (int)max_distance);
        jo.put("current_distance", (int)current_distance);
        jo.put("type", (int)type);
        jo.put("id", (int)id);
        jo.put("orientation", (int)orientation);
        jo.put("covariance", (int)covariance);
        
        jo.put("horizontal_fov", (double)horizontal_fov);
        jo.put("vertical_fov", (double)vertical_fov);
         
        JSONArray ja_quaternion = new JSONArray();
        for (int i = 0; i < this.quaternion.length; i++) {
            ja_quaternion.put(this.quaternion[i]);
        }
        jo.putOpt("quaternion", (Object)ja_quaternion);
                
        
        return jo;
    }

                          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_DISTANCE_SENSOR - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" min_distance:"+min_distance+" max_distance:"+max_distance+" current_distance:"+current_distance+" type:"+type+" id:"+id+" orientation:"+orientation+" covariance:"+covariance+" horizontal_fov:"+horizontal_fov+" vertical_fov:"+vertical_fov+" quaternion:"+quaternion+"";
    }
}
        