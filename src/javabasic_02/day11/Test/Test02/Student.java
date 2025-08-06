package javabasic_02.day11.Test.Test02;

public class Student {
    public String getName() {
        return name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
        private int age;
        private int id;



        public void print() {
            System.out.println("이름 : " + name + "  나이 : " + age + "  학번 : " + id);
        }
    }
