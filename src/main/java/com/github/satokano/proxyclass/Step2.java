/**
 * 
 */
package com.github.satokano.proxyclass;

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
	public void doStep() {
		System.out.println("Step2");
	}

	@Override
	public void after() {
		System.out.println("after");
	}

}
