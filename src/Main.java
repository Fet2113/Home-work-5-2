import java.sql.SQLOutput;

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

    public static void task1() {
        System.out.println("Задача 1");

        int inBox = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + inBox;
            i = i + 1;
            {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(" " + a + " ");
            a = a + 1;
        }
        {
            System.out.println();
        }

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i + " ");}
        {System.out.println();
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
    int y = 12_000_000;
    int pBorn;
    int pDeath;
    for (int year = 0; year <= 10; year = year + 1)
    { System.out.println("Год " + year+ ", численность населения составляет " + y);
    pBorn = y/1000*17;
    pDeath = y/1000*8;
    y = y + (pBorn-pDeath);}}

    public static void task4() {
    System.out.println("Задача 4");

    double total = 15000;
    double procent = 0.07;
    int i = 0;
    while (total <= 12_000_000) {
        total = total + total *  procent;
        i = i +1;

        {System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
    }}

    public static void task5 () {
        System.out.println("Задача 5");

        double total = 15000;
        double procent = 0.07;
        int i = 0;
        while (total <= 12_000_000) {
            total = total + total *  procent;
            i = i +1;
            if (i % 6 == 0)

            {System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
    }}
    public static void task6 () {
        System.out.println("Задача 6");

        double total = 15000;
        double procent = 0.07;
        int i = 0;
        int year = 9;
        while (i <= year * 12) {
            total = total + total *  procent;
            i = i +1;
            if (i % 6 == 0)

            {System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }}
    public static void task7 () {
        System.out.println("Задача 7");

        int Friday = 6;
        for (int i = Friday; i <= 31;i = i + 7) {

            {System.out.println("«Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет");
            }
        }}
    public static void task8 () {
        System.out.println("Задача 8");
        int nowYear = 2023;
        int startYear = nowYear - 200;
        int endYear = nowYear + 100;
        int cometYear = 0;
        while (cometYear <= endYear) { cometYear = 79 * ((cometYear/79) + 1);
            if (cometYear >= startYear && cometYear <= endYear) {

            {System.out.println(cometYear);
            }
        }}}}

