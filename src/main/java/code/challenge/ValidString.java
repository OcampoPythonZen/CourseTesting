package code.challenge;

public class ValidString {

    public boolean checkValidString(String inputStr) {
        int size = inputStr.length();
        if (size % 2 == 1) {
            return false;
        }

        int level = 0;
        int j = 0;
        boolean isValid = true;

        for (int k = 0; k < inputStr.length(); k++) {
            if (inputStr.charAt(k) == '(' || inputStr.charAt(k) == '[' || inputStr.charAt(k) == '{') {
                level = level + 1;
            } else {
                level = level - 1;
            }
            if (level == 0) {
                if (isPair(inputStr.charAt(j), inputStr.charAt(k))) {
                    return false;
                }
                if (j + 1 < k) {
                    isValid = checkValidString(inputStr.substring(j + 1, k));
                }
                j = k + 1;
            }
        }

        if (level == 0) {
            return isValid;
        }
        return false;
    }

    public static boolean isPair(char p, char q) {
        if (p == '(') {
            if (q == ')') {
                return false;
            }
            return true;
        } else if (p == '[') {
            if (q == ']') {
                return false;
            }
            return true;
        } else if (p == '{') {
            if (q == '}') {
                return false;
            }
            return true;
        }
        return true;
    }
}