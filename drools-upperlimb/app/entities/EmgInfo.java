package entities;

import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Instant;

public class EmgInfo{
    public long time;
    public float emg1;
    public float emg2;
    public float emg3;
    public float emg4;
    public float emg5;

    public EmgInfo(long time, float emg1, float emg2, float emg3, float emg4, float emg5) {
        this.time = time;
        this.emg1 = emg1;
        this.emg2 = emg2;
        this.emg3 = emg3;
        this.emg4 = emg4;
        this.emg5 = emg5;
    }
    public float averageEmg1(float emg) { return ((this.emg1+emg)/2); }
    public float averageEmg2(float emg){
        return ((this.emg2+emg)/2);
    }
    public float averageEmg3(float emg){
        return ((this.emg3+emg)/2);
    }
    public float averageEmg4(float emg){
        return ((this.emg4+emg)/2);
    }
    public float averageEmg5(float emg){
        return ((this.emg5+emg)/2);
    }
    /*public EmgData average(EmgData i){
        LocalDate ld = LocalDate.now();
        Instant instant = ld.atStartOfDay(ZoneId.systemDefault()).toInstant();
        return new EmgData(instant.toEpochMilli(),
                emg1.averageEmg1(i.getEmg1()),
                emg2.averageEmg2(i.getEmg2()),
                emg3.averageEmg3(i.getEmg3()),
                emg4.averageEmg4(i.getEmg4()),
                emg5.averageEmg5(i.getEmg5())
                );
    }*/

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public float getEmg1() {
        return emg1;
    }

    public void setEmg1(float emg1) {
        this.emg1 = emg1;
    }

    public float getEmg2() {
        return emg2;
    }

    public void setEmg2(float emg2) {
        this.emg2 = emg2;
    }

    public float getEmg3() {
        return emg3;
    }

    public void setEmg3(float emg3) {
        this.emg3 = emg3;
    }

    public float getEmg4() {
        return emg4;
    }

    public void setEmg4(float emg4) {
        this.emg4 = emg4;
    }

    public float getEmg5() {
        return emg5;
    }

    public void setEmg5(float emg5) {
        this.emg5 = emg5;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "EmgInfo{" +
                "time=" + time +
                ", emg1=" + emg1 +
                ", emg2=" + emg2 +
                ", emg3=" + emg3 +
                ", emg4=" + emg4 +
                ", emg5=" + emg5 +
                '}';
    }
}
