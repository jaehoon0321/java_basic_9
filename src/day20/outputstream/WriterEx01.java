package day20.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx01 {
    public static void main(String[] args)throws IOException {

        //출력 스트림을 생성 C:Temp/Test1.db에 1byte 데이터를 저장한다.
        OutputStream os = new FileOutputStream("C:/t");

        //내부낼 데이터를 지정

        byte num1 = 10;
        byte num2 = 20;
        byte num3 = 30;

        //데이터를 스트림에 보내서 해당 목적지에 쓴다
        os.write(num1);
        os.write(num2);
        os.write(num3);
        //스트림의 버퍼를 비운다.(내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움)

        os.flush();


        //스트림을 닫는다.
        os.close();

    }
}
