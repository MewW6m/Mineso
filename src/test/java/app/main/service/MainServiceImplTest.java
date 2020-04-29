package app.main.service;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainServiceImplTest extends MainServiceIFTest{
	private MainServiceIF mainService = new MainServiceImpl();
}