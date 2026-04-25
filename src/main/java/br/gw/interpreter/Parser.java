package br.gw.interpreter;

import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public static Element parse(List<Token> tokens) {
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;

        for(int i = 0; i < tokens.size(); ++i) {
            Token token = tokens.get(i);
            switch (token.getTokenType()) {
                case INTEGER:
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.getText()));
                    if (!haveLHS) {
                        result.setLeft(integer);
                        haveLHS = true;
                    } else {
                        result.setRight(integer);
                    }
                    break;
                case PLUS:
                    result.setType(BinaryOperationType.ADD);
                    break;
                case MINUS:
                    result.setType(BinaryOperationType.SUB);
                    break;
                case LPAREN:
                    int j = i;
                    for(;j < tokens.size(); ++j) {
                        if(tokens.get(j).getTokenType() == TokenType.RPAREN) {
                            break;
                        }
                    }
                    List<Token> subExpression = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());
                    Element element = parse(subExpression);
                    if (!haveLHS) {
                        result.setLeft(element);
                        haveLHS = true;
                    } else {
                        result.setRight(element);
                    }
                    i = j;
                    break;
            }
        }
        return result;
    }

}
