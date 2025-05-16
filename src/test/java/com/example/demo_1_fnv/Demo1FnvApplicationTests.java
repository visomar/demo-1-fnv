package com.example.demo_1_fnv;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Demo1FnvApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void testDeliverPlatinumChip() {
		String response = restTemplate.getForObject("/", String.class);

		assertThat(response)
				.isEqualTo("Sorry, Benny stole it from me");
	}
}
