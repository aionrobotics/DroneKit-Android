/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HIL_GPS PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The global position, as returned by the Global Positioning System (GPS). This is
                 NOT the global position estimate of the sytem, but rather a RAW sensor value. See message GLOBAL_POSITION for the global position estimate.
 */
public class msg_hil_gps extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_HIL_GPS = 113;
    public static final int MAVLINK_MSG_LENGTH = 36;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HIL_GPS;

      
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
     * GPS HDOP horizontal dilution of position. If unknown, set to: 65535
     */
    public int eph;
      
    /**
     * GPS VDOP vertical dilution of position. If unknown, set to: 65535
     */
    public int epv;
      
    /**
     * GPS ground speed. If unknown, set to: 65535
     */
    public int vel;
      
    /**
     * GPS velocity in NORTH direction in earth-fixed NED frame
     */
    public short vn;
      
    /**
     * GPS velocity in EAST direction in earth-fixed NED frame
     */
    public short ve;
      
    /**
     * GPS velocity in DOWN direction in earth-fixed NED frame
     */
    public short vd;
      
    /**
     * Course over ground (NOT heading, but direction of movement), 0.0..359.99 degrees. If unknown, set to: 65535
     */
    public int cog;
      
    /**
     * 0-1: no fix, 2: 2D fix, 3: 3D fix. Some applications will not use the value of this field unless it is at least two, so always correctly fill in the fix.
     */
    public short fix_type;
      
    /**
     * Number of satellites visible. If unknown, set to 255
     */
    public short satellites_visible;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_HIL_GPS;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putInt(alt);
        packet.payload.putUnsignedShort(eph);
        packet.payload.putUnsignedShort(epv);
        packet.payload.putUnsignedShort(vel);
        packet.payload.putShort(vn);
        packet.payload.putShort(ve);
        packet.payload.putShort(vd);
        packet.payload.putUnsignedShort(cog);
        packet.payload.putUnsignedByte(fix_type);
        packet.payload.putUnsignedByte(satellites_visible);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a hil_gps message into this class fields
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
        this.eph = payload.getUnsignedShort();
        this.epv = payload.getUnsignedShort();
        this.vel = payload.getUnsignedShort();
        this.vn = payload.getShort();
        this.ve = payload.getShort();
        this.vd = payload.getShort();
        this.cog = payload.getUnsignedShort();
        this.fix_type = payload.getUnsignedByte();
        this.satellites_visible = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_hil_gps() {
        this.msgid = MAVLINK_MSG_ID_HIL_GPS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_hil_gps( long time_usec, int lat, int lon, int alt, int eph, int epv, int vel, short vn, short ve, short vd, int cog, short fix_type, short satellites_visible) {
        this.msgid = MAVLINK_MSG_ID_HIL_GPS;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.eph = eph;
        this.epv = epv;
        this.vel = vel;
        this.vn = vn;
        this.ve = ve;
        this.vd = vd;
        this.cog = cog;
        this.fix_type = fix_type;
        this.satellites_visible = satellites_visible;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_hil_gps( long time_usec, int lat, int lon, int alt, int eph, int epv, int vel, short vn, short ve, short vd, int cog, short fix_type, short satellites_visible, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_HIL_GPS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.eph = eph;
        this.epv = epv;
        this.vel = vel;
        this.vn = vn;
        this.ve = ve;
        this.vd = vd;
        this.cog = cog;
        this.fix_type = fix_type;
        this.satellites_visible = satellites_visible;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_hil_gps(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_HIL_GPS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_hil_gps(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_HIL_GPS;

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
        this.eph = (int)jo.optInt("eph",0);
        this.epv = (int)jo.optInt("epv",0);
        this.vel = (int)jo.optInt("vel",0);
        this.vn = (short)jo.optInt("vn",0);
        this.ve = (short)jo.optInt("ve",0);
        this.vd = (short)jo.optInt("vd",0);
        this.cog = (int)jo.optInt("cog",0);
        this.fix_type = (short)jo.optInt("fix_type",0);
        this.satellites_visible = (short)jo.optInt("satellites_visible",0);
        
        
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
        jo.put("eph", eph);
        jo.put("epv", epv);
        jo.put("vel", vel);
        jo.put("vn", vn);
        jo.put("ve", ve);
        jo.put("vd", vd);
        jo.put("cog", cog);
        jo.put("fix_type", fix_type);
        jo.put("satellites_visible", satellites_visible);
        
        
        return jo;
    }

                              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_HIL_GPS - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" lat:"+lat+" lon:"+lon+" alt:"+alt+" eph:"+eph+" epv:"+epv+" vel:"+vel+" vn:"+vn+" ve:"+ve+" vd:"+vd+" cog:"+cog+" fix_type:"+fix_type+" satellites_visible:"+satellites_visible+"";
    }
}
        