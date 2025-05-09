class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> p = new HashSet<>();
        for (int num1 : arr1) {
            String s1 = String.valueOf(num1);
            for (int i = 1; i <= s1.length(); i++) {
                p.add(s1.substring(0, i));
            }
        }      
            
        int max = 0;

        for (int num2 : arr2) {
            String s2 = String.valueOf(num2);
            for (int i = 1; i <= s2.length(); i++) {
                String prefix = s2.substring(0, i);
                if (p.contains(prefix)) {
                    max = Math.max(max, i);
                }
            }
        }
        return max;

    }
}