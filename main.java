import package_PP.BankAccount;
import package_PP.Person;

public class main {
    /*
    Zde naimplementujte komunikaci.
    RČ (rok)85(měsíc)05(den)30(čtyřčíslí vygenerované)2589, nerozlišujeme pohlaví
    1) Vytvořte 3 lidi:
        i) Petr, RČ 9510184289, Moravské Budějovice
        ii) Jakub, RČ 5502274976, Praha
        iii) Karolína, RČ 0912095186, Znojmo
        ?*) František, RČ 5902311485, Neznámo odkud -> Překontrolujte, že údaje jsou validní v rámci kódu (RČ)
    2) Vypište všechny 3 validní osoby pomocí metody toString. (stačí pouze napsat System.out.println(name_of_object_Person)
    3) Nechte pozdravit Petra Karolínu
    Bankovní účty
    4) Vytvořte bankovní účet pro objekt, kterým je Petr, RČ 9510184289, Moravské Budějovice.
        Jde o nový účet, nemá žádný původní zůstatek.
    5) Vytvořte bankovní účet pro objekt, kterým je Jakub, RČ 5502274976, Praha.
        Jakub má převedený účet a jeho úvodní zůstatek činí 12 598,-.
    6) Vypište současný stav obou účtů pomocí toString (stačí pouze napsat System.out.println(name_of_object_BankAccount).
    7) Jakub nyní bude pracovat se svým účtem. U všech akcí vypište, zda se provedla, či nikoliv
        (System.out.println(name_of_object_BankAccount.depositMoney(20000)) -> vytiskne false)
        (System.out.println(name_of_object_BankAccount.withdrawMoney(5000)) -> vytiskne true)
        i) Jakub se pokusí vložit 20 000,-
        ii) vybere 5 000,-
        iii) vloží 1 000,-
        iv) pokusí se vybrat 10 000,-
    8) Vypište současný stav obou účtů pomocí toString (stačí pouze napsat System.out.println(name_of_object_BankAccount).

    hrubý očekávaný výstup z metody main:
    Osoby...
    Jméno: Petr; Bydliště: Moravské Budějovice; Věk: 27
    Jméno: Jakub; Bydliště: Praha; Věk: 68
    Jméno: Karolína; Bydliště: Znojmo; Věk: 13
    Petr: Aá, Karolína. Dlouho jsme se neviděli, doufám, že se máš ve věku 13 dobře. Přeji ti hezký den a užívej si sluníčko.
    Účty...
    Jméno: Petr; Bydliště: Moravské Budějovice; Číslo účtu: 689521; Zůstatek: 0
    Jméno: Jakub; Bydliště: Praha; Číslo účtu: 281799; Zůstatek: 12598
    false
    true
    true
    false
    Jméno: Petr; Bydliště: Moravské Budějovice; Číslo účtu: 689521; Zůstatek: 0
    Jméno: Jakub; Bydliště: Praha; Číslo účtu: 281799; Zůstatek: 8598
     */
    public static void main(String[] args) {
        //TODO: nezapomeň na Lko za RC
        Person person = new Person(new long[]{9,5,1,0,1,8,4,2,8,9}, "Petr", "Moravské Budějovice");
        Person jirka = new Person(new long[]{5,5,0,2,2,7,4,9,7,6}, "Jakub", "Praha");
        Person david = new Person(new long[]{0,9,1,2,0,9,5,1,8,6}, "Karolína", "Znojmo");
        System.out.println(person);
        System.out.println(jirka);
        System.out.println(david);
    }
}
