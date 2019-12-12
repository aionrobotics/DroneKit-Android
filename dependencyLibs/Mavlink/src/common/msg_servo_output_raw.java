/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SERVO_OUTPUT_RAW PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The RAW values of the servo outputs (for RC input from the remote, use the RC_CHANNELS messages). The standard PPM modulation is as follows: 1000 microseconds: 0%, 2000 microseconds: 100%.
 */
public class msg_servo_output_raw extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SERVO_OUTPUT_RAW = 36;
    public static final int MAVLINK_MSG_LENGTH = 37;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude the number.
     */
    public long time_usec;
      
    /**
     * Servo output 1 value
     */
    public int servo1_raw;
      
    /**
     * Servo output 2 value
     */
    public int servo2_raw;
      
    /**
     * Servo output 3 value
     */
    public int servo3_raw;
      
    /**
     * Servo output 4 value
     */
    public int servo4_raw;
      
    /**
     * Servo output 5 value
     */
    public int servo5_raw;
      
    /**
     * Servo output 6 value
     */
    public int servo6_raw;
      
    /**
     * Servo output 7 value
     */
    public int servo7_raw;
      
    /**
     * Servo output 8 value
     */
    public int servo8_raw;
      
    /**
     * Servo output port (set of 8 outputs = 1 port). Flight stacks running on Pixhawk should use: 0 = MAIN, 1 = AUX.
     */
    public short port;
      
    /**
     * Servo output 9 value
     */
    public int servo9_raw;
      
    /**
     * Servo output 10 value
     */
    public int servo10_raw;
      
    /**
     * Servo output 11 value
     */
    public int servo11_raw;
      
    /**
     * Servo output 12 value
     */
    public int servo12_raw;
      
    /**
     * Servo output 13 value
     */
    public int servo13_raw;
      
    /**
     * Servo output 14 value
     */
    public int servo14_raw;
      
    /**
     * Servo output 15 value
     */
    public int servo15_raw;
      
    /**
     * Servo output 16 value
     */
    public int servo16_raw;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;
        
        packet.payload.putUnsignedInt(time_usec);
        packet.payload.putUnsignedShort(servo1_raw);
        packet.payload.putUnsignedShort(servo2_raw);
        packet.payload.putUnsignedShort(servo3_raw);
        packet.payload.putUnsignedShort(servo4_raw);
        packet.payload.putUnsignedShort(servo5_raw);
        packet.payload.putUnsignedShort(servo6_raw);
        packet.payload.putUnsignedShort(servo7_raw);
        packet.payload.putUnsignedShort(servo8_raw);
        packet.payload.putUnsignedByte(port);
        
        
        if(isMavlink2) {
            packet.payload.putUnsignedShort(servo9_raw);
        }
        if(isMavlink2) {
            packet.payload.putUnsignedShort(servo10_raw);
        }
        if(isMavlink2) {
            packet.payload.putUnsignedShort(servo11_raw);
        }
        if(isMavlink2) {
            packet.payload.putUnsignedShort(servo12_raw);
        }
        if(isMavlink2) {
            packet.payload.putUnsignedShort(servo13_raw);
        }
        if(isMavlink2) {
            packet.payload.putUnsignedShort(servo14_raw);
        }
        if(isMavlink2) {
            packet.payload.putUnsignedShort(servo15_raw);
        }
        if(isMavlink2) {
            packet.payload.putUnsignedShort(servo16_raw);
        }
        return packet;
    }

    /**
     * Decode a servo_output_raw message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedInt();
        this.servo1_raw = payload.getUnsignedShort();
        this.servo2_raw = payload.getUnsignedShort();
        this.servo3_raw = payload.getUnsignedShort();
        this.servo4_raw = payload.getUnsignedShort();
        this.servo5_raw = payload.getUnsignedShort();
        this.servo6_raw = payload.getUnsignedShort();
        this.servo7_raw = payload.getUnsignedShort();
        this.servo8_raw = payload.getUnsignedShort();
        this.port = payload.getUnsignedByte();
        
        
        if(isMavlink2) {
            this.servo9_raw = payload.getUnsignedShort();
        }
        if(isMavlink2) {
            this.servo10_raw = payload.getUnsignedShort();
        }
        if(isMavlink2) {
            this.servo11_raw = payload.getUnsignedShort();
        }
        if(isMavlink2) {
            this.servo12_raw = payload.getUnsignedShort();
        }
        if(isMavlink2) {
            this.servo13_raw = payload.getUnsignedShort();
        }
        if(isMavlink2) {
            this.servo14_raw = payload.getUnsignedShort();
        }
        if(isMavlink2) {
            this.servo15_raw = payload.getUnsignedShort();
        }
        if(isMavlink2) {
            this.servo16_raw = payload.getUnsignedShort();
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_servo_output_raw() {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_servo_output_raw( long time_usec, int servo1_raw, int servo2_raw, int servo3_raw, int servo4_raw, int servo5_raw, int servo6_raw, int servo7_raw, int servo8_raw, short port, int servo9_raw, int servo10_raw, int servo11_raw, int servo12_raw, int servo13_raw, int servo14_raw, int servo15_raw, int servo16_raw) {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;

        this.time_usec = time_usec;
        this.servo1_raw = servo1_raw;
        this.servo2_raw = servo2_raw;
        this.servo3_raw = servo3_raw;
        this.servo4_raw = servo4_raw;
        this.servo5_raw = servo5_raw;
        this.servo6_raw = servo6_raw;
        this.servo7_raw = servo7_raw;
        this.servo8_raw = servo8_raw;
        this.port = port;
        this.servo9_raw = servo9_raw;
        this.servo10_raw = servo10_raw;
        this.servo11_raw = servo11_raw;
        this.servo12_raw = servo12_raw;
        this.servo13_raw = servo13_raw;
        this.servo14_raw = servo14_raw;
        this.servo15_raw = servo15_raw;
        this.servo16_raw = servo16_raw;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_servo_output_raw( long time_usec, int servo1_raw, int servo2_raw, int servo3_raw, int servo4_raw, int servo5_raw, int servo6_raw, int servo7_raw, int servo8_raw, short port, int servo9_raw, int servo10_raw, int servo11_raw, int servo12_raw, int servo13_raw, int servo14_raw, int servo15_raw, int servo16_raw, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.servo1_raw = servo1_raw;
        this.servo2_raw = servo2_raw;
        this.servo3_raw = servo3_raw;
        this.servo4_raw = servo4_raw;
        this.servo5_raw = servo5_raw;
        this.servo6_raw = servo6_raw;
        this.servo7_raw = servo7_raw;
        this.servo8_raw = servo8_raw;
        this.port = port;
        this.servo9_raw = servo9_raw;
        this.servo10_raw = servo10_raw;
        this.servo11_raw = servo11_raw;
        this.servo12_raw = servo12_raw;
        this.servo13_raw = servo13_raw;
        this.servo14_raw = servo14_raw;
        this.servo15_raw = servo15_raw;
        this.servo16_raw = servo16_raw;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_servo_output_raw(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_servo_output_raw(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;

        readJSONheader(jo);
        
        this.time_usec = (long)jo.optLong("time_usec");
        this.servo1_raw = (int)jo.optInt("servo1_raw");
        this.servo2_raw = (int)jo.optInt("servo2_raw");
        this.servo3_raw = (int)jo.optInt("servo3_raw");
        this.servo4_raw = (int)jo.optInt("servo4_raw");
        this.servo5_raw = (int)jo.optInt("servo5_raw");
        this.servo6_raw = (int)jo.optInt("servo6_raw");
        this.servo7_raw = (int)jo.optInt("servo7_raw");
        this.servo8_raw = (int)jo.optInt("servo8_raw");
        this.port = (short)jo.optInt("port");
        
        this.servo9_raw = (int)jo.optInt("servo9_raw");
        this.servo10_raw = (int)jo.optInt("servo10_raw");
        this.servo11_raw = (int)jo.optInt("servo11_raw");
        this.servo12_raw = (int)jo.optInt("servo12_raw");
        this.servo13_raw = (int)jo.optInt("servo13_raw");
        this.servo14_raw = (int)jo.optInt("servo14_raw");
        this.servo15_raw = (int)jo.optInt("servo15_raw");
        this.servo16_raw = (int)jo.optInt("servo16_raw");
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", time_usec);
        jo.put("servo1_raw", servo1_raw);
        jo.put("servo2_raw", servo2_raw);
        jo.put("servo3_raw", servo3_raw);
        jo.put("servo4_raw", servo4_raw);
        jo.put("servo5_raw", servo5_raw);
        jo.put("servo6_raw", servo6_raw);
        jo.put("servo7_raw", servo7_raw);
        jo.put("servo8_raw", servo8_raw);
        jo.put("port", port);
        
        jo.put("servo9_raw", servo9_raw);
        jo.put("servo10_raw", servo10_raw);
        jo.put("servo11_raw", servo11_raw);
        jo.put("servo12_raw", servo12_raw);
        jo.put("servo13_raw", servo13_raw);
        jo.put("servo14_raw", servo14_raw);
        jo.put("servo15_raw", servo15_raw);
        jo.put("servo16_raw", servo16_raw);
        
        return jo;
    }

                                        
    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_SERVO_OUTPUT_RAW - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" servo1_raw:"+servo1_raw+" servo2_raw:"+servo2_raw+" servo3_raw:"+servo3_raw+" servo4_raw:"+servo4_raw+" servo5_raw:"+servo5_raw+" servo6_raw:"+servo6_raw+" servo7_raw:"+servo7_raw+" servo8_raw:"+servo8_raw+" port:"+port+" servo9_raw:"+servo9_raw+" servo10_raw:"+servo10_raw+" servo11_raw:"+servo11_raw+" servo12_raw:"+servo12_raw+" servo13_raw:"+servo13_raw+" servo14_raw:"+servo14_raw+" servo15_raw:"+servo15_raw+" servo16_raw:"+servo16_raw+"";
    }
}
        