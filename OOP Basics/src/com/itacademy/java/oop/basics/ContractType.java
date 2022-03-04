package com.itacademy.java.oop.basics;

public enum ContractType {
    FullTime("FT"),
    PartTime("PT");

    public final String contractType;

    ContractType(String contractType) { this.contractType = contractType;}

    public static ContractType contractType(String contractType) {
        for (ContractType e : values()) {
            if (e.contractType.equals(contractType)) {
                return e;
            }
        }
        return null;
    }
}
