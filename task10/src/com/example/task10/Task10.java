package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }

        if (Float.isInfinite(a) && Float.isInfinite(b)) {
            return a == b;
        }

        float epsilon = (float) Math.pow(10, -precision);
        return Math.abs(a - b) < epsilon;
    }

    public static void main(String[] args) {
        float a = 1f;
        float b = 2f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 10);
        System.out.println(result);

    }

}
