package com.trl.chapter_6.factory;

import javax.enterprise.inject.Alternative;

@Alternative
public class MessageA {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}