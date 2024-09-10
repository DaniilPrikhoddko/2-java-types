package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        String output = null;
        long number = Long.parseLong(input);

        if (-128 <= number && number <= 127) {
            output = "byte";
        }
        else if (-Math.pow(2, 15) <= number && number < Math.pow(2, 15)) {
            output = "short";
        }
        else if (-Math.pow(2, 31) <= number && number < Math.pow(2, 31)) {
            output = "int";
        }
        else {
            output = "long";
        }


        return output;
    }

    public static void main(String[] args) {

        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("12345");
        System.out.println(result);
    }

}
