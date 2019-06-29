import java.util.*;

class Solution {
    public String reverseVowels(String s) {
      //  Hashtable<Integer, String> hm = new Hashtable<Integer, String>(); 
      //  String[] arr = new String[s.length()];
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u","A","E","I","O","U"));
        StringBuilder ans = new StringBuilder(s);
        // for(int i = 0; i < s.length(); i++) {
        //     if(vowels.contains(String.valueOf(s.charAt(i))))    {
        //         arr[i] = String.valueOf(s.charAt(i));
        //     }
        // }
        int i = 0, j = s.length()-1;
        //String temp;
        while(j > i)    {
            if(vowels.contains(String.valueOf(s.charAt(i))) && vowels.contains(String.valueOf(s.charAt(j))))    {
                ans.setCharAt(i,s.charAt(j));
                ans.setCharAt(j,s.charAt(i));
                i++;
                j--;
            }
            else if(!vowels.contains(String.valueOf(s.charAt(i))))   {
                i++;
            } else  {
                j--;
            }
            
        }
        // for(String c : arr)
        //     System.out.print(c);
       // System.out.println(arr.toString());
        return ans.toString();
    }
}
