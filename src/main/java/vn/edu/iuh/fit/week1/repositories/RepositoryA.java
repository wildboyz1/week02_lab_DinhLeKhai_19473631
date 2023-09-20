package vn.edu.iuh.fit.week1.repositories;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
public interface RepositoryA<T> {
    boolean them(T t);
    boolean xoa(T t);
    boolean capnhat(T t);
    List<T> layDs();
    Optional<T> laytheoma(Objects ... objects);

}
