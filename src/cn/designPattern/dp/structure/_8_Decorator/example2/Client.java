package cn.designPattern.dp.structure._8_Decorator.example2;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("F:\\javadesignpattern\\designPattern\\src\\cn\\designPattern\\dp\\structure\\_8_Decorator\\example2\\test.txt")
                )
        );

        int i ;
        while ((i = inputStream.read())>0){
            System.out.print((char)i);
        }
    }
}
