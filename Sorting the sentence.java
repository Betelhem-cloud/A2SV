class Solution {
    public String sortSentence(String s) {
        String[] words =s.split(" ");
        Map<Integer,String> map=new HashMap<>();
        for (String word: words){
            int pos =word.charAt(word.length()-1)-'0';
            map.put(pos,word.substring(0,word.length()-1));
        }
        StringBuilder sb= new StringBuilder();
        for (int i=1;i<=words.length;i++){
            sb.append(map.get(i)).append(" ");
        }
 
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
