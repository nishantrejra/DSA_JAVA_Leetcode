class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") -1;
    }
}

// class Solution {
//     public int lengthOfLastWord(String s) {
//         //java1
//         s = s.trim();
//         String[] str = s.split("\\s+");
//         String word = str[str.length -1];
//         int count = word.length();
//         return count;
//     }
// }