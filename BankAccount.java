package package_PP;

import java.util.Random;

public class BankAccount {
    // implementujte 3 atributy: číslo účtu, osoba (objekt třídy Person), zůstatek
    private int BankNum;
    private String Person;
    private int Bal;

    // implementujte konstruktor s parametry: osoba (objekt třídy Person). číslo účtu vygenerujte jako 6 místné číslo,
    // zůstatek nastavte na 0.
    public BankAccount(Person person){
        this.Bal = 0;
        this.BankNum = new Random().nextInt(900000) + 100000;
        //this.Person = person;

    }

    // implementujte konstruktor s parametry: osoba (objekt třídy Person) a zůstatek. číslo účtu vygenerujte jako 6
    // místné číslo, zůstatek nastavte na předaný parametr.
    public BankAccount(int balance){

    }

    // implementujte get a set pro atributy, uvědomte si které lze měnit


    // implementujte metodu toSting, ta bude vracet řetězec ve formátu:
    // "Jméno: attr_osoba.name; Bydliště: attr_osoba.homeTown; Číslo účtu: attr_accNumber; Zůstatek: attr_balance"
    @Override
    public String toString() {
        return super.toString();
    }

    // implementujte metodu pro vklad peněz na účet s parametrem: částka. Maximální vklad je 10 000,- -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean depositMoney(){
        return true;
    }

    // implementujte metodu pro výběr peněz na účet s parametrem: částka. Maximální výběr je 10 000,- -> Ošetřete.
    // A nesmíte se dostat do záporných částek -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean withdrawMoney(){
        return true;
    }
}
