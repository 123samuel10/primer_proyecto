package model;

public class Person {
    private String name;
    private String age;
    public Person(String name,String age){
        this.name=name;
        this.age=age;
    }

    public String getAge() {
        return age;
    }
    public void setName(String age){
        this.age=age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
