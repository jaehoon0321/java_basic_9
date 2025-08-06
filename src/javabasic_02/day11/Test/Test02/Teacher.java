package javabasic_02.day11.Test.Test02;

public class Teacher {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    private String subject;


    public void print() {
        System.out.println("이름 : " + name + "  나이 : " + age + "  담당과목 : " + subject);
    }
}

