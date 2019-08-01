package com.github.satokano.proxyclass.fw;

import java.sql.Connection;

public interface JobStep {
    public abstract void before();
    public abstract int doStep(Connection con);
    public abstract void after();
}
