package com.company;

public class Nurs extends People{
   private String married; //состоите в браке
    private int havinghildren;


    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public int getHavinghildren() {
        return havinghildren;
    }

    public void setHavinghildren(int havinghildren) {
        this.havinghildren = havinghildren;
    }

    public Nurs(String name, String surname, int age, SexOfaPerson sexOfaPerson, String profession, String married, int havinghildren) {
        super(name, surname, age, sexOfaPerson, profession);
        this.married = married;
        this.havinghildren = havinghildren;
    }
    @Override
    public void print() {
        System.out.println("Имя = "+ getName()+ " Фамилия = " + getSurname() +" Возраст = "+ getAge() + " Профессия = " + getProfession() + " Пол = "+getSexOfaPerson() +" Брак = " +getMarried() + " Дети ="+getHavinghildren());
    }

}
