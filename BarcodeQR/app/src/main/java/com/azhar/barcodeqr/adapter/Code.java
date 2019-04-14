package com.azhar.barcodeqr.adapter;

/**
 * Created by Azhar Rivaldi on 11/04/2019.
 */

public class Code {

    public Long _id; // for cupboard
    public String name; // bunny name
    public String type;

    public Code() {
        this.name = "noName";
        this.type = "noType";
    }

    public Code(String name, String type) {
        this.name = name;
        this.type = type;
    }

}
