package com.study.muti.sources.serializabletest;

import java.io.*;

/**
 * Created by Administrator on 2017/12/21.
 */
public class TestMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestMain main = new TestMain();
        //main.doSerializable();
        main.decodeSerializable();
    }

    public void doSerializable() throws IOException {
        Person person = new Person("王八蛋","人妖");
        FileOutputStream outputStream = new FileOutputStream("d:/person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }

    public void decodeSerializable() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d:/person.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Person person = (Person) inputStream.readObject();
        inputStream.close();
        System.out.println(person.toString());
    }
}
