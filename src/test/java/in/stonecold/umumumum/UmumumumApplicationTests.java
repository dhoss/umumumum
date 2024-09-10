package in.stonecold.umumumum;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

// TODO: figure out why the fuck the default profile isn't getting set properly
@ActiveProfiles("it-test")
@Tag("it-test")
@SpringBootTest
class UmumumumApplicationTests {

	@Test
	void contextLoads() {
	}

}