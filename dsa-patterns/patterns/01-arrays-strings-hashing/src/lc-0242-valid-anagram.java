class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // TODO: Implement the O(N) frequency-based solution here.
        // 1. Check if lengths are equal.
        // 2. Count character frequencies using a frequency array.
        // 3. Verify that all frequencies equal zero.

        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram v = new ValidAnagram();
        System.out.println(v.isAnagram(s, t));
    }
}
