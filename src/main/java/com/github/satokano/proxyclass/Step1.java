/**
 * 
 */
package com.github.satokano.proxyclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.github.satokano.proxyclass.fw.JobStep;

/**
 * @author okano
 *
 */
public class Step1 implements JobStep {

    @Override
    public void before() {
        System.out.println("before");
    }

    @Override
    public int doStep(Connection con) {
        try {
            PreparedStatement ps = con.prepareStatement("select 1 from dual;");
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("This is Step1");
        return 0;
    }

    @Override
    public void after() {
        System.out.println("after");
    }

}
