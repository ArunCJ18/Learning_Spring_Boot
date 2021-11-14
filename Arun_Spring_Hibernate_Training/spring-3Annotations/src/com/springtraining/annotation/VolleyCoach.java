package com.springtraining.annotation;

import org.springframework.stereotype.Component;

//@Component("VolleyCoach")

			//Default name of this bean will be volleyCoach
@Component  //Same as the class name but start with smallcase letter
public class VolleyCoach implements Coach {

	@Override
	public void getDailyWorkout() {
		System.out.println("Concentrate on the ball for 5minutes");

	}

}
