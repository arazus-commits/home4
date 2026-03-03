
public class Main {
    public static void main(String[] args) {
        //задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равне " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равне " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
        //задача 2
        int temp = 10;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
        //задача 3
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        //задача 4
        int age2 = 10;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        }
        if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
        }
        //задача 5
        int age3 = 10;
        boolean adult = false;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.");
        }
        if (age3 > 5 && age3 <= 14 && adult == true) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то можно кататься на аттракицоне в сопровождении.");
        } else {
            System.out.println("Если возраст ребенка равен " + age3 + " и нет взрослого, то нельзя кататься.");
        }
        if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то можно кататься без сопровождения.");
        }
        //задача 6
        boolean clogged = false;
        boolean sedentaryThereIs = true;

        if (clogged == true) {
            System.out.println("В поезде нет мест");
        } else if (sedentaryThereIs == true) {
            System.out.println("В поезде есть сидячие места");
        } else {
            System.out.println("В поезде только стоячие места");
        }
        //задача 7
        int one = 541;
        int two = 350;
        int three = 964;
        if (one > two && one > three) {
            System.out.println("Число one наибольшее");
        } else if (two > one && two > three) {
            System.out.println("Число two наибольшее");
        } else {
            System.out.println("Число there наибольшее");
        }
    }
}