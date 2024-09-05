package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Games/bilya.txt");
        File file1 = new File("C:/Games/namHana");
        try {
            OutputStream out = new FileOutputStream(file1);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(new Student(22, 5, "Vasya", StudentType.HONOR_STUDENT));
InputStream in = new FileInputStream(file1);
ObjectInputStream ois = new ObjectInputStream(in);

Student s = (Student) ois.readObject();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}