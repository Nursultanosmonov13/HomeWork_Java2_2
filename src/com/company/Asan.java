package com.company;

public class Asan extends People{
    private String hobby;
    private String married;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public Asan(String name, String surname, int age, SexOfaPerson sexOfaPerson, String profession, String hobby,String married) {
        super(name, surname, age, sexOfaPerson, profession);
        this.hobby = hobby;
        this.married = married;
    }

    @Override
    public void print() {
        System.out.println("Имя = "+ getName()+ " Фамилия = " + getSurname() +" Возраст = "+ getAge() + " Профессия = " + getProfession() + " Пол = "+getSexOfaPerson() + " Хобби = " + getHobby() +" Брак = " +getMarried());
    }
}
