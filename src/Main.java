public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int deposit = 15_000;
        int total = 0;
        int monthCount = 0;
        while (total <= 2_459_000) {
            total += deposit;
            monthCount++;
        }
        System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + total + " рублей");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int count = 0;
        while (count < 10) {
            count++;
            if (count < 10) {
                System.out.print(count + " ");
            }
            else {
                System.out.println(count);
            }
        }
        for (; count >= 1; count--) {
            if (count > 1) {
                System.out.print(count + " ");

            }
            else {
                System.out.println(count);
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRateIn1000 = 17;
        int deathRateIn1000 = 8;
        int birthRate = birthRateIn1000 * population / 1000;
        int deathRate = deathRateIn1000 *population / 1000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        double deposit = 15_000;
        int percent = 7;
        System.out.println("Месяц 1, сумма вклада равна " + deposit);
        for (int i = 2; deposit < 12_000_000; i++) {
            deposit = deposit + deposit * percent / 100;
            System.out.printf("Месяц %d, сумма вклада равна %.2f", i, deposit);
            System.out.println();
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        double deposit = 15_000;
        int percent = 7;
        System.out.println("Месяц 1, сумма вклада равна " + deposit);
        for (int i = 2; deposit < 12_000_000; i++) {
            deposit = deposit + deposit * percent / 100;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма вклада равна %.2f", i, deposit);
                System.out.println();
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        double deposit = 15_000;
        int percent = 7;
        int year = 1;
        System.out.println("Месяц 1, сумма вклада равна " + deposit);
        for (int i = 2; year <= 9; i++) {
            deposit = deposit + deposit * percent / 100;

            if (i % 6 == 0) {
                if (i == 12) {
                    year++;
                    i = 1;
                }
                System.out.printf("Год %d месяц %d, сумма вклада равна %.2f", year, i, deposit);
                System.out.println();
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int i = 2;
        int daysInMonth = 31;
        int weekCount = 0;
        for (int dayCount = 1; dayCount + weekCount * 7 <= daysInMonth; dayCount++) {
            if (dayCount == 8) {
                weekCount++;
                dayCount = 1;
            }
            if (dayCount == i) {
                System.out.println("Сегодня пятница " + (dayCount + weekCount * 7) + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int previousYears = 200;
        int nextYears = 100;
        for (int i = 0; i <= currentYear + nextYears; i += 79) {
            if (i == currentYear) {
                continue;
            }
            if (i > currentYear - previousYears) {
                System.out.println(i);
            }
        }
    }
}