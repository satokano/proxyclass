package com.github.satokano.proxyclass.fw;

public class AppRunner {

    public static void main(String[] args) {
        Core c = new Core();
        int result = c.run();
        System.exit(result);
    }
}
