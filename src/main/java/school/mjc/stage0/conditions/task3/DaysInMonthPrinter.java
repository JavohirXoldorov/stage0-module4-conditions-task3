package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month >= 1 && month <= 12) {
            int days = 28;
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                days = 31;
            System.out.println(days);
        } else {
            System.out.println("wrong number!");
        }
    }
}
