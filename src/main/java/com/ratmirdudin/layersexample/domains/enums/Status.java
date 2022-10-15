package com.ratmirdudin.layersexample.domains.enums;

import java.util.Arrays;

public enum Status {

    Online,
    Offline;

    public static Status findIgnoreCase(String str) {
        return Arrays.stream(Status.values())
                .filter(status -> str.equalsIgnoreCase(status.name()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Constant with name: " + str + " not found."));
    }
}