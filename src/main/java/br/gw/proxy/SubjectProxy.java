package br.gw.proxy;

public class SubjectProxy implements Subject {

    private SubjectImpl subjectImpl;

    public SubjectProxy(SubjectImpl subjectImpl) {
        this.subjectImpl = subjectImpl;
    }

    @Override
    public void request() {
        if(this.validateAcess()) {
            this.subjectImpl.request();
            this.logAcess();
        }
    }

    private boolean validateAcess() {
        System.out.println("validateAcess");
        return true;
    }

    private void logAcess() {
        System.out.println("logAcess");
    }

}
