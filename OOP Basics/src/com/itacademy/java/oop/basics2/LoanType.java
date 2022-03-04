package com.itacademy.java.oop.basics2;

import com.itacademy.java.oop.basics.ContractType;

public enum LoanType {
    LEASING("LS"),
    CONSUMERLOAN("CL");

    public final String loanType;

    LoanType(String loanType) { this.loanType = loanType;}

    public static LoanType loanType(String loanType) {
        for (LoanType e : values()) {
            if (e.loanType.equals(loanType)) {
                return e;
            }
        }
        return null;
    }
}
