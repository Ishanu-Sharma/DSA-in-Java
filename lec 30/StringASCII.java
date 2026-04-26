public class StringASCII{
    public static void main(String[] args) {
        String s = "ishanu";
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            freq[idx] ++;
        }
        for (int i = 0; i<26; i++) {
            System.out.print(freq[i] + " ");
        }
    }
}