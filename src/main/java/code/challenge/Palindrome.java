package code.challenge;

public class Palindrome {
    static Boolean isPalindrome(String message) {
        StringBuilder reversedWord = new StringBuilder();
        String messageCleaned = message.replace(" ", "").toLowerCase();
        System.out.println("cleaned: " + messageCleaned);
        StringBuilder reversed = new StringBuilder(new StringBuilder(messageCleaned).reverse().toString());
        System.out.println("reversed: " + reversed);
        for (int i = reversed.length() - 1; i >= 0; i--) {
            reversedWord.append(reversed.charAt(i));
        }
        return messageCleaned.contentEquals(reversedWord);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("Anita Lava La Tina"));
        System.out.println(isPalindrome("A man a plan a canal Panama"));
        //System.out.println(isPalindrome("x y  z"));
    }
}
