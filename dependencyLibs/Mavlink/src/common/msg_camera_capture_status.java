/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CAMERA_CAPTURE_STATUS PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Information about the status of a capture.
 */
public class msg_camera_capture_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS = 262;
    public static final int MAVLINK_MSG_LENGTH = 18;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * Image capture interval
     */
    public float image_interval;
      
    /**
     * Time since recording started
     */
    public long recording_time_ms;
      
    /**
     * Available storage capacity.
     */
    public float available_capacity;
      
    /**
     * Current status of image capturing (0: idle, 1: capture in progress, 2: interval set but idle, 3: interval set and capture in progress)
     */
    public short image_status;
      
    /**
     * Current status of video capturing (0: idle, 1: capture in progress)
     */
    public short video_status;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putFloat(image_interval);
        packet.payload.putUnsignedInt(recording_time_ms);
        packet.payload.putFloat(available_capacity);
        packet.payload.putUnsignedByte(image_status);
        packet.payload.putUnsignedByte(video_status);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a camera_capture_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.image_interval = payload.getFloat();
        this.recording_time_ms = payload.getUnsignedInt();
        this.available_capacity = payload.getFloat();
        this.image_status = payload.getUnsignedByte();
        this.video_status = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_camera_capture_status() {
        this.msgid = MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_camera_capture_status( long time_boot_ms, float image_interval, long recording_time_ms, float available_capacity, short image_status, short video_status) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS;

        this.time_boot_ms = time_boot_ms;
        this.image_interval = image_interval;
        this.recording_time_ms = recording_time_ms;
        this.available_capacity = available_capacity;
        this.image_status = image_status;
        this.video_status = video_status;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_camera_capture_status( long time_boot_ms, float image_interval, long recording_time_ms, float available_capacity, short image_status, short video_status, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.image_interval = image_interval;
        this.recording_time_ms = recording_time_ms;
        this.available_capacity = available_capacity;
        this.image_status = image_status;
        this.video_status = video_status;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_camera_capture_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_camera_capture_status(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS;

        readJSONheader(jo);
        
        this.time_boot_ms = (long)jo.optLong("time_boot_ms",0);
        this.image_interval = (float)jo.optDouble("image_interval",0);
        this.recording_time_ms = (long)jo.optLong("recording_time_ms",0);
        this.available_capacity = (float)jo.optDouble("available_capacity",0);
        this.image_status = (short)jo.optInt("image_status",0);
        this.video_status = (short)jo.optInt("video_status",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_boot_ms", (long)time_boot_ms);
        jo.put("image_interval", (double)image_interval);
        jo.put("recording_time_ms", (long)recording_time_ms);
        jo.put("available_capacity", (double)available_capacity);
        jo.put("image_status", (int)image_status);
        jo.put("video_status", (int)video_status);
        
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_CAMERA_CAPTURE_STATUS - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" image_interval:"+image_interval+" recording_time_ms:"+recording_time_ms+" available_capacity:"+available_capacity+" image_status:"+image_status+" video_status:"+video_status+"";
    }
}
        