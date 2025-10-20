public class Third {
    public static void main(String[] args) {

        System.out.println("2.5 Условные операторы");

        System.out.println("К 1-ому видео");

// 8 основных операторов
// И (&&) ИЛИ (||)   - логические операторы
// РАВНО (==) НЕ РАВНО (!=)  - операторы сравнения
// БОЛЬШЕ(>) МЕНЬШЕ (<)
// БОЛЬШЕ ЛИБО РАВНО (>=) МЕНЬШЕ ЛИБО РАВНО(<=)
// TRUE FALSE

        int a = 100;
        int b = -100;
        int c = 0;
        int d = 100;

        Boolean boVALY = (a == d);

        System.out.println(a == b);
        System.out.println(a == d);
        System.out.println(a != d);
        System.out.println(boVALY);
        System.out.println(a > c);
        System.out.println(a < d);

        System.out.println(a <= d);
        System.out.println(a >= 100);


        boolean bVali = (a > c) && (b > c);
        System.out.println((a > c) && (b < c));
        System.out.println((a > c) && (b > c));

        System.out.println((a > c) && (b < c) && (c == d));

// или

        System.out.println((a == b) || (c > a));
// чтобы вернул true необходимо чтобы хотя бы одно значение было true

        System.out.println((a == b) || (c == a));


        System.out.println("Ко 2-ому видео");

//if

        int af = 5;
        int bf = 100;

        if (af > 0) { //true || false
            System.out.println("af положительное число");
        }
        if (bf > 0) {
            System.out.println("bf положительное число");
        }
        if (bf < 0) {
            System.out.println("bf отрицательное  число");
        }

// else

        if (af > 0) {
            System.out.println("af положительное число");
        } else if (af == 0) {
            System.out.println("af равно 0");
        } else {
            System.out.println("af отрицательное число");
        }


        System.out.println("Задание Взрослый");

        int age = 20;

        if (age > 18) {
            System.out.println("Взрослый");
        }


        System.out.println("Задание Положительное");

        /*
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt(); // Тестовые данные

                if (input > 0 ) {
                    System.out.println("Положительное");
                }
                else if (input == 0) {
                    System.out.println("Это ноль");
                }
                else {
                    System.out.println("Отрицательное");
                }
                scanner. close ();
            }
        }





        System.out.println("Задание первое больше");

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int inputOne = scanner.nextInt(); // 10
                int inputTwo = scanner.nextInt(); // 5

                if (inputOne>inputTwo) {
                    System.out.println("Первое больше");
                }
                else if (inputOne==inputTwo) {
                    System.out.println("Числа равны");
                }
                else {
                    System.out.println("Второе больше");
                }

            }
        }



        System.out.println("Задание Больше нуля!");

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt(); // 1000

                if (input > 0) {
                    System.out.println("Больше нуля!");
                }
                else {
                    System.out.println("Меньше нуля!");
                }

            }
        }


        System.out.println("Задание Зима");

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt(); // Тестовые данные

                if (input == 12 || input == 1 || input == 2 ) {
                    System.out.println("Зима");
                }
                else if (input >=3 && input <=5) {
                    System.out.println("Весна");
                }
                else if (input >=6 && input <=8) {
                    System.out.println("Лето");
                }
                else if (input >=9 && input <=11) {
                    System.out.println("Осень");
                }

            }
        }



        System.out.println("К видео уроку switch case");

// switch - case - > byte, short, int, char, ENUM, string
// break;
// пример записи char  '%'


        int a =100;

        switch (a) {
            case  0 :
                System.out.println("Ваше значение равно 0");
                break;
            case -1 :
                System.out.println("Ваше значение равно -1");
                break;
            case: 100
                System.out.println("Ваше значение равно 100");
                break;
            case: 999
                System.out.println("Ваше значение равно 999");
                break;
            default:
                System.out.println("Совпадений нигде нет");
        }




        System.out.println("Задание день недели");

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt(); // 1-7

                switch (input) {
                    case 1:
                        System.out.println("Понедельник");
                        break;
                    case 2:
                        System.out.println("Вторник");
                        break;
                    case 3:
                        System.out.println("Среда");
                        break;
                    case 4:
                        System.out.println("Четверг");
                        break;
                    case 5:
                        System.out.println("Пятница");
                        break;
                    case 6:
                        System.out.println("Суббота");
                        break;
                    case 7:
                        System.out.println("Воскресенье");
                        break;
                    default:
                        System.out.println("Совпадений нигде нет");   //а
                }
*/

    }
}