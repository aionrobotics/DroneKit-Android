/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PING PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * A ping message either requesting or responding to a ping. This allows to measure the system latencies, including serial port, radio modem and UDP connections. The ping microservice is documented at https://mavlink.io/en/services/ping.html
 */
public class msg_ping extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_PING = 4;
    public static final int MAVLINK_MSG_LENGTH = 14;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PING;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * PING sequence
     */
    public long seq;
      
    /**
     * 0: request ping from all receiving systems. If greater than 0: message is a ping response and number is the system id of the requesting system
     */
    public short target_system;
      
    /**
     * 0: request ping from all receiving components. If greater than 0: message is a ping response and number is the component id of the requesting component.
     */
    public short target_component;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_PING;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putUnsignedInt(seq);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a ping message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.seq = payload.getUnsignedInt();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_ping() {
        this.msgid = MAVLINK_MSG_ID_PING;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_ping( long time_usec, long seq, short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_PING;

        this.time_usec = time_usec;
        this.seq = seq;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_ping( long time_usec, long seq, short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_PING;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.seq = seq;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_ping(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_PING;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_ping(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_PING;

        readJSONheader(jo);
        
        this.time_usec = (long)jo.optLong("time_usec",0);
        this.seq = (long)jo.optLong("seq",0);
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", time_usec);
        jo.put("seq", seq);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        
        
        return jo;
    }

            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_PING - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" seq:"+seq+" target_system:"+target_system+" target_component:"+target_component+"";
    }
}
        