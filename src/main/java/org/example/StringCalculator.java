package org.example;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n", 2);
            delimiter = parts[0].substring(2);
            numbers = parts[1];
        }
        numbers = numbers.replace("\n", delimiter);
        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
