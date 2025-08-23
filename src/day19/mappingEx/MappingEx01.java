package day19.mappingEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
}

public class MappingEx01 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("이", 11));
        students.add(new Student("재", 22));
        students.add(new Student("훈", 34));

        System.out.println("점수 목록:");
        students.stream().map(Student::getScore).forEach(score -> System.out.println("점수: " + score));


        double average = students.stream().mapToInt(Student::getScore).average().getAsDouble();


        System.out.printf("학생들의 평균 %.1f", average);
    }
}

