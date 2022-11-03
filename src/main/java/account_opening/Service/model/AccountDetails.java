package account_opening.Service.model;

import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class AccountDetails {

    @Id
    @GeneratedValue
   long Account_No;

private String name;
private String Permanent_address;

private long Pan_No;
private long Aadhaar_No;
private long Amount;

//Default Constructs


    public AccountDetails() {
    }

    //Parameterized Const


    public AccountDetails(long account_No, String name, String permanent_address, long pan_No, long aadhaar_No, long amount) {
       this.Account_No = account_No;
        this.name = name;
        this.Permanent_address = permanent_address;
        this.Pan_No = pan_No;
        this.Aadhaar_No = aadhaar_No;
        this.Amount = amount;
    }

    //Getter and Setter


    public long getAccount_No() {
        return Account_No;
    }

    public void setAccount_No(long account_No) {
        Account_No = account_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermanent_address() {
        return Permanent_address;
    }

    public void setPermanent_address(String permanent_address) {
        Permanent_address = permanent_address;
    }

    public long getPan_No() {
        return Pan_No;
    }

    public void setPan_No(long pan_No) {
        Pan_No = pan_No;
    }

    public long getAadhaar_No() {
        return Aadhaar_No;
    }

    public void setAadhaar_No(long aadhaar_No) {
        Aadhaar_No = aadhaar_No;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }
}
