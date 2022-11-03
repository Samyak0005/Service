package account_opening.Service.service;

import account_opening.Service.model.AccountDetails;
import account_opening.Service.repository.AccountJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class OpenAccountService {

    @Autowired
    AccountJpaRepository accountRepo;

    public String Add(AccountDetails accountDetails){

        accountRepo.save(accountDetails);
        return "Add account data Successfully";
    }

    public List<AccountDetails> get(){

        return accountRepo.findAll();
    }

    public String update( long Account_No,  String name) {

        AccountDetails accountDetails = accountRepo.getReferenceById(Account_No);
        accountDetails.setName(name);
        accountRepo.save(accountDetails);

        return "Update Account Successfully";
    }

        public String delete( long Account_No){

        accountRepo.deleteById(Account_No);
        return "Delete data in Account SuccessFully";
        }


    }


