package edu.phambdvcu.pacecalc;

/**
 * Created by phambd on 10/5/15.
 */
public class Calculator {

    private double time;
    private double distance;
    private double pace;

    public double getPace(double time, double distance){
        this.time = time;
        this.distance = distance;

        pace = distance/time;
        return pace;
    }

    public double getTime(double distance, double pace){
        this.distance = distance;
        this.pace = pace;
        time = distance/pace;
        return time;
    }

    public double getDistance(double time, double pace){
        this.time = time;
        this.pace = pace;
        distance = time * pace;
        return distance;
    }

}
