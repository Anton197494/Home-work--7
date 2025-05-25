public class Main {
    public static void main(String[] args) {
        task1(15000);
        task2();


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
    }


}