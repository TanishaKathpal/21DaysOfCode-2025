public class Q1{
    public static boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        String filteredStr = filtered.toString();
        String reversedStr = filtered.reverse().toString();
        return filteredStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); 
        System.out.println(isPalindrome("hello"));   
        System.out.println(isPalindrome("Madam")); 
    }
}
