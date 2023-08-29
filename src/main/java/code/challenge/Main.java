package code.challenge;

public class Main {

    public static void main(String[] args) {
        ParenthesisChallenge pc = new ParenthesisChallenge();
        ValidString vs = new ValidString();

        //System.out.println(pc.IsAValidFormatChain("{[Hello]}"));
        //pc.validateParenthesis("pepepecas");
        System.out.println(vs.checkValidString("{[op]}"));
    }
}
