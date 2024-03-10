package com.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {


	private SSD ssd;

	public SSD getSsd() {
		return ssd;
	}

	@Autowired
	public void setSsd(SSD ssd) {
		this.ssd = ssd;
	}

	public String getName() {
		return name;
	}

	private final String name = "MY Computer";

	@Override
	public String toString() {
		return "Computer [ssd=" + ssd + ", name=" + name + "]";
	}



}
