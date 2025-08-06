package javabasic_02.day11.Test.Test02;

public class Employee {

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    private String name;
        private int age;
        private String dept;


        public void print() {
            System.out.println("이름 : " + name + "  나이 : " + age + "  부서 : " + dept);
        }
    }

