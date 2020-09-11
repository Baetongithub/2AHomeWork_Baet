package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(methodString(50,25) + "       " + generateRandomAge());
    }

    public static String methodString(int age, int temperatureOnStreet) {

        if (age <= 45 && temperatureOnStreet <= 30) {
            System.out.println("можно идти гулять");
        } else if (age < 20 && temperatureOnStreet <= 28) {
            System.out.println("можно идти гулять");
        } else if (temperatureOnStreet <= 25 || age > 45) {
            System.out.println("можно идти гулять");
        } else {
            System.out.println("оставайтесь дома");
        }

        String result = age + " " + temperatureOnStreet;
        return result;
    }

    public static int generateRandomAge(){
        int random = (int) (Math.random() * 20);  // ( Math.random() * (b-a)) + a;
        return random;
    }
}
