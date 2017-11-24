package com.wan.di2;

import java.util.ArrayList;

public class Info {
	
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobby;
	private BMICalc bmiCalc;
	
	public void getInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("Ű : " + height);
		System.out.println("������ : " + weight);
		System.out.println("��� : " + hobby);
		bmiCalculation();
	}
	
	public void bmiCalculation() {
		bmiCalc.bmiCalculation(weight, height);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public BMICalc getBmiCalc() {
		return bmiCalc;
	}

	public void setBmiCalc(BMICalc bmiCalc) {
		this.bmiCalc = bmiCalc;
	}
	

}
