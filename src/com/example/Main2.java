package com.example;

import java.io.*;

/**
 * create by Freedom on 2021/2/3
 */
public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cola cola = new Cola("cola cola","colaCompany");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(cola);

        byte[] bytes = bos.toByteArray();

        //�����ڴ���Ҫ���л�
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Object o = ois.readObject();
        System.out.println("o = " + o);
        System.out.println(o == cola);
    }
}
