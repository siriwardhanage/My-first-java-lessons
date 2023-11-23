package com.youtube;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        TextBox textBox1 = new TextBox();  //create textBox object and assign it to textBox1 reference variable
        textBox1.setText("box1"); //assign string value "box1" to text field ,calling setText method in textBox1 object
        System.out.println(textBox1.text);  //print value in text field
        System.out.println(textBox1.text.toUpperCase(Locale.ROOT)); //convert text value to upperCase

        TextBox textBox2 = new TextBox();
        textBox2.setText("box2");
        System.out.println(textBox2.text);
        textBox2.clear(); //call clear method to clear the text field
        System.out.println(textBox2.text);


        //for understand memory allocation

        //there are 2 types of memory allocation
        // * 1.Heap - only store the object no variables
        // * 2.Stack - store both reference and primitive variable, no objects
        // * for example TextBox object is stored in heap and, it's reference textBox1,textBox2 reference data types are stored in stack,
        //   and it stores only the memory address of the object not direct value

        TextBox textBoxA = new TextBox();
        TextBox textBoxB;
        textBoxB = textBoxA;
        textBoxB.setText("Hello");
        System.out.println(textBoxA.text);
        //the above example both textBoxA and textBoxB have the same object
        // so memory address is also the same
        // so values are the same
    }
}