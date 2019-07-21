package com.github.satokano.proxyclass;

public interface JobStep {
	public abstract void before();
	public abstract void doStep();
	public abstract void after();
}
