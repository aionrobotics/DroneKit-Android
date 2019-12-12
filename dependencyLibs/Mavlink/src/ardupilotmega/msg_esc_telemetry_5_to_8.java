/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ESC_TELEMETRY_5_TO_8 PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * ESC Telemetry Data for ESCs 5 to 8, matching data sent by BLHeli ESCs.
 */
public class msg_esc_telemetry_5_to_8 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8 = 11031;
    public static final int MAVLINK_MSG_LENGTH = 44;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8;

      
    /**
     * Voltage.
     */
    public int voltage[] = new int[4];
      
    /**
     * Current.
     */
    public int current[] = new int[4];
      
    /**
     * Total current.
     */
    public int totalcurrent[] = new int[4];
      
    /**
     * RPM (eRPM).
     */
    public int rpm[] = new int[4];
      
    /**
     * count of telemetry packets received (wraps at 65535).
     */
    public int count[] = new int[4];
      
    /**
     * Temperature.
     */
    public short temperature[] = new short[4];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8;
        
        
        for (int i = 0; i < voltage.length; i++) {
            packet.payload.putUnsignedShort(voltage[i]);
        }
                    
        
        for (int i = 0; i < current.length; i++) {
            packet.payload.putUnsignedShort(current[i]);
        }
                    
        
        for (int i = 0; i < totalcurrent.length; i++) {
            packet.payload.putUnsignedShort(totalcurrent[i]);
        }
                    
        
        for (int i = 0; i < rpm.length; i++) {
            packet.payload.putUnsignedShort(rpm[i]);
        }
                    
        
        for (int i = 0; i < count.length; i++) {
            packet.payload.putUnsignedShort(count[i]);
        }
                    
        
        for (int i = 0; i < temperature.length; i++) {
            packet.payload.putUnsignedByte(temperature[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a esc_telemetry_5_to_8 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
         
        for (int i = 0; i < this.voltage.length; i++) {
            this.voltage[i] = payload.getUnsignedShort();
        }
                
         
        for (int i = 0; i < this.current.length; i++) {
            this.current[i] = payload.getUnsignedShort();
        }
                
         
        for (int i = 0; i < this.totalcurrent.length; i++) {
            this.totalcurrent[i] = payload.getUnsignedShort();
        }
                
         
        for (int i = 0; i < this.rpm.length; i++) {
            this.rpm[i] = payload.getUnsignedShort();
        }
                
         
        for (int i = 0; i < this.count.length; i++) {
            this.count[i] = payload.getUnsignedShort();
        }
                
         
        for (int i = 0; i < this.temperature.length; i++) {
            this.temperature[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_esc_telemetry_5_to_8() {
        this.msgid = MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_esc_telemetry_5_to_8( int[] voltage, int[] current, int[] totalcurrent, int[] rpm, int[] count, short[] temperature) {
        this.msgid = MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8;

        this.voltage = voltage;
        this.current = current;
        this.totalcurrent = totalcurrent;
        this.rpm = rpm;
        this.count = count;
        this.temperature = temperature;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_esc_telemetry_5_to_8( int[] voltage, int[] current, int[] totalcurrent, int[] rpm, int[] count, short[] temperature, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.voltage = voltage;
        this.current = current;
        this.totalcurrent = totalcurrent;
        this.rpm = rpm;
        this.count = count;
        this.temperature = temperature;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_esc_telemetry_5_to_8(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_esc_telemetry_5_to_8(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8;

        readJSONheader(jo);
        
         
        if (jo.has("voltage")) {
            JSONArray ja_voltage = jo.optJSONArray("voltage");
            if (ja_voltage == null) {
                this.voltage[0] = (int)jo.optInt("voltage", 0);
            } else {
                for (int i = 0; i < Math.min(this.voltage.length, ja_voltage.length()); i++) {
                    this.voltage[i] = (int)ja_voltage.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("current")) {
            JSONArray ja_current = jo.optJSONArray("current");
            if (ja_current == null) {
                this.current[0] = (int)jo.optInt("current", 0);
            } else {
                for (int i = 0; i < Math.min(this.current.length, ja_current.length()); i++) {
                    this.current[i] = (int)ja_current.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("totalcurrent")) {
            JSONArray ja_totalcurrent = jo.optJSONArray("totalcurrent");
            if (ja_totalcurrent == null) {
                this.totalcurrent[0] = (int)jo.optInt("totalcurrent", 0);
            } else {
                for (int i = 0; i < Math.min(this.totalcurrent.length, ja_totalcurrent.length()); i++) {
                    this.totalcurrent[i] = (int)ja_totalcurrent.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("rpm")) {
            JSONArray ja_rpm = jo.optJSONArray("rpm");
            if (ja_rpm == null) {
                this.rpm[0] = (int)jo.optInt("rpm", 0);
            } else {
                for (int i = 0; i < Math.min(this.rpm.length, ja_rpm.length()); i++) {
                    this.rpm[i] = (int)ja_rpm.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("count")) {
            JSONArray ja_count = jo.optJSONArray("count");
            if (ja_count == null) {
                this.count[0] = (int)jo.optInt("count", 0);
            } else {
                for (int i = 0; i < Math.min(this.count.length, ja_count.length()); i++) {
                    this.count[i] = (int)ja_count.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("temperature")) {
            JSONArray ja_temperature = jo.optJSONArray("temperature");
            if (ja_temperature == null) {
                this.temperature[0] = (short)jo.optInt("temperature", 0);
            } else {
                for (int i = 0; i < Math.min(this.temperature.length, ja_temperature.length()); i++) {
                    this.temperature[i] = (short)ja_temperature.optInt(i,0);
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
        
         
        JSONArray ja_voltage = new JSONArray();
        for (int i = 0; i < this.voltage.length; i++) {
            ja_voltage.put(this.voltage[i]);
        }
        jo.putOpt("voltage", (Object)ja_voltage);
                
         
        JSONArray ja_current = new JSONArray();
        for (int i = 0; i < this.current.length; i++) {
            ja_current.put(this.current[i]);
        }
        jo.putOpt("current", (Object)ja_current);
                
         
        JSONArray ja_totalcurrent = new JSONArray();
        for (int i = 0; i < this.totalcurrent.length; i++) {
            ja_totalcurrent.put(this.totalcurrent[i]);
        }
        jo.putOpt("totalcurrent", (Object)ja_totalcurrent);
                
         
        JSONArray ja_rpm = new JSONArray();
        for (int i = 0; i < this.rpm.length; i++) {
            ja_rpm.put(this.rpm[i]);
        }
        jo.putOpt("rpm", (Object)ja_rpm);
                
         
        JSONArray ja_count = new JSONArray();
        for (int i = 0; i < this.count.length; i++) {
            ja_count.put(this.count[i]);
        }
        jo.putOpt("count", (Object)ja_count);
                
         
        JSONArray ja_temperature = new JSONArray();
        for (int i = 0; i < this.temperature.length; i++) {
            ja_temperature.put(this.temperature[i]);
        }
        jo.putOpt("temperature", (Object)ja_temperature);
                
        
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_ESC_TELEMETRY_5_TO_8 - sysid:"+sysid+" compid:"+compid+" voltage:"+voltage+" current:"+current+" totalcurrent:"+totalcurrent+" rpm:"+rpm+" count:"+count+" temperature:"+temperature+"";
    }
}
        