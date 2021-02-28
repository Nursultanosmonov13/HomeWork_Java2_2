package com.company;

public abstract class People implements Printable{
    private String name;                //Имя
    private String surname;             //Фамилия
    private int age;                    //Возраст
    private SexOfaPerson sexOfaPerson;  //Пол
    private String profession;          //Профессия

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SexOfaPerson getSexOfaPerson() {
        return sexOfaPerson;
    }

    public void setSexOfaPerson(SexOfaPerson sexOfaPerson) {
        this.sexOfaPerson = sexOfaPerson;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public People(String name, String surname, int age, SexOfaPerson sexOfaPerson, String profession) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sexOfaPerson = sexOfaPerson;
        this.profession = profession;
    }

    @Override
    public void print() {
        System.out.println("test");
    }
}
