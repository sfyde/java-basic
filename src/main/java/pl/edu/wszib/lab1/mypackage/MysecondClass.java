package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.myabstract.MyAbstractClass;

public class MysecondClass extends MyAbstractClass {

    private String firstField;

    String firstField2;

    public void run(){
        System.out.println("firstField = " + firstField);
        System.out.println("firstField2 = " + firstField2);
        myProtectedField = "my protected";
        MyProtected();
    }

    @Override
    protected void myAbstract() {

    }
}
