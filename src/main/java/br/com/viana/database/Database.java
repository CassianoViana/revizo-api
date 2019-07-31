package br.com.viana.database;

import java.io.Serializable;

public interface Database extends Serializable {
    boolean save(String content);

    String list();

}
