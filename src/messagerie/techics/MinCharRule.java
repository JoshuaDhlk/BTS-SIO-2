package messagerie.techics;

public class MinCharRule implements Rule {
	int charCount;
	
	//Constructeur
	public MinCharRule() {
			this(8);
		}
		
	public MinCharRule(int charCount) {
		this.charCount = charCount;
	}
	
	@Override
	public boolean check(String passwordSeq) {
		return charCount <= passwordSeq.length();
		
	}

}
