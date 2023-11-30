package leetcode._58.LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int i = new Solution().lengthOfLastWord(s);
        System.out.println("i = " + i);
    }
}
