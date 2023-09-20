package vn.edu.iuh.fit.week1.repositories;

import vn.edu.iuh.fit.week1.entities.Account;
import  vn.edu.iuh.fit.week1.repositories.AccountRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AccountRepository implements  RepositoryA<Account> {

    private connectDB connectDB;

    @Override
    public boolean them(Account account) {
        return false;
    }

    @Override
    public boolean xoa(Account account) {
        return false;
    }

    @Override
    public boolean capnhat(Account account) {
        return false;
    }

    @Override
    public List<Account> layDs() {
        return null;
    }

    @Override
    public Optional<Account> laytheoma(Objects... objects) {
        try {
            PreparedStatement preparedStatement = connectDB.getConnection().prepareStatement("select * from account where account_id = ? and password = ? ");
            String account = objects[0].toString();
            String password = objects[1].toString();
            preparedStatement.setString(1,account);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while ( resultSet.next){
                Account account = new Account();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


