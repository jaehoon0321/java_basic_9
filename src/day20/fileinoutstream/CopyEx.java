package day20.fileinoutstream;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) { // throws IOException은 main 메서드에 추가
        String originalFileName = "C:/Temp1/Zed.jpeg";
        String newFileName = "C:/Temp1/testCopy2.jpeg";


        try (InputStream is = new FileInputStream(originalFileName);
             OutputStream os = new FileOutputStream(newFileName)) {

            is.transferTo(os);
                // 3. 버퍼에 읽은 데이터만큼(numRead) 파일에 씀

        os.flush();

        os.close();

            System.out.println("파일 복사가 완료되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}