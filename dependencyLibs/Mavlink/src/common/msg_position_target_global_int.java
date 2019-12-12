/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE POSITION_TARGET_GLOBAL_INT PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Reports the current commanded vehicle position, velocity, and acceleration as specified by the autopilot. This should match the commands sent in SET_POSITION_TARGET_GLOBAL_INT if the vehicle is being controlled this way.
 */
public class msg_position_target_global_int extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT = 87;
    public static final int MAVLINK_MSG_LENGTH = 51;
    private static final long serialVersionUID = MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT;

      
    /**
     * Timestamp (time since system boot). The rationale for the timestamp in the setpoint is to allow the system to compensate for the transport delay of the setpoint. This allows the system to compensate processing latency.
     */
    public long time_boot_ms;
      
    /**
     * X Position in WGS84 frame
     */
    public int lat_int;
      
    /**
     * Y Position in WGS84 frame
     */
    public int lon_int;
      
    /**
     * Altitude (MSL, AGL or relative to home altitude, depending on frame)
     */
    public float alt;
      
    /**
     * X velocity in NED frame
     */
    public float vx;
      
    /**
     * Y velocity in NED frame
     */
    public float vy;
      
    /**
     * Z velocity in NED frame
     */
    public float vz;
      
    /**
     * X acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afx;
      
    /**
     * Y acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afy;
      
    /**
     * Z acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afz;
      
    /**
     * yaw setpoint
     */
    public float yaw;
      
    /**
     * yaw rate setpoint
     */
    public float yaw_rate;
      
    /**
     * Bitmap to indicate which dimensions should be ignored by the vehicle.
     */
    public int type_mask;
      
    /**
     * Valid options are: MAV_FRAME_GLOBAL_INT = 5, MAV_FRAME_GLOBAL_RELATIVE_ALT_INT = 6, MAV_FRAME_GLOBAL_TERRAIN_ALT_INT = 11
     */
    public short coordinate_frame;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putInt(lat_int);
        packet.payload.putInt(lon_int);
        packet.payload.putFloat(alt);
        packet.payload.putFloat(vx);
        packet.payload.putFloat(vy);
        packet.payload.putFloat(vz);
        packet.payload.putFloat(afx);
        packet.payload.putFloat(afy);
        packet.payload.putFloat(afz);
        packet.payload.putFloat(yaw);
        packet.payload.putFloat(yaw_rate);
        packet.payload.putUnsignedShort(type_mask);
        packet.payload.putUnsignedByte(coordinate_frame);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a position_target_global_int message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.lat_int = payload.getInt();
        this.lon_int = payload.getInt();
        this.alt = payload.getFloat();
        this.vx = payload.getFloat();
        this.vy = payload.getFloat();
        this.vz = payload.getFloat();
        this.afx = payload.getFloat();
        this.afy = payload.getFloat();
        this.afz = payload.getFloat();
        this.yaw = payload.getFloat();
        this.yaw_rate = payload.getFloat();
        this.type_mask = payload.getUnsignedShort();
        this.coordinate_frame = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_position_target_global_int() {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_position_target_global_int( long time_boot_ms, int lat_int, int lon_int, float alt, float vx, float vy, float vz, float afx, float afy, float afz, float yaw, float yaw_rate, int type_mask, short coordinate_frame) {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT;

        this.time_boot_ms = time_boot_ms;
        this.lat_int = lat_int;
        this.lon_int = lon_int;
        this.alt = alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.afx = afx;
        this.afy = afy;
        this.afz = afz;
        this.yaw = yaw;
        this.yaw_rate = yaw_rate;
        this.type_mask = type_mask;
        this.coordinate_frame = coordinate_frame;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_position_target_global_int( long time_boot_ms, int lat_int, int lon_int, float alt, float vx, float vy, float vz, float afx, float afy, float afz, float yaw, float yaw_rate, int type_mask, short coordinate_frame, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.lat_int = lat_int;
        this.lon_int = lon_int;
        this.alt = alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.afx = afx;
        this.afy = afy;
        this.afz = afz;
        this.yaw = yaw;
        this.yaw_rate = yaw_rate;
        this.type_mask = type_mask;
        this.coordinate_frame = coordinate_frame;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_position_target_global_int(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_position_target_global_int(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT;

        readJSONheader(jo);
        
        this.time_boot_ms = (long)jo.optLong("time_boot_ms",0);
        this.lat_int = (int)jo.optInt("lat_int",0);
        this.lon_int = (int)jo.optInt("lon_int",0);
        this.alt = (float)jo.optDouble("alt",0);
        this.vx = (float)jo.optDouble("vx",0);
        this.vy = (float)jo.optDouble("vy",0);
        this.vz = (float)jo.optDouble("vz",0);
        this.afx = (float)jo.optDouble("afx",0);
        this.afy = (float)jo.optDouble("afy",0);
        this.afz = (float)jo.optDouble("afz",0);
        this.yaw = (float)jo.optDouble("yaw",0);
        this.yaw_rate = (float)jo.optDouble("yaw_rate",0);
        this.type_mask = (int)jo.optInt("type_mask",0);
        this.coordinate_frame = (short)jo.optInt("coordinate_frame",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_boot_ms", (long)time_boot_ms);
        jo.put("lat_int", (int)lat_int);
        jo.put("lon_int", (int)lon_int);
        jo.put("alt", (double)alt);
        jo.put("vx", (double)vx);
        jo.put("vy", (double)vy);
        jo.put("vz", (double)vz);
        jo.put("afx", (double)afx);
        jo.put("afy", (double)afy);
        jo.put("afz", (double)afz);
        jo.put("yaw", (double)yaw);
        jo.put("yaw_rate", (double)yaw_rate);
        jo.put("type_mask", (int)type_mask);
        jo.put("coordinate_frame", (int)coordinate_frame);
        
        
        return jo;
    }

                                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_POSITION_TARGET_GLOBAL_INT - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" lat_int:"+lat_int+" lon_int:"+lon_int+" alt:"+alt+" vx:"+vx+" vy:"+vy+" vz:"+vz+" afx:"+afx+" afy:"+afy+" afz:"+afz+" yaw:"+yaw+" yaw_rate:"+yaw_rate+" type_mask:"+type_mask+" coordinate_frame:"+coordinate_frame+"";
    }
}
        