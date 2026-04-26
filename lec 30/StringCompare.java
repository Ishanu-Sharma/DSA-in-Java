public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Komal";
        String s2 = "Komal Sharma";
        for(int i = 0; i<s1.length(); i++){
            System.out.print(s1.charAt(i) + " ");
        }
        System.out.println();
        for(int i = 0; i<s2.length(); i++){
            System.out.print(s2.charAt(i) + " ");
        }
        System.out.println();
        System.out.println(s1.compareTo(s2));
    }
}
