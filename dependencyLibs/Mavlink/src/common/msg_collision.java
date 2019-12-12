/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COLLISION PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Information about a potential collision
 */
public class msg_collision extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_COLLISION = 247;
    public static final int MAVLINK_MSG_LENGTH = 19;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COLLISION;

      
    /**
     * Unique identifier, domain based on src field
     */
    public long id;
      
    /**
     * Estimated time until collision occurs
     */
    public float time_to_minimum_delta;
      
    /**
     * Closest vertical distance between vehicle and object
     */
    public float altitude_minimum_delta;
      
    /**
     * Closest horizontal distance between vehicle and object
     */
    public float horizontal_minimum_delta;
      
    /**
     * Collision data source
     */
    public short src;
      
    /**
     * Action that is being taken to avoid this collision
     */
    public short action;
      
    /**
     * How concerned the aircraft is about this collision
     */
    public short threat_level;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_COLLISION;
        
        packet.payload.putUnsignedInt(id);
        packet.payload.putFloat(time_to_minimum_delta);
        packet.payload.putFloat(altitude_minimum_delta);
        packet.payload.putFloat(horizontal_minimum_delta);
        packet.payload.putUnsignedByte(src);
        packet.payload.putUnsignedByte(action);
        packet.payload.putUnsignedByte(threat_level);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a collision message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.id = payload.getUnsignedInt();
        this.time_to_minimum_delta = payload.getFloat();
        this.altitude_minimum_delta = payload.getFloat();
        this.horizontal_minimum_delta = payload.getFloat();
        this.src = payload.getUnsignedByte();
        this.action = payload.getUnsignedByte();
        this.threat_level = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_collision() {
        this.msgid = MAVLINK_MSG_ID_COLLISION;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_collision( long id, float time_to_minimum_delta, float altitude_minimum_delta, float horizontal_minimum_delta, short src, short action, short threat_level) {
        this.msgid = MAVLINK_MSG_ID_COLLISION;

        this.id = id;
        this.time_to_minimum_delta = time_to_minimum_delta;
        this.altitude_minimum_delta = altitude_minimum_delta;
        this.horizontal_minimum_delta = horizontal_minimum_delta;
        this.src = src;
        this.action = action;
        this.threat_level = threat_level;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_collision( long id, float time_to_minimum_delta, float altitude_minimum_delta, float horizontal_minimum_delta, short src, short action, short threat_level, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_COLLISION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.id = id;
        this.time_to_minimum_delta = time_to_minimum_delta;
        this.altitude_minimum_delta = altitude_minimum_delta;
        this.horizontal_minimum_delta = horizontal_minimum_delta;
        this.src = src;
        this.action = action;
        this.threat_level = threat_level;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_collision(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_COLLISION;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_collision(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_COLLISION;

        readJSONheader(jo);
        
        this.id = (long)jo.optLong("id",0);
        this.time_to_minimum_delta = (float)jo.optDouble("time_to_minimum_delta",0);
        this.altitude_minimum_delta = (float)jo.optDouble("altitude_minimum_delta",0);
        this.horizontal_minimum_delta = (float)jo.optDouble("horizontal_minimum_delta",0);
        this.src = (short)jo.optInt("src",0);
        this.action = (short)jo.optInt("action",0);
        this.threat_level = (short)jo.optInt("threat_level",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("id", id);
        jo.put("time_to_minimum_delta", time_to_minimum_delta);
        jo.put("altitude_minimum_delta", altitude_minimum_delta);
        jo.put("horizontal_minimum_delta", horizontal_minimum_delta);
        jo.put("src", src);
        jo.put("action", action);
        jo.put("threat_level", threat_level);
        
        
        return jo;
    }

                  
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_COLLISION - sysid:"+sysid+" compid:"+compid+" id:"+id+" time_to_minimum_delta:"+time_to_minimum_delta+" altitude_minimum_delta:"+altitude_minimum_delta+" horizontal_minimum_delta:"+horizontal_minimum_delta+" src:"+src+" action:"+action+" threat_level:"+threat_level+"";
    }
}
        