package messagerie.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GroupTest {

	private Group group;
	
	@BeforeEach
	void setUp() throws Exception {
		group=new Group("Groupe de test");
	}

	@Test
	void testAddUsers() {
		assertEquals(0, group.getUsers().size());
		User u1= new User("J", "DOE");
		User u2= new User("J", "SMITH");
		group.addUsers(u1, u2);
		assertEquals(2, group.getUsers().size());
		assertEquals(group, u1.getGroups().iterator().next());
		assertEquals(group, u2.getGroups().iterator().next());
		assertEquals(1, u1.getGroups().size());
		assertEquals(2, u2.getGroups().size());
		group.addUsers(new User("J", "DOE"));
		assertEquals(2, group.getUsers().size());
	}

	@Test
	void testRemoveUser() {
		group.getUsers().add(new User("bob", "B"));
		assertEquals(1, group.count());
		group.getUsers().add(new User("bob", "B"));
		assertEquals(0, group.count());
	}

	@Test
	void testCount() {
		assertEquals(0, group.count());
		group.getUsers().add(new User());
		assertEquals(1, group.count());
	}

}
