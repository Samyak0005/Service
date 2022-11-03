package account_opening.Service.controller;

import account_opening.Service.model.AccountDetails;
import account_opening.Service.service.OpenAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OpenAccountController {

    @Autowired
    OpenAccountService openAccountService;

    @PostMapping("/add_account")
    public String Add(@RequestBody AccountDetails accountDetails){

        return openAccountService.Add(accountDetails);
    }

    @GetMapping("/get_account")
    public List<AccountDetails> get(){

        return openAccountService.get();
    }

    @PutMapping("/update_account/{Account_No}/{name}")
    public String update(@PathVariable long Account_No, @PathVariable String name){

        return openAccountService.update(Account_No,name);
    }

    @DeleteMapping("/delete_account/{Account_No}")
    public String delete(@PathVariable long Account_No){

        return openAccountService.delete(Account_No);
    }
}
