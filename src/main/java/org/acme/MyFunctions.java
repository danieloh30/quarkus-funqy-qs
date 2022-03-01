package org.acme;

import javax.inject.Inject;
import io.quarkus.funqy.Funq;

public class MyFunctions {

    @Funq
    public String hello() {
        return "Welcome, Quarkus Serverless Functions on the Developer Sandbox!";
    }

}
