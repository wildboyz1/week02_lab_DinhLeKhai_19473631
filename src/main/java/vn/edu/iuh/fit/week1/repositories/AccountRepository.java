package vn.edu.iuh.fit.week1.repositories;

import vn.edu.iuh.fit.week1.entities.Account;
import  vn.edu.iuh.fit.week1.repositories.AccountRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AccountRepository implements  RepositoryA<Account> {

    @Override
    public boolean them(Account account) {
        return false;
    }

    @Override
    public boolean xoa(Account account) {
        return false;
    }

    @Override
    public boolean capNhat(Account account) {
        return false;
    }

    @Override
    public List<Account> layDanhsach() {
        return null;
    }

    @Override
    public Optional<Account> laytheoma(Objects... objects) {
        return Optional.empty();
    }
}
