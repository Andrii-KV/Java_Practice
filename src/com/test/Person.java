package com.test;

public class Person {
    Pet pet;

    Person person;

    private String name;
    private int age;

    private char sex;

    public Person(){
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getNameWithPrefix(){
        if (sex == 'M'){
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

    protected  String getBaseName(){
        return name;
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName(){
        return getNameWithPrefix();
    }

    void setName(String name){

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
