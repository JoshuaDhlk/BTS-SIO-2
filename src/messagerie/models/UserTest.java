package messagerie.models;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	private UserTest user;
	@BeforeEach
	void setUp() throws Exception {
		user = new User("Jean","Clenche", LocalDate.of(2004, 10, 24));

		
	}

	@Test
	void testAddIn() {
		
	}

	@Test
	void testGetAge() {
		User u1 = new User("Jean","Clenche", LocalDate.of(2004, 09, 24));
		User u2 = new User("Jean","Clenche", LocalDate.of(2004, 10, 24));
		User u3 = new User("Jean","Clenche", LocalDate.of(2004, 11, 24));
		
		assertEquals(18, u1.getAge());
		assertEquals(18, u2.getAge());
		assertEquals(18, u3.getAge());
	}

	@Test
	void testRemoveFrom() {
		fail("Not yet implemented");
	}
}
