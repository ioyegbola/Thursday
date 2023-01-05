package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1 ){
            System.out.println("Please provide an argument");
        }
        else {
            System.out.println(String.format("Argument provided: %s <%s>",args[0],args[1]));
            }
    }
}