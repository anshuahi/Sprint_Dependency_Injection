package org.anshuahi.car;

import org.anshuahi.interfaces.Car;
import org.springframework.stereotype.Component;

@Component
public class Swift implements Car {

	@Override
	public void specs() {
		System.out.println("Sedan from toyota");

	}

}
