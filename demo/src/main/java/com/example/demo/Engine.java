package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String engine = "V8";
	private int cc = 4000;
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
