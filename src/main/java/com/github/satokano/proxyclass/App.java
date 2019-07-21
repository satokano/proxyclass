package com.github.satokano.proxyclass;

public class App {

    public static void main(String[] args) {
        JobStep proxy = StepFactory.getJobStep(true);
        proxy.before();
        proxy.doStep();
        proxy.after();
    }
}
