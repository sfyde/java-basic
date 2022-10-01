package pl.edu.wszib.lab1;

import pl.edu.wszib.lab1.mypackage.MysecondClass;

public class Applicaton {

    public static void main(String[] args) {
        MyFirstClass.myStaticField = "My static";
        MyFirstClass myFirstClass = new MyFirstClass();
        myFirstClass.firstField2 = "Test";
        myFirstClass.run1();

        MysecondClass mysecondClass = new MysecondClass();
        mysecondClass.run();

    }
}
