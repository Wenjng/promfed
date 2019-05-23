package com.wen.promfed;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PromfedApplicationTests {

	@Test
//    @DisplayName("MyDummyTest-- todos!!!")
	public void contextLoads() {
        assertEquals(2,2);
	}

}
