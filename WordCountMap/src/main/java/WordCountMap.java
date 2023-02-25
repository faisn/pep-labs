
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        String[] arrWord = words.split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();
        int count = 0;
        String str = " ";
        for (int i = 0; i < arrWord.length; i++) {
            if(arrWord[i].equals(arrWord[i])) {
                count = count + i;
                str = arrWord[i];
                wordCountMap.put(str, count);
            }else {
                wordCountMap.put(str, count);
            }
        }

        return wordCountMap;
    }
}
