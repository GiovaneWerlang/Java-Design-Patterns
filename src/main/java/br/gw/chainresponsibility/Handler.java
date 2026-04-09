package br.gw.chainresponsibility;

public interface Handler {

    void setNext(CreatureModifier next);
    void handle();

}
