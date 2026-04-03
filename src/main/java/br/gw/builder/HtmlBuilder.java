package br.gw.builder;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        this.root.setName(this.rootName);
    }

    public void addChild(String childName, String childText) {
        HtmlElement element = new HtmlElement(childName, childText);
        root.getElements().add(element);
    }

    public void clear() {
        root = new HtmlElement();
        root.setName(rootName);
    }

    @Override
    public String toString() {
        return root.toString();
    }

}
