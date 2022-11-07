package account_opening.Service.service;

import account_opening.Service.model.Account_Details;
import account_opening.Service.repository.AccountJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Service
public class Account_Service {

    @Autowired
   private AccountJpaRepository accountJpaRepository;

    public Account_Details CreatedAccount( Account_Details accountDetails){

        return accountJpaRepository.save(accountDetails);

    }
    public List<Account_Details> get(){

        return accountJpaRepository.findAll();
    }

}
