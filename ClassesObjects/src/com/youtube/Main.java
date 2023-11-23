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



    }
}