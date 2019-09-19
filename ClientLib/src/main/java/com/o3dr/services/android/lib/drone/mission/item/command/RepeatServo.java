package com.o3dr.services.android.lib.drone.mission.item.command;

import android.os.Parcel;

import com.o3dr.services.android.lib.drone.mission.MissionItemType;
import com.o3dr.services.android.lib.drone.mission.item.MissionItem;

/**
 * Mission command used to move a servo to a particular pwm value.
 */
public class RepeatServo extends MissionItem implements MissionItem.Command, android.os.Parcelable {

    private int pwm;
    private int channel;
    private int count;
    private int time;

    public RepeatServo(){
        super(MissionItemType.REPEAT_SERVO);
    }

    public RepeatServo(RepeatServo copy){
        this();
        pwm = copy.pwm;
        channel = copy.channel;
        count = copy.count;
        time = copy.time;
    }

    /**
     * @return PWM value to output to the servo
     */
    public int getPwm() {
        return pwm;
    }

    /**
     * Repeat setting PWM value to output to the servo
     * @param pwm value to output to the servo
     */
    public void setPwm(int pwm) {
        this.pwm = pwm;
    }

    /**
     * @return the output channel the servo is attached to
     */
    public int getChannel() {
        return channel;
    }

    /**
     * @param channel the output channel the servo is attached to
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }

    /**
     * @return the repeat count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the repeat count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return the repeat time duration
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the repeat time duration
     */
    public void setTime(int time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "RepeatServo{" +
                "channel=" + channel +
                ", pwm=" + pwm +
                ", count=" + count +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RepeatServo)) return false;
        if (!super.equals(o)) return false;

        RepeatServo repeatServo = (RepeatServo) o;

        if (pwm != repeatServo.pwm) return false;
        if (channel != repeatServo.channel) return false;
        if (count != repeatServo.count) return false;
        if (time != repeatServo.time) return false;
        return true;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + pwm;
        result = 31 * result + channel;
        result = 31 * result + count;
        result = 31 * result + time;
        return result;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.pwm);
        dest.writeInt(this.channel);
        dest.writeInt(this.count);
        dest.writeInt(this.time);
    }

    private RepeatServo(Parcel in) {
        super(in);
        this.pwm = in.readInt();
        this.channel = in.readInt();
        this.count = in.readInt();
        this.time = in.readInt();
    }

    @Override
    public MissionItem clone() {
        return new RepeatServo(this);
    }

    public static final Creator<RepeatServo> CREATOR = new Creator<RepeatServo>() {
        public RepeatServo createFromParcel(Parcel source) {
            return new RepeatServo(source);
        }

        public RepeatServo[] newArray(int size) {
            return new RepeatServo[size];
        }
    };
}
