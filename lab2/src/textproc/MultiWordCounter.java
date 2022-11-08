package textproc;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MultiWordCounter implements TextProcessor {
	private Map<String, Integer> matchedWords = new TreeMap<String, Integer>();

	public MultiWordCounter(String[] words) {
		for (String s : words) {
			matchedWords.put(s, 0);
		}
	}

	public void process(String w) {
		if (matchedWords.containsKey(w)) {
			int val = matchedWords.get(w) + 1;
			matchedWords.put(w, val);
		}
	}

	public void report() {
		for (String key : matchedWords.keySet()) {
			System.out.println(key + ": " + matchedWords.get(key));
		}
	}
}
