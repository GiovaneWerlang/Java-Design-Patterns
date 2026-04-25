package br.gw.interpreter;

public class Token {

    private TokenType tokenType;
    private String text;

    public Token(TokenType tokenType, String text) {
        this.tokenType = tokenType;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    @Override
    public String toString() {
        return "`" + getText() + "`";
    }

}
