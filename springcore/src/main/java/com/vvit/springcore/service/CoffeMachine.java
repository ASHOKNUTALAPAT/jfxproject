package com.vvit.springcore.service;

import com.vvit.springcore.bean.CoffeType;

public class CoffeMachine {
	private CoffeType coffeType;

	public CoffeType getCoffeType() {
		return coffeType;
	}

	public void setCoffeType(CoffeType coffeType) {
		this.coffeType = coffeType;
	}
	public void orderCoffe() {
		System.out.println("Ordered coffe..."+coffeType.getCoffe());
	}

}
