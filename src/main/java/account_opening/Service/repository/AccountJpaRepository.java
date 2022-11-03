package account_opening.Service.repository;

import account_opening.Service.model.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepository extends JpaRepository<AccountDetails,Long> {
}
