public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println("\n");
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
    }

    public static void task1(){
        int i = 0;
        while(i <= 10){
            System.out.print(i++ + " ");
        }
        System.out.println();
        for(; i > 0;){
            System.out.print(--i + " ");
        }
    }

    public static void task2(){
        for(int friday = 3; friday <= 31; friday += 7){
            System.out.println("сегодня пятница " + friday);
        }
    }

    public static void task3(){
        int year = 2022, minYear = year - 200, maxYear = year + 100;
        for(year = 0; year <= maxYear; year += 79){
            if(year >= minYear && year <= maxYear){
                System.out.println(year + " год кометы");
            }
        }
    }

    public static void task4(){
        for (int i = 1; i <= 30; i++){
            System.out.print(i + ":\t");
            if (i % 3 == 0){
                System.out.print("ping ");
            }
            if (i % 5 == 0){
                System.out.println("pong");
            } else System.out.println();
        }
    }

    public static void task5(){
        int first = 0, second = 1, third;
        System.out.print(first + " " + second);
        for(int i = 0; i < 8; i++){
            third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }
}