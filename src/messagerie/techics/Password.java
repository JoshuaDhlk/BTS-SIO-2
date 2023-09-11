package messagerie.techics;

import java.util.ArrayList;
import java.util.List;


public class Password {
	String value;
	private List<Rule>rules;
	
	public Password(String value) {
		this.value = value;
		this.rules = new ArrayList<>();
	}
	
	public void addRule(Rule rule) {
		this.rules.add(rule);
	}
	
	public boolean isValid() {
		for(Rule rule :rules) {
			if(!rule.check(value)) {
				return false;
			}
		}
		return true;
	}
}


