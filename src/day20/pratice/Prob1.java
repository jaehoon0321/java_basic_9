package day20.pratice;

// 문제 1: 텍스트 파일에 문자열 저장
//         문자열 "Hello Java!"를 hello.txt에 저장하세요.
import java.io.FileWriter;
import java.io.IOException;

public class Prob1 {

    public static void main(String[] args)throws IOException {
        String fileName = "hello.txt";
        String content = "Hello Java!";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("hello.txt 저장 성공");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }

