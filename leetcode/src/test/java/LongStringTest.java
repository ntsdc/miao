import java.util.HashMap;
import java.util.Map;

public class LongStringTest {
    //滑动窗口
    public static void main(String[] args) {
        String s = "pwwke";
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for (int start = 0,end = 0;end<n;end++){
            if(map.containsKey(s.charAt(end))){
                start++;
            }
            map.put(s.charAt(end),end+1);

        }

    }
    static class Solution {
        public int lengthOfLongestSubstring(String s) {


        }
    }
}
