package dev.milikkan.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedControlTest {

    @Test
    void gpsWithMoreThanOneSpeedValuesReturnsMaxAverageSpeed() {
        int s = 15;
        double [] x = {0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25};

        int result = SpeedControl.gps(s, x);
        assertEquals(74, result);
    }

    @Test
    void gpsWithOneSpeedValuesReturnsZero() {
        int s = 15;
        double [] x = {0.19};

        int result = SpeedControl.gps(s, x);
        assertEquals(0, result);
    }

    @Test
    void gpsWithZeroSpeedValuesReturnsZero() {
        int s = 15;
        double [] x = {};

        int result = SpeedControl.gps(s, x);
        assertEquals(0, result);
    }

    @Test
    public void test1() {
        double[] x = new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
        assertEquals(SpeedControl.gps(20, x), 41);
        x = new double[] {0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25};
        assertEquals(SpeedControl.gps(12, x), 219);
        x = new double[] {0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84};
        assertEquals(SpeedControl.gps(20, x), 80);
    }
}