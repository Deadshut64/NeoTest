package com.example.calculatevacation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalculateVacationApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	void calculate() {
		int salary = 100000;
		int vacation = 20;
		double expected = 68259.385665529;
		ResponseEntity<Double> response = testRestTemplate.exchange(
				"/calculate?salary=" + salary + "&vacation=" + vacation,
				HttpMethod.GET, HttpEntity.EMPTY, Double.class);
		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
		Double body = response.getBody();
		Assertions.assertNotNull(body);
		Assertions.assertEquals(expected,body);
	}

}