package com.o3dr.services.android.lib.drone.mission.item.command;

import android.os.Parcel;

import com.o3dr.services.android.lib.drone.mission.MissionItemType;
import com.o3dr.services.android.lib.drone.mission.item.MissionItem;

/**
 * Created by Tom on 8/7/2019.
 */
public class Delay extends MissionItem implements MissionItem.Command, android.os.Parcelable {
    private float seconds = 1;
    private int UTChour = -1;
    private int UTCminute = -1;
    private int UTCsecond = -1;

    public Delay(){ super(MissionItemType.DELAY); }

    public Delay(float seconds, int UTChour, int UTCminute, int UTCsecond) {
        super(MissionItemType.DELAY);
        this.seconds = seconds;
        this.UTChour = UTChour;
        this.UTCminute = UTCminute;
        this.UTCsecond = UTCsecond;
    }

    public Delay(Delay copy){
        this();
        this.seconds = copy.seconds;
        this.UTChour = copy.UTChour;
        this.UTCminute = copy.UTCminute;
        this.UTCsecond = copy.UTCsecond;
    }

    protected Delay(Parcel in) {
        super(in);
        this.seconds = in.readFloat();
        this.UTChour = in.readInt();
        this.UTCminute = in.readInt();
        this.UTCsecond = in.readInt();
    }

    public float getSeconds() { return seconds; }
    public void setSeconds(final float seconds) { this.seconds = seconds; }

    public int getUTChour() {
        return UTChour;
    }
    public void setUTChour(int UTChour) { this.UTChour = UTChour; }

    public int getUTCminute() {
        return UTCminute;
    }
    public void setUTCminute(int UTCminute) { this.UTCminute = UTCminute; }

    public int getUTCsecond() {
        return UTCsecond;
    }
    public void setUTCsecond(int UTCsecond) { this.UTCsecond = UTCsecond; }

    @Override
    public String toString() {
        return "Delay{" +
                "seconds=" + seconds +
                ", UTChour=" + UTChour +
                ", UTCminute=" + UTCminute +
                ", UTCsecond=" + UTCsecond +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Delay)) return false;
        if (!super.equals(o)) return false;

        Delay obj = (Delay) o;

        if (this.seconds != obj.seconds) return false;
        if (this.UTChour != obj.UTChour) return false;
        if (this.UTCminute != obj.UTCminute) return false;
        if (this.UTCsecond != obj.UTCsecond) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = (int)(31 * result + this.seconds);
        result = 31 * result + this.UTChour;
        result = 31 * result + this.UTCminute;
        result = 31 * result + this.UTCsecond;
        return result;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeFloat(this.seconds);
        dest.writeInt(this.UTChour);
        dest.writeInt(this.UTCminute);
        dest.writeInt(this.UTCsecond);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Delay> CREATOR = new Creator<Delay>() {
        @Override
        public Delay createFromParcel(Parcel in) {
            return new Delay(in);
        }

        @Override
        public Delay[] newArray(int size) {
            return new Delay[size];
        }
    };

    @Override
    public MissionItem clone() {
        return new Delay(this);
    }
}
