package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by mengfl on 2019/3/14.
 */

public class SerializationTest {
    public static void main(String args[])
    {
        Student obj = new Student(101, 25, "Chaitanya", "Agra", 6);
        try{


            FileOutputStream fos = new FileOutputStream("/tmp/Student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.println("Serialzation Done!!");
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}

class Student implements java.io.Serializable{
    private int stuRollNum;
    private int stuAge;
    private String stuName;
    private transient String stuAddress;
    private transient int stuHeight;

    public Student(int roll, int age, String name,
                   String address, int height) {
        this.stuRollNum = roll;
        this.stuAge = age;
        this.stuName = name;
        this.stuAddress = address;
        this.stuHeight = height;
    }

    public int getStuRollNum() {
        return stuRollNum;
    }
    public void setStuRollNum(int stuRollNum) {
        this.stuRollNum = stuRollNum;
    }
    public int getStuAge() {
        return stuAge;
    }
    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public String getStuAddress() {
        return stuAddress;
    }
    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
    public int getStuHeight() {
        return stuHeight;
    }
    public void setStuHeight(int stuHeight) {
        this.stuHeight = stuHeight;
    }
}
