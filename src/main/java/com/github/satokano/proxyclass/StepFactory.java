/**
 * 
 */
package com.github.satokano.proxyclass;

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
