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

    public GuiHelper() {
        type = "";
        x = "";
        y = "";
        time = 0;
        distance = 0;
        pace = 0;

    }

    public GuiHelper(String type, String x, String y) {
        this.type = type;
        this.x = x;
        this.y = y;
        time = 0;
        distance = 0;
        pace = 0;
    }


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

        if (type.equals(pace))
            return pace;
        else if (type.equals(time))
            return time;
        else
            return distance;
    }

    private double parseTime(String time){

        return 0;
    }

    private double parseNumber(String number){

        return 0;
    }


}
