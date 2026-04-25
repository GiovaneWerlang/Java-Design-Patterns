package br.gw.interpreter;

public class BinaryOperation implements Element {

    private BinaryOperationType type;
    private Element left;
    private Element right;

    public BinaryOperation() {}

    public BinaryOperation(BinaryOperationType type, Element left, Element right) {
        this.type = type;
        this.left = left;
        this.right = right;
    }

    public BinaryOperationType getType() {
        return type;
    }

    public void setType(BinaryOperationType type) {
        this.type = type;
    }

    public Element getLeft() {
        return left;
    }

    public void setLeft(Element left) {
        this.left = left;
    }

    public Element getRight() {
        return right;
    }

    public void setRight(Element right) {
        this.right = right;
    }

    @Override
    public int eval() {
        switch (type) {
            case ADD:
                return left.eval() + right.eval();
            case SUB:
                return left.eval() - right.eval();
            default:
                return 0;
        }
    }

}
