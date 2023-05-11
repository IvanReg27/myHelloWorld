package com.usersTaxHabReg;

public class UsersTaxHabReg implements Comparable<UsersTaxHabReg> {

    String name;
    int age;
    String status;
    int cabinetNumber;
    int telephone;
    int salary;

    public UsersTaxHabReg(String name, int age, String status, int cabinetNumber, int telephone, int salary) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.cabinetNumber = cabinetNumber;
        this.telephone = telephone;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getStatus() {
        return status;
    }
    public int getCabinetNumber() {
        return cabinetNumber;
    }
    public int getTelephone() {
        return telephone;
    }
    public int getSalary() {
        return salary;
    }

    //public int compareTo(UsersTaxHabReg other) {
    //      return Integer.compare(salary, other.salary);

    public int compareTo(UsersTaxHabReg other) {
        return CharSequence.compare(name, other.name);
    }
}