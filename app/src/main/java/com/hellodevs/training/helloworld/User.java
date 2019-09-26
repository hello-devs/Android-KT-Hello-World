package com.hellodevs.training.helloworld;

public class User {

    private String name;
    private int age;
    private Address address;

    public String getName() {
        return name;
    }

    public User(){
        address = new Address("Paris","France");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
