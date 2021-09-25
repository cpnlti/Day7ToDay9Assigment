package com.example912.demo912;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class MyCompenent {
	public String met() {
		return "Hellooo" + new Date();
	}
}
