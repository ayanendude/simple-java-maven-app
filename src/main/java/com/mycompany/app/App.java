package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

<<<<<<< HEAD
    public App() {}//////
=======
    public App() {}
    // App A1 = new App();
    App A2 = new App();

>>>>>>> 432ec211534216594f8366194db734c5c5d7b2b6

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
