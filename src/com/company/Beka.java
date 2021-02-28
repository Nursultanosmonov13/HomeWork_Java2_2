package com.company;

public class Beka extends People {
    public Beka(String name, String surname, int age, SexOfaPerson sexOfaPerson, String profession) {
        super(name, surname, age, sexOfaPerson, profession);
    }

    @Override
    public void print() {
        System.out.println("Имя = "+ getName()+ " Фамилия = " + getSurname() +" Возраст = "+ getAge() + " Профессия = " + getProfession() + " Пол = "+getSexOfaPerson());
    }
}
