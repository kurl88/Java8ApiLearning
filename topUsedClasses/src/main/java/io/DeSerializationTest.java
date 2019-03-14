package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by mengfl on 2019/3/14.
 */

public class DeSerializationTest {
    public static void main(String args[])
    {
        Student o=null;
        try{
            FileInputStream fis = new FileInputStream("/tmp/Student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = (Student)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException cnfe)
        {
            System.out.println("Student Class is not found.");
            cnfe.printStackTrace();
            return;
        }
        System.out.println("Student Name:"+o.getStuName());
        System.out.println("Student Age:"+o.getStuAge());
        System.out.println("Student Roll No:"+o.getStuRollNum());
        System.out.println("Student Address:"+o.getStuAddress());
        System.out.println("Student Height:"+o.getStuHeight());
    }
}
