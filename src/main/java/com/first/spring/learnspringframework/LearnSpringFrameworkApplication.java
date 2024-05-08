package com.first.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.first.spring.learnspringframework.game.GameRunner;
import com.first.spring.learnspringframework.game.MarioGame;
import com.first.spring.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame mario = new MarioGame();
		SuperContraGame superContra = new SuperContraGame();
		GameRunner runner = new GameRunner(superContra);
		runner.run();
	}

}