package com.propulsion.app.propulsion;

import com.propulsion.app.propulsion.Helpers.DBHelpers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropulsionApiApplicationTests {
	@Autowired
	private DBHelpers dbHelpers;

	@Test
	void contextLoads() {
	}

}
