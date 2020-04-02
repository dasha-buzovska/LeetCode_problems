import java.util.HashSet;
import java.util.Set;

public class MorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
                "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> resultSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                int index = words[i].charAt(j) - 97;
                word.append(morse[index]);
            }
            resultSet.add(word.toString());
        }
        return resultSet.size();
    }
}
