package lang;

/**
 * Created by mengfl on 2019/3/14.
 */

public class StringTest {


    void CharAtExample(){
        String str = "Welcome to string handling tutorial";
        //This will return the first char of the string
        char ch1 = str.charAt(0);

        //This will return the 6th char of the string
        char ch2 = str.charAt(5);

        //This will return the 12th char of the string
        char ch3 = str.charAt(11);

        //This will return the 21st char of the string
        char ch4 = str.charAt(20);

        System.out.println("Character at 0 index is: "+ch1);
        System.out.println("Character at 5th index is: "+ch2);
        System.out.println("Character at 11th index is: "+ch3);
        System.out.println("Character at 20th index is: "+ch4);
    }
    /*
    char charAt()
    boolean equals(Object obj)
    boolean equalsIgnoreCase(String string)
    int CompareTo(String string)
     */

   static void CompareToTest(){
        String str1 = "String method tutorial";
        String str2 = "compareTo method example";
        String str3 = "String method tutorial";

        int var1 = str1.compareTo( str2 );
        System.out.println("str1 & str2 comparison: "+var1);

        int var2 = str1.compareTo( str3 );
        System.out.println("str1 & str3 comparison: "+var2);

        int var3 = str2.compareTo("compareTo method example");
        System.out.println("str2 & string argument comparison: "+var3);

    }

    static void hascodeTest(){
        String str = new String("Welcome!!");
        String str1 = new String("Welcome!!");
        String str2 = "Welcome!!";

        System.out.println("Hash Code for String str: "+str.hashCode());
        System.out.println("Hash Code for String str1: "+str1.hashCode());
        System.out.println("Hash Code for String str2: "+str2.hashCode());
    }

    public static void main(String args[]){
//        //creating a string by java string literal
//        String str = "Beginnersbook";
//        char arrch[]={'h','e','l','l','o'};
//        //converting char array arrch[] to string str2
//        String str2 = new String(arrch);

     //   CompareToTest();
        hascodeTest();

    }

}

