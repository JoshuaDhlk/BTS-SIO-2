package messagerie.techics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpeCharRuleRegexp extends SpeCharRule {
	
	public SpeCharRuleRegexp(int count) {
		super(count);
	}
	@Override
	public boolean check(String passwordSeq) {
		String regExpr = "[" + SPECIAL_CHARS + "]{1}";
		Pattern pattern=Pattern.compile(regExpr);
		Matcher matcher=pattern.matcher(passwordSeq);
		return matcher.results().count() >= charCount;
	}
}
