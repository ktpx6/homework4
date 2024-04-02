public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");}
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");}

        System.out.println("Задача 2");
        int airTemperature = 17;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + "градусов, нужно надеть шапку.");}
        if (airTemperature > 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки.");}

        System.out.println("Задача 3");
        int carSpeed = 90;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " км/ч, то придется заплатить штраф.");}
        if(carSpeed <60) {
            System.out.println("Если скорость " + carSpeed + " км/ч, то можно ездить спокойно.");}

        System.out.println("Задача 4");
        int agePerson = 31;
        if (agePerson >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");}
        else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");}
        else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет.");}
        else {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу.");}

        System.out.println("Задача 5");
        int Age = 12;
        if (Age < 5) {
            System.out.println("Если возраст ребенка равен " + Age + ", то ему нельзя кататься на аттракционе.");}
        else if (Age >= 5 && Age < 14) {
            System.out.println("Если возраст ребенка равен " + Age + ", то он может кататься на аттракционе в сопровождении взрослого.");}
        else {
            System.out.println("Если возраст ребенка равен " + Age + ", то он может кататься на аттракционе без сопровождения взрослого.");}

        System.out.println("Задача 6");
        int passsengersCount = 100;
        if (passsengersCount <= 60) {
            System.out.println("В вагоне есть сидячее место.");}
        else if (passsengersCount <= 102) {
            System.out.println("В вагоне есть место, но только стоячее.");}
        else {
            System.out.println("В вагоне уже нет места.");}

        System.out.println("Задача 7");
        int one = 15;
        int two = 23;
        int three = 113;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);}
        else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);}
        else {
            System.out.println("Наибольшее число: " + three);}
    }
}