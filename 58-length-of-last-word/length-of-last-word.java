class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split("\\s+");
        String word = str[str.length -1];
        int count = word.length();
        return count;
    }
}