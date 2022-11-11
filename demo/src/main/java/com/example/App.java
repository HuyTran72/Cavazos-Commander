/*
Name: Huy Tran
Student ID: 1011887
Class: CIS 055
Date: 09/29/2022
*/

package com.example;

import java.util.*;


public class App 
{
    public static void main( String[] args ) {

    float numberA = 0;
    float numberB = 0;
    addValue(numberA, numberB);
}

private static void addValue(float a, float b){
    String value = String.format("A = %.3f B = %.3f", a, b);
    System.out.println("----------------------------------------");
    System.out.println("General Cavazos Comander App");
    System.out.println("----------------------------------------");
    System.out.println("i   Issue a command");
    System.out.println("l   List all of the commands");
    System.out.println("u   Undo the last command that was issued");
    System.out.println("r   Redo the last command that was issued");
    System.out.println("q   Quit");
    System.out.println("----------------------------------------");
    System.out.printf("Enter a command: ");
    }
}