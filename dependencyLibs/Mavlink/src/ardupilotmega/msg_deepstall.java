/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DEEPSTALL PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Deepstall path planning.
 */
public class msg_deepstall extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DEEPSTALL = 195;
    public static final int MAVLINK_MSG_LENGTH = 37;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DEEPSTALL;

      
    /**
     * Landing latitude.
     */
    public int landing_lat;
      
    /**
     * Landing longitude.
     */
    public int landing_lon;
      
    /**
     * Final heading start point, latitude.
     */
    public int path_lat;
      
    /**
     * Final heading start point, longitude.
     */
    public int path_lon;
      
    /**
     * Arc entry point, latitude.
     */
    public int arc_entry_lat;
      
    /**
     * Arc entry point, longitude.
     */
    public int arc_entry_lon;
      
    /**
     * Altitude.
     */
    public float altitude;
      
    /**
     * Distance the aircraft expects to travel during the deepstall.
     */
    public float expected_travel_distance;
      
    /**
     * Deepstall cross track error (only valid when in DEEPSTALL_STAGE_LAND).
     */
    public float cross_track_error;
      
    /**
     * Deepstall stage.
     */
    public short stage;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_DEEPSTALL;
        
        packet.payload.putInt(landing_lat);
        packet.payload.putInt(landing_lon);
        packet.payload.putInt(path_lat);
        packet.payload.putInt(path_lon);
        packet.payload.putInt(arc_entry_lat);
        packet.payload.putInt(arc_entry_lon);
        packet.payload.putFloat(altitude);
        packet.payload.putFloat(expected_travel_distance);
        packet.payload.putFloat(cross_track_error);
        packet.payload.putUnsignedByte(stage);
        
        
        return packet;
    }

    /**
     * Decode a deepstall message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.landing_lat = payload.getInt();
        this.landing_lon = payload.getInt();
        this.path_lat = payload.getInt();
        this.path_lon = payload.getInt();
        this.arc_entry_lat = payload.getInt();
        this.arc_entry_lon = payload.getInt();
        this.altitude = payload.getFloat();
        this.expected_travel_distance = payload.getFloat();
        this.cross_track_error = payload.getFloat();
        this.stage = payload.getUnsignedByte();
        
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_deepstall() {
        this.msgid = MAVLINK_MSG_ID_DEEPSTALL;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_deepstall( int landing_lat, int landing_lon, int path_lat, int path_lon, int arc_entry_lat, int arc_entry_lon, float altitude, float expected_travel_distance, float cross_track_error, short stage) {
        this.msgid = MAVLINK_MSG_ID_DEEPSTALL;

        this.landing_lat = landing_lat;
        this.landing_lon = landing_lon;
        this.path_lat = path_lat;
        this.path_lon = path_lon;
        this.arc_entry_lat = arc_entry_lat;
        this.arc_entry_lon = arc_entry_lon;
        this.altitude = altitude;
        this.expected_travel_distance = expected_travel_distance;
        this.cross_track_error = cross_track_error;
        this.stage = stage;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_deepstall( int landing_lat, int landing_lon, int path_lat, int path_lon, int arc_entry_lat, int arc_entry_lon, float altitude, float expected_travel_distance, float cross_track_error, short stage, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_DEEPSTALL;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.landing_lat = landing_lat;
        this.landing_lon = landing_lon;
        this.path_lat = path_lat;
        this.path_lon = path_lon;
        this.arc_entry_lat = arc_entry_lat;
        this.arc_entry_lon = arc_entry_lon;
        this.altitude = altitude;
        this.expected_travel_distance = expected_travel_distance;
        this.cross_track_error = cross_track_error;
        this.stage = stage;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_deepstall(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_DEEPSTALL;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_deepstall(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_DEEPSTALL;

        readJSONheader(jo);
        
        this.landing_lat = (int)jo.optInt("landing_lat");
        this.landing_lon = (int)jo.optInt("landing_lon");
        this.path_lat = (int)jo.optInt("path_lat");
        this.path_lon = (int)jo.optInt("path_lon");
        this.arc_entry_lat = (int)jo.optInt("arc_entry_lat");
        this.arc_entry_lon = (int)jo.optInt("arc_entry_lon");
        this.altitude = (float)jo.optFloat("altitude");
        this.expected_travel_distance = (float)jo.optFloat("expected_travel_distance");
        this.cross_track_error = (float)jo.optFloat("cross_track_error");
        this.stage = (short)jo.optInt("stage");
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("landing_lat", landing_lat);
        jo.put("landing_lon", landing_lon);
        jo.put("path_lat", path_lat);
        jo.put("path_lon", path_lon);
        jo.put("arc_entry_lat", arc_entry_lat);
        jo.put("arc_entry_lon", arc_entry_lon);
        jo.put("altitude", altitude);
        jo.put("expected_travel_distance", expected_travel_distance);
        jo.put("cross_track_error", cross_track_error);
        jo.put("stage", stage);
        
        
        return jo;
    }

                        
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_DEEPSTALL - sysid:"+sysid+" compid:"+compid+" landing_lat:"+landing_lat+" landing_lon:"+landing_lon+" path_lat:"+path_lat+" path_lon:"+path_lon+" arc_entry_lat:"+arc_entry_lat+" arc_entry_lon:"+arc_entry_lon+" altitude:"+altitude+" expected_travel_distance:"+expected_travel_distance+" cross_track_error:"+cross_track_error+" stage:"+stage+"";
    }
}
        