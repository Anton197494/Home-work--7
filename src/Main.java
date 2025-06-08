public class Main {
    public static void main(String[] args) {
        task1(15000);
        task2();
        task3(2025,12_000_000,1000,17,8);
        task4(15000);


    }

    public static void task1(int savings) {
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + savings;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }


    public static void task2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void task3( int year, int population, int human, int growth, int mortality) {
        int populationGrowth = (growth - mortality) * population / human;
        while ( year <= 2035 ) {
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек");
            year++;
            population = population + populationGrowth;
        }
    }



    public static void task4 ( int contribution ) {
        int i = 1;
        while ( contribution <= 12_000_000 ) {
            System.out.println("Месяц " + i + ", сумма накоплений составляет " + contribution + " рублей");
            i++;
            contribution = contribution + (contribution * 7) / 100;
        }
    }


}