package de.lart.demo;

import static spark.Spark.*;

public class DemoMain {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
