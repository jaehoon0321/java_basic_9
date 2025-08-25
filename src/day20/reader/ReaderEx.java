package day20.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws Exception {

        Reader reader = null;

        // 1. 문자 하나씩 읽기
        // [수정] 파일 경로 구분자를 '/' 또는 '\\'로 변경
        reader = new FileReader("C:/Temp1/testchar.txt");
        System.out.println("--- 1. 문자 하나씩 읽기 ---");
        while (true) {
            int data = reader.read();
            if (data == -1) break;
            System.out.print((char) data);
        }
        reader.close();
        System.out.println("\n------------------------"); // 출력 구분을 위해 추가

        // 2. 문자 배열로 읽기 (main 메서드 안으로 이동)
        // [수정] 파일 경로 구분자를 '/' 또는 '\\'로 변경
        reader = new FileReader("C:/Temp1/testchar.txt"); // 경로를 통일했습니다.
        char[] datas = new char[100];

        System.out.println("--- 2. 문자 배열로 읽기 ---");
        while (true) {
            // datas 배열에 읽은 문자를 저장하고, 읽은 문자 수를 numRead에 저장
            int numRead = reader.read(datas);
            if (numRead == -1) break;

            // 읽은 문자 수(numRead)만큼만 반복하여 출력
            for (int i = 0; i < numRead; i++) {
                System.out.print(datas[i]);
            }
        }
        reader.close(); // 사용한 스트림 닫기

        // 3. 문자열 읽기 (향후 추가될 부분)
    }
}
