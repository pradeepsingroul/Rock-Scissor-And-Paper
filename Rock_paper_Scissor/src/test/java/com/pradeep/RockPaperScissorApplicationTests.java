package com.pradeep;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.intThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.client.ExpectedCount;

@SpringBootTest
class RockPaperScissorApplicationTests {
	
	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
		
	}
	
	@Test
	@Disabled
	void testSum() {
		int expected = 12;
		int actualResult = calculator.doSum(7, 5);
		assertThat(actualResult).isEqualTo(expected);
	}
	
	@Test
	void testProduct() {
	    int expected = 60;
	    int actual = calculator.doProduct(12, 5);
	    assertThat(actual).isEqualTo(expected);
	}
	
	@Test 
	void doCompareion() {
		boolean flag = calculator.doCompare(5, 5);
		assertThat(true).isEqualTo(flag);
	}

}
