/**
 * 
 */
package com.github.satokano.proxyclass;

import java.sql.Connection;

import com.github.satokano.proxyclass.fw.JobStep;

/**
 * @author okano
 *
 */
public class Step2 implements JobStep {

    @Override
    public void before() {
        System.out.println("before");
    }

    @Override
    public int doStep(Connection con) {
        System.out.println("Step2");
        return 0;
    }

    @Override
    public void after() {
        System.out.println("after");
    }

}
