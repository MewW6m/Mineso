package app.main.repository;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainRepositoryImplTest extends MainRepositoryIFTest{
	private MainRepositoryIF mainRepository = new MainRepository();
}