import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        //Build Hashmap of letters and number of times that letter appeared.
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i)) == null){
                map.put(str.charAt(i), 1);
            }
            else{
                int current_val = map.get(str.charAt(i));
                map.put(str.charAt(i), current_val+1);
            }
        }

        //Check map for greatest value and corresponding key
        Character greatestKey = null;
        int greatestValue = Integer.MIN_VALUE;

        for(Character c : map.keySet()){
            if(map.get(c) > greatestValue){
                greatestValue = map.get(c);
                greatestKey = c;
            }
        }
        return greatestKey;
    }
}
