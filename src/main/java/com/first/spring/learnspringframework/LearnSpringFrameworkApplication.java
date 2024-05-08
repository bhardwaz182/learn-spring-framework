package com.first.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.first.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.first.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		MyWebController webApp = context.getBean(MyWebController.class);
		System.out.println(webApp.returnValueFromBusinessService());
//		MarioGame mario = new MarioGame();
//		SuperContraGame superContra = new SuperContraGame();
//		Game Pacman = new PacMan();
//		GameRunner contraRunner = new GameRunner(superContra);
//		GameRunner marioRunner = new GameRunner(mario);
//		GameRunner pacman = new GameRunner(Pacman);
//		contraRunner.run();
//		marioRunner.run();
//		pacman.run();
	}

}