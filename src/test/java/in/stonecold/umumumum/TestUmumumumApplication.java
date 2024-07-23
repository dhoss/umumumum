package in.stonecold.umumumum;

import org.junit.jupiter.api.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("it-test")
@Tag("it-test")
@TestConfiguration(proxyBeanMethods = false)
public class TestUmumumumApplication {

	public static void main(String[] args) {
		SpringApplication.from(UmumumumApplication::main).with(TestUmumumumApplication.class).run(args);
	}

}