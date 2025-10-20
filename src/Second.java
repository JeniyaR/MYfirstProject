public class Second {
    public static void main(String[] args) {

        //2.2 к видео

        // тип название = значение;

       /*  float flv = 1.7F;
        double dob = 10000.78;

        System.out.println(flv + dob);    */

        /*  char ch = '*';
        boolean blv = true;

        System.out.println(ch);
        System.out.println(blv);     */



       /* byte a = 1;
        byte b = 100 ;
        short Sh = 20000;
        int intF = 1000000;
        int intS = 2000000;
        long loV = 900000000L;


        System.out.println("Складываем a и b: "  + a + b);
        System.out.println("Складываем int: "  + intF + intS);
        System.out.println("Вычитаем long и short: "  + (loV - Sh));    */

        //2.2 задание сложить переменные
        System.out.println("Задание Сложить переменные" );


        byte a = 10;
        byte b = 91;

        System.out.println(a + b);

        // 2.2  переменные вещественного типа
        double valueA = 10.69;
        double valueB = 91.34;

        System.out.println(b - a);


        // 2.2 по видео
        System.out.println("к видеоуроку Операции с переменными" );


        int intValA = 10;
        int intValB = 3;

// Сложение
        System.out.println(intValA + intValB);

// Вычитание
        System.out.println(intValA - intValB);
        System.out.println(intValB - intValA);

//Умножение
        System.out.println(intValA * intValB);

// Деление
//   %  - остаток от деления
//   / - Значение
        System.out.println(intValA % intValB); // остаток от деления
        System.out.println(intValA / intValB);  // Значение
        System.out.println("Выражение intValA * intValB - 5 = " + (intValA * intValB - 5));


        // 2.2
        System.out.println("Задание Реализуйте выражение" );

        int c = 0;
        int d = 1;

        System.out.println((c+d) - 100 * (15-1));

        // 2.2 по видео
        System.out.println("к видеоуроку Инкремент/Декремент Java" );

        System.out.println("Инкремент префикс");
        int e = 5;
        int f = ++e;
        System.out.println(f);
        System.out.println(e);

        System.out.println("Инкремент постфикс");
        int j = 5;
        int k = j++;
        System.out.println(k);
        System.out.println(j);

        System.out.println("Декремент префикс");
        int p = 5;
        int s = --p;
        System.out.println(s);
        System.out.println(p);

        System.out.println("Декремент постфикс");
        int t = 5;
        int o = t--;
        System.out.println(o);
        System.out.println(t);

        //Задания

        System.out.println("остаток от деления x на y");

        int x = 10;
        int y = 3;
        System.out.println(x % y);

        System.out.println("Частное от деления z на n");

        int z = 100;
        int n = 10;
        System.out.println(z / n);

        System.out.println("остаток от деления 64 на 8");

        int zp = 64;
        int np = 8;
        System.out.println(zp % np);

        System.out.println("Нахождение периметра прямоугольника");

        int vpt = 60;
        int npn = 43;
        int perimetr = 2* (vpt + npn) ;
        System.out.println(perimetr);

        System.out.println("Периметр квадрата");

        int storona = 100;
        int perkv = 4 * storona ;
        System.out.println(perkv);





        System.out.println(" 2.4. К видео Массивы");

        // Массивы

        //Инициализация


      /*  int []array = new int[5];
        array [0] = 100;
        array [1] = -9;
        array [2] = 97;
        array [3] = 0;
        array [4] = -1000000;


        System.out.println("Элемент под индексом 2: " + array[2]);
        System.out.println("Элемент под индексом 4 " + array[4]);
        System.out.println(array[1] + array[3]);   */

        //System.out.println("Элемент под индексом которого нет "array[77]);


// второй вариант создания массивов без отложенной инициализации



        System.out.println("2 вариант создания массивов");

        int []array = {100, -9, -97, 0, -1000000};

        System.out.println("Элемент под индексом 2: " + array[2]);
        System.out.println("Элемент под индексом 4: "+ array[4]);



        System.out.println("Как узнать длинну массива");
        System.out.println(array.length);

        System.out.println("2.4 Второй урок по массивам");

        int[] arrayInt = {77, 90, 1, -8, 98};
        double [] arrayDouble = {1.2, 6.4, 9.87};
        char[] arrayChar = {'^', '$', '3', 'G'};
        char[] arayCharzero = new char [10];

        System.out.println(arrayInt[0] + " " + arrayDouble[1] + " " + arrayChar[3]);

        //Как узнать размер массива

        System.out.println(arayCharzero.length);

        int [] arrayIntzer = new int [10];
        System.out.println(arrayIntzer [7]);  //дефолтное значение будет 0

        boolean [] arrayBoolean = new boolean[10];  // по дефолту всегда принимает значние false
        System.out.println(arrayBoolean [5]);

        double [] arrayDoublezer = new double [10];   // 0.0
        System.out.println(arrayDoublezer [7]);

        // работа с многомерными массивами на примере двухмерных массивов


        System.out.println("Многомерный массив");

        int [] [] matrix = new int [2] [2];

// столбец1 столбец 2
// [100] [-100] -- строка 1
// [-100] [100] -- строка 2

        matrix [0] [0] = 100;
        matrix [1] [0] = -100;
        matrix [0] [1] = -100;
        matrix [1] [1] = 100;

        System.out.print(matrix [0][0] + " ");
        System.out.println(matrix [1][0]);
        System.out.print(matrix [0][1] + " ");
        System.out.println(matrix [1][1]);

        System.out.println(" 2.4. Задание сумма элементов 101");

        int [] arrIn = new int[3];
        arrIn [0] = 40;
        arrIn [1] = 60;
        arrIn [2] = 1;
        int result = arrIn [0] + arrIn [1] + arrIn [2];
        System.out.println(result);

        System.out.println(" 2.4. Задание сумма элементов -7");

        int [] arrayIteg = new int[5];
        arrayIteg [3] = -7;

        int resultat = arrayIteg [0] + arrayIteg [1] + arrayIteg [2] + arrayIteg [3] + arrayIteg [4] ;

        System.out.println(resultat);

        boolean [] arrayBoo = new boolean [3];
        arrayBoo [1] = true;

        System.out.println(arrayBoo [0]);
        System.out.println(arrayBoo [1]);
        System.out.println(arrayBoo [2]);


        System.out.println( "Задание ФИО");

        String [] arrstring = new String [3];
        arrstring [0] = "Иванов";
        arrstring [1] = "Иван";
        arrstring [2] = "Иванович";

        System.out.println( arrstring [0] + " " +  arrstring [1] + " " +  arrstring [2]);

        System.out.println( "Задание города");

        String[] cities = {"Москва", "Лондон", "Париж"};

        System.out.println("Город 1: "+ cities[0]);
        System.out.println("Город 2: "+ cities[1]);
        System.out.println("Город 3: "+ cities[2]);

        System.out.println( "Задание массив чисел");

        int[] numbers = {10, 20, 30};

        System.out.println("Элемент 3: "+ numbers[2]);
        System.out.println("Элемент 2: "+ numbers[1]);
        System.out.println("Элемент 1: "+ numbers[0]);

        System.out.println( "Задание char Java");

        char[] letters = {'a', 'J', 'v', 'a'};

        System.out.print(letters[1]);
        System.out.print(letters[0]);
        System.out.print(letters[2]);
        System.out.print(letters[3]);

        System.out.println( "Задание слово Code");

        char[] lett = {'e', 'C', 'd', 'o'};

        System.out.print(lett[1]);
        System.out.print(lett[3]);
        System.out.print(lett[2]);
        System.out.print(lett[0]);







    }
}

















