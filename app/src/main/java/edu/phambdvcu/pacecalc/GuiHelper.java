package edu.phambdvcu.pacecalc;

/**
 * Created by phambd on 10/5/15.
 */
public class GuiHelper {
    private Calculator calc = new Calculator();     //MVC Controller Object
    private String type;                            //Type (time, distance, pace)
    private String x;                               //To hold user input
    private String y;                               //To hold user input
    private double time;
    private double distance;
    private double pace;

    /**
     * default constructor
     */
    public GuiHelper() {
        type = "";
        x = "";
        y = "";
        time = 0;
        distance = 0;
        pace = 0;

    }

    /**
     * 3 arg constructor sets user input in x and y, and sets type.
     * @param type type of variable needed
     * @param x first user input
     * @param y second user input
     */
    public GuiHelper(String type, String x, String y) {
        this.type = type;
        this.x = x;
        this.y = y;
        time = 0;
        distance = 0;
        pace = 0;
    }


    /**
     * This method finds the type of variable needed and
     * uses Calculator object to make calculations
     * @return the desired variable as a double
     */
    public double helper(){

        switch(type){
            case "pace":
                time = parseTime(x);
                distance = parseNumber(y);
                pace = calc.getPace(time, distance);
                break;
            case "time":
                distance = parseNumber(x);
                pace = parseNumber(y);
                time = calc.getTime(distance, pace);
                break;
            case "distance":
                time = parseTime(x);
                pace = parseNumber(y);
                distance = calc.getDistance(time, pace);
                break;
        }

        if (type.compareTo("pace")==0)
            return pace;
        else if (type.compareTo("time")==0)
            return time;
        else
            return distance;
    }

    /**
     * This method parses time in string to double, and
     * converts time into hours
     * @param time as a String
     * @return time as a double in terms of hours
     */
    private double parseTime(String time){
            String[] hourMin = time.split(":");
            double hour = Double.parseDouble(hourMin[0]);
            double mins = Double.parseDouble(hourMin[1]);
            double secs = Double.parseDouble(hourMin[2]);
            double convertmins = mins/60;
            double convertsecs = secs/3600;
            return hour + convertmins + convertsecs;
    }

    /**
     * This method accepts a string and parses it into a double
     * @param number number to be parsed
     * @return number as a double
     */
    private double parseNumber(String number){

        return Double.parseDouble(number);
    }


}
