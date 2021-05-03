package com.rijaltanjung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String activity;
        float speed = 0f;
        System.out.println("-------------------- Biodata --------------------");
        System.out.println("Nama    : Rijal Tanjung");
        System.out.println("NIM     : 200401010049");
        System.out.println("-------------------------------------------------");
        System.out.println("Human Activity Prediction Using Speed Measurement.");
        System.out.println(" ");
        System.out.println("---------------------- RULE ---------------------");
        System.out.println("Input/speed must be floating numbers, eg. 0.5, 1.0, 45.0.");
        System.out.println(" ");
        System.out.println("If speed is around 0.5 - 9.0 km/hour, then it's walking.");
        System.out.println("If.Else speed is around 9.0 - 45.0 km/hour, then it's running.");
        System.out.println("Else speed is > 45.0 km/hour, then it's biking.");
        System.out.println("-------------------------------------------------");

        Float[] walking = new Float[86];
        Float[] running = new Float[360];

        float _walk = 0.5f;
        for (int i = 0; i < walking.length; i++) {
            walking[i] = _walk;
            _walk = _walk + 0.1f;
            String _w = String.format("%.1f", _walk);
            _walk = Float.parseFloat(_w);
        }

        float _run = 9.1f;
        for (int i = 0; i < running.length; i++) {
            running[i] = _run;
            _run = _run + 0.1f;
            String _r = String.format("%.1f", _run);
            _run = Float.parseFloat(_r);
        }

        System.out.println(" ");
        System.out.println("Input captured speed to guest the activity :");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextFloat()) {
            speed = scanner.nextFloat();
        } else if (scanner.hasNextInt()) {
            Integer input = new Integer(scanner.nextInt());
            speed = input.floatValue();
        } else if (scanner.hasNextLine()){
            try {
                speed = Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Abort.");
            }
        }

        if (speed >= walking[0] && speed <= walking[walking.length-1]) {
            activity = "walking";
        } else if(speed >= running[0] && speed <= running[running.length -1]) {
            activity = "running";
        } else {
            activity = "biking";
        }

        System.out.printf("It seems like %s%n", activity);
    }
}
