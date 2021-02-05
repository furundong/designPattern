package cn.designPattern.dp.structure._2_Decorator.example55;

import cn.designPattern.dp.structure._1_proxy.example4.Clinet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Client {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new LowerCaseInputStream(
                new BufferedInputStream(
                        Objects.requireNonNull(Clinet.class.getClassLoader().getResourceAsStream("cn\\designPattern\\dp\\structure\\_2_Decorator\\example55\\test.txt"))
//                        new FileInputStream("")
                )
        );

        int i ;
        while ((i = inputStream.read())>0){
            System.out.print((char)i);
        }
    }
}
