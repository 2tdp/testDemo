package com.datnt.testdemo;

public class DanhMuc {

    private int anh1;
    private int anh2;
    private int anh3;
    private int anh4;
    private int tongMon;
    private int tongDat;

    public DanhMuc(int anh1, int anh2, int anh3, int anh4, int tongMon, int tongDat) {
        this.anh1 = anh1;
        this.anh2 = anh2;
        this.anh3 = anh3;
        this.anh4 = anh4;
        this.tongMon = tongMon;
        this.tongDat = tongDat;
    }

    public int getAnh1() {
        return anh1;
    }

    public void setAnh1(int anh1) {
        this.anh1 = anh1;
    }

    public int getAnh2() {
        return anh2;
    }

    public void setAnh2(int anh2) {
        this.anh2 = anh2;
    }

    public int getAnh3() {
        return anh3;
    }

    public void setAnh3(int anh3) {
        this.anh3 = anh3;
    }

    public int getAnh4() {
        return anh4;
    }

    public void setAnh4(int anh4) {
        this.anh4 = anh4;
    }

    public int getTongMon() {
        return tongMon;
    }

    public void setTongMon(int tongMon) {
        this.tongMon = tongMon;
    }

    public int getTongDat() {
        return tongDat;
    }

    public void setTongDat(int tongDat) {
        this.tongDat = tongDat;
    }
}
