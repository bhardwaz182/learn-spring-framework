package com.first.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.first.spring.learnspringframework.game.GameRunner;
import com.first.spring.learnspringframework.game.MarioGame;
import com.first.spring.learnspringframework.game.SuperContraGame;
import com.first.spring.learnspringframework.game.Game;
import com.first.spring.learnspringframework.game.PacMan;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame mario = new MarioGame();
		SuperContraGame superContra = new SuperContraGame();
		Game Pacman = new PacMan();
		GameRunner contraRunner = new GameRunner(superContra);
		GameRunner marioRunner = new GameRunner(mario);
		GameRunner pacman = new GameRunner(Pacman);
		contraRunner.run();
		marioRunner.run();
		pacman.run();
	}

}