package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SpellService {

    List<String> dictionary = Arrays.asList(
        "apple","banana","computer","science","engineering","java","spring",
        "boot","application","developer","software","hardware","internet",
        "programming","language","keyboard","monitor","mouse","screen",
        "mobile","android","system","network","security","data","database",
        "algorithm","function","variable","object","class","method","string",
        "number","boolean","array","loop","condition","project","design",
        "analysis","development","testing","deployment","server","client",
        "technology","education","student","teacher","university","college",
        "school","information","knowledge","learning","practice","example",
        "important","different","solution","problem","correct","wrong",
        "spelling","receive","believe","achieve","because","people"
    );

    // Edit Distance
    public int editDistance(String a, String b) {
        int[][] dp = new int[a.length()+1][b.length()+1];

        for(int i=0;i<=a.length();i++) dp[i][0]=i;
        for(int j=0;j<=b.length();j++) dp[0][j]=j;

        for(int i=1;i<=a.length();i++) {
            for(int j=1;j<=b.length();j++) {
                if(a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+Math.min(dp[i-1][j],
                            Math.min(dp[i][j-1],dp[i-1][j-1]));
            }
        }
        return dp[a.length()][b.length()];
    }

    // Suggestions
    public List<Map<String,Object>> getSuggestions(String word) {

        List<Map<String,Object>> result = new ArrayList<>();

        for(String dictWord : dictionary) {

            int dist = editDistance(word.toLowerCase(), dictWord);

            if(dist <= 3) {
                int maxLen = Math.max(word.length(), dictWord.length());
                int similarity = ((maxLen - dist) * 100) / maxLen;

                Map<String,Object> map = new HashMap<>();
                map.put("word", dictWord);
                map.put("distance", dist);
                map.put("similarity", similarity);

                result.add(map);
            }
        }

        // ✅ CORRECT SORT (no error)
        result.sort(Comparator.comparingInt(a -> (int) a.get("distance")));

        return result;
    }
}