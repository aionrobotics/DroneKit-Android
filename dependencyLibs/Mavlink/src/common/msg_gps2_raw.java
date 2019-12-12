/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GPS2_RAW PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Second GPS data.
 */
public class msg_gps2_raw extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GPS2_RAW = 124;
    public static final int MAVLINK_MSG_LENGTH = 35;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GPS2_RAW;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * Latitude (WGS84)
     */
    public int lat;
      
    /**
     * Longitude (WGS84)
     */
    public int lon;
      
    /**
     * Altitude (MSL). Positive for up.
     */
    public int alt;
      
    /**
     * Age of DGPS info
     */
    public long dgps_age;
      
    /**
     * GPS HDOP horizontal dilution of position. If unknown, set to: UINT16_MAX
     */
    public int eph;
      
    /**
     * GPS VDOP vertical dilution of position. If unknown, set to: UINT16_MAX
     */
    public int epv;
      
    /**
     * GPS ground speed. If unknown, set to: UINT16_MAX
     */
    public int vel;
      
    /**
     * Course over ground (NOT heading, but direction of movement): 0.0..359.99 degrees. If unknown, set to: UINT16_MAX
     */
    public int cog;
      
    /**
     * GPS fix type.
     */
    public short fix_type;
      
    /**
     * Number of satellites visible. If unknown, set to 255
     */
    public short satellites_visible;
      
    /**
     * Number of DGPS satellites
     */
    public short dgps_numch;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GPS2_RAW;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putInt(alt);
        packet.payload.putUnsignedInt(dgps_age);
        packet.payload.putUnsignedShort(eph);
        packet.payload.putUnsignedShort(epv);
        packet.payload.putUnsignedShort(vel);
        packet.payload.putUnsignedShort(cog);
        packet.payload.putUnsignedByte(fix_type);
        packet.payload.putUnsignedByte(satellites_visible);
        packet.payload.putUnsignedByte(dgps_numch);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gps2_raw message into this class fields
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
        this.dgps_age = payload.getUnsignedInt();
        this.eph = payload.getUnsignedShort();
        this.epv = payload.getUnsignedShort();
        this.vel = payload.getUnsignedShort();
        this.cog = payload.getUnsignedShort();
        this.fix_type = payload.getUnsignedByte();
        this.satellites_visible = payload.getUnsignedByte();
        this.dgps_numch = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gps2_raw() {
        this.msgid = MAVLINK_MSG_ID_GPS2_RAW;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gps2_raw( long time_usec, int lat, int lon, int alt, long dgps_age, int eph, int epv, int vel, int cog, short fix_type, short satellites_visible, short dgps_numch) {
        this.msgid = MAVLINK_MSG_ID_GPS2_RAW;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.dgps_age = dgps_age;
        this.eph = eph;
        this.epv = epv;
        this.vel = vel;
        this.cog = cog;
        this.fix_type = fix_type;
        this.satellites_visible = satellites_visible;
        this.dgps_numch = dgps_numch;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gps2_raw( long time_usec, int lat, int lon, int alt, long dgps_age, int eph, int epv, int vel, int cog, short fix_type, short satellites_visible, short dgps_numch, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GPS2_RAW;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.dgps_age = dgps_age;
        this.eph = eph;
        this.epv = epv;
        this.vel = vel;
        this.cog = cog;
        this.fix_type = fix_type;
        this.satellites_visible = satellites_visible;
        this.dgps_numch = dgps_numch;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gps2_raw(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GPS2_RAW;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_gps2_raw(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_GPS2_RAW;

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
        this.dgps_age = (long)jo.optLong("dgps_age",0);
        this.eph = (int)jo.optInt("eph",0);
        this.epv = (int)jo.optInt("epv",0);
        this.vel = (int)jo.optInt("vel",0);
        this.cog = (int)jo.optInt("cog",0);
        this.fix_type = (short)jo.optInt("fix_type",0);
        this.satellites_visible = (short)jo.optInt("satellites_visible",0);
        this.dgps_numch = (short)jo.optInt("dgps_numch",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", time_usec);
        jo.put("lat", lat);
        jo.put("lon", lon);
        jo.put("alt", alt);
        jo.put("dgps_age", dgps_age);
        jo.put("eph", eph);
        jo.put("epv", epv);
        jo.put("vel", vel);
        jo.put("cog", cog);
        jo.put("fix_type", fix_type);
        jo.put("satellites_visible", satellites_visible);
        jo.put("dgps_numch", dgps_numch);
        
        
        return jo;
    }

                            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GPS2_RAW - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" lat:"+lat+" lon:"+lon+" alt:"+alt+" dgps_age:"+dgps_age+" eph:"+eph+" epv:"+epv+" vel:"+vel+" cog:"+cog+" fix_type:"+fix_type+" satellites_visible:"+satellites_visible+" dgps_numch:"+dgps_numch+"";
    }
}
        