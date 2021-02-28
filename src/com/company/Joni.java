package com.company;

public class Joni extends People{
    private String phobia;
    public Joni(String name, String surname, int age, SexOfaPerson sexOfaPerson, String profession, String phobia) {
        super(name, surname, age, sexOfaPerson, profession);
        this.phobia = phobia;
    }

    public String getPhobia() {
        return phobia;
    }

    public void setPhobia(String phobia) {
        this.phobia = phobia;
    }

    @Override
    public void print() {
        System.out.println("Имя = "+ getName()+ " Фамилия = " + getSurname() +" Возраст = "+ getAge() + " Профессия = " + getProfession() + " Пол = "+getSexOfaPerson() + " Хобби = " + getPhobia());
    }
}
