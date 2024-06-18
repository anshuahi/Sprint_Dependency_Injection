import org.anshuahi.car.Swift;
import org.anshuahi.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.anshuahi.car.Corolla;

public class App {

	public static void main(String[] args) {
//		Car swift = new Swift();
//		swift.specs();
//		
//		Car corolla = new Corolla();
//		corolla.specs();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = context.getBean("cc", Car.class);
		car.specs();
		context.close();
	}

}