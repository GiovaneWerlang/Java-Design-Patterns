package br.gw.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Lexing {

    public static List<Token> execute(String input) {
        ArrayList<Token> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '+': {
                    result.add(new Token(TokenType.PLUS, "+"));
                    break;
                }
                case '-': {
                    result.add(new Token(TokenType.MINUS, "-"));
                    break;
                }
                case '(': {
                    result.add(new Token(TokenType.LPAREN, "("));
                    break;
                }
                case ')': {
                    result.add(new Token(TokenType.RPAREN, ")"));
                    break;
                }
                default: {
                    StringBuilder sb = new StringBuilder("" + input.charAt(i));
                    for (int j = i+1; j < input.length(); ++j) {
                        if(Character.isDigit(input.charAt(j))) {
                            sb.append(input.charAt(j));
                            ++i;
                        } else {
                            result.add(new Token(TokenType.INTEGER, sb.toString()));
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return result;
    }

}
