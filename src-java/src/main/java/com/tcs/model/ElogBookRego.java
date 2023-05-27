package com.tcs.model;

import org.springframework.stereotype.Component;

@Component
public class ElogBookRego {
    private String Rego;

    public ElogBookRego(){
        super();
    }

    public ElogBookRego(String rego){
        this.Rego = Rego;
    }

    public void setRego(String Rego) {
        this.Rego = Rego;
    }
    public String getRego(){
        return Rego;
    }
}
