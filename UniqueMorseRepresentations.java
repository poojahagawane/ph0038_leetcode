class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length == 0)   return 0;
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word : words)    {
            //System.out.println(word);
            StringBuilder codeword = new StringBuilder();
            for(int i = 0; i < word.length(); i++)    {
                codeword.append(morse[word.charAt(i)-'a']);
            }
            //System.out.println(codeword);
            Integer count = hm.get(codeword.toString());
            if(count == null)  {
                hm.put(codeword.toString(),1);
            }
        }
        //hm.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v)); 
        return hm.size();
    }
}
