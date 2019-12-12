/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GLOBAL_POSITION_INT_COV PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The filtered global position (e.g. fused GPS and accelerometers). The position is in GPS-frame (right-handed, Z-up). It  is designed as scaled integer message since the resolution of float is not sufficient. NOTE: This message is intended for onboard networks / companion computers and higher-bandwidth links and optimized for accuracy and completeness. Please use the GLOBAL_POSITION_INT message for a minimal subset.
 */
public class msg_global_position_int_cov extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV = 63;
    public static final int MAVLINK_MSG_LENGTH = 181;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * Latitude
     */
    public int lat;
      
    /**
     * Longitude
     */
    public int lon;
      
    /**
     * Altitude in meters above MSL
     */
    public int alt;
      
    /**
     * Altitude above ground
     */
    public int relative_alt;
      
    /**
     * Ground X Speed (Latitude)
     */
    public float vx;
      
    /**
     * Ground Y Speed (Longitude)
     */
    public float vy;
      
    /**
     * Ground Z Speed (Altitude)
     */
    public float vz;
      
    /**
     * Row-major representation of a 6x6 position and velocity 6x6 cross-covariance matrix (states: lat, lon, alt, vx, vy, vz; first six entries are the first ROW, next six entries are the second row, etc.). If unknown, assign NaN value to first element in the array.
     */
    public float covariance[] = new float[36];
      
    /**
     * Class id of the estimator this estimate originated from.
     */
    public short estimator_type;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putInt(alt);
        packet.payload.putInt(relative_alt);
        packet.payload.putFloat(vx);
        packet.payload.putFloat(vy);
        packet.payload.putFloat(vz);
        
        for (int i = 0; i < covariance.length; i++) {
            packet.payload.putFloat(covariance[i]);
        }
                    
        packet.payload.putUnsignedByte(estimator_type);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a global_position_int_cov message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.lat = payload.getInt();
        this.lon = payload.getInt();
        this.alt = payload.getInt();
        this.relative_alt = payload.getInt();
        this.vx = payload.getFloat();
        this.vy = payload.getFloat();
        this.vz = payload.getFloat();
         
        for (int i = 0; i < this.covariance.length; i++) {
            this.covariance[i] = payload.getFloat();
        }
                
        this.estimator_type = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_global_position_int_cov() {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_global_position_int_cov( long time_usec, int lat, int lon, int alt, int relative_alt, float vx, float vy, float vz, float[] covariance, short estimator_type) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.relative_alt = relative_alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.covariance = covariance;
        this.estimator_type = estimator_type;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_global_position_int_cov( long time_usec, int lat, int lon, int alt, int relative_alt, float vx, float vy, float vz, float[] covariance, short estimator_type, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.relative_alt = relative_alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.covariance = covariance;
        this.estimator_type = estimator_type;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_global_position_int_cov(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_global_position_int_cov(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV;

        readJSONheader(jo);
        
         
        if (jo.has("time_usec")) {
            final JSONArray ja_time_usec = jo.optJSONArray("time_usec");
            if (ja_time_usec == null) {
                this.time_usec = (long)jo.optLong("time_usec", 0);
            } else if (ja_time_usec.length() > 0) {
                this.time_usec = (long)ja_time_usec.optLong(0, 0);
            }
        }
                    
        this.lat = (int)jo.optInt("lat",0);
        this.lon = (int)jo.optInt("lon",0);
        this.alt = (int)jo.optInt("alt",0);
        this.relative_alt = (int)jo.optInt("relative_alt",0);
        this.vx = (float)jo.optDouble("vx",0);
        this.vy = (float)jo.optDouble("vy",0);
        this.vz = (float)jo.optDouble("vz",0);
         
        if (jo.has("covariance")) {
            JSONArray ja_covariance = jo.optJSONArray("covariance");
            if (ja_covariance == null) {
                this.covariance[0] = (float)jo.optDouble("covariance", 0);
            } else {
                for (int i = 0; i < Math.min(this.covariance.length, ja_covariance.length()); i++) {
                    this.covariance[i] = (float)ja_covariance.optDouble(i,0);
                }
            }
        }
                    
        this.estimator_type = (short)jo.optInt("estimator_type",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", (long)time_usec);
        jo.put("lat", (int)lat);
        jo.put("lon", (int)lon);
        jo.put("alt", (int)alt);
        jo.put("relative_alt", (int)relative_alt);
        jo.put("vx", (double)vx);
        jo.put("vy", (double)vy);
        jo.put("vz", (double)vz);
         
        JSONArray ja_covariance = new JSONArray();
        for (int i = 0; i < this.covariance.length; i++) {
            ja_covariance.put(this.covariance[i]);
        }
        jo.putOpt("covariance", (Object)ja_covariance);
                
        jo.put("estimator_type", (int)estimator_type);
        
        
        return jo;
    }

                        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GLOBAL_POSITION_INT_COV - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" lat:"+lat+" lon:"+lon+" alt:"+alt+" relative_alt:"+relative_alt+" vx:"+vx+" vy:"+vy+" vz:"+vz+" covariance:"+covariance+" estimator_type:"+estimator_type+"";
    }
}
        