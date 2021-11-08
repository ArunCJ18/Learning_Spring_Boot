package com.springtraining.demo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Track coach on duty" ;
	}

	@Override
	public String getDailyFortune() {
		return "Just Know That" + fortuneService.getFortune();
	}

}
