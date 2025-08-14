class Solution {
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        String lastWord = words[words.length-1];
        int op = lastWord.length();
        return op;
    }
}
