import package_PP.BankAccount;
import package_PP.Person;



public class main {

    public static void main(String[] args) {


    //TODO Person
        //TODO: 1) Vytvořte 3 lidi:

        //TODO: i) Petr, RČ 9510184289, Moravské Budějovice
        Person piotr = new Person(new long[]{9,5,1,0,1,8,4,2,8,9}, "Petr", "Moravské Budějovice");

        //TODO: ii) Jakub, RČ 5502274976, Praha
        Person yakub = new Person(new long[]{5,5,0,2,2,7,4,9,7,6}, "Jakub", "Praha");

        //TODO: iii) Karolína, RČ 0912095186, Znojmo
        Person karolina = new Person(new long[]{0,9,1,2,0,9,5,1,8,6}, "Karolína", "Znojmo");

        //TODO: ?*) František, RČ 5902311485, Neznámo odkud
        Person frensis = new Person(new long[]{5,9,0,2,3,1,1,4,8,5}, "František", null);

        System.out.println("Osoby...");
        //TODO: 2) Vypište všechny 3 validní osoby pomocí metody toString. (stačí pouze napsat System.out.println(name_of_object_Person)
        System.out.println(piotr);
        System.out.println(yakub);
        System.out.println(karolina);
        System.out.println(frensis);

        //TODO: 3) Nechte pozdravit Petra Karolínu
        System.out.println(piotr.sayHi(karolina));
    //TODO Person



    //TODO Bankovní účty



        //TODO: 4) Vytvořte bankovní účet pro objekt, kterým je Petr, RČ 9510184289, Moravské Budějovice Jde o nový účet, nemá žádný původní zůstatek.
        BankAccount petr = new BankAccount(piotr);

        //TODO: 5) Vytvořte bankovní účet pro objekt, kterým je Jakub, RČ 5502274976, Praha.
        //Jakub má převedený účet a jeho úvodní zůstatek činí 12 598,-.
        BankAccount jakub = new BankAccount(yakub, 12598);

        System.out.println("Účty...");
        //TODO: 6) Vypište současný stav obou účtů pomocí toString (stačí pouze napsat System.out.println(name_of_object_BankAccount).
        System.out.println(petr);
        System.out.println(jakub);

        //TODO: 7) Jakub nyní bude pracovat se svým účtem. U všech akcí vypište, zda se provedla, či nikoliv
                //        (System.out.println(name_of_object_BankAccount.depositMoney(20000)) -> vytiskne false)
                //        (System.out.println(name_of_object_BankAccount.withdrawMoney(5000)) -> vytiskne true)

        //TODO: i) Jakub se pokusí vložit 20 000,-
        System.out.println(jakub.depositMoney(20000));

        //TODO: ii) vybere 5 000,-
        System.out.println(jakub.withdrawMoney(5000));

        //TODO: iii) vloží 1 000,-
        System.out.println(jakub.depositMoney(1000));

        //TODO: iv) pokusí se vybrat 10 000,-
        System.out.println(jakub.withdrawMoney(10000));

        //TODO: 8) Vypište současný stav obou účtů pomocí toString (stačí pouze napsat System.out.println(name_of_object_BankAccount).

        System.out.println(petr);
        System.out.println(jakub);


        /*
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
 }
}
