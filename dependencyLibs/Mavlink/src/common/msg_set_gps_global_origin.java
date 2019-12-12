/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SET_GPS_GLOBAL_ORIGIN PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * As local waypoints exist, the global waypoint reference allows to transform between the local coordinate frame and the global (GPS) coordinate frame. This can be necessary when e.g. in- and outdoor settings are connected and the MAV should move from in- to outdoor.
 */
public class msg_set_gps_global_origin extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN = 48;
    public static final int MAVLINK_MSG_LENGTH = 21;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;

      
    /**
     * Latitude (WGS84)
     */
    public int latitude;
      
    /**
     * Longitude (WGS84)
     */
    public int longitude;
      
    /**
     * Altitude (MSL). Positive for up.
     */
    public int altitude;
      
    /**
     * System ID
     */
    public short target_system;
      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;
        
        packet.payload.putInt(latitude);
        packet.payload.putInt(longitude);
        packet.payload.putInt(altitude);
        packet.payload.putUnsignedByte(target_system);
        
        if (isMavlink2) {
             packet.payload.putUnsignedLong(time_usec);
            
        }
        return packet;
    }

    /**
     * Decode a set_gps_global_origin message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.latitude = payload.getInt();
        this.longitude = payload.getInt();
        this.altitude = payload.getInt();
        this.target_system = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.time_usec = payload.getUnsignedLong();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_set_gps_global_origin() {
        this.msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_set_gps_global_origin( int latitude, int longitude, int altitude, short target_system, long time_usec) {
        this.msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;

        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.target_system = target_system;
        this.time_usec = time_usec;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_set_gps_global_origin( int latitude, int longitude, int altitude, short target_system, long time_usec, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.target_system = target_system;
        this.time_usec = time_usec;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_set_gps_global_origin(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_set_gps_global_origin(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN;

        readJSONheader(jo);
        
        this.latitude = (int)jo.optInt("latitude",0);
        this.longitude = (int)jo.optInt("longitude",0);
        this.altitude = (int)jo.optInt("altitude",0);
        this.target_system = (short)jo.optInt("target_system",0);
        
         
        if (jo.has("time_usec")) {
            final JSONArray ja_time_usec = jo.optJSONArray("time_usec");
            if (ja_time_usec == null) {
                this.time_usec = (long)jo.optLong("time_usec", 0);
            } else if (ja_time_usec.length() > 0) {
                this.time_usec = (long)ja_time_usec.optLong(0, 0);
            }
        }
                    
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("latitude", (int)latitude);
        jo.put("longitude", (int)longitude);
        jo.put("altitude", (int)altitude);
        jo.put("target_system", (int)target_system);
        
        jo.put("time_usec", (long)time_usec);
        
        return jo;
    }

              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN - sysid:"+sysid+" compid:"+compid+" latitude:"+latitude+" longitude:"+longitude+" altitude:"+altitude+" target_system:"+target_system+" time_usec:"+time_usec+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SET_GPS_GLOBAL_ORIGIN";
    }
}
        