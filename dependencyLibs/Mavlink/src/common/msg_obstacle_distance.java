/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE OBSTACLE_DISTANCE PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Obstacle distances in front of the sensor, starting from the left in increment degrees to the right
 */
public class msg_obstacle_distance extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_OBSTACLE_DISTANCE = 330;
    public static final int MAVLINK_MSG_LENGTH = 166;
    private static final long serialVersionUID = MAVLINK_MSG_ID_OBSTACLE_DISTANCE;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * Distance of obstacles around the UAV with index 0 corresponding to local forward + angle_offset. A value of 0 means that the obstacle is right in front of the sensor. A value of max_distance +1 means no obstacle is present. A value of UINT16_MAX for unknown/not used. In a array element, one unit corresponds to 1cm.
     */
    public int distances[] = new int[72];
      
    /**
     * Minimum distance the sensor can measure.
     */
    public int min_distance;
      
    /**
     * Maximum distance the sensor can measure.
     */
    public int max_distance;
      
    /**
     * Class id of the distance sensor type.
     */
    public short sensor_type;
      
    /**
     * Angular width in degrees of each array element. (Ignored if increment_f greater than 0).
     */
    public short increment;
      
    /**
     * Angular width in degrees of each array element as a float. If greater than 0 then this value is used instead of the uint8_t increment field.
     */
    public float increment_f;
      
    /**
     * Relative angle offset of the 0-index element in the distances array. Value of 0 corresponds to forward. Positive values are offsets to the right.
     */
    public float angle_offset;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE;
        
        packet.payload.putUnsignedLong(time_usec);
        
        for (int i = 0; i < distances.length; i++) {
            packet.payload.putUnsignedShort(distances[i]);
        }
                    
        packet.payload.putUnsignedShort(min_distance);
        packet.payload.putUnsignedShort(max_distance);
        packet.payload.putUnsignedByte(sensor_type);
        packet.payload.putUnsignedByte(increment);
        
        if (isMavlink2) {
             packet.payload.putFloat(increment_f);
             packet.payload.putFloat(angle_offset);
            
        }
        return packet;
    }

    /**
     * Decode a obstacle_distance message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
         
        for (int i = 0; i < this.distances.length; i++) {
            this.distances[i] = payload.getUnsignedShort();
        }
                
        this.min_distance = payload.getUnsignedShort();
        this.max_distance = payload.getUnsignedShort();
        this.sensor_type = payload.getUnsignedByte();
        this.increment = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.increment_f = payload.getFloat();
             this.angle_offset = payload.getFloat();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_obstacle_distance() {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_obstacle_distance( long time_usec, int[] distances, int min_distance, int max_distance, short sensor_type, short increment, float increment_f, float angle_offset) {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE;

        this.time_usec = time_usec;
        this.distances = distances;
        this.min_distance = min_distance;
        this.max_distance = max_distance;
        this.sensor_type = sensor_type;
        this.increment = increment;
        this.increment_f = increment_f;
        this.angle_offset = angle_offset;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_obstacle_distance( long time_usec, int[] distances, int min_distance, int max_distance, short sensor_type, short increment, float increment_f, float angle_offset, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.distances = distances;
        this.min_distance = min_distance;
        this.max_distance = max_distance;
        this.sensor_type = sensor_type;
        this.increment = increment;
        this.increment_f = increment_f;
        this.angle_offset = angle_offset;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_obstacle_distance(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_obstacle_distance(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_OBSTACLE_DISTANCE;

        readJSONheader(jo);
        
        this.time_usec = (long)jo.optLong("time_usec",0);
         
        if (jo.has("distances")) {
            JSONArray ja_distances = jo.optJSONArray("distances");
            if (ja_distances == null) {
                this.distances[0] = (int)jo.optInt("distances", 0);
            } else {
                for (int i = 0; i < Math.min(this.distances.length, ja_distances.length()); i++) {
                    this.distances[i] = (int)ja_distances.optInt(i,0);
                }
            }
        }
                    
        this.min_distance = (int)jo.optInt("min_distance",0);
        this.max_distance = (int)jo.optInt("max_distance",0);
        this.sensor_type = (short)jo.optInt("sensor_type",0);
        this.increment = (short)jo.optInt("increment",0);
        
        this.increment_f = (float)jo.optDouble("increment_f",0);
        this.angle_offset = (float)jo.optDouble("angle_offset",0);
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", time_usec);
         
        JSONArray ja_distances = new JSONArray();
        for (int i = 0; i < this.distances.length; i++) {
            ja_distances.put(this.distances[i]);
        }
        jo.put("distances", (Object)ja_distances);
                
        jo.put("min_distance", min_distance);
        jo.put("max_distance", max_distance);
        jo.put("sensor_type", sensor_type);
        jo.put("increment", increment);
        
        jo.put("increment_f", increment_f);
        jo.put("angle_offset", angle_offset);
        
        return jo;
    }

                    
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_OBSTACLE_DISTANCE - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" distances:"+distances+" min_distance:"+min_distance+" max_distance:"+max_distance+" sensor_type:"+sensor_type+" increment:"+increment+" increment_f:"+increment_f+" angle_offset:"+angle_offset+"";
    }
}
        