package messagerie.run;

import messagerie.models.Group;
import messagerie.models.User;
import messagerie.techics.Password;
import messagerie.techics.SpeCharRule;
import messagerie.techics.MinCharRule;
import messagerie.techics.SpeCharRuleRegexp;

public class ProgTest {

	public static void main(String[] args) {
		
		Group group = new Group("2 SIO SLAM");
		Group group2= new Group("2 SIO SLAM");
				User user=new User ("J", "SMITH");
				group.addUsers(user, user, user, new User("j", "SMITH"));
				group2.addUsers(user);
				System.out.println(user.getGroups());
				group2.removeUser(user);
				System.out.println(group2);
				System.out.println(user.getGroups());
	}

	
}
