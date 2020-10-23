package main.java.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Entry implements Serializable {
    private double x;
    private double y;
    private double r;
    private boolean result;
    private Date queryTime;
    
    public Entry(double x, double y, double r, boolean result, Date queryTime) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.result = result;
        this.queryTime = queryTime;
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public double getR() {
        return r;
    }
    
    public void setR(double r) {
        this.r = r;
    }
    
    public boolean isResult() {
        return result;
    }
    
    public void setResult(boolean result) {
        this.result = result;
    }
    
    public Date getQueryTime() {
        return queryTime;
    }
    
    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof Entry)) return false;
        Entry entry = (Entry) o;
        return Double.compare(entry.getX(), getX()) == 0 && Double.compare(entry.getY(), getY()) == 0 && Double.compare(entry.getR(), getR()) == 0 && isResult() == entry.isResult() && Objects.equals(getQueryTime(), entry.getQueryTime());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getR(), isResult(), getQueryTime());
    }
    
    @Override
    public String toString() {
        return "Entry{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", result=" + result +
                ", queryTime=" + queryTime +
                '}';
    }
}
