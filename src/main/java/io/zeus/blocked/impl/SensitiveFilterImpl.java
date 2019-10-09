package io.zeus.blocked.impl;

import java.util.Set;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import io.zeus.blocked.ISensitiveFilter;

@Component
@ConditionalOnProperty(name="zeus.sensitive.file")
public class SensitiveFilterImpl implements ISensitiveFilter {
	private SensitiveWordFilter filter;
	public SensitiveFilterImpl() {
		super();
		SensitiveWordFilter.init(System.getProperty("zeus.sensitive.file"));
		filter = SensitiveWordFilter.getInstance();
	}

	@Override
	public int checkSensitive(String text, int begin) {
		return filter.checkSensitiveWord(text, begin, 2);
	}

	@Override
	public Set<String> getSensitive(String text) {
		return filter.getSensitiveWord(text, 2);
	}

	@Override
	public boolean containSensitive(String text) {
		return filter.isContaintSensitiveWord(text, 2);
	}

	@Override
	public String replaceSensitive(String text, String replaceChar) {
		return filter.replaceSensitiveWord(text, 2, replaceChar);
	}

}
