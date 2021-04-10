package com.ssm.entity;

import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.math.BigDecimal;
import java.util.Date;

public class bill_state {
    private char tic_num;
    private Date da_is;//出票日期
    private Date da_ac;//承兑日期
    private Date da_du;//到期日期
    private String name_drawer;//出票人全称
    private String acco_drawer;//出票人账号
    private String pay_bank;//付款行
    private String name_rec;//收款人全称
    private String acco_rec;//收款人账号
    private String rec_bank;//收款行
    private BigDecimal bill_amount;//出票金额
    private String cus_manager;//客户经理
    private int acc_app_state;//承兑审批状态：0未审批；1审批中；2审批成功；3审批失败
    private int dic_app_state;//贴现审批状态：0未审批；1审批中；2审批成功；3审批失败

    public void bill_state(){}

    public void bill_state(char tic_num, Date da_is, Date da_ac, Date da_du, String name_drawer, String acco_drawer, String pay_bank, String name_rec, String acco_rec, String rec_bank, BigDecimal bill_amount, String cus_manager, int acc_app_state, int dic_app_state) {
        this.tic_num = tic_num;
        this.da_is = da_is;
        this.da_ac = da_ac;
        this.da_du = da_du;
        this.name_drawer = name_drawer;
        this.acco_drawer = acco_drawer;
        this.pay_bank = pay_bank;
        this.name_rec = name_rec;
        this.acco_rec = acco_rec;
        this.rec_bank = rec_bank;
        this.bill_amount = bill_amount;
        this.cus_manager = cus_manager;
        this.acc_app_state = acc_app_state;
        this.dic_app_state = dic_app_state;
    }

    public char getTic_num() {
        return tic_num;
    }

    public void setTic_num(char tic_num) {
        this.tic_num = tic_num;
    }

    public Date getDa_is() {
        return da_is;
    }

    public void setDa_is(Date da_is) {
        this.da_is = da_is;
    }

    public Date getDa_ac() {
        return da_ac;
    }

    public void setDa_ac(Date da_ac) {
        this.da_ac = da_ac;
    }

    public Date getDa_du() {
        return da_du;
    }

    public void setDa_du(Date da_du) {
        this.da_du = da_du;
    }

    public String getName_drawer() {
        return name_drawer;
    }

    public void setName_drawer(String name_drawer) {
        this.name_drawer = name_drawer;
    }

    public String getAcco_drawer() {
        return acco_drawer;
    }

    public void setAcco_drawer(String acco_drawer) {
        this.acco_drawer = acco_drawer;
    }

    public String getPay_bank() {
        return pay_bank;
    }

    public void setPay_bank(String pay_bank) {
        this.pay_bank = pay_bank;
    }

    public String getName_rec() {
        return name_rec;
    }

    public void setName_rec(String name_rec) {
        this.name_rec = name_rec;
    }

    public String getAcco_rec() {
        return acco_rec;
    }

    public void setAcco_rec(String acco_rec) {
        this.acco_rec = acco_rec;
    }

    public String getRec_bank() {
        return rec_bank;
    }

    public void setRec_bank(String rec_bank) {
        this.rec_bank = rec_bank;
    }

    public BigDecimal getBill_amount() {
        return bill_amount;
    }

    public void setBill_amount(BigDecimal bill_amount) {
        this.bill_amount = bill_amount;
    }

    public String getCus_manager() {
        return cus_manager;
    }

    public void setCus_manager(String cus_manager) {
        this.cus_manager = cus_manager;
    }

    public int getAcc_app_state() {
        return acc_app_state;
    }

    public void setAcc_app_state(short acc_app_state) {
        this.acc_app_state = acc_app_state;
    }

    public int getDic_app_state() {
        return dic_app_state;
    }

    public void setDic_app_state(short dic_app_state) {
        this.dic_app_state = dic_app_state;
    }
}
