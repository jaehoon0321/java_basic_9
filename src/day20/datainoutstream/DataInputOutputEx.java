package day20.datainoutstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputEx {
    public static void main(String[] args) throws Exception{
        //데이터 입출력 객체 생성
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("primitive db");
        dos = new DataOutputStream(fos);

        dos.writeUTF("Hello Java!");
        dos.writeInt(10);
        dos.writeDouble(3.14);
        dos.writeBoolean(Boolean.TRUE);

        dos.flush();
        dos.close();
        fos.close();

        //DataInputStream 객체
        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("primitive db");
        dis = new DataInputStream(fis);

        for (int i = 0; i < 10; i++) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double price = dis.readDouble();
            boolean flag = dis.readBoolean();
            System.out.println(name + "," + age + "," + price + "," + flag);
        }
        dis.close();
        fis.close();

    }
}
