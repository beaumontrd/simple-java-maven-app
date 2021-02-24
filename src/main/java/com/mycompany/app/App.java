package com.mycompany.app;

/**
 * Slow Computer!
 */
public class App
{

    private final String message = "My Computer is too slow!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
