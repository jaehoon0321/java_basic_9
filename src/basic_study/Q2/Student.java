package basic_study.Q2;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name){
        this.studentNum = studentNum;
        this.name = name;
    }
    //학번이 같으면 같은 학생으로 간주
    public boolean equals(Object o) {
        if (this == o) return true;
        Student other = (Student) o;//학번을 기준으로 비교해주고
        return this.studentNum == other.studentNum;//이름을 비교하지 않고 학번만 같으면 같튼 학생으로 인식하게끔.
    }

    public int hashCode() {
        return Objects.hash(studentNum); // 학번만 기준으로 해시값 생성
    }
}
