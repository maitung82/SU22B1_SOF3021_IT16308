package su22.sof3021.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import su22.sof3021.entities.Account;

@Repository
public interface AccountRepository
	extends JpaRepository<Account, Integer> {

}
