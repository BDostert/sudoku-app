package com.example.sudoku_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SudokuAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SudokuAppApplication.class, args);
	}


}
