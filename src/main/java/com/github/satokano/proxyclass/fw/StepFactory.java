/**
 * 
 */
package com.github.satokano.proxyclass.fw;

import com.github.satokano.proxyclass.Step1;
import com.github.satokano.proxyclass.Step2;

/**
 * @author okano
 *
 */
public class StepFactory {
    public static final JobStep getJobStep(boolean flag) {
        if (flag) {
            return new Step1();
        } else {
            return new Step2();
        }
    }
}
