package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int cash = 0;
        int months = 0;
        for (int i = 0; i < 12; i++) {
            if (cash >= threshold) {
                months++;
                cash -= expenses;
                cash = cash / 3;
            } else {
                cash += income;
                cash -= expenses;
            }
        }
        return months;
    }

}
