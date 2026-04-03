package br.gw.builder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {

    private String name;
    private String text;
    private ArrayList<HtmlElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<HtmlElement> getElements() {
        return elements;
    }

    public void setElements(ArrayList<HtmlElement> elements) {
        this.elements = elements;
    }

    public String getNewLine() {
        return newLine;
    }

    public int getIndentSize() {
        return indentSize;
    }

    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * this.getIndentSize(), " "));
        sb.append(String.format("%s<%s>%s", i, this.getName(), this.getNewLine()));
        if(this.getText() != null && !this.getText().isEmpty()) {
            sb.append(String.join("", Collections.nCopies(this.getIndentSize() * (indent + 1), " ")))
                .append(this.getText())
                .append(this.getNewLine());
        }

        for(HtmlElement element : this.getElements()) {
            sb.append(element.toStringImpl(indent + 1));
        }
        sb.append(String.format("%s<%s>%s", i, this.getName(), this.getNewLine()));

        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
