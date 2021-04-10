package com.ssm.entity;

import java.math.BigDecimal;

public class accounting_table {

    private String cre_serial_num;//信贷流水号
    private char tic_num;//票号
    private int acco_class;//记账类别，1代表承兑、2代表贴现
    private BigDecimal acco_change;//记账变化
    private int acco_state;//记账状态，1代表成功、2代表失败

    public void accounting_table(){}

    public void accounting_table(String cre_serial_num, char tic_num, int acco_class, BigDecimal acco_change, int acco_state) {
        this.cre_serial_num = cre_serial_num;
        this.tic_num = tic_num;
        this.acco_class = acco_class;
        this.acco_change = acco_change;
        this.acco_state = acco_state;
    }

    public String getCre_serial_num() {
        return cre_serial_num;
    }

    public void setCre_serial_num(String cre_serial_num) {
        this.cre_serial_num = cre_serial_num;
    }

    public char getTic_num() {
        return tic_num;
    }

    public void setTic_num(char tic_num) {
        this.tic_num = tic_num;
    }

    public int getAcco_class() {
        return acco_class;
    }

    public void setAcco_class(int acco_class) {
        this.acco_class = acco_class;
    }

    public BigDecimal getAcco_change() {
        return acco_change;
    }

    public void setAcco_change(BigDecimal acco_change) {
        this.acco_change = acco_change;
    }

    public int getAcco_state() {
        return acco_state;
    }

    public void setAcco_state(int acco_state) {
        this.acco_state = acco_state;
    }
}
