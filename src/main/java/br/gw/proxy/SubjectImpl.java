package br.gw.proxy;

public class SubjectImpl implements Subject {

    @Override
    public void request() {
        System.out.println("Impl");
    }
}
