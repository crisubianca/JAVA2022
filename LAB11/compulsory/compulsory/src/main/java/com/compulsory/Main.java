package com.compulsory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Main {
	private Set<String> users = new HashSet<>();
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	public Set<String> getUsers() {
		return users;
	}
}
