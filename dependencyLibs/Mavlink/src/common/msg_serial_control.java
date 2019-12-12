/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SERIAL_CONTROL PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Control a serial port. This can be used for raw access to an onboard serial peripheral such as a GPS or telemetry radio. It is designed to make it possible to update the devices firmware via MAVLink messages or change the devices settings. A message with zero bytes can be used to change just the baudrate.
 */
public class msg_serial_control extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SERIAL_CONTROL = 126;
    public static final int MAVLINK_MSG_LENGTH = 79;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SERIAL_CONTROL;

      
    /**
     * Baudrate of transfer. Zero means no change.
     */
    public long baudrate;
      
    /**
     * Timeout for reply data
     */
    public int timeout;
      
    /**
     * Serial control device type.
     */
    public short device;
      
    /**
     * Bitmap of serial control flags.
     */
    public short flags;
      
    /**
     * how many bytes in this transfer
     */
    public short count;
      
    /**
     * serial data
     */
    public short data[] = new short[70];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;
        
        packet.payload.putUnsignedInt(baudrate);
        packet.payload.putUnsignedShort(timeout);
        packet.payload.putUnsignedByte(device);
        packet.payload.putUnsignedByte(flags);
        packet.payload.putUnsignedByte(count);
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a serial_control message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.baudrate = payload.getUnsignedInt();
        this.timeout = payload.getUnsignedShort();
        this.device = payload.getUnsignedByte();
        this.flags = payload.getUnsignedByte();
        this.count = payload.getUnsignedByte();
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_serial_control() {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_serial_control( long baudrate, int timeout, short device, short flags, short count, short[] data) {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;

        this.baudrate = baudrate;
        this.timeout = timeout;
        this.device = device;
        this.flags = flags;
        this.count = count;
        this.data = data;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_serial_control( long baudrate, int timeout, short device, short flags, short count, short[] data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.baudrate = baudrate;
        this.timeout = timeout;
        this.device = device;
        this.flags = flags;
        this.count = count;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_serial_control(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_serial_control(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;

        readJSONheader(jo);
        
        this.baudrate = (long)jo.optLong("baudrate",0);
        this.timeout = (int)jo.optInt("timeout",0);
        this.device = (short)jo.optInt("device",0);
        this.flags = (short)jo.optInt("flags",0);
        this.count = (short)jo.optInt("count",0);
         
        if (jo.has("data")) {
            JSONArray ja_data = jo.optJSONArray("data");
            if (ja_data == null) {
                this.data[0] = (short)jo.optInt("data", 0);
            } else {
                for (int i = 0; i < Math.min(this.data.length, ja_data.length()); i++) {
                    this.data[i] = (short)ja_data.optInt(i,0);
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
        
        jo.put("baudrate", (long)baudrate);
        jo.put("timeout", (int)timeout);
        jo.put("device", (int)device);
        jo.put("flags", (int)flags);
        jo.put("count", (int)count);
         
        JSONArray ja_data = new JSONArray();
        for (int i = 0; i < this.data.length; i++) {
            ja_data.put(this.data[i]);
        }
        jo.putOpt("data", (Object)ja_data);
                
        
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SERIAL_CONTROL - sysid:"+sysid+" compid:"+compid+" baudrate:"+baudrate+" timeout:"+timeout+" device:"+device+" flags:"+flags+" count:"+count+" data:"+data+"";
    }
}
        