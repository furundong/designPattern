package com.example;

import sun.net.www.protocol.https.HttpsURLConnectionImpl;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main2(String[] args) throws IOException {
        //在计算机内存中，统一使用Unicode编码，当需要保存到硬盘或者需要传输的时候，就转换为UTF-8编码。
        FileOutputStream out = new FileOutputStream("D:1.txt");
        out.write(228);
        out.write(184);
        out.write(173);
        out.write(28);
        out.close();

        /*FileInputStream fileInputStream = new FileInputStream("D:1.txt");
        int read = fileInputStream.read();
        System.out.println("read = " + read);

        read = fileInputStream.read();
        System.out.println("read = " + read);

        read = fileInputStream.read();
        System.out.println("read = " + read);

        read = fileInputStream.read();
        System.out.println("read = " + read);

        read = fileInputStream.read();
        System.out.println("read = " + read);*/

        FileReader reader = new FileReader("D:1.txt");
        System.out.println(reader.read());
    }

    public static void main(String[] args) throws Exception {
        download("https://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/180/180-bigskin-9.jpg",1);
    }

    //java 通过url下载图片保存到本地
    public static void download(String urlString, int i) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        if(((HttpsURLConnectionImpl) con).getResponseCode() != 404){
            // 输入流
            //((HttpsURLConnectionImpl) con).getResponseMessage()
            //((HttpsURLConnectionImpl) con).getResponseCode()
            InputStream is = con.getInputStream();
            // 1K的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            // 输出的文件流
            String filename = "D:\\" + i + ".jpg";  //下载路径及下载图片名称
            File file = new File(filename);
            FileOutputStream os = new FileOutputStream(file, true);
            // 开始读取
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
            System.out.println(i);
            // 完毕，关闭所有链接
            os.close();
            is.close();
        }else{
            System.out.println("nothing");
        }

    }
}

/*
一个 Java 源代码文件称为一个编译单元（compilation unit）（有时也称翻译单元（translation unit））。
每个编译单元的文件名后缀必须是 .java。在编译单元中可以有一个 public 类，它的类名必须与文件名相同（包括大小写，但不包括后缀名 .java）。
每个编译单元中只能有一个 public 类，否则编译器不接受。如果这个编译单元中还有其他类，那么在包之外是无法访问到这些类的，
    因为它们不是 public 类，此时它们为主 public 类提供“支持”类 。
 */

