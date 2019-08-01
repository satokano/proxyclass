/**
 * 
 */
package com.github.satokano.proxyclass.fw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author okano
 *
 */
public class Core {
    private JobStep proxy;
    public Core() {
        proxy = StepFactory.getJobStep(false);
    }
    public void initialize() {
        proxy.before();
    }
    public int run() {
        
        Connection con;
        Properties dbInfo = new Properties();
        dbInfo.put("user", "scott");
        dbInfo.put("password", "tiger");
        try {
            con = DriverManager.getConnection("", dbInfo);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return -1;
        }
        
        // start transaction
        int result = proxy.doStep(con);
        // try {
        // commit transaction
        // } catch () {
        // }
        return result;
    }
    public void terminate() {
        proxy.after();
    }
}
