package com.example.programacao_web.server.shared;

public interface Identifiable<T>{

    T getId();
    void setId(T id);
}