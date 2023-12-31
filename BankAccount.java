package package_PP;

import java.util.Random;

public class BankAccount {
    // implementujte 3 atributy: číslo účtu, osoba (objekt třídy Person), zůstatek
    private int bankNum;
    private String person;
    private int bal;
    private String address;

    // implementujte konstruktor s parametry: osoba (objekt třídy Person). číslo účtu vygenerujte jako 6 místné číslo,
    // zůstatek nastavte na 0.
    public BankAccount(Person person){
        this.person = person.getName();
        this.bankNum = new Random().nextInt(900000) + 100000; //TODO working
        this.bal = 0;
        this.address = person.getCity();
    }
    // implementujte konstruktor s parametry: osoba (objekt třídy Person) a zůstatek. číslo účtu vygenerujte jako 6
    // místné číslo, zůstatek nastavte na předaný parametr.
    public BankAccount(Person person, int balance){
        this.person = person.getName();
        this.bal = balance;
        this.bankNum = new Random().nextInt(900000) + 100000;
        this.address = person.getCity();
    }
    
    // implementujte get a set pro atributy, uvědomte si které lze měnit
    //no
    // implementujte metodu toSting, ta bude vracet řetězec ve formátu:
    // "Jméno: attr_osoba.name; Bydliště: attr_osoba.homeTown; Číslo účtu: attr_accNumber; Zůstatek: attr_balance"


    @Override
    public String toString() {
        return "Jméno: " + person +
                "; Bydliště: " + address +
                "; Číslo účtu: " + bankNum +
                "; Zůstatek: " + bal;
    }

    // implementujte metodu pro vklad peněz na účet s parametrem: částka. Maximální vklad je 10 000,- -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean depositMoney(int amount) {
        if (amount <= 10000) {
            this.bal += amount;
            return true;
        } else {
            return false;
        }
    }

    // implementujte metodu pro výběr peněz na účet s parametrem: částka. Maximální výběr je 10 000,- -> Ošetřete.
    // A nesmíte se dostat do záporných částek -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean withdrawMoney(int amount){
        if(amount <= 10000 && bal > amount){
            bal -= amount;
            return true;
        }
        else{
            return false;
        }
    }
}
