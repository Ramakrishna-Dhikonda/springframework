package com.annotationbased;

import org.springframework.stereotype.Component;

@Component
public class SSD {

	private final String name = "2GB";

	@Override
	public String toString() {
		return "SSD [name=" + name + "]";
	}
}
