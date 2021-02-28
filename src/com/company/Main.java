package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("1й");
        createObject("2й");
        createObject("3й");
    }
    public static void createObject(String className){
        People Asan = new Asan("Асан","Талаев", 25,SexOfaPerson.MALE_GENDER,"Электрик","Футбол","Не женат");
        People Nurs = new Nurs("Нурсултан","Осмонов", 25,SexOfaPerson.MALE_GENDER,"Программист","Женат", 2 );
        People Joni = new Joni("Жолдошбек", "Курбашов", 32, SexOfaPerson.MALE_GENDER,"Строитель", "Боится змей");
        People Beka = new Beka("Бегимай", "Нурланбекова",18,SexOfaPerson.FEMALE,"Бухгалтер");

        switch (className){
            case ("1й"):
                Asan.print();
                break;
            case ("2й"):
                Nurs.print();
                break;
            case ("3й"):
                Joni.print();
                break;
            case ("4й"):
                Beka.print();
                break;
        }
    }
}
