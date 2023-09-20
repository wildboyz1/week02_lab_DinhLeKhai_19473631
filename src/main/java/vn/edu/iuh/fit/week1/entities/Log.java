package vn.edu.iuh.fit.week1.entities;

import java.util.Date;
import java.util.Objects;

public class Log {
    private Account AccountID;

    public Account getAccountID() {
        return AccountID;
    }

    public void setAccountID(Account accountID) {
        AccountID = accountID;
    }

    @Override
    public String toString() {
        return "Log{" +
                "AccountID=" + AccountID +
                ", Ngaydangnhap=" + Ngaydangnhap +
                ", ngaydangxuat=" + ngaydangxuat +
                ", ghiChu='" + ghiChu + '\'' +
                '}';
    }

    public Date getNgaydangnhap() {
        return Ngaydangnhap;
    }

    public void setNgaydangnhap(Date ngaydangnhap) {
        Ngaydangnhap = ngaydangnhap;
    }

    public Date getNgaydangxuat() {
        return ngaydangxuat;
    }

    public void setNgaydangxuat(Date ngaydangxuat) {
        this.ngaydangxuat = ngaydangxuat;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Log(Account accountID, Date ngaydangnhap, Date ngaydangxuat, String ghiChu) {
        AccountID = accountID;
        Ngaydangnhap = ngaydangnhap;
        this.ngaydangxuat = ngaydangxuat;
        this.ghiChu = ghiChu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(AccountID, log.AccountID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AccountID);
    }

    private Date Ngaydangnhap;
    private Date ngaydangxuat;
    private String ghiChu;

}
