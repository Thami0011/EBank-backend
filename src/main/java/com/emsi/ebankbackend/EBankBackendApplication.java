package com.emsi.ebankbackend;

import com.emsi.ebankbackend.entities.AccountOperation;
import com.emsi.ebankbackend.entities.CurrentAccount;
import com.emsi.ebankbackend.entities.Customer;
import com.emsi.ebankbackend.entities.SavingAccount;
import com.emsi.ebankbackend.enums.AccountStatus;
import com.emsi.ebankbackend.enums.OperationType;
import com.emsi.ebankbackend.repositories.AccountOperationRepository;
import com.emsi.ebankbackend.repositories.BankAccountRepository;
import com.emsi.ebankbackend.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class EBankBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EBankBackendApplication.class, args);
    }

}
