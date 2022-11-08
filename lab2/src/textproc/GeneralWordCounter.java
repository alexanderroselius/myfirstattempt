package textproc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class GeneralWordCounter implements TextProcessor {
	private Map<String, Integer> allWords = new HashMap<String, Integer>();
	private Set<String> bannedWords;
	
	public GeneralWordCounter(Set<String> bannedWords) {
		this.bannedWords = bannedWords;
	}
	
	
	
	public void process(String w) {
		for (String word : bannedWords) {
			if (word.equals(w)) {
				return;
			}
		}
		if (allWords.containsKey(w)) {
			int val = allWords.get(w) + 1;
			allWords.put(w, val);
		}
		else {
			allWords.put(w, 1);
		}
	}


	public void report() {
		Set<Map.Entry<String, Integer>> wordSet = allWords.entrySet();
		List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordSet);
		wordList.sort((w1, w2) ->{
			if (w2.getValue() - w1.getValue() == 0) {
				return w1.getKey().compareTo(w2.getKey());
			} 				
			return w2.getValue() - w1.getValue();
			
		});
				
		
		
		for (int n = 0; n < 25; n++) {
			System.out.println(wordList.get(n).getKey() + ": " + wordList.get(n).getValue());
		}
		
		
		/*for(String key : allWords.keySet()) {
			if (allWords.get(key) >= 200) {
				System.out.println(key + ": " + allWords.get(key));
			}
		}*/
		
	}



	private Object w2() {
		// TODO Auto-generated method stub
		return null;
	}

}
