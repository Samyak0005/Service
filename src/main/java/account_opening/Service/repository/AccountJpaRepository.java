package account_opening.Service.repository;

import account_opening.Service.model.Account_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountJpaRepository extends JpaRepository<Account_Details,Long> {
}
