package vn.edu.iuh.fit.week1.entities;

import java.util.Objects;

public class GrantAccess {
    public Account getAccountID() {
        return accountID;
    }

    public void setAccountID(Account accountID) {
        this.accountID = accountID;
    }

    public Role getRoleID() {
        return roleID;
    }

    public void setRoleID(Role roleID) {
        this.roleID = roleID;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "accountID=" + accountID +
                ", roleID=" + roleID +
                ", isGrant=" + isGrant +
                ", note='" + note + '\'' +
                '}';
    }

    public boolean isGrant() {
        return isGrant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrantAccess that = (GrantAccess) o;
        return Objects.equals(accountID, that.accountID) && Objects.equals(roleID, that.roleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID, roleID);
    }

    public void setGrant(boolean grant) {
        isGrant = grant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private Account accountID;
    private Role roleID;

    public GrantAccess(Account accountID, Role roleID, boolean isGrant, String note) {
        this.accountID = accountID;
        this.roleID = roleID;
        this.isGrant = isGrant;
        this.note = note;
    }

    private boolean isGrant;
    private  String note;
}
