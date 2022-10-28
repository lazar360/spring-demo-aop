package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	/*private String[] data = {
			"Beware of the world in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private int index = new Random().nextInt(data.length);*/
	
	//create a list of strings
	ArrayList<String> data = new ArrayList<String>(
			List.of("Beware of the world in sheep's clothing",
					"Diligence is the mother of good luck",
					"The journey is the reward"));
	
	private int index = new Random().nextInt(data.size());
	
	@Override
	public String getFortune() {
		//return data[index];
		return data.get(index);
	}

}
