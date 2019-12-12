/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MAG_CAL_REPORT PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Reports results of completed compass calibration. Sent until MAG_CAL_ACK received.
 */
public class msg_mag_cal_report extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MAG_CAL_REPORT = 192;
    public static final int MAVLINK_MSG_LENGTH = 50;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MAG_CAL_REPORT;

      
    /**
     * RMS milligauss residuals.
     */
    public float fitness;
      
    /**
     * X offset.
     */
    public float ofs_x;
      
    /**
     * Y offset.
     */
    public float ofs_y;
      
    /**
     * Z offset.
     */
    public float ofs_z;
      
    /**
     * X diagonal (matrix 11).
     */
    public float diag_x;
      
    /**
     * Y diagonal (matrix 22).
     */
    public float diag_y;
      
    /**
     * Z diagonal (matrix 33).
     */
    public float diag_z;
      
    /**
     * X off-diagonal (matrix 12 and 21).
     */
    public float offdiag_x;
      
    /**
     * Y off-diagonal (matrix 13 and 31).
     */
    public float offdiag_y;
      
    /**
     * Z off-diagonal (matrix 32 and 23).
     */
    public float offdiag_z;
      
    /**
     * Compass being calibrated.
     */
    public short compass_id;
      
    /**
     * Bitmask of compasses being calibrated.
     */
    public short cal_mask;
      
    /**
     * Calibration Status.
     */
    public short cal_status;
      
    /**
     * 0=requires a MAV_CMD_DO_ACCEPT_MAG_CAL, 1=saved to parameters.
     */
    public short autosaved;
      
    /**
     * Confidence in orientation (higher is better).
     */
    public float orientation_confidence;
      
    /**
     * orientation before calibration.
     */
    public short old_orientation;
      
    /**
     * orientation after calibration.
     */
    public short new_orientation;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MAG_CAL_REPORT;
        
        packet.payload.putFloat(fitness);
        packet.payload.putFloat(ofs_x);
        packet.payload.putFloat(ofs_y);
        packet.payload.putFloat(ofs_z);
        packet.payload.putFloat(diag_x);
        packet.payload.putFloat(diag_y);
        packet.payload.putFloat(diag_z);
        packet.payload.putFloat(offdiag_x);
        packet.payload.putFloat(offdiag_y);
        packet.payload.putFloat(offdiag_z);
        packet.payload.putUnsignedByte(compass_id);
        packet.payload.putUnsignedByte(cal_mask);
        packet.payload.putUnsignedByte(cal_status);
        packet.payload.putUnsignedByte(autosaved);
        
        if (isMavlink2) {
             packet.payload.putFloat(orientation_confidence);
             packet.payload.putUnsignedByte(old_orientation);
             packet.payload.putUnsignedByte(new_orientation);
            
        }
        return packet;
    }

    /**
     * Decode a mag_cal_report message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.fitness = payload.getFloat();
        this.ofs_x = payload.getFloat();
        this.ofs_y = payload.getFloat();
        this.ofs_z = payload.getFloat();
        this.diag_x = payload.getFloat();
        this.diag_y = payload.getFloat();
        this.diag_z = payload.getFloat();
        this.offdiag_x = payload.getFloat();
        this.offdiag_y = payload.getFloat();
        this.offdiag_z = payload.getFloat();
        this.compass_id = payload.getUnsignedByte();
        this.cal_mask = payload.getUnsignedByte();
        this.cal_status = payload.getUnsignedByte();
        this.autosaved = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.orientation_confidence = payload.getFloat();
             this.old_orientation = payload.getUnsignedByte();
             this.new_orientation = payload.getUnsignedByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mag_cal_report() {
        this.msgid = MAVLINK_MSG_ID_MAG_CAL_REPORT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_mag_cal_report( float fitness, float ofs_x, float ofs_y, float ofs_z, float diag_x, float diag_y, float diag_z, float offdiag_x, float offdiag_y, float offdiag_z, short compass_id, short cal_mask, short cal_status, short autosaved, float orientation_confidence, short old_orientation, short new_orientation) {
        this.msgid = MAVLINK_MSG_ID_MAG_CAL_REPORT;

        this.fitness = fitness;
        this.ofs_x = ofs_x;
        this.ofs_y = ofs_y;
        this.ofs_z = ofs_z;
        this.diag_x = diag_x;
        this.diag_y = diag_y;
        this.diag_z = diag_z;
        this.offdiag_x = offdiag_x;
        this.offdiag_y = offdiag_y;
        this.offdiag_z = offdiag_z;
        this.compass_id = compass_id;
        this.cal_mask = cal_mask;
        this.cal_status = cal_status;
        this.autosaved = autosaved;
        this.orientation_confidence = orientation_confidence;
        this.old_orientation = old_orientation;
        this.new_orientation = new_orientation;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_mag_cal_report( float fitness, float ofs_x, float ofs_y, float ofs_z, float diag_x, float diag_y, float diag_z, float offdiag_x, float offdiag_y, float offdiag_z, short compass_id, short cal_mask, short cal_status, short autosaved, float orientation_confidence, short old_orientation, short new_orientation, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MAG_CAL_REPORT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.fitness = fitness;
        this.ofs_x = ofs_x;
        this.ofs_y = ofs_y;
        this.ofs_z = ofs_z;
        this.diag_x = diag_x;
        this.diag_y = diag_y;
        this.diag_z = diag_z;
        this.offdiag_x = offdiag_x;
        this.offdiag_y = offdiag_y;
        this.offdiag_z = offdiag_z;
        this.compass_id = compass_id;
        this.cal_mask = cal_mask;
        this.cal_status = cal_status;
        this.autosaved = autosaved;
        this.orientation_confidence = orientation_confidence;
        this.old_orientation = old_orientation;
        this.new_orientation = new_orientation;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mag_cal_report(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MAG_CAL_REPORT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_mag_cal_report(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_MAG_CAL_REPORT;

        readJSONheader(jo);
        
        this.fitness = (float)jo.optDouble("fitness",0);
        this.ofs_x = (float)jo.optDouble("ofs_x",0);
        this.ofs_y = (float)jo.optDouble("ofs_y",0);
        this.ofs_z = (float)jo.optDouble("ofs_z",0);
        this.diag_x = (float)jo.optDouble("diag_x",0);
        this.diag_y = (float)jo.optDouble("diag_y",0);
        this.diag_z = (float)jo.optDouble("diag_z",0);
        this.offdiag_x = (float)jo.optDouble("offdiag_x",0);
        this.offdiag_y = (float)jo.optDouble("offdiag_y",0);
        this.offdiag_z = (float)jo.optDouble("offdiag_z",0);
        this.compass_id = (short)jo.optInt("compass_id",0);
        this.cal_mask = (short)jo.optInt("cal_mask",0);
        this.cal_status = (short)jo.optInt("cal_status",0);
        this.autosaved = (short)jo.optInt("autosaved",0);
        
        this.orientation_confidence = (float)jo.optDouble("orientation_confidence",0);
        this.old_orientation = (short)jo.optInt("old_orientation",0);
        this.new_orientation = (short)jo.optInt("new_orientation",0);
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("fitness", (double)fitness);
        jo.put("ofs_x", (double)ofs_x);
        jo.put("ofs_y", (double)ofs_y);
        jo.put("ofs_z", (double)ofs_z);
        jo.put("diag_x", (double)diag_x);
        jo.put("diag_y", (double)diag_y);
        jo.put("diag_z", (double)diag_z);
        jo.put("offdiag_x", (double)offdiag_x);
        jo.put("offdiag_y", (double)offdiag_y);
        jo.put("offdiag_z", (double)offdiag_z);
        jo.put("compass_id", (int)compass_id);
        jo.put("cal_mask", (int)cal_mask);
        jo.put("cal_status", (int)cal_status);
        jo.put("autosaved", (int)autosaved);
        
        jo.put("orientation_confidence", (double)orientation_confidence);
        jo.put("old_orientation", (int)old_orientation);
        jo.put("new_orientation", (int)new_orientation);
        
        return jo;
    }

                                      
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_MAG_CAL_REPORT - sysid:"+sysid+" compid:"+compid+" fitness:"+fitness+" ofs_x:"+ofs_x+" ofs_y:"+ofs_y+" ofs_z:"+ofs_z+" diag_x:"+diag_x+" diag_y:"+diag_y+" diag_z:"+diag_z+" offdiag_x:"+offdiag_x+" offdiag_y:"+offdiag_y+" offdiag_z:"+offdiag_z+" compass_id:"+compass_id+" cal_mask:"+cal_mask+" cal_status:"+cal_status+" autosaved:"+autosaved+" orientation_confidence:"+orientation_confidence+" old_orientation:"+old_orientation+" new_orientation:"+new_orientation+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_MAG_CAL_REPORT";
    }
}
        