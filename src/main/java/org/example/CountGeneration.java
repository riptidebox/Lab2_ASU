package org.example;

import java.util.Random;

public class CountGeneration {
    public static int rndGen() //приватное стат поле целочисленное т.е метод для генерации случ числа
    {

        Random random = new Random(); //переменнная хранит в себе генератор чисел в виде класса
        int numberRand = random.nextInt(); // считывает и возвращает введенное ссылаясь на генератор

        return numberRand; // возвращает значение
    }

    public static  void main(String[] args){ //метод строковй
        int genrnd = rndGen();
        System.out.println("Случайное число: "+ genrnd);
    }

}
