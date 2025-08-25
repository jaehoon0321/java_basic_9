package day20.writer;
//Writer  클래스는 OutputStream 과 사용법은 동일하지만 , 출력단위가 문자 (char)이다.
//문자열을 출력하는 writer(String str)메소드가 추가 제공된다
//Writer 클래스를 활용하여 하ㅣ나의 문자, 문자배열, 문자열 출력하는 기능 구현


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writerEx {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/Temp1/testchar.txt");

        //1.문자열 출력
        char ch1 = 'A';
        writer.write(ch1);

        char ch2 = 'B';
        writer.write(ch2);

        char[] chars ={'a','b','c','d','e','f'};
        writer.write(chars);

        //문자열 파일 출력
        String str = "never mind to find some like you";
        writer.write(str);

        writer.flush();
        writer.close();
    }
}
