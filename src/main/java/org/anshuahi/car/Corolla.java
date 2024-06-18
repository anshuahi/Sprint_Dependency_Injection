package org.anshuahi.car;

import org.anshuahi.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cc")
public class Corolla implements Car {
//	/required = false)
	@Autowired
	Engine engine;

	@Override
	public void specs() {
		
		System.out.println("Sedan from Toyota with engine as " + engine.type);

	}
//	@Autowired
//	public Corolla(Engine engine) {
//		super();
//		engine.type = "V6";
//		this.engine = engine;
//	}

}
	