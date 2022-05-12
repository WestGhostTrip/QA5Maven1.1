package ru.netology.sqr;

public class SQRService {
    public long calculate(long min, long max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (min <= x & x <= max) {
                count++;
            }
        }
        return count;
    }


}


