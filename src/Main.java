public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
    int age = 17;
        System.out.println("Задача 1");
        System.out.println("Если возраст человека равен " + age + ", то ");
    if (age >= 18 ) {System.out.println("он совершеннолетний");}
    else {
        System.out.println("он не достиг совершеннолетия, нужно немного подождать");
    }
        }
    public static void task2 () {
        System.out.println();
        System.out.println("Задача 2");
    double temperature =  5.9;
        System.out.println( "На улице " + temperature + " градусов,");
    if (temperature < 5) {System.out.println("нужно надеть шапку");}
    else {System.out.println("можно идти без шапки");}
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        double speed =  68.9;
        System.out.println( "Если скорость " + speed + " км/ч, то ");
        if (speed > 60.0) {System.out.println("придется заплатить штраф");}
        else {System.out.println("можно ездить спокойно");}
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача 4");
        int age =  13;
        System.out.println( "Если возраст человека равен " + age + ", то ему нужно ходить ");
        if (age >= 2 && age <6) {System.out.println("в детский сад");}
        if (age >= 7 && age <18) {System.out.println("в школу");}
        if (age >= 18 && age <24) {System.out.println("в университет");}
        if (age >= 24 ) {System.out.println("на работу");}

    }
    public static void task5 () {
        System.out.println();
        System.out.println("Задача 5");
        int age =  7;
        System.out.println( "Если возраст ребенка равен " + age + ", то ему");
        if (age < 5) {System.out.println("нельзя кататься на аттракционе");}
        if (age >= 5 && age <14) {System.out.println("можно кататься на аттракционе в сопровождении взрослого");}
        if (age >= 14 ) {System.out.println("можно кататься на аттракционе без сопровождения взрослого");}

    }

    public static void task6 () {
        int maxPlaces = 102;
        int sitPlaces = 60;
        int passengers = 58;
        System.out.println();
        System.out.println("Задача 6");
        System.out.println("Если в поезде " + passengers + " пассажиров, то ");
        if (passengers > 102 ) {System.out.println("мест нет");}
        else { if (passengers > 60) {System.out.println("остались только стоячие места");}
                else {System.out.println("есть сидячее место");}
        }
    }
    public static void task7 () {
        int one = 110;
        int two = 60;
        int three = 158;
        int max = two;
        System.out.println();
        System.out.println("Задача 7");
        System.out.println("Большим среди чисел" + one + ", " + two + ", " + three +" является: ");
        if (one > two ) {
            max = one;
            if (one < three) {max = three;}
        else {if (two < three) {max = three;}}
        }
        System.out.println(max);
    }

}



