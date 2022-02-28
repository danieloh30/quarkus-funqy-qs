package org.acme;

import io.quarkus.funqy.Funq;

public class MyFunctions {

    @Funq
    public String hello() {
        return "Welcome, Quarkus Serverless Functions on the Developer Sandbox!";
    }

}
