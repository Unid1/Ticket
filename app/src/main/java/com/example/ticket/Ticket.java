package com.example.ticket;

import android.content.Intent;

import java.io.Serializable;
import java.util.Calendar;

public class Ticket implements Serializable {

    private String name, arriveplace, depplace, arrivedate, depdate, cost;
    //private Calendar arrivedate, depdate;
    //private Double cost;

    public Ticket(String name, String arriveplace, String depplace, String arrivedate, String depdate, String cost) {
        this.name = name;
        this.arriveplace = arriveplace;
        this.arrivedate = arrivedate;
        this.depdate = depdate;
        this.depplace = depplace;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArriveplace() {
        return arriveplace;
    }

    public void setArriveplace(String arriveplace) {
        this.arriveplace = arriveplace;
    }

    public String getDepplace() {
        return depplace;
    }

    public void setDepplace(String depplace) {
        this.depplace = depplace;
    }

    public String getArrivedate() {
        return arrivedate;
    }

    public void setArrivedate(String arrivedate) {
        this.arrivedate = arrivedate;
    }

    public String getDepdate() {
        return depdate;
    }

    public void setDepdate(String depdate) {
        this.depdate = depdate;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
