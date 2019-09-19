package com.o3dr.services.android.lib.drone.mission.item.command;

import android.os.Parcel;

import com.o3dr.services.android.lib.drone.mission.MissionItemType;
import com.o3dr.services.android.lib.drone.mission.item.MissionItem;

/**
 * Repeat setting a Relay pin’s voltage high or low.
 */
public class RepeatRelay extends MissionItem implements MissionItem.Command, android.os.Parcelable {

    private int relayNumber;
    private int count;
    private int time;

    public RepeatRelay() {
        super(MissionItemType.REPEAT_RELAY);
    }

    public RepeatRelay(RepeatRelay copy) {
        this();
        this.relayNumber = copy.relayNumber;
        this.count = copy.count;
        this.time = copy.time;
    }



    /**
     * @return relay number
     */
    public int getRelayNumber() {
        return relayNumber;
    }

    /**
     * Repeat setting the relay number
     *
     * @param relayNumber
     */
    public void setRelayNumber(int relayNumber) {
        this.relayNumber = relayNumber;
    }



    /**
     * @return count
     */
    public int getCount() {
        return count;
    }
    /**
     * Repeat setting the count
     *
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }



    /**
     * @return time
     */
    public int getTime() {
        return time;
    }

    /**
     * Repeat setting the time
     *
     * @param time
     */
    public void setTime(int time) { this.time = time; }

    @Override
    public MissionItem clone() {
        return new RepeatRelay(this);
    }

    @Override
    public String toString() {
        return "RepeatRelay{" +
                ", relayNumber=" + relayNumber +
                ", count=" + count +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RepeatRelay)) return false;
        if (!super.equals(o)) return false;

        RepeatRelay repeatRelay = (RepeatRelay) o;

        if (relayNumber != repeatRelay.relayNumber) return false;
        if (count != repeatRelay.count) return false;
        if (time != repeatRelay.time) return false;
        return true;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + relayNumber;
        result = 31 * result + count;
        result = 31 * result + time;
        return result;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.relayNumber);
        dest.writeInt(this.count);
        dest.writeInt(this.time);
    }

    private RepeatRelay(Parcel in) {
        super(in);
        this.relayNumber = in.readInt();
        this.count = in.readInt();
        this.time = in.readInt();
    }

    public static final Creator<RepeatRelay> CREATOR = new Creator<RepeatRelay>() {
        public RepeatRelay createFromParcel(Parcel source) {
            return new RepeatRelay(source);
        }

        public RepeatRelay[] newArray(int size) {
            return new RepeatRelay[size];
        }
    };
}
