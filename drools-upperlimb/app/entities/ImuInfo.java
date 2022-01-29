package entities;

import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Instant;

public class ImuInfo{
    public long time;
    public List<Float> imu1;
    public List<Float> imu2;

    public ImuInfo(long time, List<Float> imu1, List<Float> imu2) {
        this.time = time;
        this.imu1 = imu1;
        this.imu2 = imu2;
    }
    public List<Float> averageImu1(List<Float> imu){
        List<Float> sum = new ArrayList<>();
        for(int i =0;i<9;i++){
            float s = (this.imu1.get(i)+imu.get(i))/2;
            sum.add(s);
        }
        return sum;
    }
    public List<Float> average(List<Float> one,List<Float> two ){
        List<Float> sum= new ArrayList<>();;
        for(int i =0;i<9;i++){
            float s = (one.get(i)+two.get(i));
            sum.add(s);
        }
        return sum;
    }
    /*public ImuData average(ImuData i){
        LocalDate ld = LocalDate.now();
        Instant instant = ld.atStartOfDay(ZoneId.systemDefault()).toInstant();
        return new ImuData(instant.toEpochMilli(),
                imu1.averageImu1(i.getImu1()),
                imu2.averageImu2(i.getImu2())
                );
    }*/

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<Float> getImu1() {
        return imu1;
    }

    public void setImu1(List<Float> imu1) {
        this.imu1 = imu1;
    }

    public List<Float> getImu2() {
        return imu2;
    }

    public void setImu2(List<Float> imu2) {
        this.imu2 = imu2;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ImuData{" +
                "time=" + time +
                ", imu1=" + imu1 +
                ", imu2=" + imu2 +
                '}';
    }
}
