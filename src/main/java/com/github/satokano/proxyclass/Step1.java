/**
 * 
 */
package com.github.satokano.proxyclass;

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
	public void doStep() {
		System.out.println("This is Step1");
	}

	@Override
	public void after() {
		System.out.println("after");
	}

}
