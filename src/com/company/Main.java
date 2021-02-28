package com.company;

public class Main {

    public static void main(String[] args) {
        People Asan = new Asan("Асан","Талаев", 25,SexOfaPerson.MALE_GENDER,"Электрик","Футбол","Не женат");
        People Nurs = new Nurs("Нурсултан","Осмонов", 25,SexOfaPerson.MALE_GENDER,"Программист","Женат", 2 );
        People Joni = new Joni("Жолдошбек", "Курбашов", 32, SexOfaPerson.MALE_GENDER,"Строитель", "Боится змей");
        People Beka = new Beka("Бегимай", "Нурланбекова",18,SexOfaPerson.FEMALE,"Бухгалтер");

        Asan.print();
        Nurs.print();
        Joni.print();
        Beka.print();
        System.out.println(createObject("1й"));
    }
    public static String createObject(String className){

        switch (className){
            case ("1й"):
               return "test1";
            case ("2й"):
                return "test2";
            case ("3й"):
                return "test3";
            case ("4й"):
                return "test4";
        }
        return "uuuuu";
    }
}
