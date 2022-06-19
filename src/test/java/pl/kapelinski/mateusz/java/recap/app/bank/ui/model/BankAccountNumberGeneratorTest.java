package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kapelinski.mateusz.java.recap.app.bank.api.exception.AccountNumberGeneratorException;

class BankAccountNumberGeneratorTest {
    @Test
    void givenBankAccountNumberGenerator_whenGenerate_thenGeneratedNumberNotNull() throws AccountNumberGeneratorException {
        //GIVEN
        BankAccountNumberGenerator bankAccountNumberGenerator = new BankAccountNumberGenerator();
        //WHEN
        String number = bankAccountNumberGenerator.generate();
        //THEN
        Assertions.assertNotNull(number, "Generated number is null");
    }

    @Test
    void givenBankAccountNumberGenerator_whenGenerate_thenGeneratedNumberInBounds() throws AccountNumberGeneratorException {
        //GIVEN
        BankAccountNumberGenerator bankAccountNumberGenerator = new BankAccountNumberGenerator();
        //WHEN
        String number = bankAccountNumberGenerator.generate();
        //THEN
        Assertions.assertNotEquals(number.length(), 5, "Generated number size is wrong");
    }

//    @Test
//    void givenBankAccountNumberGenerator_whenGenerate_thenGeneratedNumberContainsNumbers() throws AccountNumberGeneratorException {
//        //GIVEN
//        BankAccountNumberGenerator bankAccountNumberGenerator = new BankAccountNumberGenerator();
//        //WHEN
//        String number = bankAccountNumberGenerator.generate();
//        //THEN
//        Assertions.assertThrows()
//    }
}