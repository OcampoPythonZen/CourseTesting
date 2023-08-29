package code.challenge;

public class ParenthesisChallenge {
    public boolean IsAValidFormatChain(String chain) {
        char[] openedValues = {'{', '[', '('};
        char[] closedValues = {'}', ']', ')'};
        int numberOfValuesOpened = 0;
        int numberOfValuesClosed = 0;
        for (char value : chain.toCharArray()) {
            if (value == openedValues[0] || value == openedValues[1] || value == openedValues[2]) {
                numberOfValuesOpened = numberOfValuesOpened + 1;
            } else if (value == closedValues[0] || value == closedValues[1] || value == closedValues[2]) {
                numberOfValuesClosed = numberOfValuesClosed + 1;
            }
        }
        return numberOfValuesOpened == numberOfValuesClosed;
    }

    void testRec(int value) {
        if (value <= 6) {
            System.out.println(value);
            testRec(value + 1);
        }
    }

    void validateParenthesis(String chain) {
        char[] strToChar = chain.toCharArray();
        for (char value :
                strToChar) {
            System.out.println(value);
        }
    }
}
