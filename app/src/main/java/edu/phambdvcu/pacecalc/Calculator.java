package edu.phambdvcu.pacecalc;

/**
 * Created by phambd on 10/5/15.
 */
public class Calculator {

    private double time;
    private double distance;
    private double pace;

    /**
     * This method calculates and returns pace,
     * given time and distance
     * @param time time in hours
     * @param distance distance in miles
     * @return pace
     */
    public double getPace(double time, double distance){
        this.time = time;
        this.distance = distance;

        pace = distance/time;
        return pace;
    }

    /**
     * This method calculates and returns time,
     * given distance and pace
     * @param distance in miles
     * @param pace in mph
     * @return time in hours
     */
    public double getTime(double distance, double pace){
        this.distance = distance;
        this.pace = pace;
        time = distance/pace;
        return time;
    }

    /**
     * This method calculates and returns distance,
     * given time and pace
     * @param time in hours
     * @param pace in mph
     * @return distance
     */
    public double getDistance(double time, double pace){
        this.time = time;
        this.pace = pace;
        distance = time * pace;
        return distance;
    }

}
