import java.util.Scanner;

public class first_task {
    public static void main(String[] args){
        task2(args);
        task3(args);
        boolean task4 = task4(args);
        System.out.println(task4);
        task5(args);
        boolean task6 = task6(args);
        System.out.println(task6);
        task7(args);
    }


    static void task2(String[] args){
        System.out.println("\nЗадание 2");
        byte a = 101;
        short b = 558;
        int c = 45544;
        long d = 5454L;
        float e = 158.77f; 
        double f = 78.284875; 
        boolean g = true;
        char h = 'A';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

    static void task3(String[] args){
        System.out.println("\nЗадание 3");
        Scanner userInputTask3 = new Scanner(System.in);
        System.out.println("Введите числа\n");
        double var_a = userInputTask3.nextDouble();
        double var_b = userInputTask3.nextDouble();
        double var_c = userInputTask3.nextDouble();
        double var_d = userInputTask3.nextDouble();

        if(var_d == 0){
            System.out.println("На ноль делить нельзя");
        } else{
            System.out.println(var_a * (var_b + (var_c / var_d)));
        }
    }

    static boolean task4(String[] args){
        System.out.println("\nЗадание 4");
        Scanner userInputTask4 = new Scanner(System.in);
        System.out.println("Введите числа\n");
        double var_a = userInputTask4.nextDouble();
        double var_b = userInputTask4.nextDouble();
        double var_c = var_a + var_b;

        if(10 <= var_c && var_c <= 20){
            return true;
        } else{
            return false;
        }
    }

    static void task5(String[] args){
        System.out.println("\nЗадание 5");
        Scanner userInputTask5 = new Scanner(System.in);
        int var_a = userInputTask5.nextInt();
        if(var_a < 0){
            System.out.println("Число отрицательное");
        }else{
            System.out.println("Число полоительное");
        }
    }

    static boolean task6(String[] args){
        System.out.println("\nЗадание 6");
        Scanner userInputTask6 = new Scanner(System.in);
        int var_a = userInputTask6.nextInt();
        if(var_a < 0){
            return true;
        }else{
            return false;
        }
    }

    static void task7(String[] args){
        System.out.println("\nЗадание 7");
        Scanner userInputTask7 = new Scanner(System.in);
        String name = userInputTask7.nextLine();
        System.out.println("Привет," + name);
    }

    
        
}
    

