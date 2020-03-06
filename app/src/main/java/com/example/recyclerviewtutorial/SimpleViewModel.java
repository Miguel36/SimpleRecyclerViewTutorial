package com.example.recyclerviewtutorial;

import androidx.annotation.NonNull;

public class SimpleViewModel {

    private String simpleText;

    public SimpleViewModel(@NonNull final String simpleText) {
        this.simpleText = simpleText;
    }

    public String getSimpleText() {
        return simpleText;
    }

    public void setSimpleText(@NonNull final String simpleText) {
        this.simpleText = simpleText;
    }
}
