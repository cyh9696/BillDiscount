package com.ssm.entity;

import java.math.BigDecimal;

public class custom_information {

    private String name;//单位名称
    private BigDecimal save;//单位存款
    private BigDecimal loan;//单位贷款

    public void custom_information(){}

    public void custom_information(String name, BigDecimal save, BigDecimal loan) {
        this.name = name;
        this.save = save;
        this.loan = loan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSave() {
        return save;
    }

    public void setSave(BigDecimal save) {
        this.save = save;
    }

    public BigDecimal getLoan() {
        return loan;
    }

    public void setLoan(BigDecimal loan) {
        this.loan = loan;
    }
}
