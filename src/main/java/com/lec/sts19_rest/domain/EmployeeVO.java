package com.lec.sts19_rest.domain;

import lombok.Getter;

@Getter
public class EmployeeVO {
	private Integer id;
	private String name;
	private int age;
	private int [] score;
	private double point;
	
	
	public EmployeeVO() {
		super();
	}


	public EmployeeVO(Integer id, String name, int age, int[] score, double point) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
		this.point = point;
	}
	
		
	
	
}
