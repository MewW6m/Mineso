package app.main.util;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ErrorUtilImplTest extends ErrorUtilIFTest {
	protected ErrorUtilIF errorUtil = new ErrorUtilI();
}