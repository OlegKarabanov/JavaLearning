import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initialization of variables
/*
        {
            System.out.println("Введи мне два числа и я посчитаю тебе их сумму");
            System.out.println("______________________________________________");

            double a = 0, b = 0;
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);

            System.out.print("Введите сюда первое число:  ");
            a = in.nextDouble();

            System.out.print("Введите сюда второе число:  ");
            b = in.nextDouble();

            System.out.println("Сумма ваших чисел равна: " + (a + b));


        }
       */

// types
        /*{
            // int g = ( (a + b) / c);

            // a + ( b + c ) ;

            long x = 1000000L;

            System.out.println( (int)  (x * x) );
            System.out.println( x  );

        }*/

// operations
        /*{
            System.out.println((-5) % 3);
            System.out.println((double) (5));
            System.out.println((double) 5 / 3);

            Scanner in = new Scanner(System.in);
            double value = in.nextDouble();
            if (value % 2 == 0) {
                System.out.println("Вы ввели четное число");
            } else System.out.println("Вы ввели нечетное число");

            System.out.println(12.2 % 2);
        }*/

        /*{
            int minutes = 10;

            System.out.println(minutes++);// увеличивает на единицу

            System.out.println(minutes);
            minutes -= 1;

            System.out.println(minutes);
        }*/


        //char explanation
     /*   {
            char a = 8667;
            char b = '\u21DB';
            char c = '→';

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }*/

      /* {
            Scanner in = Scanner(System.in);

            if (in.nextInt() > 10) { // ==, >, <, >=, <=, !=, &&, ||, !, true false
                System.out.println( "условие сгенерировано true"); // true != 0 boolean
                 } else {
            System.out.println("условие сгенерировано false");
            }

        }

        int x = in.nextInt();

        boolean a = x < 5 || x > 5 && x < 7;

        System.out.println(a);*/


        //boolean
       /* {
            boolean a = true;
            boolean b = false;

            int x = 5;
            boolean b1 = x > 0;
            boolean b2 = b1 && (x < 20);

        }*/

        //Ternarn operation

        /* {

         *//*
         * <условие>? <значение если условие истинно> : <значение если условие ложно>
         * *//*

           int a = - 10;
           int b = 20;
           int max = (a>b ? a : b);
           System.out.println(max);


           System.out.println( a > 0 ? a *a : "Wrong");


        }*/

        // Shablon rechenia

   /*     {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println( < условие > ? "YES" : "NO");
        }*/

        //112165
/*        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println( x<2 && y < x && x*x + y*y > 4 && y > 0 ? "YES" : "NO");
        }*/

        //112167

       /* {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println((y<2-x*x && y > 0 && x<0)||(y<2-x*x && y>0 && x>=0)? "YES" : "NO");
        }*/

        // if else

        /*{
          int max = 0;
          int a =10, b = 5;
          if(a>b){
              max = a;
          } else {
              max = b;
          }
        }*/

       /* {
        Scanner in = new Scanner(System.in);
        int x1, x2;
        x1 = in.nextInt();
        if(x1>9 && x1<100) {
            x2 = x1 % 10;  //32
            x1 = x1 / 10;
            System.out.println(x1 + ";" + x2);
            if (x1 == x2) {
                System.out.println("В числе одинаковые цифры");
            } else if (x2 < x1) {
                System.out.println("Первая цифра больше второй");
            } else System.out.println("Вторая цифра больше");
        } else System.out.println("Введено не двух значное число");
            }*/

        // switch case

            /*Scanner in = new Scanner(System.in);
            switch (in.nextInt()){
                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 3:
                    System.out.println("31");
                    break;
                case 4:
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("31");
                    break;
                case 6:
                    System.out.println("30");
                    break;
                case 7:
                    System.out.println("31");
                    break;
                case 8:
                    System.out.println("31");
                    break;
                case 9:
                    System.out.println("30");
                    break;
                case 10:
                    System.out.println("31");
                    break;
                case 11:
                    System.out.println("30");
                    break;
                case 12:
                    System.out.println("31");
                    break;
                default:
                    System.out.print("0");
                    break;

            }*/

        //blocks

/*        {
            {
                int =10;
                int price = 4;
                if (int >0){
                price += int +price / 100;
                System.out.println(price);

            }
                System.out.println(price);
            }

            {
                Scanner in = new Scanner(System.in);
                int x1, x2;
                x1 = in.nextInt();
                x2 = x1 %10;
                x1 = x1/10;
                if(x2 == 3 || x1 == 3) {
                    System.out.println("В числе присутствет цифра 3");
                } else {
                    System.out.println("В числе отсутствует цифра 3");
                }


            }

        }*/

        //while

        /*{
                 int x =0;
                 while (x < 5) {
                     System.out.print( x + " ");
                     x ++;

                 }


        }*/
/*        int x = 0;
        do {
            System.out.print(x + " ");
            x++;
        } while (x < 5);*/

/*    Scanner in = new Scanner(System.in);
    int t =0;
    int i =1;
    int N = in.nextInt();
    while (i<N) {
        t = in.nextInt();
        if (t < 437) {
            System.out.println("Crash on " + i + " bridge");
            break;
        }
        i++;
    }
    if(t>437) {
        System.out.println("No crash");

    }*/

    }
}