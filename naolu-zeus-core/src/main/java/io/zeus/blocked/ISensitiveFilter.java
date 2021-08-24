package io.zeus.blocked;

import java.util.Set;

public interface ISensitiveFilter {
	int checkSensitive(String text, int begin);
	Set<String> getSensitive(String text);
	boolean containSensitive(String text);
	String replaceSensitive(String text, String replaceChar);
}
