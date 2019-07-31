package br.com.viana.database;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DatabaseSimpleText implements Database {
    @Override
    public boolean save(String content) {
        return true;
    }

    @Override
    public String list() {
        return "conteúdo";
    }
}
