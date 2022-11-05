package dev.milikkan.codewars;

// kata link: https://www.codewars.com/kata/56484848ba95170a8000004d/train/java
public class SpeedControl {

    public static int gps(int s, double[] x) {
        if (x.length <= 1) {
            return 0;
        }

        int max = 0;

        for (int i = 0; i <= x.length - 2; i++) {
            double dist1 = x[i];
            double dist2 = x[i + 1];
            int averageSpeed = (int) Math.floor(3600 * Math.abs(dist2 - dist1)) / s;
            if (averageSpeed > max) {
                max = averageSpeed;
            }

        }
        return max;
    }

}

/*
Inputs
s: an integer, the secons of measurement
x: a double array that contains distances

output: an integer, the max average speed

- the array contains consecutive distance measurements, example
x = [0.0, 0.19, 0.5] -> distances: 0.0-0.19, 0.19-0.5
- return floor of max average speed
- return 0 if x.len <= 1
- formula to calculate avg speed -> (3600 * distance) / s

Example:
s = 15
x = [0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25]

delta of distances: 0.0-0.19, 0.19-0.5, 0.5-0.75, 0.75-1.0, 1.0-1.25, 1.25-1.50, 1.5-1.75, 1.75-2.0, 2.0-2.25
average speeds: [45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0]

output: 74 -> floor(74.4) = 74


 */
